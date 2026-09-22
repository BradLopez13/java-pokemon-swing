 package Pantalla_de_Eleccion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import MenuInicio.FotoFondo;
import Pantalla_combate.Combate;
import Pantalla_de_carga.Cargando;


import javax.swing.Icon;
import javax.swing.ImageIcon;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;

import javax.swing.border.SoftBevelBorder;

public class Eleccion extends JFrame {

	private JPanel contentPane;
	FotoFondo fondo=new FotoFondo("/Imagenes/eleccion.jpg");
	FotoFondo charizard=new FotoFondo("/Imagenes/Charizard-Pokemon.png");
	FotoFondo blastoise=new FotoFondo("/Imagenes/Blastoise-Pokemon.png");
	FotoFondo venasaur =new FotoFondo("/Imagenes/Venasaur-Pokemon.png");
	FotoFondo pikachu=new FotoFondo("/Imagenes/Pikachu-Pokemon.png");
	private static JLabel pokemon_elegido1 = new JLabel("");
	private static JLabel pokemon_elegido2 = new JLabel("");
	ArrayList <Icon> iconos = new ArrayList<Icon>();
	public static String p_elegido;
	public static String p_elegido2;
	public static Combate combate;


	/**
	 * Create the frame.
	 */
	public Eleccion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 852, 504);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		fondo.setForeground(new Color(192, 192, 192));
		getContentPane().add(fondo);
		fondo.setBounds(0, 0, 836, 465);
		fondo.setLayout(null);
		fondo.add(pokemon_elegido1);
		pokemon_elegido1.setBounds(228,170,107,96);
		pokemon_elegido2.setBounds(501, 170, 107, 96);
		fondo.add(pokemon_elegido2);
		
		/**
		 * Arraylist que almacena los iconos de los pokemones
		 */
		iconos.add((new ImageIcon(Eleccion.class.getResource("/Imagenes/Charizard-Pokemon.png"))));
		iconos.add((new ImageIcon(Eleccion.class.getResource("/Imagenes/Blastoise-Pokemon.png"))));
		iconos.add((new ImageIcon(Eleccion.class.getResource("/Imagenes/Venasaur-Pokemon.png"))));
		iconos.add((new ImageIcon(Eleccion.class.getResource("/Imagenes/Pikachu-Pokemon.png"))));

		
			/**
			 *Charizard foto izquierda
			 */
			JButton charizard_btn = new JButton("");
			charizard_btn.setContentAreaFilled(false);
			charizard_btn.setBounds(39, 11, 107, 96);
			fondo.add(charizard_btn);
			charizard_btn.add(charizard);
			charizard.setBounds(39, 11, 107, 96);
			charizard_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido1.setIcon((Icon) iconos.get(0));
						p_elegido="Charizard";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});
			
			/**
			 *Blastoise foto izquierda
			 */
			JButton blastoise_btn = new JButton("");
			blastoise_btn.setContentAreaFilled(false);
			blastoise_btn.setBounds(39, 118, 107, 96);
			fondo.add(blastoise_btn);
			blastoise_btn.add(blastoise);
			blastoise.setBounds(39, 121, 107, 96);
			blastoise_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido1.setIcon((Icon) iconos.get(1));
						p_elegido="Blastoise";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});
			
			
			/**
			 *Venasaur foto izquierda
			 */
			JButton venasaur_btn = new JButton("");
			venasaur_btn.setContentAreaFilled(false);
			venasaur_btn.setBounds(39, 225, 107, 96);
			fondo.add(venasaur_btn);
			venasaur_btn.add(venasaur);
			venasaur.setBounds(39, 233, 107, 96);
			venasaur_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido1.setIcon((Icon) iconos.get(2));
						p_elegido="Venasaur";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});
			
			
			/**
			 *Pikachu foto izquierda
			 */
			JButton pikachu_btn = new JButton("");
			pikachu_btn.setContentAreaFilled(false);
			pikachu_btn.setBounds(39, 332, 107, 96);
			fondo.add(pikachu_btn);
			pikachu_btn.add(pikachu);
			pikachu.setBounds(39, 233, 107, 96);
			pikachu_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido1.setIcon((Icon) iconos.get(3));
						p_elegido="Pikachu";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});

			/**
			 * Charizard foto derecha
			 */
			JButton charizard_btn1 = new JButton("");
			charizard_btn1.setContentAreaFilled(false);
			charizard_btn1.setBounds(701, 11, 107, 96);
			fondo.add(charizard_btn1);
			FotoFondo charizard1=new FotoFondo("/Imagenes/Charizard-Pokemon.png");
			charizard_btn1.add(charizard1);
			charizard1.setBounds(700, 11, 107, 96);
			charizard_btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido2.setIcon((Icon) iconos.get(0));
						p_elegido2="Charizard";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});
			
			/**
			 *Blastoise foto derecha
			 */
			JButton blastoise_btn1 = new JButton("");
			blastoise_btn1.setContentAreaFilled(false);
			blastoise_btn1.setBounds(701, 118, 107, 96);
			fondo.add(blastoise_btn1);
			FotoFondo blastoise1=new FotoFondo("/Imagenes/Blastoise-Pokemon.png");
			blastoise_btn1.add(blastoise1);
			blastoise1.setBounds(39, 121, 107, 96);
			blastoise_btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido2.setIcon((Icon) iconos.get(1));
						p_elegido2="Blastoise";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});
			
			
			/**
			 *Venasaur foto derecha
			 */
			JButton venasaur_btn1 = new JButton("");
			venasaur_btn1.setContentAreaFilled(false);
			venasaur_btn1.setBounds(701, 225, 107, 96);
			fondo.add(venasaur_btn1);
			FotoFondo venasaur1 =new FotoFondo("/Imagenes/Venasaur-Pokemon.png");
			venasaur_btn1.add(venasaur1);
			venasaur1.setBounds(39, 233, 107, 96);
			venasaur_btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido2.setIcon((Icon) iconos.get(2));
						p_elegido2="Venasaur";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});
		
			/**
			 *Pikachu foto derecha
			 */
			JButton pikachu_btn1 = new JButton("");
			pikachu_btn1.setContentAreaFilled(false);
			pikachu_btn1.setBounds(701, 332, 107, 96);
			fondo.add(pikachu_btn1);
			FotoFondo pikachu1=new FotoFondo("/Imagenes/Pikachu-Pokemon.png");
			pikachu_btn1.add(pikachu1);
			pikachu1.setBounds(39, 233, 107, 96);
			pikachu_btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pokemon_elegido2.setIcon((Icon) iconos.get(3));
						p_elegido2="Pikachu";
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});
			
			
			/**
			 * Boton Batalla
			 */
			JButton btn_batalla = new JButton("BATALLA");
			btn_batalla.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			btn_batalla.setBorderPainted(false);
			btn_batalla.setBackground(Color.GRAY);
			btn_batalla.setSelected(true);
			btn_batalla.setFont(new Font("Tahoma", Font.PLAIN, 25));
			btn_batalla.setBounds(334, 352, 197, 59);
			fondo.add(btn_batalla);
			btn_batalla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p_elegido==null||p_elegido2==null) {
						JOptionPane.showMessageDialog(null,"ELIGA UN POKEMON POR FAVOR");
					}else {
						try {
							combate = new Combate();
							combate.setVisible(false);
							combate.setResizable(false);
							Cargando frame = new Cargando(combate);
							
							frame.setVisible(true);
							frame.setResizable(false);
							dispose();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					
				}
			});
		
	}

}



