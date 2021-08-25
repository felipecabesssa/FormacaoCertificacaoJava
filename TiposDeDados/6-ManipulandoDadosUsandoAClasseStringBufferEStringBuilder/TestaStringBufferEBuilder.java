class TestaStringBufferEBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Caelum");
        sb.append(" - ");
        sb.append("Ensino e Inovacao");
        System.out.println(sb.toString());
        //Esse toString é opcional, pos o syso ja tem o toString meio que imbutido nele.

        //Delimitando o tamanho do StringBuffer
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println(sb2.toString());
        //aqui ele não imprime 50 e sim uma string vazia de 50 posições

        StringBuffer sb3 = new StringBuffer(sb);
        sb3.append(" e Alura e Casa do Codigo");
        System.out.println(sb3);

        //O método INSERT determina a posição onde vai inserir e o que
        StringBuffer sb4 = new StringBuffer("Caelum - Inovacao");
        sb4.insert(9, "Ensino e ");
        //Insere esse texto logo após o - (posição 9)
        System.out.println(sb4);
        //Ja o DELETE exclui o intervalo que vc setar, ex.:
        sb4.delete(6, 15);
        System.out.println(sb4);
        //tbem temos o REVERSE que troca a ordem das palavras, ex.:
        System.out.println(new StringBuffer("Felipe").reverse());
    }
}

/*

- Daria no mesmo substituir o StringBuffer por StringBuilder - o buffer vem de uma
versão mais antiga do java o builder tbem mas foi do java 1.5 (java 5) pra ca.

- O StringBuilder/Buffer no fundo nada mais são do que a concatenação que fazemos
com variaveis e strings (ao concatenar ele meio que usa isso implicitamente).



*/
