public class tresSeis{
  public static void main(String[] args) {
    //Escribe un programa que calcule el área de un triangulo.
    System.out.println("Introduce la base(b) del triangulo: ");
    String b = System.console().readLine();
    System.out.println("Introduce la altura(h) del triangulo: ");
    String h = System.console().readLine();
    int base = Integer.parseInt(b);
    int altura = Integer.parseInt(h);
    int resultado = (base * altura)/2;
    System.out.println("El área del triangulo es: " + resultado);

  }
}
