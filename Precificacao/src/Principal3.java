public class Principal3 {
    public static void main(String[] args) {
        //método estatico
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.printf("Total de custos: %.2f%n",
                Produto.calcularCustosTotais(produto));

    }
}
