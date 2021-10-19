public class stringDeVar{
  public static void main(String[] args) {
    /*Escribe un programa que declare 5 variables de tipo char. A continuación, crea
    otra variable como cadena de caracteres y asígnale como valor la concatenación
    de las anteriores 5 variables. Por último, muestra la cadena de caracteres
    por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?*/
    char letra1 = 'M';
    char letra2 = 'A';
    char letra3 = 'R';
    char letra4 = 'I';
    String maria = "" + letra1 + letra2 + letra3 + letra4 + letra2;
    System.out.println("El nombre es " + maria);
  }
}
