import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        // Pontos negativos = Precisa atribuir um tamanho fixo (desvantagem em sistemas que crescem)


        // array só suporta um tipo
        int quantidadeNoArray = 5;
        int[] notas = new int[quantidadeNoArray];

        // Inserindo os valores manualmente gaveta por gaveta
        notas[0] = 85; // Primeira posição
        notas[1] = 90; // Segunda posição
        notas[2] = 70; // Terceira posição
        notas[3] = 100;// Quarta posição
        notas[4] = 65; // Quinta e última posição

        for (int i=0 ; i < notas.length; i++){
            System.out.println("Valor :  " + notas[i]);
        }

        // calculo de notas
        int[] somaTotalNotas = {8 , 7 , 5 ,3,1};

        int total = 0;
        for (int i=0; i < somaTotalNotas.length;i++){
            total +=somaTotalNotas[i];
        }
        System.out.println("Soma total : " + total);

        // Transformando array em String linha 39
        int[] valor = {10 , 4, 5 , 7};

        // ordenando o array
        Arrays.sort(valor);

        System.out.println(Arrays.toString(valor));

    }
}
