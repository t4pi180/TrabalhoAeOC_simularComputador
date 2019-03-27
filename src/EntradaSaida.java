import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EntradaSaida {
    public static void main(String[] args) throws FileNotFoundException {


        arquivoAssembly("assembly16bits.txt");

    }


    public static void arquivoAssembly(String arquivoTXT){


        try {
            FileReader arquivo = new FileReader(arquivoTXT);
            BufferedReader lerArquivo = new BufferedReader(arquivo);


            String linha = lerArquivo.readLine();
            while (linha !=null){

                System.out.println(linha);//imprime o texto

                if(!parserArquivo(linha)) throw new ExcecaoParser();
                encoder(linha);
                linha = lerArquivo.readLine();// passa para proxima linha do txt



            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ExcecaoParser excecaoParser) {
            excecaoParser.printStackTrace();
        }
    }
    //------------------------------------------
    enum encoder{
        MOV, INC, ADD, INUL;

    }
    //------------------------------------------

    public static void encoder(String texto){
        byte[] vetor=new byte[3];
        String s =texto;
        String[] array= s.split(" ");
        switch (array[0].toUpperCase()){
            case "MOV":
                byte[] mov = array[0].getBytes();
                byte novoValor=100;
                vetor[0]=novoValor;
//                char[] p = s.toCharArray(); não é isso
//                vetor[1]=;
                break;
            case "INC":
                byte[] inc = array[0].getBytes();

                break;
            case "IMUL":
                byte[] imul = array[0].getBytes();

                break;
            case "ADD":
                byte[] add = array[0].getBytes();

                break;
        }

//        System.out.println(array[(0)]);
    }

    public static void buffer(){
        byte[] vetor;

    }

    public static boolean parserArquivo(String linha){
        if(linha.matches("(?i)mov\\s+0x\\d{4},\\s*\\d\\s*")){
            return true;
        }
        if(linha.matches("(?i)mov\\s+[a-zA-Z],\\s*\\d")){
            return true;
        }
        if(linha.matches("(?i)mov\\s+0x\\d{4},\\s*[a-zA-Z]")){
            return true;
        }
        if(linha.matches("(?i)mov\\s+[a-zA-Z],\\s*0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)add\\s+[a-zA-Z],\\s*\\d+")){
            return true;
        }
        if(linha.matches("(?i)add\\s+[a-zA-Z],\\s*[a-zA-Z]")){
            return true;
        }
        if(linha.matches("(?i)add\\s+0x\\d{4},\\s*\\d+")){
            return true;
        }
        if(linha.matches("(?i)inc\\s+[a-zA-Z]")){
            return true;
        }
        if(linha.matches("(?i)inc\\s+0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*[a-zA-Z],\\s*[a-zA-Z]")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*[a-zA-Z],\\s*0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*[a-zA-Z],\\s*\\d+")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*0x\\d{4},\\s*[a-zA-Z]")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*0x\\d{4},\\s*0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*0x\\d{4},\\s*\\d+")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*[a-zA-Z],\\s*[a-zA-Z]")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*[a-zA-Z],\\s*0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*[a-zA-Z],\\s*\\d+")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*0x\\d{4},\\s*[a-zA-Z]")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*0x\\d{4},\\s*0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*0x\\d{4},\\s*\\d+")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*\\d+,\\s*[a-zA-Z]+")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*\\d+,\\s*0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+[a-zA-Z],\\s*\\d+,\\s*\\d+")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*\\d+,\\s*[a-zA-Z]+")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*\\d+,\\s*0x\\d{4}")){
            return true;
        }
        if(linha.matches("(?i)imul\\s+0x\\d{4},\\s*\\d+,\\s*\\d+")){
            return true;
        }
        return false;
    }

    public static void escolheTamanhoBarramento(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe tamanho da palavra: 8, 16 ou 32 bits?");
        try {
            int tamanhoBarramento = teclado.nextInt();
            switch (tamanhoBarramento){
                case (8):
                    System.out.println("Escolhido palavra de 8bits");
                    break;
                case (16):
                    System.out.println("Escolhido palavra de 16bits");
                    break;
                case (32):
                    System.out.println("Escolhido palavra de 32bits");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    escolheTamanhoBarramento();
                    break;
            }

        }catch (InputMismatchException e){
            System.out.println("Caractere inválido. Digite apenas números!");
            escolheTamanhoBarramento();
        }
    }
}
