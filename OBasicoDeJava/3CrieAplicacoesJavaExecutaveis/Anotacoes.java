public class Anotacoes {
    public static void main(String params[]) {
        System.out.println("Rodando o programa");
        System.out.println(params.length);
        for(int i=0; i < params.length; i++){
            System.out.println(i + " => " + params[i]);
        } //assim vamos ver todos os parametros que foram passados.
    }
}

/*
Se eu tiver um arquivo .java dentro de um package (pasta especifica) e 
compilar ele e depois tentar rodar na pasta raiz não vai funcionar, tenho que rodar
com o nome do pacote.NomeDaClasse.java ex: java d:/dev.Anotacoes - não roda tenho que entrar 
na pasta (package) correto e rodar D:/dev/Alura/...Anotacoes (lembrando que pra compilar colocamos
o .java e para rodar só o nome da classe main (sem o .java))
resumindo o ponto determina que a classe ta naquele pacote e a / separa os diretórios (padrão)


CLASSPATH - define onde o java vai procurar as classes, posso editar isso por meio das variaveis 
de ambiente, colocando classes la dentro ou arquivos .jar contendo classes. Porem tenha muito cuidado 
pois alterando o classpath tudo que usar java vai buscar nesse novo classpath.

arquivos .jar são somete arquivos .zip

posso rodar um metodo main mesmo que a classe não seja publica.

----------------------------------

material da aula:

Nesta seção, entenderemos as diferenças entre classes normais e classes que podem ser executadas pela linha de comando.

Uma classe executável é uma classe que possui um método inicial para a execução do programa - o método main, que será chamado pela JVM. Classes sem o método main não são classes executáveis e não podem ser usadas como ponto inicial da aplicação.

Método main
O tal método de entrada deve seguir algumas regras para ser executado pela JVM:

Ser público (public);
Ser estático (static);
Não ter retorno (void);
Ter o nome main;
Receber como parâmetro um array ou varargs de String (String[] ou String...).
São então métodos main válidos os seguintes exemplos:

//Parâmetro como array
public static void main (String[] args) {}

//Parâmetro como varargs
public static void main (String... args) {}

//A ordem dos modificadores não importa
static public void main(String[] args) {}

//O nome do parâmetro não importa
public static void main (String... argumentos){}

//Também é uma definição válida de array
public static void main (String args[]) {}

Classpath
Para compilar ou para executar, é necessário que os comandos javac e java possam encontrar as classes referenciadas pela aplicação java.

A prova de certificação exige o conhecimento do algoritmo de busca das classes. As classes feitas pelo programador são encontradas através do classpath (caminho das classes).

O classpath é formado por diretórios, jars e zips que contenham as classes e pacotes da nossa aplicação. Por padrão, o classpath está configurado para o diretório corrente (.).

Configurando o classpath
Há duas maneiras de configurar o classpath:

1) Configurando a variável de ambiente CLASSPATH no sistema operacional.

Basta seguir as opções do SO em questão e definir a variável. Isso é considerado uma má prática no dia a dia porque é um classpath global, que vai valer para qualquer programa java executado na máquina.

2) Com as opções -cp ou -classpath dos comandos javac ou java.

É a forma mais usada. Imagine que queremos usar alguma biblioteca junto com nosso programa:

$ javac -cp /diretorio/biblioteca.jar Prova.java
$ java -cp /diretorio/biblioteca.jar Prova

E podemos passar tanto caminhos de outras pastas como de JARs ou zips. Para passar mais de uma coisa no classpath, usamos o separador de parâmetros no SO (no Windows é ponto e vírgula, no Linux/Mac/Solaris/Unix são dois pontos):

$ javac -cp /diretorio/biblioteca.jar;/outrodir/ scjp/Prova.java
$ java -cp /diretorio/biblioteca.jar;/outrodir/ scjp.Prova

Para saber mais: arquivos JAR
Para facilitar a distribuição de bibliotecas de classes ou de aplicativos, o JDK disponibiliza uma ferramenta para a compactação das classes java.

Um arquivo JAR nada mais é que a pasta de nossas classes no formato ZIP mas com extensão .jar.

Para criar um jar incluindo a pasta scjp que fizemos antes:

jar -cf bib.jar scjp

Agora podemos executar nossa classe usando esse jar:

java -cp bib.jar scjp.Prova

Escolha a opção adequada para compilar e rodar o arquivo A.java, existente no diretório b:

package b;
class A {
    public static void main(String[] args) {
        System.out.println("rodando");
    }
}

Para compilar, estamos trabalhando com arquivos e diretórios, portanto javac b/A.java; enquanto, para rodar, estamos pensando em pacotes e classes: java b.A.

*/