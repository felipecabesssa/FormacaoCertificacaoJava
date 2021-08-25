/*

// Declaração
int idade;

System.out.println(idade); // erro de compilação pq idade não foi inicializada

// Declaração
int idade;

// Inicialização explícita de uma variável
idade = 10;

// Utilização da variável
System.out.println(idade); // ok

Podemos declarar e iniciar a variável na mesma instrução:

// Declaração e inicialização explícita na mesma linha
double pi = 3.14;

Quando a variável é membro de uma classe, ela é iniciada implicitamente junto com o objeto com um valor default:

class Prova {
     double tempo;
}

// Implicitamente, na criação de um objeto Prova, 
// o atributo tempo é iniciado com 0
Prova prova = new Prova();

// Utilização do atributo tempo
System.out.println(prova.tempo);

Outro momento em que ocorre a inicialização implícita é na criação de arrays:

int[] numeros = new int[10];
System.out.println(numeros[0]); // imprime 0

Quando iniciadas implicitamente, os valores default para as variáveis são:

primitivos numéricos inteiros - 0
primitivos numéricos com ponto flutuante - 0.0
boolean - false
char - vazio, equivalente a 0
referências - null
Os tipos das variáveis do Java podem ser classificados em duas categorias: primitivos e não primitivos (referências).

Tipos primitivos
Todos os tipos primitivos do Java já estão definidos e não é possível criar novos tipos primitivos. São oito os tipos primitivos do Java: byte, short, char, int, long, float, double e boolean.

O boolean é o único primitivo não numérico. Todos os demais armazenam números: double e float são ponto flutuante, e os demais, todos inteiros (incluindo char). Apesar de representar um caractere, o tipo char armazena seu valor como um número positivo. Em Java, não é possível declarar variáveis com ou sem sinal (unsigned), todos os números (exceto char) podem ser positivos e negativos.

Cada tipo primitivo abrange um conjunto de valores. Por exemplo, o tipo byte abrange os números inteiros de -128 até 127. Isso depende do tamanho em bytes do tipo sendo usado.

Os tipos inteiros têm os seguintes tamanhos:

byte - 1 byte (8 bits, de -128 a 127);
short - 2 bytes (16 bits, de –32.768 a 32.767);
char - 2 bytes (só positivo), (16 bits, de 0 a 65.535);
int - 4 bytes (32 bits, de –2.147.483.648 a 2.147.483.647);
long - 8 bytes (64 bits, de –9.223.372.036.854.775.808 a 9.223.372.036.854.775.807).
Decorar o tamanho dos primitivos para prova
Não há a necessidade de decorar o intervalo e tamanho de todos os tipos de primitivos para a prova. O único intervalo cobrado é o do byte (-128 a 127).

É importante também saber que o char, apesar de ter o mesmo tamanho de um short, não consegue armazenar todos os números que cabem em um short, já que o char só armazena números positivos.

Literais
Na codificação, muitas vezes o programador coloca os valores das variáveis diretamente no código-fonte. Quando isso ocorre, dizemos que o valor foi literalmente escrito no código, ou seja, é um valor literal.

Todos os valores primitivos maiores que int podem ser expressos literalmente. Por outro lado, as referências (valores não primitivos) não podem ser expressas de maneira literal (não conseguimos colocar direto os endereços de memória dos objetos).

Ao inicializar uma variável, podemos explicitar que queremos que ela seja do tipo double ou long usando a letra específica:

// compila pois 737821237891232 é um double válido
System.out.println(737821237891232d);

// compila pois 737821237891232 é um long válido
System.out.println(737821237891232l);

// nao compila pois 737821237891232 é um valor maior que
// o int aceita
System.out.println(737821237891232);

Identificadores
Quando escrevemos nossos programas, usamos basicamente dois tipos de termos para compor nosso código: identificadores e palavras reservadas.

Chamamos de identificadores as palavras definidas pelo programador para nomear variáveis, métodos, construtores, classes, interfaces etc.

Já palavras reservadas ou palavras-chave são termos predefinidos da linguagem que podemos usar para definir comandos (if, for, class, entre outras).

São diversas palavras-chave na linguagem java:

abstract
assert
boolean
break
byte
case
catch
char
class
const
continue
default
do
double
else
enum
extends
false
final
finally
float
for
goto
if
implements
import
instanceof
int
interface
long
native
new
null
package
private
protected
public
return
short
static
strictfp
super
switch
synchronized
this
throw
throws
transient
true
try
void
volatile
while
null, false e true
Outras três palavras reservadas que não aparecem nessa lista são true, false e null. Mas, segundo a especificação na linguagem Java, esses três termos são considerados literais e não palavras-chave (embora também sejam reservadas), totalizando 53 palavras reservadas.

http://java.sun.com/docs/books/tutorial/java/nutsandbolts/_keywords.html

Identificadores válidos devem seguir as seguintes regras:

Não podem ser igual a uma palavra-chave;
Podem usar letras (unicode), números, $ e _;
O primeiro caractere não pode ser um número;
Podem possuir qualquer número de caracteres.
Os identificadores são case sensitive, ou seja, respeitam maiúsculas e minúsculas:

int umNome; // ok
int umnome;    // ok, diferente do anterior
int _num;    // ok
int $_ab_c; // ok
int x_y;    // ok
int false;    // inválido, palavra reservada
int x-y;     // inválido, traço
int 4num;     // inválido, começa com número
int av#f;     // inválido, #
int num.spc; // inválido, ponto no meio




*/