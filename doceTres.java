public class doceTres {
public static void main(String[] args) {
  //(x * 0.40) + (y * 0.60) = notafinal --> y = notafinal - (x*0,40)
    System.out.println("Introduce la primera nota: ");
    String cantidad = System.console().readLine();
    System.out.println("Introduce la nota que quieres sacar: ");
    String cantidad2 = System.console().readLine();
    float primeraNota = Float.parseFloat(cantidad);
    float notaFinal = Float.parseFloat(cantidad2);
    float resultado = ((notaFinal * 100) - (primeraNota * 0.40f))/100;
    System.out.println("La nota que debes sacar es: " +resultado);
  }
}
    
