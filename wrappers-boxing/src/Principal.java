public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setIdade(Integer.valueOf(20));

        System.out.println("Idade : " + cliente.getIdade());

        int idade = 20;
        short idadeShort = (short) idade; // casting , forçando a transformação

        Integer valorIdade = Integer.valueOf(30);
        Short valorIdadeTransformado = Short.valueOf(valorIdade.shortValue()); // transformamos em short
        Long valorTransformadoLONG = Long.valueOf(valorIdadeTransformado.longValue());
        Double valorDouble = Double.valueOf(valorIdade.doubleValue());
        System.out.println(valorIdade);
        System.out.println(valorIdadeTransformado);
        System.out.println(valorDouble);
    }
}
