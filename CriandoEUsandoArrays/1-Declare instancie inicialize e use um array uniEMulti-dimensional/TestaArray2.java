public class TestaArray2 {
    public static void main(String[] args) {

        //Quando usamos objetos no array - é um array de referencia, dai 
        //usamos o . para acessar determinado atributo do objeto.
        Cliente[] clientes = new Cliente[10];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            clientes[i].nome = "Mario " + i;
        }

        // percorrendo o vetor com o for-eache
        for (Cliente c : clientes) {
            System.out.println(c.nome);
        }

        Cliente clientes2[] = new Cliente[5];
        clientes2[0] = new Cliente();
        clientes2[1] = new ClienteEspecial();
        // compilda de boa pq o vetor aceita receber um subtipo.
        // por exemplo, se for um array de pessoa, eu consigo jogar la dentro os subtipos pessoa fisica e juridica.

        Cliente guilherme = new Cliente();
        guilherme.nome = "guilherme";

        clientes2[0] = guilherme;

        System.out.println(guilherme.nome);
        System.out.println(clientes2[0].nome);

        guilherme.nome = "Silveira";

        System.out.println(guilherme.nome);
        System.out.println(clientes2[0].nome);


    }
}

class Cliente {
    String nome;
}

class ClienteEspecial extends Cliente {
}