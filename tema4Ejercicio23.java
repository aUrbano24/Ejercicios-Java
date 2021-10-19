public class tema4Ejercicio23{
  public static void main(String[] args) {
  /*Escribe un programa que calcule el precio final de un producto según su
* base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
* reducido o superreducido) y el código promocional. Los tipos de IVA general,
* reducido y superreducido son del 21%, 10% y 4% respectivamente. promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
* respectivamente que no se aplica promoción, el precio se reduce a la mitad,
* se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
* si se muestran los valores correctos, aunque los números no estén tabulados.*/
    double baseConIVA=0;
    double precioFinal=0;
    System.out.print("Introduce el precio sin impuestos: ");
    double baseImponibles = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el tipo de IVA: (general, aplicado o superreducido).");
    String tipoDeIVA = System.console().readLine();
    switch (tipoDeIVA) {
      case "general":
      baseConIVA = baseImponibles * 1.21;
      break;
       case "reducido":
      baseConIVA = baseImponibles * 1.10;
      break;
       case "superreducido":
      baseConIVA = baseImponibles * 1.04;
      break;
      default:
      System.out.println("Valor no aceptable");
    }
      System.out.println("Indica la promoción (nopro, mitad, meno5, 5por) .");
      String promo = System.console().readLine();
      switch (promo) {
        case "nopro":
        precioFinal = baseConIVA;
        break;
        case "mitad":
        precioFinal = baseConIVA/2;
        break;
        case "meno5":
        precioFinal = baseConIVA - 5;
        break;
        case "5por":
        precioFinal = baseConIVA * 0.95;
        break;
        default:
        System.out.println("Valor no aceptable");
      }
     System.out.println("El precio final es " + precioFinal);
    }
  }

