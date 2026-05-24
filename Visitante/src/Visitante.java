public class Visitante {

    // constante para não alteração
    static final int IDADE_MINIMA = 18 ;

    private String nome;
    private int idade;
    private String mensagem;

    String validarEntradaVisitate(){
        if (idade < IDADE_MINIMA){
            return "Sua idade não permite a entrada";
        }
        return "Bem vindo!";
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

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
}
