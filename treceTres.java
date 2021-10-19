public class treceTres {
public static void main(String[] args) {
  String frase;
  System.out.println("Introduce la primera frase: ");
   frase = System.console().readLine();
   System.out.println("Introduce la segunda frase: ");
   frase = "\n"+frase+"\n"+System.console().readLine();
   System.out.println("Introduce la tercera frase: ");
   frase = frase+"\n"+System.console().readLine();
   System.out.println("Introduce la cuatro frase: ");
   frase = frase+"\n"+System.console().readLine();
   System.out.println("Introduce la cinco frase: ");
   frase = frase+"\n"+System.console().readLine();
   System.out.println("La frases son: " + frase);
 }
}
