public class CalculadoraIMC {

    public CalculadoraIMC() {
    }

    GerarRelatorioIMC calcularIndiceMassaCorporal(Pessoa paciente) {
        double calculo = paciente.getPeso() / (paciente.getAltura() * paciente.getAltura());

        GerarRelatorioIMC relatorio = new GerarRelatorioIMC();
        relatorio.setResultado(calculo);

        if(relatorio.getResultado() < 18.5){
            relatorio.setStatus("Abaixo do peso");
            relatorio.setSugestao("Procure um nutricionista");
        }else if (relatorio.getResultado()> 18.5 && relatorio.getResultado() < 24.9){
            relatorio.setStatus("Peso normal");
            relatorio.setSugestao("Mantenha o peso , saudável");
        }else if(relatorio.getResultado() >= 25 && relatorio.getResultado() <= 30){
            relatorio.setStatus("Acima do peso!");
            relatorio.setSugestao("Acima do peso, procure urgente um nutricionista");
        }else{
            relatorio.setStatus("Grau obesidade");
            relatorio.setSugestao("Procure um nutricionista o mais rápido possível");
        }
        return relatorio;
    }
}
