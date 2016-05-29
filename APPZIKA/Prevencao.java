import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prevencao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prevencao frame = new Prevencao();
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
	public Prevencao() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblParaPrevenirO = new JLabel("Dicas de preven\u00E7\u00E3o:");
		lblParaPrevenirO.setForeground(new Color(0, 128, 128));
		lblParaPrevenirO.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParaPrevenirO.setBounds(14, 16, 308, 25);
		contentPane.add(lblParaPrevenirO);

		JLabel fotoCerto = new JLabel("");
		fotoCerto.setBounds(14, 88, 46, 41);
		contentPane.add(fotoCerto);

		ImageIcon imagem = new ImageIcon(Menu.class.getResource("/img/positivo.png"));
		Image imag = imagem.getImage().getScaledInstance(fotoCerto.getWidth(), fotoCerto.getHeight(), Image.SCALE_DEFAULT);

		fotoCerto.setIcon(new ImageIcon(imag));

		JLabel foto1 = new JLabel("img1");
		foto1.setBounds(74, 91, 102, 105);
		contentPane.add(foto1);

		ImageIcon imagem2 = new ImageIcon(Menu.class.getResource("/img/img1.png"));
		Image imag2 = imagem2.getImage().getScaledInstance(foto1.getWidth(), foto1.getHeight(), Image.SCALE_DEFAULT);

		foto1.setIcon(new ImageIcon(imag2));

		JLabel fotoE = new JLabel("errado");
		fotoE.setBounds(245, 88, 46, 41);
		contentPane.add(fotoE);

		ImageIcon imagem3 = new ImageIcon(Menu.class.getResource("/img/negativo.png"));
		Image imag3 = imagem3.getImage().getScaledInstance(fotoE.getWidth(), fotoE.getHeight(), Image.SCALE_DEFAULT);

		fotoE.setIcon(new ImageIcon(imag3));

		JLabel foto2 = new JLabel("img2");
		foto2.setBounds(301, 88, 102, 108);
		contentPane.add(foto2);

		ImageIcon imagem4 = new ImageIcon(Menu.class.getResource("/img/img2.png"));
		Image imag4 = imagem4.getImage().getScaledInstance(foto2.getWidth(), foto2.getHeight(), Image.SCALE_DEFAULT);

		foto2.setIcon(new ImageIcon(imag4));

		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Prevencao2 j = new Prevencao2();
				j.setVisible(true);
			}
		});
		btnPrximo.setForeground(new Color(0, 128, 128));
		btnPrximo.setBounds(173, 227, 89, 23);
		contentPane.add(btnPrximo);

	}
}