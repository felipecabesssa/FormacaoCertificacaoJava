//package: D:\dev\Alura\certificacao

public class TestaStrings {
    public static void main(String[] args) {
        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");

        char[] nome = new char[]{'J', 'a', 'v', 'a'};
        String nome1 = new String(nome);

        StringBuilder sb1 = new StringBuilder("Java");
        String nome2 = new String(sb1);

        String nomeNulo = null;
        //Posso fazer isso porem se tentar acessar essa variavel dara erro 
        //de nullPointerException

        String nomeDaProva = "Certificacao" + " " + "Java";
        System.out.println(nomeDaProva);

        //String é imutavel, depois que ela é criada não muda de valor, logo
        //se eu usar um toUpercase como exemplo abaixo, nada vai acontecer

        String s = "caelum";
        s.toUpperCase();
        System.out.println(s);

        //para resolver isso teriamos que fazer da forma abaixo.

        String s2 = "caelum";
        s2 = s2.toUpperCase();
        System.out.println(s2);
        //pois aqui quando damos um simples s2.toUpercase ele cria uma nova referencia
    
        //- IMPORTANTE lembrar que uma string usa um array, (caelum é um array de 5 posições)
        //ex.: para pegar só a letra l 

        System.out.println(s.charAt(3));

        //lenght pega o tamanho das coisas, logo para saber o tamanho de uma string:
        //Lembrando que lenght é um método desse objeto.
        System.out.println(s.length());

        //isEmpty retorna se é vazia ou não, muito interessante para usarmos em campos
        //em que o preenchimento é obrigatório, como senha etc.

        System.out.println("".isEmpty()); //retorna true

        //mais exemplos e o que podemos fazer no material de apoio.

        //O EQUALS compara mas acusa camelcase, o ignoreCase evita isso, ex.:

        System.out.println("Java".equals("java")); //retorna false
        System.out.println("Java".equalsIgnoreCase("java")); //retorna true

        //Métodos de busca:
        String texto = "Pretendo fazer a prova de certificacao java";
        System.out.println(texto.indexOf("Pretendo")); //retorna 0 (posição da palavra "Pretendo")
        //se ele não achar/não existir ele retorna -1

        System.out.println(texto.indexOf("tendo")); //retorna 3 (onde começa o "tendo")

        System.out.println(texto.indexOf("e", 7)); //retorna 12 (primeiro e a partir da posição 7)

        //startsWith e endsWith - retorna true or false (se a string começar ou terminar com o que
        //vc passou de parametro respectivamente)

        System.out.println(texto.startsWith("Pretendia")); //retorna false
        System.out.println(texto.startsWith("Pretendo")); //retorna true

        System.out.println(texto.endsWith("java")); //retorna true
        System.out.println(texto.endsWith("C#")); //retorna false
    }
}
