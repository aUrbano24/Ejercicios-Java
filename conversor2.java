public class conversor2{
  public static void main(String[] args) {
    // 1 euro = 166,3860 pesetas
    System.out.print("Introduce la cantidad en pesetas: \n");
    String cantidad = System.console().readLine();
    double pesetas = Integer.parseInt(cantidad);
    double resultado = pesetas/166.3860;
    System.out.println( pesetas + " pesetas equivale a " + resultado + "euros");

  }
}
