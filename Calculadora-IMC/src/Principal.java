public class Principal {
    public static void main(String[] args) {


        Paciente paciente = new Paciente();

        paciente.setNome_Paciente("Juliano");
        paciente.setPeso(70);
        paciente.setAltura(1.80);

        GerarRelatorioIMC gerarRelatorioIMC = paciente.calcularIndiceMassaCorporal();
        System.out.println(gerarRelatorioIMC);
    }
}
