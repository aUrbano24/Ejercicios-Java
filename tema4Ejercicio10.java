public class tema4Ejercicio10{
  public static void main(String[] args) {
    System.out.println("Introduce el mes en el que nacistes: ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el dia en el que nacistes: ");
    int dia = Integer.parseInt(System.console().readLine());
    switch (mes) {
      case 1:
      if (dia<21) {
        System.out.println("Eres capricornio");
      } else {
        System.out.println("Eres acuario");
      }
      break;
      case 2:
      if (dia<20) {
        System.out.println("Eres acuario");
      } else {
        System.out.println("Eres piscis");
      }
      break;
      case 3:
      if (dia<21) {
        System.out.println("Eres piscis");
      } else {
        System.out.println("Eres aries");
      }
      break;
      case 4:
      if (dia<21) {
        System.out.println("Eres aries");
      } else {
        System.out.println("Eres tauro");
      }
      break;
      case 5:
      if (dia<22) {
        System.out.println("Eres tauro");
      } else {
        System.out.println("Eres gémisis");
      }
      break;
      case 6:
      if (dia<22) {
        System.out.println("Eres gémisis");
      } else {
        System.out.println("Eres cáncer");
      }
      break;
      case 7:
      if (dia<23) {
        System.out.println("Eres cáncer");
      } else {
        System.out.println("Eres leo");
      }
      break;
      case 8:
      if (dia<23) {
        System.out.println("Eres leo");
      } else {
        System.out.println("Eres virgo");
      }
      break;
      case 9:
      if (dia<23) {
        System.out.println("Eres virgo");
      } else {
        System.out.println("Eres libra");
      }
      break;
      case 10:
      if (dia<23) {
        System.out.println("Eres libra");
      } else {
        System.out.println("Eres escorpio");
      }
      break;
      case 11:
      if (dia<23) {
        System.out.println("Eres escorpio");
      } else {
        System.out.println("Eres sagitario");
      }
      break;
      case 12:
      if (dia<22) {
        System.out.println("Eres sagitario");
      } else {
        System.out.println("Eres capricornio");
      }
      break;
  }
}
}
