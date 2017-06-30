	package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantalla {
	
	public String ingresarValor( String tituloVentana ){
		
		JFrame frame = new JFrame("cualquiera");
		
		String ingresado = JOptionPane.showInputDialog( frame, tituloVentana, "");
		
		return ingresado;
	}
	
	public void mostrarMensaje( String mensaje ){
		
		JFrame frame = new JFrame("etc");
		
		JOptionPane.showMessageDialog( frame, mensaje );
	}

}
