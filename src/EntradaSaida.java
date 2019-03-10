import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EntradaSaida {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(parserArquivo("imul 0x0001, 0x0002, 0x0003",8));

    }


    public static void arquivoAssembly(String arquivoTXT){

        try {
            FileReader arquivo = new FileReader(arquivoTXT);
            BufferedReader lerArquivo = new BufferedReader(arquivo);

            String linha = lerArquivo.readLine();
            while (linha !=null){

                System.out.println(linha);
                linha = lerArquivo.readLine();
                //inserir parser aqui
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean parserArquivo(String linha, int tamanhoBarramento){
        if(linha.matches("(?i)mov\\s+0x\\d{4},\\s*\\d")){
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
        return false;
    }

    public static void escolheTamanhoBarramento(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe tamanho do barramento: 8, 16 ou 32 bits?");
        try {
            int tamanhoBarramento = teclado.nextInt();
            switch (tamanhoBarramento){
                case (8):
                    System.out.println("Escolhido barramento de 8bits");
                    break;
                case (16):
                    System.out.println("Escolhido barramento de 16bits");
                    break;
                case (32):
                    System.out.println("Escolhido barramento de 32bits");
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
