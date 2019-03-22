package TextEnumeracao;

public class ExemplosExpressaoRegular {
    public static void main(String[] args) {

        boolean texto = "MOv 0x0003, 2".matches("(?i)mov\\s*[a-zA-Z],\\d");
        System.out.println(texto);

        //verifica se o registro é apenas de composto por 0 e 1
        //mov 0x0001, A -> verifica mov (endereço de memória), (inteiro literal)
        texto = "mov 0x0003, 2".matches("(?i)mov\\s0x[01]{4},\\s*\\d");
        System.out.println(texto);

        //mov a, 2 -> verifica mov (registrador), (inteiro literal)
        texto = "mov 0x0003, 2".matches("(?i)mov\\s*[a-zA-Z],\\s*\\d");
        System.out.println(texto);

        // mov 0x0001, A -> verifica mov (endereco de memoria), (registrador)
        texto = "mov 0x0003, A".matches("(?i)mov\\s*0x\\d{4},\\s*[a-zA-Z]");
        System.out.println(texto);

        //mov A,0x0001 -> verifica mov (registrador), (endereco de memoria)
        texto = "mov a, 0x0001".matches("(?i)mov\\s*[a-zA-Z],\\s*0x\\d{4}");
        System.out.println(texto);

        //add A, 1 -> verifica add (registrador), (inteiro literal)
        texto = "add a, 1".matches("(?i)add\\s+[a-zA-Z],\\d");
        System.out.println(texto);

        //add A, B -> verifica add (registrador), (registrador)
        texto = "add a, B".matches("(?i)add\\s+[a-zA-Z],\\s*[a-zA-Z]");
        System.out.println(texto);

        // add 0x0001, A -> verifica add (endereco de memoria), (registrador)
        texto = "add 0x0001, B".matches("(?i)add\\s+ox\\d{4},\\s*[a-zA-Z]");
        System.out.println(texto);

        //add 0x0001, 5 -> verifica add (endereco de memoria), (inteiro literal)
        texto = "add 0x0001, B".matches("(?i)add\\s+0x\\d{4},\\s*\\d+");
        System.out.println(texto);

        //inc X - >verifica inc (registrador)
        texto = "add 0x0001, B".matches("(?i)inc\\s+[a-zA-Z]");
        System.out.println(texto);

        //inc X - >verifica inc (endereco de memoria)
        texto = "add 0x0001, B".matches("(?i)inc\\s+0x\\d{4}");
        System.out.println(texto);

        //imul A, B, C -> verifica imul (registrador), (registrador), (registrador)
        texto = "imul A, B, c".matches("(?i)imul\\s+[a-zA-Z],\\s*[a-zA-Z],\\s*[a-zA-Z]");
        System.out.println(texto);

        //imul A, B, 0x0001 -> verifica imul (registrador), (registrador), (endereco de memoria)
        texto = "imul A, B, 0x0001".matches("(?i)imul\\s+[a-zA-Z],\\s*[a-zA-Z],\\s*0x\\d{4}");
        System.out.println(texto);

        //imul A, B, 5 -> verifica imul (registrador), (registrador), (inteiro literal)
        texto = "imul A, B, 5".matches("(?i)imul\\s+[a-zA-Z],\\s*[a-zA-Z],\\s*\\d+");
        System.out.println(texto);

        //imul A, 0x0001, C -> verifica imul (registrador), (endereco de memoria), (registrador)
        texto = "imul A, 0x0001, C".matches("(?i)imul\\s+[a-zA-Z],\\s*0x\\d{4},\\s*[a-zA-Z]");
        System.out.println(texto);

        //imul A, 0x0001, 0x0002 -> verifica imul (registrador), (endereco de memoria), (endereco de memoria)
        texto = "imul A, 0x0001, 0x0002".matches("(?i)imul\\s+[a-zA-Z],\\s*0x\\d{4},\\s*0x\\d{4}");
        System.out.println(texto);

        //imul A, 0x0001, 5 -> verifica verifica imul (registrador), (endereco de memoria), (inteiro literal)
        texto = "imul A, 0x0001, 5".matches("(?i)imul\\s+[a-zA-Z],\\s*0x\\d{4},\\s*\\d+");
        System.out.println(texto);

        //imul 0x0001, B, C -> verifica imul (endereco de memoria), (registrador), (registrador)
        texto = "imul 0x0001, B, C".matches("(?i)imul\\s+0x\\d{4},\\s*[a-zA-Z],\\s*[a-zA-Z]");
        System.out.println(texto);

        //imul 0x0001, B, 0x0001 -> verifica imul (endereco de memoria), (registrador), (endereco de memoria)
        texto = "imul 0x0001, B, 0x0001".matches("(?i)imul\\s+0x\\d{4},\\s*[a-zA-Z],\\s*0x\\d{4}");
        System.out.println(texto);

        //imul 0x0001, B, 5 -> verifica imul (endereco de memoria), (registrador), (inteiro literal)
        texto = "imul 0x0001, B, 5".matches("(?i)imul\\s+0x\\d{4},\\s*[a-zA-Z],\\s*\\d+");
        System.out.println(texto);

        //imul 0x0001, 0x0001, C -> verifica imul (endereco de memoria), (endereco de memoria), (registrador)
        texto = "imul 0x0001, 0x0002, C".matches("(?i)imul\\s+0x\\d{4},\\s*0x\\d{4},\\s*[a-zA-Z]+");
        System.out.println(texto);

        //imul 0x0001, 0x0001, 0x0002 -> verifica imul (endereco de memoria), (endereco de memoria), (endereco de memoria)
        texto = "imul 0x0001, 0x0002, 0x0003".matches("(?i)imul\\s+0x\\d{4},\\s*0x\\d{4},\\s*0x\\d{4}");
        System.out.println(texto);

        //imul 0x0001, 0x0001, 5 -> verifica imul (endereco de memoria), (endereco de memoria), (inteiro literal)
        texto = "imul 0x0001, 0x0002, 5".matches("(?i)imul\\s+0x\\d{4},\\s*0x\\d{4},\\s*\\d+");
        System.out.println(texto);

        //imul A, 5, C -> verifica imul (registrador), (inteiro literal), (registrador)
        texto = "imul A, 5, C".matches("(?i)imul\\s+[a-zA-Z],\\s*\\d+,\\s*[a-zA-Z]+");
        System.out.println(texto);

        //imul A, 5, 0x0003 -> imul (registrador), (inteiro literal), (endereco de memoria)
        texto = "imul A, 5, 0x0003".matches("(?i)imul\\s+[a-zA-Z],\\s*\\d+,\\s*0x\\d{4}");
        System.out.println(texto);

        //imul A, 5, 5 -> verifica (registrador), (inteiro literal), (inteiro literal)
        texto = "imul A, 5, 5".matches("(?i)imul\\s+[a-zA-Z],\\s*\\d+,\\s*\\d+");
        System.out.println(texto);

        //imul 0x0001, 5, C -> verifica (endereco de memoria), (inteiro literal), (registrador)
        texto = "imul 0x0001, 5, C".matches("(?i)imul\\s+0x\\d{4},\\s*\\d+,\\s*[a-zA-Z]+");
        System.out.println(texto);

        //imul 0x0001, 5, 0x0003 -> verifica (endereco de memoria), (inteiro literal), (endereco de memoria)
        texto = "imul 0x0001, 5, 0x0003".matches("(?i)imul\\s+0x\\d{4},\\s*\\d+,\\s*0x\\d{4}");
        System.out.println(texto);

        //imul 0x0001, 5, 5 -> verifica (endereco de memoria), (inteiro literal), (inteiro literal)
        texto = "imul 0x0001, 5, 5".matches("(?i)imul\\s+0x\\d{4},\\s*\\d+,\\s*\\d+");
        System.out.println(texto);


        texto = "add 0x0001, B".matches("(?i)inc\\s+0x\\d{4}");
        System.out.println(texto);

        //Procura a ocorrencia de 1 caractere
        boolean caractere = "E".matches(".");
        System.out.println(caractere);

        //Procura a ocorrência de 2 caracteres
        caractere = "Ab".matches("..");
        System.out.println(caractere);

        //Validação de cep
        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        boolean valida = "99855-000".matches(cep);
        System.out.println(valida);

        //Procura 2 dígitos no texto
        boolean valor = "74".matches("\\d{2}");
        System.out.println(valor);

        //Procura mais de 2 dígitos no texto
        valor = "21109009h0".matches("\\d{9,}");
        System.out.println(valor);

        //Procura dígitos entre os valores de 2 e 5
        valor = "2121".matches("\\d{2,5}");
        System.out.println(valor);

        //Procura dígito entre 0 e 1 vezes
        valor = "22".matches(".?");
        System.out.println(valor);

        //Procura dígito entre 0 e mais vezes
        valor = "75411".matches(".*");
        System.out.println(valor);

        //Procura dígito entre 1 e mais vezes
        valor = "".matches(".+");
        System.out.println(valor);

        //Cria expressão regular resumida da data
        String data = "02/05/1995";
        valor = data.matches("\\d{2}/\\d{2}/\\d{4}");
        System.out.println("Data: "+valor);

        //Cria a expressão regular resumida do cep
        cep = "8545-222";
        valor = cep.matches("\\d{4}-\\d{3}");
        System.out.println("Cep: "+valor);
    }
}
