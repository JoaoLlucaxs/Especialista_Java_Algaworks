public class Cliente {
    // Inteiros não aceitam null , ao colocar uma classe Wrapper embrulhamos o primitivo para tratarmos como objeto
    // Assim podemos atribuir Null ou manipular;

    private String nome;
    private int idade;
    private double rendaMensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
