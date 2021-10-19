public class aplicarIVA{
  public static void main(String[] args) {
  /*Escribe un programa que calcule el total de una factura a partir de la base
    imponible (precio sin IVA). La base imponible estará almacenada en una
    variable.*/
    System.out.println("Introduce el precio de la factura sin IVA: ");
    String cantidad = System.console().readLine();
    double factura = Integer.parseInt(cantidad);
    double IVA = 1.21;
    double resultado = factura * IVA;
    System.out.println("El precio final es: " + resultado);
  }
}
    
    
