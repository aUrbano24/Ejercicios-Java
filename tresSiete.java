public class tresSiete{
  public static void main(String[] args) {
    /*Escribe un programa que calcule el total de una factura a partir de la base
    imponible.*/
    // Ecuación: "x = imponible/0,21"
    System.out.println("Introduce la cantidad imponible: ");
    String i = System.console().readLine();
    double imponible = Integer.parseInt(i);
    System.out.println("El IVA es: " + imponible * 0.21);
    System.out.println("El total de la factura es: " + imponible * 1.21);
    
  }
}
