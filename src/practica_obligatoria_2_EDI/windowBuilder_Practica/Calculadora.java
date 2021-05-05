package practica_obligatoria_2_EDI.windowBuilder_Practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField jtfn1;
	private JTextField jtfn2;
	private JTextField jtfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		//Controlamos el cierre de la ventana
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("SUMADOR");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(1, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 5;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 1");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfn1 = new JTextField();
		GridBagConstraints gbc_jtfn1 = new GridBagConstraints();
		gbc_jtfn1.insets = new Insets(0, 0, 5, 5);
		gbc_jtfn1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfn1.gridx = 3;
		gbc_jtfn1.gridy = 1;
		panel.add(jtfn1, gbc_jtfn1);
		jtfn1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Número 2");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfn2 = new JTextField();
		GridBagConstraints gbc_jtfn2 = new GridBagConstraints();
		gbc_jtfn2.insets = new Insets(0, 0, 5, 5);
		gbc_jtfn2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfn2.gridx = 3;
		gbc_jtfn2.gridy = 3;
		panel.add(jtfn2, gbc_jtfn2);
		jtfn2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfResultado = new JTextField();
		jtfResultado.setEditable(false);
		GridBagConstraints gbc_jtfResultado = new GridBagConstraints();
		gbc_jtfResultado.insets = new Insets(0, 0, 0, 5);
		gbc_jtfResultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfResultado.gridx = 3;
		gbc_jtfResultado.gridy = 4;
		panel.add(jtfResultado, gbc_jtfResultado);
		jtfResultado.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.gridwidth = 5;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfResultado.setText(""+sumar());
			}
		});
		panel_1.add(btnSumar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Control del evento de cierre de ventana
				String opciones[] = { "Aceptar", "Cancelar" };// Creamos opciones que aparecerán en ventana
				int choice = JOptionPane.showOptionDialog(frame, "¿Quiere abandonar la aplicación?",
						"Abandonar aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,
						"Aceptar");
				if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);

				}
			}
		});

		panel_1.add(btnSalir);
	}
	
	private double sumar() {
		return Double.parseDouble(jtfn1.getText()) + Double.parseDouble(jtfn2.getText());
	}
	
	

}
