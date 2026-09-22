/**
 * 
 */
package Pantalla_combate;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.Timer;

import MenuInicio.FotoFondo;
import MenuInicio.PantallaInicio;

import Pantalla_de_Eleccion.Eleccion;
import Pantalla_de_carga.Cargando;
import Pokemones.Ataque;
import Pokemones.Blastoise;
import Pokemones.Charizard;
import Pokemones.Pikachu;
import Pokemones.Venasaur;

/**
 * @author Alumno
 *
 */
public class AtaquesCombate  {
	static Charizard charizard =new Charizard();
	static Blastoise blastoise =new Blastoise();
	static Venasaur venasaur =new Venasaur();
	static Pikachu pikachu =new Pikachu();
	static int charAtak =(int) Math.floor(Math.random()*4);
	static int charAtak1;
	static int blasAtak =(int) Math.floor(Math.random()*(8-5)+5);
	static int blasAtak1;
	static int venAtak =(int) Math.floor(Math.random()*(12-9)+9);
	static int venAtak1;
	static int pikAtak =(int) Math.floor(Math.random()*(16-13)+13);
	static int pikAtak1;
	static String jugador = Eleccion.p_elegido;
	static String contrincante = Eleccion.p_elegido2;
	private static Combate combate;
	 /**
	  * COnstructor que determina el combate
	  * @param combate
	  */
	public AtaquesCombate(Combate combate) {
		this.combate = combate;
	}

	/**
	 * Metodo jugador 
	 * 	Comprueba que el tipo de ataque determinado en la clase enum sea igual que el de su interfaz y los esocoge aleatoriamente
	 */
	public  void Jugador() {
		switch (jugador) {
		case "Charizard":
			 pruebaCharizard();
			if(charizard.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[charAtak].getTipo())==true) {
				JButton Ataque1 = new JButton( Ataque.values()[charAtak].getNombre());
				Ataque1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
					combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[charAtak].getDano());
					combate.Informacion.setOpaque(true);
					combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[charAtak].getNombre());
					try {
						Thread.sleep(200);
						Contrincante();
						
						
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
				});
				Ataque1.setBounds(10, 11, 122, 52);
				combate.fondo.add(Ataque1);
				JButton Ataque2 = new JButton( Ataque.values()[charAtak1].getNombre());
				Ataque2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[charAtak1].getDano());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[charAtak1].getNombre());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				});
				Ataque2.setBounds(10, 74, 122, 52);
				combate.fondo.add(Ataque2);
				
				JButton Ataque3 = new JButton(charizard.n_placaje());
				Ataque3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- charizard.placaje());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ charizard.n_placaje());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque3.setBounds(10, 137, 122, 52);
				combate.fondo.add(Ataque3);
				
				JButton Ataque4 = new JButton(charizard.n_ataqueRapido());
				Ataque4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- charizard.ataqueRapido());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ charizard.n_ataqueRapido());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque4.setBounds(10, 200, 122, 52);
				combate.fondo.add(Ataque4);
			}
			break;
		case "Blastoise":
			pruebaBlastoise();
			if(blastoise.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[blasAtak].getTipo())==true) {
				JButton Ataque1 = new JButton( Ataque.values()[blasAtak].getNombre());
				Ataque1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[blasAtak].getDano());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[blasAtak].getNombre());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque1.setBounds(10, 11, 122, 52);
				combate.fondo.add(Ataque1);
				
				JButton Ataque2 = new JButton( Ataque.values()[blasAtak1].getNombre());
				Ataque2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[blasAtak1].getDano());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[blasAtak1].getNombre());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				Ataque2.setBounds(10, 74, 122, 52);
				combate.fondo.add(Ataque2);
				
				JButton Ataque3 = new JButton(blastoise.n_placaje());
				Ataque3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- blastoise.placaje());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ blastoise.n_placaje());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque3.setBounds(10, 137, 122, 52);
				combate.fondo.add(Ataque3);
				
				JButton Ataque4 = new JButton(blastoise.n_ataqueRapido());
				Ataque4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- blastoise.ataqueRapido());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ blastoise.n_ataqueRapido());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque4.setBounds(10, 200, 122, 52);
				combate.fondo.add(Ataque4);
			}
			break;
		case "Venasaur":
			pruebaVenasaur();
			if(venasaur.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[venAtak].getTipo())==true) {
				JButton Ataque1 = new JButton( Ataque.values()[venAtak].getNombre());
				Ataque1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[venAtak].getDano());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[venAtak].getNombre());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}						
					}
				});
				Ataque1.setBounds(10, 11, 122, 52);
				combate.fondo.add(Ataque1);
				
				JButton Ataque2 = new JButton( Ataque.values()[venAtak1].getNombre());
				Ataque2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[venAtak1].getDano());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[venAtak1].getNombre());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				Ataque2.setBounds(10, 74, 122, 52);
				combate.fondo.add(Ataque2);
				
				JButton Ataque3 = new JButton(venasaur.n_placaje());
				Ataque3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- venasaur.placaje());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ venasaur.n_placaje());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque3.setBounds(10, 137, 122, 52);
				combate.fondo.add(Ataque3);
				
				JButton Ataque4 = new JButton(venasaur.n_ataqueRapido());
				Ataque4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- venasaur.ataqueRapido());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+venasaur.n_ataqueRapido());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque4.setBounds(10, 200, 122, 52);
				combate.fondo.add(Ataque4);
			}
			break;
		case "Pikachu":
			pruebaPikachu();
			if(pikachu.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[pikAtak].getTipo())==true) {
				JButton Ataque1 = new JButton( Ataque.values()[pikAtak].getNombre());
				Ataque1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[pikAtak].getDano());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[pikAtak].getNombre());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque1.setBounds(10, 11, 122, 52);
				combate.fondo.add(Ataque1);
				
				JButton Ataque2 = new JButton( Ataque.values()[pikAtak1].getNombre());
				Ataque2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- Ataque.values()[pikAtak1].getDano());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ Ataque.values()[pikAtak1].getNombre());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque2.setBounds(10, 74, 122, 52);
				combate.fondo.add(Ataque2);
				
				JButton Ataque3 = new JButton(pikachu.n_placaje());
				Ataque3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- pikachu.placaje());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ pikachu.n_placaje());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					
						
					}
				});
				Ataque3.setBounds(10, 137, 122, 52);
				combate.fondo.add(Ataque3);
				
				JButton Ataque4 = new JButton(pikachu.n_ataqueRapido());
				Ataque4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						combate.vidaContrincante.setValue(combate.vidaContrincante.getValue()- pikachu.ataqueRapido());
						
						combate.Informacion.setOpaque(true);
						combate.Informacion.setText("Tu "+jugador+" ha utlizado= "+ pikachu.n_ataqueRapido());
						try {
							Thread.sleep(200);
							Contrincante();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					}
				});
				Ataque4.setBounds(10, 200, 122, 52);
				combate.fondo.add(Ataque4);
			}
			break;
		default:
			break;
	
		}
	
	}
	
	/**
	 * Metodo Contrincante
	 * 	Devuelve ataques aleatorios del pokemon contrario y determina cuando se acaba la vida de alguno de los dos y finaliza el juego
	 */
	public static  void Contrincante() {
		switch (contrincante) {
		case "Charizard":
			
			 pruebaCharizard();
			if(charizard.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[charAtak].getTipo())==true) {
				if(combate.vidaContrincante.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA GANADO!!!!!! ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e1) {
								e1.printStackTrace();
							}			
							
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else if(combate.vidaJugador.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA PERDIDO =(=(=( INTENTALO DE NUEVO ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e1) {
								e1.printStackTrace();
							}			
							
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else{
					ArrayList<Integer> ataqueChar =new ArrayList<Integer>();
					ataqueChar.add(combate.vidaJugador.getValue()- Ataque.values()[charAtak].getDano());
					ataqueChar.add(combate.vidaJugador.getValue()- Ataque.values()[charAtak1].getDano());
					ataqueChar.add(combate.vidaJugador.getValue()- charizard.placaje());
					ataqueChar.add(combate.vidaJugador.getValue()- charizard.ataqueRapido());
					ArrayList<String> n_ataqueChar =new ArrayList<String>();
					n_ataqueChar.add(Ataque.values()[charAtak].getNombre());
					n_ataqueChar.add(Ataque.values()[charAtak1].getNombre());
					n_ataqueChar.add(charizard.n_placaje());
					n_ataqueChar.add(charizard.n_ataqueRapido());
					int random=(int) (Math.random()*4);
					combate.vidaJugador.setValue(ataqueChar.get(random));
					combate.Informacion1.setOpaque(true);
					combate.Informacion1.setText(contrincante+" ha contratacado con= "+ n_ataqueChar.get(random));
				

				}
			}
			break;
		case "Blastoise":
			
			pruebaBlastoise();
			if(blastoise.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[blasAtak].getTipo())==true) {
				if(combate.vidaContrincante.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA GANADO!!!!!! ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e1) {
								e1.printStackTrace();
							}			
							
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else if(combate.vidaJugador.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA PERDIDO =(=(=( INTENTALO DE NUEVO ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e1) {
								e1.printStackTrace();
							}			
							
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else{	
					ArrayList<Integer> ataqueBas =new ArrayList<Integer>();
						ataqueBas.add(combate.vidaJugador.getValue()- Ataque.values()[blasAtak].getDano());
						ataqueBas.add(combate.vidaJugador.getValue()- Ataque.values()[blasAtak1].getDano());
						ataqueBas.add(combate.vidaJugador.getValue()- blastoise.placaje());
						ataqueBas.add(combate.vidaJugador.getValue()- blastoise.ataqueRapido());
						ArrayList<String> n_ataqueBlas =new ArrayList<String>();
						n_ataqueBlas.add(Ataque.values()[blasAtak].getNombre());
						n_ataqueBlas.add(Ataque.values()[blasAtak1].getNombre());
						n_ataqueBlas.add(blastoise.n_placaje());
						n_ataqueBlas.add(blastoise.n_ataqueRapido());
					int random=(int) (Math.random()*4);
						combate.vidaJugador.setValue(ataqueBas.get(random));
						combate.Informacion1.setOpaque(true);
						combate.Informacion1.setText(contrincante+" ha contratacado con= "+ n_ataqueBlas.get(random));
				}
			}
			break;
		case "Venasaur":
			pruebaVenasaur();
			if(venasaur.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[venAtak].getTipo())==true) {
				if(combate.vidaContrincante.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA GANADO!!!!!! ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e1) {
								e1.printStackTrace();
							}			
							
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else if(combate.vidaJugador.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA PERDIDO =(=(=( INTENTALO DE NUEVO ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e1) {
								e1.printStackTrace();
							}			
							
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else{
					ArrayList<Integer> ataqueVen =new ArrayList<Integer>();
					ataqueVen.add(combate.vidaJugador.getValue()- Ataque.values()[venAtak].getDano());
					ataqueVen.add(combate.vidaJugador.getValue()- Ataque.values()[venAtak1].getDano());
					ataqueVen.add(combate.vidaJugador.getValue()- venasaur.placaje());
					ataqueVen.add(combate.vidaJugador.getValue()- venasaur.ataqueRapido());
					ArrayList<String> n_ataqueVen =new ArrayList<String>();
					n_ataqueVen.add(Ataque.values()[venAtak].getNombre());
					n_ataqueVen.add(Ataque.values()[venAtak1].getNombre());
					n_ataqueVen.add(venasaur.n_placaje());
					n_ataqueVen.add(venasaur.n_ataqueRapido());
					int random=(int) (Math.random()*4);
					combate.vidaJugador.setValue(ataqueVen.get(random));
					combate.Informacion1.setOpaque(true);
					combate.Informacion1.setText(contrincante+" ha contratacado con= "+ n_ataqueVen.get(random));
				}
				}
			break;
		case "Pikachu":
			pruebaPikachu();
			if(pikachu.getClass().getInterfaces()[0].toString().split("\\.")[1].equals( Ataque.values()[pikAtak].getTipo())==true) {
				if(combate.vidaContrincante.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA GANADO!!!!!! ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e1) {
								e1.printStackTrace();
							}			
							
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else if(combate.vidaJugador.getValue()==0) {
					combate.Informacion1.setVisible(false);
					combate.Informacion.setText("Tu "+jugador+" HA PERDIDO =(=(=( INTENTALO DE NUEVO ");
					JButton Inicio = new JButton("VOLVER INICIO");
					Inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								combate.stop();
								combate.dispose();
								PantallaInicio frame = new PantallaInicio();
								frame.setVisible(true);
								frame.setResizable(false);
						}
					});
					Inicio.setBounds(252, 220, 100, 30);
					combate.fondo.add(Inicio);
				}else{
				ArrayList<Integer> ataquePika =new ArrayList<Integer>();
				ataquePika.add(combate.vidaJugador.getValue()- Ataque.values()[pikAtak].getDano());
				ataquePika.add(combate.vidaJugador.getValue()- Ataque.values()[pikAtak1].getDano());
				ataquePika.add(combate.vidaJugador.getValue()- pikachu.placaje());
				ataquePika.add(combate.vidaJugador.getValue()- pikachu.ataqueRapido());
				ArrayList<String> n_ataquePika =new ArrayList<String>();
				n_ataquePika.add(Ataque.values()[pikAtak].getNombre());
				n_ataquePika.add(Ataque.values()[pikAtak1].getNombre());
				n_ataquePika.add(pikachu.n_placaje());
				n_ataquePika.add(pikachu.n_ataqueRapido());
				int random=(int) (Math.random()*4);
				combate.vidaJugador.setValue(ataquePika.get(random));
				combate.Informacion1.setOpaque(true);
				combate.Informacion1.setText(contrincante+" ha contratacado con= "+ n_ataquePika.get(random));
				}	
			}
			break;
		default:
			break;
	
		}
	
	}
	
	/**
	 * PRUEBAS
	 * 	Comprueba qu el numero aleatorio no sea igual para qque no se repitan ataques
	 */
	private static void pruebaCharizard() {
		charAtak1=(int) Math.floor(Math.random()*4);
		if(charAtak==charAtak1) {
			pruebaCharizard();
		}
	}
	private static void pruebaBlastoise() {
		blasAtak1=(int) Math.floor(Math.random()*(8-5)+5);
		if(blasAtak==blasAtak1) {
			pruebaBlastoise();
		}
	}
	private static void pruebaVenasaur() {
		venAtak1=(int) Math.floor(Math.random()*(12-9)+9);
		if(venAtak==venAtak1) {
			pruebaVenasaur();
		}
	}
	private static void pruebaPikachu() {
		pikAtak1=(int) Math.floor(Math.random()*(16-13)+13);
		if(pikAtak==pikAtak1) {
			pruebaPikachu();
		}
	}
}

