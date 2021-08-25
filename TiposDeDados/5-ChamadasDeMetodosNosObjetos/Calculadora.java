public class Calculadora {
    public int soma(int... numeros) {
        int somaInterna = 0;
        for(int i = 0; i < numeros.length; i++) {
            somaInterna += numeros[i];
        }
        return somaInterna;
    }
}
class TestaCalculadora {
    public static void main(String... args) {
        // O main por padrão chama um vetor de args ;)
        Calculadora c = new Calculadora();
        System.out.println(c.soma(3, 5));
        System.out.println(c.soma(3, 5, 10));
        System.out.println(c.soma(3, 5, 10, 4));
        System.out.println(c.soma(3, 5, 10, 4, 5, 9, 6, 3));
        System.out.println(c.soma(3));
    }
}

//Um var args é um array por default, 
//um array NÃO é um var args !