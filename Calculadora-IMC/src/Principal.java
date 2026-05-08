public class Principal {
    public static void main(String[] args) {


        Paciente paciente = new Paciente();

        paciente.setNome_Paciente("Juliano");
        paciente.setPeso(95);
        paciente.setAltura(1.65);

        paciente.calculoIMC();
    }
}
