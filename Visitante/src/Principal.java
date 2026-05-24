import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Informe seu nome : ");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade : ");
        int idade =scanner.nextInt();

        Visitante visitante = new Visitante();
        visitante.setNome(nome);
        visitante.setIdade(idade);

        System.out.println(visitante.validarEntradaVisitate());

    }
}
