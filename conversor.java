public class conversor{
  public static void main(String[] args) {
    // 1 euro = 166,3860 pesetas
    System.out.print("Introduce la cantidad en euros: \n");
    String cantidad = System.console().readLine();
    double euros = Integer.parseInt(cantidad);
    double resultado = euros * 166.3860;
    System.out.println( euros + " euros equivale a " + resultado + "pesetas");

  }
}
