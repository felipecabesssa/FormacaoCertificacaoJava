public class TestaArray{
    public static void main(String[] args) {
        int[] idades = new int[10];

        /*minha solução para exibir o vetor
        int i = 0;
        for(i = 0; i < idades.length; i++){
            idades[i] = i;
            System.out.println(idades[i]);
        }*/

        //Solução mais aprimorada dada pelo professor:

        for (int i = 0; i < idades.length; i++){
            idades[i] = i;
            System.out.println(idades[i]);
        }

        /* Posso declarar um array com parametros especificos usando o 
        colchetes, por exemplo um array ate o 10 pegando só os pares:

        int[] idades = new int[]{0,2,4,6,8}; //essa forma só funciona se
        de fato estiver na mesma linha.

        int i = 0;
        for(i = 0; i <= idades.length; i++){
            idades[i] = i;
            System.out.println(idades[i]);
        }*/

    }
}
/*
- Array é um objeto, então nós inicializamos ele com o new.

public static void main(String[] args){
    int[] idades = new int[10] // Criamos o vetor idades (int[] idades) e iniciamos ele com o new (tudo na mesma linha.)
}
*/