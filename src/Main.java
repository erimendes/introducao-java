import Animais.Cachorro;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world");
    // byte -127 a 126
    // short -32768 a 32767
    // int -2b a 2b
    // long -9t a 9t

    Cachorro cachorro = new Cachorro();

    cachorro.nome = "Puppy";
    cachorro.cor = "Marron";
    cachorro.altura = 25;
    cachorro.peso = 5.5;
    cachorro.tamanhoDoRabo = 5;
}
