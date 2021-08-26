public class TestaAritmetica {
    public static void main(String[] args) {
                 //char ->
        // byte -> short -> int -> long
        // float -> double
 
        /* O minimo que uma operação aritmetica devolve é um INT !!
            Logo se eu faço uma operação entre dois bytes e tento usar o 
            resultado também como byte da erro, pois o minimo é um nº maior (int)

            erro = possible loss of precision (perda de precisão)
        */

        int dois = 2;
        int dez = 10;
        // Fazendo uma soma com o operador "+".
        int doze = dois + dez;
        // Fazendo uma subtração com o operador "-".
        int oito = dez - dois;
        // Fazendo uma multiplicação com o operador "*".
        int vinte = dois * dez;
        // Fazendo uma divisão com o operador "/".
        int cinco = dez / dois;
        //resto da divisão
        int zero = dez % dois;

        System.out.println(doze);
        System.out.println(oito);
        System.out.println(vinte);
        System.out.println(cinco);
        System.out.println(zero);

        /* Divisão de numeros inteiros por 0 da erro de arithmeticException
        ja se eu dividir por ponto flutuante 0.0 ele deixa. */

    }
}
