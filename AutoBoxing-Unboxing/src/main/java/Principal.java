public class Principal {
    public static void main(String[] args) {

        Integer diasEntrega = 30; //  embrulhando o valor primitivo de forma oculta  Integer valorIdade = Integer.valueOf(30);
        int diasEntregaInt = diasEntrega; // desembrulhando

        int valor1 = 128;
        int valor2 = 128;

        System.out.println(valor1 == valor2); // será true pois compara valor

        Integer valorWrapper = 128;
        Integer valorWrapper2 = 128;

        System.out.println(valorWrapper == valorWrapper2); //false , pois são objetos diferentes e == compara apenas valor
        System.out.println(valorWrapper.equals(valorWrapper2)); // dará true pois equal compara tipo e valor

        // Cuidado com NullPointerException , todos abaixo darão pois não há valor
        // Sempre verifique com condicioanis se o valor está nulo
        Integer valor = null;

        System.out.println(valor + 10);
        System.out.println( valor == 10);
        System.out.println( valor.equals(100));
    }
}
