public class Principal {
    public static void main(String[] args) {


        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();

        Pessoa paciente =new Pessoa();
        paciente.setPeso(70);
        paciente.setAltura(1.70);

        GerarRelatorioIMC gerarRelatorioIMC = calculadoraIMC.calcularIndiceMassaCorporal(paciente);
        System.out.println(gerarRelatorioIMC);
    }
}
