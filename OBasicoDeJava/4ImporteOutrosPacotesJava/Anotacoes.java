public class Anotacoes {
    
}


/*
$ javac modelo/Pessoa.java
ls modelo 
Endereco.class  Endereco.java  Pessoa.class  Pessoa.java
(ele entende que a pessoa precisa do endereço e ja compila tambem.
o mais comum é mandarmos compilar tudo da seguinte forma:
javac modelo/*.java)

Quando tenho classes dentro do mesmo pacote, posso usar (referenciar) elas
sem precisar importar, se estiver em outro basta eu importar e posso usar numa boa.

posso também ao invés de importar referenciar o pacote ao usar a classe. ex.:

package financeiro;
class Pedido{
    modelo.Pessoa cliente; //se colocasse só Pessoa ele não acharia ela, 
    o nome disso é fulled qualified name (mto chato de se trabalhar assim, 
    bem mais fácil importar logo e usar quando quiser.)
}

porem dependendo da visibilidade da classe ele da erro (pessoa is not public por ex)

resumo:
uma classe precisa ser public para poder ser importada.
se não for publica eu só consigo acessa-la dentro do mesmo pacote.

posso importar tudo (tipos etc) que estejam no pacote modelo para não
ter que fazer import modelo.pessoa, import modelo.cliente bla bla bla
só mando um import modelo.*  (assim ele impporta só os tipos,
subpacotes ele não importa)

NUNCA JAMAIS Crie classe no pacote principal ! alem de ser uma completa 
falta de organização, essa classe não podera ser importada nem usada por NINGUÉM !

existem 3 coisas numa classe: Package
                              Import
                              Tipos
                              e comentarios a rodo rrsrsrs

-------------------------------

Anotações da aula:

import static
Desde o Java 5, é possível importar apenas métodos e atributos estáticos de uma classe, usando a palavra-chave static juntamente com o import. Podemos importar um a um ou simplesmente importar todos usando *:

package model;

public class Utils {

    // Atributo estático público 
    public static int VALOR = 0;
    // Métodos estáticos públicos
    public static void metodo1() {}
    public static void metodo1(int a) {}

}

// Importando todos os membros public static de Utils
import static model.Utils.*;

public class Testes {

    public static void main(String[] args) {
        int x = VALOR;
        metodo1();
        metodo1(x);
    }
}


*/