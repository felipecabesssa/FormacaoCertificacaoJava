class Pessoa {
    static int id = 1;
    static void metodo(){
        System.out.println(id);
    }
}

public class Variaveis {
    public static void main(String[] args) {
        Pessoa.metodo();
    }
}

/* Regra geral de acesso as variaveis:

-NameDoTipo.variavel
-Instancia.variavel

Variáveis estáticas podem ser acessadas a partir de qualquer lugar, desde
que sejam respeitados os modificadores de acesso (pode acessar pelo nome 
da classe(tipo) diretamente, ou atravéz de uma instancia daquela classe/tipo) 


*/