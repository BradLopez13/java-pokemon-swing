/**
 * 
 */
package MenuInicio;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Brad Lopez
 *
 */
public class FotoFondo extends JPanel {
	private Image imagen;
	private String ruta;
	
	/**
	 * Constructor que exige ruta alli donde sea llamada la clase
	 * @param ruta
	 */
	public FotoFondo (String ruta) {
		this.ruta=ruta;
	}
	
	/**
	 * Pintar la Foto
	 */
	public void paint(Graphics g) {
		Dimension size =getSize();
		imagen=new ImageIcon(getClass().getResource(ruta)).getImage();
		g.drawImage(imagen, 0, 0, size.width, size.height,null);
		
		setOpaque(false);
		super.paint(g);
	}

	

}
