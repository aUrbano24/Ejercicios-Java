public class tema4Ejercicio22{
  public static void main(String[] args) {
  /*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
  hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
  Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
  por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
  a las 15:00h.*/
  
  int horasDia = 0;
  System.out.print("Introduce el dia de la semana de lunes a viernes (1-5)");
  int dia = Integer.parseInt(System.console().readLine());
  switch (dia) {
    case 1:
    horasDia = 24*5;
    break;
    case 2:
    horasDia = 24*4;
    break;
    case 3:
    horasDia = 24*3;
    break;
    case 4:
    horasDia = 24*2;
    break;
    case 5:
    horasDia = 24;
    break;
  }
    System.out.println("Introduce la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    int resultado = ((horasDia * 60) - (hora * 60 + minutos));
    System.out.println("Para el finde semana quedan " + resultado/60 + " horas y " + resultado%60  + " minutos");
  }
}
