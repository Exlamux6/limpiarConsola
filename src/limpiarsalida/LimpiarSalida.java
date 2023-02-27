package limpiarsalida;
import java.awt.AWTException;
import java.util.Scanner;

/**
 * @author Exlamux6
 */
public class LimpiarSalida {
    public static void main(String[] args) throws AWTException {
        LimpiarConsola limpiarConsola = new LimpiarConsola(); //Creamos un objeto
        Scanner leer = new Scanner(System.in); //Creamos un objeto (Scanner)
        
        System.out.print("Escribe un nombre:");
        String nombre = leer.nextLine(); //Guardamos los datos que se inresan del teclado en la variable nombre
        System.out.println(nombre); //Imprimimos los datos guardados
        new java.util.Scanner(System.in).nextLine(); //Hacemos una pausa (Dar enter para quitar la pausa
        limpiarConsola.limpiar(); //Se limpia la ventana de salida
    }
}
