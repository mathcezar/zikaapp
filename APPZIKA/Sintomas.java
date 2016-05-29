import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Sintomas extends JFrame {
	

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sintomas frame = new Sintomas();
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
	static int aux;
	public Sintomas() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblVocEstCom = new JLabel("Voc\u00EA est\u00E1 com febre baixa(37,8-38,5)?");
		lblVocEstCom.setBounds(5, 16, 392, 14);
		lblVocEstCom.setForeground(new Color(0, 128, 128));

		JRadioButton radioSim1 = new JRadioButton("Sim");
		radioSim1.setBounds(5, 48, 141, 23);
		radioSim1.setForeground(new Color(0, 128, 128));
		radioSim1.setBackground(new Color(240, 248, 255));
		buttonGroup.add(radioSim1);

		JRadioButton radioNao1 = new JRadioButton("N\u00E3o");
		radioNao1.setBackground(new Color(240, 248, 255));
		radioNao1.setBounds(148, 48, 99, 23);
		radioNao1.setForeground(new Color(0, 128, 128));
		buttonGroup.add(radioNao1);

		JLabel lblNewLabel = new JLabel("Voc\u00EA est\u00E1 com manchas vermelhas na pele?");
		lblNewLabel.setBounds(5, 89, 381, 14);
		lblNewLabel.setForeground(new Color(0, 128, 128));

		JRadioButton radioSim2 = new JRadioButton("Sim");
		radioSim2.setBounds(5, 121, 141, 23);
		radioSim2.setForeground(new Color(0, 128, 128));
		radioSim2.setBackground(new Color(240, 248, 255));
		buttonGroup_1.add(radioSim2);

		JRadioButton radioNao2 = new JRadioButton("N\u00E3o");
		radioNao2.setBounds(148, 121, 144, 23);
		radioNao2.setForeground(new Color(0, 128, 128));
		radioNao2.setBackground(new Color(240, 248, 255));
		buttonGroup_1.add(radioNao2);

		JLabel lblNewLabel_1 = new JLabel("Voc\u00EA est\u00E1 com dor nas articula\u00E7\u00F5es?");
		lblNewLabel_1.setBounds(5, 162, 392, 14);
		lblNewLabel_1.setForeground(new Color(0, 128, 128));

		JRadioButton radioSim3 = new JRadioButton("Sim");
		radioSim3.setBounds(5, 194, 88, 23);
		radioSim3.setForeground(new Color(0, 128, 128));
		radioSim3.setBackground(new Color(240, 248, 255));
		buttonGroup_2.add(radioSim3);

		JRadioButton radioNao3 = new JRadioButton("N\u00E3o");
		radioNao3.setBounds(148, 194, 127, 23);
		radioNao3.setBackground(new Color(240, 248, 255));
		radioNao3.setForeground(new Color(0, 128, 128));
		buttonGroup_2.add(radioNao3);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(158, 227, 117, 23);
		btnSalvar.setForeground(new Color(0, 128, 128));
		btnSalvar.setBackground(new Color(230, 230, 250));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioSim1.isSelected()) {
					aux++;
				}
				if (radioSim2.isSelected()) {
					aux ++;
				}
				if (radioSim3.isSelected()) {
					aux ++;
				}
				JOptionPane.showMessageDialog(null, "Dados inseridos! "+ "" + aux);
			}
		});
		JButton btnNext = new JButton("");
		btnNext.setBounds(356, 219, 41, 31);

        ImageIcon imagem = new ImageIcon(Menu.class.getResource("/img/setas.png"));
        Image imag = imagem.getImage().getScaledInstance(btnNext.getWidth(), btnNext.getHeight(), Image.SCALE_DEFAULT);

        btnNext.setIcon(new ImageIcon(imag));
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sintomas2 j = new Sintomas2();
				j.setVisible(true);
		
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalvar);
		contentPane.add(radioSim1);
		contentPane.add(radioNao1);
		contentPane.add(lblVocEstCom);
		contentPane.add(lblNewLabel);
		contentPane.add(radioSim2);
		contentPane.add(radioNao2);
		contentPane.add(lblNewLabel_1);
		contentPane.add(radioSim3);
		contentPane.add(radioNao3);
		contentPane.add(btnNext);
	}
}