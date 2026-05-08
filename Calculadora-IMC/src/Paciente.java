public class Paciente {
    String nome_Paciente;
    double altura;
    double peso;

    public Paciente() {
    }

    void calculoIMC() {
        double calculo = getPeso() / (getAltura() * getAltura());

        if (calculo < 18.5) {
            System.out.println("Indíce de massa corporal muito baixa!");
        }else if (calculo > 18.5 && calculo < 24.9){
            System.out.println("Seu peso está normal = " + calculo);
        }else if (calculo >= 25 && calculo <= 30){
            System.out.println("Você está com sobrepreso!");
        }else{
            System.out.println("Grau de obesidade alta");
        }
    }


    public String getNome_Paciente() {
        return nome_Paciente;
    }

    public void setNome_Paciente(String nome_Paciente) {
        this.nome_Paciente = nome_Paciente;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nome do Paciente = " + nome_Paciente + '\'' +
                ", altura = " + altura +
                ", peso = " + peso;
    }
}
