public class Prueba2 {
  public static void main (String[] args){
    //esto es un comentario de una sola línea
    /* esto es un comentario
     * que ocupa varias lineas*/
          int nota1, nota2, nota3;
          String entrada;
          System.out.println("hola");
          System.out.println("Introduzca un valor entero:");
          entrada = System.console().readLine();
          System.out.println("La cadena introducida es:" + entrada);
          System.out.println(entrada);
          nota1 = Interger.parseInt(entrada);
          System.out.print("El número introducido es: ");
          System.out.println(nota1);
  }
}
