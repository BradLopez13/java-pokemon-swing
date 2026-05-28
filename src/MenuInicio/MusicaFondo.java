/**
 * 
 */
package MenuInicio;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicaFondo {
		Clip clip;
		URL urls[] = new URL[30];

		/**
		 * Array que almacena las rutas de las musicas a usar
		 */
	public MusicaFondo() {
		urls[0] = getClass().getResource("/Musica/InicioMusic.wav");
		urls[1] = getClass().getResource("/Musica/cargando.wav");
		urls[2] = getClass().getResource("/Musica/batalla.wav");



	} 
		
	/**
	 * Metodo que abre y reproduce el clip introducido del array
	 * @param i
	 */
	public void setFile(int i) {
		try {
			if (i < 0 || i >= urls.length || urls[i] == null) {
				clip = null;
				return;
			}
			AudioInputStream ais = AudioSystem.getAudioInputStream(urls[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
		}catch (Exception e) {
			clip = null;
		}
	}
	
	/**
	 * Metodos de inicar,parar,en bucle del clip
	 */
	public void play() {
		if (clip != null) {
			clip.start();
		}
	}
	
	public void loop() {
		if (clip != null) {
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}
	}
	
	public void stop() {
		if (clip != null) {
			clip.stop();
		}
	}
}
