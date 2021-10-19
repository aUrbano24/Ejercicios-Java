public class tema4Ejercicio11{
  public static void main(String[] args) {
  /*Escribe un programa que dada una hora determinada (horas y minutos), calcule
  los segundos que faltan para llegar a la medianoche.*/
  System.out.println("Introduce la hora que es sin los minutos: ");
  int hora = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce los minutos restantes: ");
  int minutos = Integer.parseInt(System.console().readLine());
  
  int operacion = 1440 - ((hora * 60) + minutos);
  int horasRestantes = operacion/60;
  System.out.println("Queda " + horasRestantes + " y " + operacion % 60 +" minutos para medianoche.");
  
  
  }
}





