public class tema4Ejercicio12{
  public static void main(String[] args) {
  /*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
  que se imparten en el curso. Cada pregunta acertada sumará un punto. El
  programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
  tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
  en las diferentes asignaturas del curso.*/
    int puntos = 0;
    String respuesta;
    System.out.println("CUESTIONARIO DE 1º DAW");
    System.out.println("1. ¿Cuantos bits son un byte? ");
    System.out.println("a) 2\nb) 7\nc) 8");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.println("1. ¿Cuantos bits son un byte? ");
    System.out.println("a) 2\nb) 8\nc) 7");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("1. ¿Cuantos bits son un byte?");
    System.out.println("a) 8\nb) 7\nc) 2");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("Tienes " + puntos + " puntos");
  }
}
    
