public class Paciente {
    String nome_Paciente;
    double altura;
    double peso;

    public Paciente() {
    }

    GerarRelatorioIMC calcularIndiceMassaCorporal() {
        double calculo = getPeso() / (getAltura() * getAltura());

        GerarRelatorioIMC relatorio = new GerarRelatorioIMC();
        relatorio.setResultado(calculo);

        if(relatorio.getResultado() < 18.5){
            relatorio.setStatus("Abaixo do peso");
            relatorio.setSugestao("Procure um nutricionista");
        }else if (relatorio.getResultado()> 18.5 && relatorio.getResultado() < 24.9){
            relatorio.setStatus("Peso normal");
            relatorio.setSugestao("Mantenha o peso , saudável");
        }else if(relatorio.getResultado() >= 25 && relatorio.getResultado() <= 30){
            relatorio.setStatus("Acima do peso!");
            relatorio.setSugestao("Acima do peso, procure urgente um nutricionista");
        }else{
            relatorio.setStatus("Grau obesidade");
            relatorio.setSugestao("Procure um nutricionista o mais rápido possível");
        }
        return relatorio;
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
