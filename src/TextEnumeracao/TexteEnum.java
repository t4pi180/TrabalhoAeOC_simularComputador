package TextEnumeracao;

public class TexteEnum {
    public static void main(String[] args) {

        DiaSemana2 dia = DiaSemana2.SEGUNDA;

        System.out.println(dia.toString()+" - "+dia.getValor());

        Data data = new Data(1,4,2016,DiaSemana2.SEXTA);

        System.out.println(data.toString());
    }
}
