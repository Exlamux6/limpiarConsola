package limpiarsalida;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
/**
 * @author Exlamux6
 */
public class LimpiarConsola {
    
    public void limpiar() throws AWTException{
        Robot limpiarC = new Robot();
        limpiarC.keyPress(KeyEvent.VK_CONTROL);
        limpiarC.keyPress(KeyEvent.VK_L);
        limpiarC.keyRelease(KeyEvent.VK_CONTROL);
        limpiarC.keyRelease(KeyEvent.VK_L);
    }
}
