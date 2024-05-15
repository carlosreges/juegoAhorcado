package ahorcado;

import java.util.Scanner;

public class Ahorcado {
  public static void main(String[] args) {

    //Clase Scanner que permite que el usuario escriba
    Scanner sc = new Scanner(System.in);

    //Declaraciones y asignaciones
    String palabraSecreta = "inteligencia";
    int intentosMax = 10;
    int intentos = 0;
    boolean palabraAdivinada = false;
        
    //Arreglos:
    char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
    //Estructura de control: Iterativa (bucle)
    for (int i = 0; i < letrasAdivinadas.length; i++) {
      letrasAdivinadas[i] = '_';
            
    }
    
    //Estructura de control: Iterativa (bucle)
    
    while (!palabraAdivinada && intentos < intentosMax) {      
      System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras.)");
      
      System.out.println("Introduce una letra: ");
      
      //Clase escanner para pedir una letra
      char letra = Character.toLowerCase(sc.next().charAt(0));
      
      boolean letraCorrecta = false;
      
      for (int i = 0; i < palabraSecreta.length(); i++) {
        //Estructura de control: condicional
        if (palabraSecreta.charAt(i) == letra) {
          letrasAdivinadas[i] = letra;
          letraCorrecta = true;
        } 
      }
      
      if (!letraCorrecta) {
        intentos ++;
        System.out.println("¡Incorrecto! Te quedan " + (intentosMax - intentos) + " intentos.");
      }
      
      if (String.valueOf(letrasAdivinadas).equals(palabraSecreta) ) {
        palabraAdivinada = true;
        System.out.println("Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
      }
    }
    if (!palabraAdivinada) {
      System.out.println("Lo siento, te has quedado sin intentos.");
    }
    sc.close();
  }
}