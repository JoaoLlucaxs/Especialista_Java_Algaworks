public class Principal2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // método da classe e não do objeto por isso não há necessidade de instanciar para buscar este método
        Produto.alterarCustoEmbalagem(12);

        Produto.imprimirCustoEmbalagem();
    }
}
