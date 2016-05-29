import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAppZika = new JLabel("App Zika");
		lblAppZika.setBounds(138, 18, 146, 46);
		lblAppZika.setForeground(new Color(0, 128, 128));
		lblAppZika.setFont(new Font("Tahoma", Font.PLAIN, 38));
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setForeground(new Color(0, 128, 128));
		btnEntrar.setBackground(new Color(230, 230, 250));
		btnEntrar.setBounds(158, 192, 96, 25);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Opcoes j = new Opcoes();
			   j.setVisible(true);
		}
			
		});
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel foto = new JLabel("");
		foto.setBounds(138, 72, 156, 109);
		

        ImageIcon imagem = new ImageIcon(Menu.class.getResource("/img/zikaO.png"));
        Image imag = imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT);

        foto.setIcon(new ImageIcon(imag));
		
		
		
		foto.setBackground(Color.PINK);
		contentPane.setLayout(null);
		contentPane.add(btnEntrar);
		contentPane.add(foto);
		contentPane.add(lblAppZika);
	}
}