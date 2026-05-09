public class GerarRelatorioIMC {
    private double resultado;
    private String status;
    private String sugestao;

    public GerarRelatorioIMC() {
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }

    @Override
    public String toString() {
        return "GerarRelatorioIMC{" +
                "resultado=" + resultado +
                ", status='" + status + '\'' +
                ", sugestao='" + sugestao + '\'' +
                '}';
    }
}
