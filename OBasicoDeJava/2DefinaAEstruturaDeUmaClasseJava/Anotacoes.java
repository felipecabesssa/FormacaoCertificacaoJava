public class Anotacoes {
    
}
/** javadoc */
/* Dentro de 1 arquivo java eu só posso ter 1 classe/tipo/interface publico
e se esse cara é público, por regra ele tem que ter o mesmo nome do arquivo

- variavel por padrão é estatica e pública
- método por padrão é abstrato e público
se eu não colocar nada diferente eles adotam esse padrão.

resumo:
- um arquivo java, vários tipos OK
- um arquivo java, um unico publico OK 
- um arquivo java, vários públicos ERRADO
- um arquivo java, público com nome do arquivo OK
- um arquivo java, público nome diferente ERRADO 

Pacotes
Pacotes servem para separar e organizar as diversas classes que temos em nossos sistemas. Todas as classes pertencem a um pacote, sendo que, caso o pacote não seja explicitamente declarado, a classe fará parte do que chamamos de pacote padrão, ou default package. Todas as classes no default package se enxergam e podem ser utilizadas entre si. Classes no pacote default não podem ser importadas para uso em outros pacotes:

// Uma classe no pacote padrão
class Pessoa {
    //...
}

Classe
Uma classe é a forma no Java onde definimos os atributos e comportamentos de um objeto. A declaração de uma classe pode ser bem simples, apenas a palavra class seguida do nome e de {}:

Dentro de uma classe, podemos ter variáveis, métodos e construtores. Essas estruturas são chamadas de membros da classe.:

class Pessoa {

    String nome;
    String sobrenome;

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + this.sobrenome;
    }
}

Nomes dos membros
Variáveis
Usando como exemplo a classe Pessoa definida anteriormente, nome e sobrenome são variáveis. A declaração de variáveis é bem simples, sempre o tipo seguido do nome da variável.

Dizemos que essas são variáveis de instância, pois existe uma cópia delas para cada objeto Pessoa criado em nosso programa. Cada cópia guarda o estado de uma certa instância desses objetos.

Existem ainda variáveis que não guardam valores ou referências para uma determinada instância, mas sim um valor compartilhado por todas as instâncias de objetos. Essas são variáveis estáticas, definidas com a palavra-chave static. Veremos mais sobre esse tipo de membro mais à frente.

Métodos
A declaração de métodos é um pouquinho diferente pois precisamos do tipo do retorno, seguido do nome do método e seguido de parênteses, sendo que pode ou não haver parâmetros de entrada desse método. Cada parâmetro é uma declaração de variável em si. Essa linha do método, onde está definido o retorno, o nome e os parâmetros é onde temos a assinatura do método. Cuidado, pois a assinatura de um método inclui somente o nome do método e os tipos dos parâmetros.

Assim como variáveis, métodos também podem ser static, como veremos mais adiante.

Construtores
Uma classe pode possuir zero ou vários construtores. Nossa classe Pessoa possui um construtor que recebe como parâmetros o nome e o sobrenome da pessoa. A principal diferença entre a declaração de um método e um construtor é que um construtor não tem retorno e possui o mesmo nome da classe.

Métodos com o mesmo nome da classe
Note que um construtor pode ter um return vazio:

class X {
    int j = -100;

    X(int i) {
        if (i > 1)
            return;
        j = i;
    }
}

Caso o valor seja maior que 1, o valor de j será -100, caso contrário, será o mesmo valor de i.

Interfaces
Além de classes, também podemos declarar interfaces em nossos arquivos java. Para definir uma interface usamos a palavra reservada interface:

interface Autenticavel {

    final int TAMANHO_SENHA = 8;

    void autentica(String login, String senha);
}

Em uma interface, devemos apenas definir a assinatura do método, sem a sua implementação. Além da assinatura de métodos, também é possível declarar constantes em interfaces.



*/
