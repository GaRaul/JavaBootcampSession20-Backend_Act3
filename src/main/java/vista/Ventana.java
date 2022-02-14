package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	int num1 = 0;
	int num2 = 0;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabel1 = new JLabel("Clicks Boton1: ");
		lblLabel1.setBounds(94, 76, 152, 14);
		contentPane.add(lblLabel1);
		
		JLabel lblLabel2 = new JLabel("Clicks Boton2: ");
		lblLabel2.setBounds(297, 76, 152, 14);
		contentPane.add(lblLabel2);
		
		JLabel lblNewLabel = new JLabel("CLICKER");
		lblNewLabel.setBounds(202, 30, 68, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnButton1 = new JButton("Boton1");
		btnButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1++;
				lblLabel1.setText("Clicks Boton1: " + num1 + " veces");
			}
		});
		
		btnButton1.setBounds(92, 101, 89, 23);
		contentPane.add(btnButton1);
		
		JButton btnButton2 = new JButton("Boton2");
		btnButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2++;
				lblLabel2.setText("Clicks Boton2: " + num2 + " veces");
			}
		});
		btnButton2.setBounds(294, 101, 89, 23);
		contentPane.add(btnButton2);
		
		
	}
}
