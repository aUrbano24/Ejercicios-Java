public class tema4Ejercicio3{
  public static void main(String[] args) {
  /*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
    nombre del día de la semana.*/
    System.out.println("Introduce un número del (1-7): ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (dia) {
      case 1: 
      System.out.println("Hoy es Lunes");
      break;
      case 2: 
      System.out.println("Hoy es Martes");
      break;
      case 3: 
      System.out.println("Hoy es Miercoles");
      break;
      case 4: 
      System.out.println("Hoy es Jueves");
      break;
      case 5: 
      System.out.println("Hoy es Viernes");
      break;
      case 6: 
      System.out.println("Hoy es Sabado");
      break;
      case 7: 
      System.out.println("Hoy es Domingo");
      break;
      default:
      System.out.println("Lo siento, la opción elegida es errónea");
    }
}
}
