public class Teste {
    String nome = "felipe";
    String nomeCompleto = nome + " henrique";

    public Teste(){
        System.out.println(nome);
    }
    public void m2(){
        System.out.println(nomeCompleto);
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        t.m2();
        t.nome = "joão";
        System.out.println(t.nome);
    }
}

