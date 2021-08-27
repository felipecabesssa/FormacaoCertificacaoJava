public class TestaArrayMulti {
    public static void main(String[] args) {

        // Arrays/vetores multidimensionais são "MATRIZES" se cruzam entre os eixos.

        int[][] tabela;

        tabela = new int[10][5];

        // podemos ter outras dimensões como no exemplo de um cubo (3) abaixo.

        int[][] cubo[];
        // podemos inicializar apenas uma direção do array
        cubo = new int[10][][];

        // ou 4 dimensões

        int[][] hipercubo[][];

        int zyx[][]=new int[3][10];
        int[]x=new int[20];
        int[]y=new int[10];
        int[]z=new int[30];
        zyx[0]=x;
        zyx[1]=y;
        zyx[2]=z;
        System.out.println(zyx[2].length);

    }

}
