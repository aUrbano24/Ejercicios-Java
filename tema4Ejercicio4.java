public class tema4Ejercicio4{
  public static void main(String[] args) {
  /*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
    las horas extras. Escribe un programa que calcule el salario semanal de un
    trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
    trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
    la hora.*/
    int operacion;
    System.out.println("Introduce las horas trabajadas:");
    int horas = Integer.parseInt(System.console().readLine());
      if (horas > 40) {
        operacion = 40 * 13 + (horas - 40) * 16;
      
     } else {
        operacion = horas * 13;
      }
        System.out.println("Has ganado " + operacion + " euros");
    }
    }
