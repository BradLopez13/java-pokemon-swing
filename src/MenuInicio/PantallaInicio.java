package MenuInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

import Pantalla_de_Eleccion.Eleccion;

public class PantallaInicio extends JFrame {

	private JPanel contentPane;
	FotoFondo fondo = new FotoFondo("/Imagenes/fondoMenu.jpg");
	static MusicaFondo musica = new MusicaFondo();

	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 852, 504);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		playMusic(0);
		add(fondo);
		fondo.setBounds(0, 0, 852, 504);

		JButton bnt_inst = new JButton("INSTRUCCIONES");
		bnt_inst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Instrucciones frame = new Instrucciones();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btn_iniciar = new JButton("INICIAR");
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Eleccion frame = new Eleccion();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btn_salir = new JButton("SALIR");
		btn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		GroupLayout gl_fondo = new GroupLayout(fondo);
		gl_fondo.setHorizontalGroup(gl_fondo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondo.createSequentialGroup().addGap(363)
						.addGroup(gl_fondo.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_iniciar, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
								.addComponent(btn_salir, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(bnt_inst, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addGap(361)));
		gl_fondo.setVerticalGroup(gl_fondo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondo.createSequentialGroup().addGap(161)
						.addComponent(btn_iniciar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(bnt_inst, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btn_salir, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(142, Short.MAX_VALUE)));
		fondo.setLayout(gl_fondo);
	}

	public static void playMusic(int i) {
		musica.setFile(i);
		musica.play();
		musica.loop();
	}

	public static void stop() {
		musica.stop();
	}

	public static void playSound(int i) {
		musica.setFile(i);
		musica.play();
	}
}
