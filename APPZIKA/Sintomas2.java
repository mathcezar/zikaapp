import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Sintomas2 extends JFrame {

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
					Sintomas2 frame = new Sintomas2();
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
	public Sintomas2() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Voc\u00EA est\u00E1 com coceiras no corpo?");
		lblNewLabel.setForeground(new Color(0, 128, 128));

		JRadioButton radioSim1 = new JRadioButton("Sim");
		radioSim1.setForeground(new Color(0, 128, 128));
		radioSim1.setBackground(new Color(240, 248, 255));
		buttonGroup.add(radioSim1);

		JRadioButton radioNao1 = new JRadioButton("N\u00E3o");
		radioNao1.setForeground(new Color(0, 128, 128));
		radioNao1.setBackground(new Color(240, 248, 255));
		buttonGroup.add(radioNao1);

		JLabel lblNewLabel_1 = new JLabel("Voc\u00EA est\u00E1 com cansa\u00E7o f\u00EDsico e metal?");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));

		JRadioButton radioSim2 = new JRadioButton("Sim");
		radioSim2.setForeground(new Color(0, 128, 128));
		radioSim2.setBackground(new Color(240, 248, 255));
		buttonGroup_1.add(radioSim2);

		JRadioButton radioNao2 = new JRadioButton("N\u00E3o");
		radioNao2.setForeground(new Color(0, 128, 128));
		radioNao2.setBackground(new Color(240, 248, 255));
		buttonGroup_1.add(radioNao2);

		JRadioButton radioAmbos = new JRadioButton("Ambos");
		radioAmbos.setForeground(new Color(0, 128, 128));
		radioAmbos.setBackground(new Color(240, 248, 255));
		buttonGroup_1.add(radioAmbos);

		JLabel lblNewLabel_2 = new JLabel("Voc\u00EA est\u00E1 com dor de cabe\u00E7a, mais especificamente atr\u00E1s dos olhos?");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));

		JRadioButton radioSim3 = new JRadioButton("Sim");
		radioSim3.setForeground(new Color(0, 128, 128));
		radioSim3.setBackground(new Color(240, 248, 255));
		buttonGroup_2.add(radioSim3);

		JRadioButton radioNao = new JRadioButton("N\u00E3o");
		radioNao.setForeground(new Color(0, 128, 128));
		radioNao.setBackground(new Color(240, 248, 255));
		buttonGroup_2.add(radioNao);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(0, 128, 128));
		btnSalvar.setBackground(new Color(230, 230, 250));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (radioSim1.isSelected()) {
					aux ++;
				}
				if (radioAmbos.isSelected()) {
					aux ++;
				}
				if (radioSim2.isSelected()) {
					aux ++;
				}
				if (radioSim3.isSelected()) {
					aux ++;
				}
				JOptionPane.showMessageDialog(null, "Dados inseridos!" + aux);
			}
		});

		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFinalizar.setBackground(new Color(230, 230, 250));
		btnFinalizar.setForeground(new Color(0, 128, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(radioSim3)
										.addGap(148)
										.addComponent(radioNao))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(142)
										.addComponent(btnSalvar)
										.addGap(60)
										.addComponent(btnFinalizar))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(radioSim1)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(radioNao1))
										.addComponent(lblNewLabel, Alignment.LEADING))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(radioSim2)
										.addGap(63)
										.addComponent(radioNao2)
										.addGap(62)
										.addComponent(radioAmbos))
								.addComponent(lblNewLabel_1))
						.addGap(88))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(11)
						.addComponent(lblNewLabel)
						.addGap(7)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(radioSim1)
								.addComponent(radioNao1))
						.addGap(18)
						.addComponent(lblNewLabel_1)
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(radioSim2)
								.addComponent(radioNao2)
								.addComponent(radioAmbos))
						.addGap(27)
						.addComponent(lblNewLabel_2)
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(radioSim3)
								.addComponent(radioNao))
						.addGap(7)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSalvar)
								.addComponent(btnFinalizar)))
				);
		contentPane.setLayout(gl_contentPane);
	}

}