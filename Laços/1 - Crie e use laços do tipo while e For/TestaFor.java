import java.util.ArrayList;

public class TestaFor {
    public static void main(String[] args) {
        System.out.println("");

        for(int j=1;j<=10;j++){
            System.out.println(j);
        }

        System.out.println("");
        System.out.println("-");
        System.out.println("");

        //posso declarar duas variaveis no for.

        for(int k=0, l=10; k<10; k++, l--){
            System.out.println(k + " " + l);
        }

        System.out.println("");
        System.out.println("-");
        System.out.println("");

        int[] numeros = {1,2,3,4,5,6};
        for(int c = 0; c < numeros.length; c++){
            int numero = numeros[c];
            System.out.println(numero);
        }
        //enhanced for (mesma coisa que ele fez acima)
        for(int number : numeros){
            System.out.println(number);
        }
        System.out.println("");
        System.out.println("-");
        System.out.println("");

        //enhanced com arraLyst

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Felipe");
        nomes.add("Henrique");
        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("");
        System.out.println(nomes);
        System.out.println("");
    }
    
}
