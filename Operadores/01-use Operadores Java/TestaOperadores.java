public class TestaOperadores {
    public static void main(String[] args) {
                  //char ->
        // byte -> short -> int -> long
        // float -> double
        

        //colocar um tipo menos abrangente (menor) dentro de um
        //mais abrangente (maior) ok, o inverso que não pode.

        int a = 10;
        // tipos iguais
        long b = 20;
        // int cabe em um long
        float c = 10f;
        // tipos iguais
        double d = 20.0f;
        // float cabe em um double
        double e = 30.0;
        // tipos iguais

        float f = 40.0f;
        // erro, double não cabe em um float.
        //com o f depois do 40.0f funciona.

        //int g = 10l;
        // erro, long não cabe em int

        float h = 10l;
        // inteiros cabem em decimais
        double i = 20;
        // inteiros cabem em decimais

        //long j = 20f;
        // decimais não cabem em inteiros

        //System.out.println(a, b, c, d, e, h, i);

    }
}