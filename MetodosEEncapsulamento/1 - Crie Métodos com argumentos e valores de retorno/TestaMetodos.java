class Param {
    void teste(int a, int b){
        
    }
}

// não posso inicializar um parametro dentro da definição do parametro,
// tipo void teste(int a = 3, int b = 5) beeeeeeeeeeeee erradissimo
// quem faz isso é quem chama o método, no caso o p
//outras linguagens suportam isso, mas no JAVA NÃO !

class ClasseComMetodos {

    int getNumero(){
        return 5;
    }

}
//toda classe, interface ou enum, pode ter métodos

public class TestaMetodos {
    public static void main(String[] args) {
        System.out.println("hello métodos");
        Param p = new Param();
        p.teste(1, 2);
    }
}


// regras de polimorfismo (mudanças de tipo) continuam valendo na chamada de métodos
