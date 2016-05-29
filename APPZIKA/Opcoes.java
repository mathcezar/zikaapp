import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Opcoes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcoes frame = new Opcoes();
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
	public Opcoes() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblEscolhaSuaOpo = new JLabel("Escolha sua op\u00E7\u00E3o:");
		lblEscolhaSuaOpo.setBounds(80, 11, 294, 37);
		lblEscolhaSuaOpo.setForeground(new Color(0, 128, 128));
		lblEscolhaSuaOpo.setBackground(new Color(0, 128, 128));
		lblEscolhaSuaOpo.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JButton btnNewButton = new JButton("Consulte seus sintomas");
		btnNewButton.setBounds(113, 160, 216, 23);
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sintomas j = new Sintomas();
				j.setVisible(true);
			}
		});

		JButton btnNewButton_1 = new JButton("Meios de preven\u00E7\u00E3o");
		btnNewButton_1.setBounds(113, 93, 207, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prevencao j = new Prevencao();
				j.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(0, 128, 128));
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		contentPane.setLayout(null);
		contentPane.add(lblEscolhaSuaOpo);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);

		JLabel fotoPrev = new JLabel("");
		fotoPrev.setBounds(80, 97, 23, 19);
		contentPane.add(fotoPrev);

		ImageIcon imagem = new ImageIcon(Menu.class.getResource("/img/zikaO.png"));
		Image imag = imagem.getImage().getScaledInstance(fotoPrev.getWidth(),fotoPrev.getHeight(), Image.SCALE_DEFAULT);

		fotoPrev.setIcon(new ImageIcon(imag));


		JLabel fotoSint = new JLabel("");
		fotoSint.setBackground(new Color(240, 248, 255));
		fotoSint.setBounds(80, 162, 23, 23);
		contentPane.add(fotoSint);

		ImageIcon image = new ImageIcon(Menu.class.getResource("/img/med.png"));
		Image imag2 = image.getImage().getScaledInstance(fotoSint.getWidth(),fotoSint.getHeight(), Image.SCALE_DEFAULT);

		fotoSint.setIcon(new ImageIcon(imag2));
	}

}