//package patio;

//import patio.Carro;

public class TestaCarro {
    Carro a = new Carro();
    a.modelo = "palio";
    a.setModelo("Palio2");
    System.out.println(a.getDadosDeImpressao());
    System.out.println(a.ano);
    System.out.println(a.modelo.length());
}
