class Moto {
    public static int getTotalDeMotos() {
        // marca = "Honda";
        return Moto.totalDeMotos;
    }

    public static final int PADRAO_TOTAL_DE_MOTOS = 8;
    public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;

    static int b = getMetodo();

    public static int getMetodo() {
        return 18;
    }

    static int a = 15;

    String marca;
}

class TestaStatic {
    public static void main(String[] args) {
        System.out.println(Moto.b);
        //System.out.println(Moto.getMetodo());
        //Moto.totalDeMotos = 15;
        System.out.println(Moto.getTotalDeMotos());

         Moto m = new Moto();
         System.out.println(m.getTotalDeMotos());
    }
}