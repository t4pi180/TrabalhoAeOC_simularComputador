package TextEnumeracao;


//exemplo de como usar enum em forma de método dentro da classe. Não necessita criar uma classe.
public class Formulario {


    public static void main(String[] args) {
        Genero f = Genero.FEMININO;
        System.out.println(f);
    }

    enum Genero{
        FEMININO('F'),MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor=valor;
        }
    }

    private String nome;
    private Genero genero;
}
