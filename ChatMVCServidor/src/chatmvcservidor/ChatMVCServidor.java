
package chatmvcservidor;

import controlador.ControladorServidor;
import modelo.ModeloServidor;
import vista.IVista;
import vista.VistaJFrame;

public class ChatMVCServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVista vista = new VistaJFrame();
        ModeloServidor modelo = new ModeloServidor();
        
        ControladorServidor controlador = new ControladorServidor(vista, modelo);
        
        vista.setControlador(controlador);
        modelo.setControlador(controlador);
        
        controlador.arrancar();
    }
    
}
