package TextEnumeracao;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private DiaSemana2 diaSemana;


    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", diaSemana=" + diaSemana +
                '}';
    }

    public Data() {
    }

    public Data(int dia, int mes, int ano, DiaSemana2 diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public DiaSemana2 getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana2 diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
