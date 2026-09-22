/**
 * 
 */
package Juego;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.Window;

import javax.sound.sampled.Clip;

import MenuInicio.MusicaFondo;
import MenuInicio.PantallaInicio;

/**
 * @author Brad Lopez
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Iniciar Juego 
		 */
		try {
			PantallaInicio frame = new PantallaInicio();
			frame.setVisible(true);
			frame.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
