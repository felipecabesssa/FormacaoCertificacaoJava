class Overloader {
    public void metodo(int a){
        System.out.println("com int");
    }
    public void metodo(double a){
        System.out.println("com double");
    }
    public void metodo(){
        System.out.println("sem nada");
    }
}
class TestaOverloader {
    public static void main(String[] args) {
        new Overloader().metodo();
        new Overloader().metodo(423);
        new Overloader().metodo(423.3);

        /*
        Interessante isso para entender a chamada dos métodos e
        que os números passados entre parametros não serão impressos,
        nesse caso nós usamos apenas pro compilador diferenciar qual
        método estamos querendo usar/chamando.
        */

    }
}
