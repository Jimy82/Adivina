import java.util.Scanner;
/**
 *  Deseamos implementar un juego en Java que permita al usuario adivinar un número oculto (que será aleatorio).  El funcionamiento será el siguiente:
 *  El programa mostrará un pequeño menú en pantalla con las siguientes opciones (1. Configurar, 2. Jugar, 3. Salir).
 *  Si el usuario selecciona el la primera opción, se le solicitará por teclado el número de intentos permitidos (numInt) y el número máximo  (numMax) generado.
 *  Si el usuario selecciona la opción 2,  el programa generará un número aleatorio entre 0 y numMax que será el número a adivinar (numOculto). A partir de este momento, se le solicitarán al usuario números hasta adivinar el número oculto.
 *  Si el usuario adivina el número, se mostrará un mensaje "Has ganado!. Has necesitado X intentos".
 *  Si se consume el número de intentos sin adivinar el número, se mostrará el mensaje "Perdiste!. Intentos consumidos".
 *  En cada intento, si el usuario no adivina el número se le proporcionará una pista, por ejemplo, "El número oculto es menor".
 *  En ambos casos, la siguiente acción será mostrar el menú.
 *  Si el usuario selecciona Jugar sin configurar previamente el número de intentos y el número máximo generado, se tomarán como valores por defecto: numInt=5 y numMax=10.
 *  Si el usuario pulsa la opción 3, el programa finaliza.
 * @author jaime
 * @version 1.0 (18/12/2022)
 */
public class Adivina{
/**
 * 
 * @param args 
 */	
        public static void main(String[] args) {
/**
 *Declaración de variables
 *Si el usuario selecciona Jugar sin configurar previamente el número de intentos y el número máximo generado,
 *se tomarán como valores por defecto: numInt=5 y numMax=10.
 */
            
                int opt;
		int numInt = 5, numMax = 10;
		int numOculto;

		Scanner teclado = new Scanner(System.in);
/**
 *Estructura "do-while". El cuerpo del bucle se ejecutará, a continuación se evaluara la condición y si es falsa el cuerpo del
 *bucle volverá a repetirse. El bucle finalizará cuando la evaluación de la condición sea verdadera.
 */
		do{
/**
 *El programa mostrará un pequeño menú en pantalla con las siguientes opciones (1. Configurar, 2. Jugar, 3. Salir).
 */			
                System.out.println(" ADIVINA EL NÚMERO OCULTO");
                System.out.println(" Selecciona una opción del Juego.");
		System.out.println(" 1. Configurar");
		System.out.println(" 2. Jugar");
		System.out.println(" 3. Salir");

		opt = teclado.nextInt();
/**
 *
 */
            switch (opt){
/**
 *Si el usuario selecciona el la primera opción,
 *se le solicitará por teclado el número de intentos permitidos (numInt) 
 *y el número máximo  (numMax) generado. 
 */				
                        case 1:
			System.out.println("Introduce el número de intentos");
			numInt = teclado.nextInt();
			System.out.println("Introduce el número máximo a adivinar");
			numMax = teclado.nextInt();
			break;
/**
 *Si el usuario selecciona la opción 2,  el programa generará un número aleatorio entre 0 y numMax
 *que será el número a adivinar (numOculto).
 * 
 */				
			case 2:
			numOculto = (int) Math.floor(Math.random() * numMax + 1);
			int numIntroducido;
			int intentos=0;
			while (intentos < numInt){
/**
 *A partir de este momento, se le solicitarán al usuario números hasta adivinar el número oculto. 
 */                        
                        System.out.println("Introduce el número buscado");
                        numIntroducido = teclado.nextInt();
/**
 *Si el usuario adivina el número, se mostrará un mensaje "Has ganado!. Has necesitado X intentos". 
 */
                        if (numIntroducido == numOculto){
                            
                            System.out.println("Has ganado!. Has necesitado " + intentos + " intentos");
                            intentos=numInt;
                        }
			else{
/**
 *En cada intento, si el usuario no adivina el número se le proporcionará una pista
 *por ejemplo, "El número oculto es menor".
 */
                            
                        if (numIntroducido < numOculto)
                            System.out.println("El número buscado es mayor. Inténtalo de nuevo");
                               
                        else
                            System.out.println("El número buscado es menor. Inténtalo de nuevo");
                            
                                intentos++;
                        }
					}
/**
 *Si se consume el número de intentos sin adivinar el número, se mostrará el mensaje "Perdiste!. Intentos consumidos".
 */                            
                            System.out.println("Perdiste!.Intentos consumidos");	
/**
 *Sentencia "break".Sirve para romper el flujo de control del bucle.
 */                                        
                            break;
			}
/**
 *Si el usuario pulsa la opción 3, el programa finaliza.
 */                                

		} while (opt != 3);
                
                   
        }
        
}