package Pantalla_combate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import MenuInicio.FotoFondo;
import MenuInicio.MusicaFondo;
import MenuInicio.PantallaInicio;

import Pantalla_de_Eleccion.Eleccion;
import Pantalla_de_carga.Cargando;
import Pokemones.*;
import Pokemones.Blastoise;
import Pokemones.Charizard;
import Pokemones.Pikachu;
import Pokemones.Pokemon;
import Pokemones.TipoFuego;
import Pokemones.Venasaur;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Combate extends JFrame{

	private JPanel contentPane;
	FotoFondo fondo=new FotoFondo("/Imagenes/campoBatalla.png");
	 MusicaFondo musica=new MusicaFondo();
	String jugador = Eleccion.p_elegido;
	String contrincante = Eleccion.p_elegido2;
	 JProgressBar vidaContrincante = new JProgressBar();
	 JProgressBar vidaJugador = new JProgressBar();
	 JTextPane Informacion = new JTextPane();
	 JTextPane Informacion1 = new JTextPane();
	



	/**
	 * Create the frame.
	 */
	public Combate() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 852, 504);		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().add(fondo);
		fondo.setBounds(0, 0, 836, 465);
		fondo.setLayout(null);
		
		

		/**
		 * Pokemon jugador elegido en eleccion
		 */
		JLabel pokemon1 = new JLabel();
		pokemon1.setBounds(108, 358, 107, 96);
		fondo.add(pokemon1);
		pokemon1.setIcon(new ImageIcon(Eleccion.class.getResource("/Pokemon_Back/"+jugador+"_espalda.png")));
		
		/**
		 * Pokemon Contrario elegido en eleccion
		 */
		JLabel pokemon2 = new JLabel();
		pokemon2.setBounds(555, 156, 107, 96);
		fondo.add(pokemon2);
		pokemon2.setIcon(new ImageIcon(Eleccion.class.getResource("/Imagenes/"+contrincante+"-Pokemon.png")));
		
		/**
		 * Progres bar con la vida del contrincnate
		 */
		vidaContrincante.setMaximum(300);
		vidaContrincante.setMinimum(0);
		vidaContrincante.setForeground(Color.GREEN);
		vidaContrincante.setBounds(252, 74, 209, 26);
		fondo.add(vidaContrincante);
		vidaContrincante.setValue(300);
		
		/**
		 * Progres bar con la vida del jugador
		 */
		vidaJugador.setMaximum(300);
		vidaJugador.setMinimum(0);
		vidaJugador.setForeground(Color.GREEN);
		vidaJugador.setBounds(470, 385, 216, 26);
		fondo.add(vidaJugador);
		vidaJugador.setValue(300);
		
		
		/**
		 * Se imprimer el nombre del jugador
		 */
		JLabel Tablero = new JLabel(jugador);
		Tablero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Tablero.setOpaque(true);
		Tablero.setForeground(Color.BLACK);
		Tablero.setBackground(Color.LIGHT_GRAY);
		Tablero.setBounds(470, 315, 216, 105);
		fondo.add(Tablero);
		
		/**
		 * Se imprimer el nombre del contrincante
		 */
		JLabel Tablero1 = new JLabel(contrincante);
		Tablero1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Tablero1.setOpaque(true);
		Tablero1.setForeground(Color.BLACK);
		Tablero1.setBackground(Color.LIGHT_GRAY);
		Tablero1.setBounds(252, 0, 209, 105);
		fondo.add(Tablero1);
		Informacion.setOpaque(false);
		Informacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		/**
		 * TextPane donde se introducira el ataque usado por el jugador
		 */
		Informacion.setBackground(Color.LIGHT_GRAY);
		Informacion.setBounds(175, 272, 226, 83);
		fondo.add(Informacion);
		Informacion1.setOpaque(false);
		Informacion1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		/**
		 * TextPane donde se introducira el ataque usado por el jugador
		 */
		Informacion1.setBackground(Color.LIGHT_GRAY);
		Informacion1.setBounds(175, 190, 226, 83);
		fondo.add(Informacion1);
		
		AtaquesCombate ataque =new AtaquesCombate(this);
		ataque.Jugador();
		
		}
	/**
	 * metodos musica
	 * @param i
	 */
	public  void playMusic(int i) {
		musica.setFile(i);
		musica.play();
		musica.loop();
		}
		public  void stop() {
		musica.stop();
		}
		public  void playSound(int i) {
		musica.setFile(i);
		musica.play();
		}
}
