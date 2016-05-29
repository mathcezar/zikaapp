import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prevencao2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prevencao2 frame = new Prevencao2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prevencao2() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMosquiteirosECalas = new JLabel("Mosquiteiros e repelentes podem ajudar:\r\n");
		lblMosquiteirosECalas.setBounds(10, 11, 387, 25);
		lblMosquiteirosECalas.setForeground(new Color(0, 128, 128));
		lblMosquiteirosECalas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblMosquiteirosECalas);
		
		JLabel fotoMosq = new JLabel("");
		fotoMosq.setBounds(20, 78, 139, 123);
		contentPane.add(fotoMosq);
		
		ImageIcon imagem = new ImageIcon(Menu.class.getResource("/img/mosquiteiro.png"));
		Image imag = imagem.getImage().getScaledInstance(fotoMosq.getWidth(), fotoMosq.getHeight(), Image.SCALE_DEFAULT);

		fotoMosq.setIcon(new ImageIcon(imag));
		
		JLabel fotoRep = new JLabel("");
		fotoRep.setBounds(259, 78, 138, 123);
		contentPane.add(fotoRep);
		
		ImageIcon imagem2 = new ImageIcon(Menu.class.getResource("/img/repelentes.png"));
		Image imag2 = imagem2.getImage().getScaledInstance(fotoRep.getWidth(), fotoRep.getHeight(), Image.SCALE_DEFAULT);

		fotoRep.setIcon(new ImageIcon(imag2));
		
		JButton btnVoltarPMenu = new JButton("Voltar p/ Menu");
		btnVoltarPMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu j = new Menu();
				j.setVisible(true);
			}
		});
		btnVoltarPMenu.setForeground(new Color(0, 128, 128));
		btnVoltarPMenu.setBounds(165, 227, 121, 23);
		contentPane.add(btnVoltarPMenu);
	}
}