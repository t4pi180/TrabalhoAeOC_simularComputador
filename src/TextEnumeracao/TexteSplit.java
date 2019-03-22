package TextEnumeracao;

public class TexteSplit {
    public static void main(String[] args) {
        String s ="textoImenso separa";
        String[] array= s.split(" ");

        System.out.println(array[(0)]+" "+array[1]+"");
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
