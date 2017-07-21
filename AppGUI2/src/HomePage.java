import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.MAGENTA, 3, true));
		panel.setBounds(22, 27, 381, 210);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(153, 16, 0, 0);
		panel.add(label);
		
		JLabel lblHrsystem = new JLabel("HRSYSTEM");
		lblHrsystem.setBounds(158, 8, 74, 17);
		lblHrsystem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lblHrsystem);
		
		JLabel lblUname = new JLabel("UNAME");
		lblUname.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblUname.setBounds(24, 45, 60, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(100, 38, 202, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("PASS");
		lblPass.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblPass.setBounds(24, 113, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 106, 202, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(Color.PINK);
		btnLogin.setBounds(69, 164, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(Color.PINK);
		btnReset.setBounds(194, 164, 89, 23);
		panel.add(btnReset);
	}
}
