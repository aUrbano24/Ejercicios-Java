public class tema4Ejercicio8{
  public static void main(String[] args) {
  /*Amplía el programa anterior para que diga la nota del boletín (insuficiente,
  suficiente, bien, notable o sobresaliente).*/
  System.out.println("Introduce tu nota: ");
  double nota = Double.parseDouble(System.console().readLine());
  
  if (nota<=4) {
    System.out.println("Tienes un insuficiente. "); }
    
  if (nota == 5) {
      System.out.println("Tienes un suficiente. "); }
      
  if (nota == 6) {
      System.out.println("Tienes un bien. "); }
  
  if ((nota>6) && (nota<9)) {
      System.out.println("Tienes un notable. "); }
  
  if ((nota>8) && (nota<11)) {
      System.out.println("Tienes un sobresaliente. "); }
      
  if(nota>10) {
    System.out.println("Esta nota no es aceptable. "); }
  }
}
