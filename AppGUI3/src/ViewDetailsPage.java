import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewDetailsPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDetailsPage frame = new ViewDetailsPage();
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
	public ViewDetailsPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 403, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProductid = new JLabel("ProductId");
		lblProductid.setBounds(27, 32, 79, 22);
		panel.add(lblProductid);
		
		textField = new JTextField();
		textField.setBounds(136, 33, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("Pname");
		lblPname.setBounds(36, 91, 46, 14);
		panel.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 88, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrdprices = new JLabel("PrdPrices");
		lblPrdprices.setBounds(27, 142, 79, 14);
		panel.add(lblPrdprices);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 139, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
				   String pid=textField.getText();
				   String pname=textField_1.getText();
				   String prices=textField_2.getText();
				   
				    String str="insert into product values('"+pid+"','"+pname+"','"+prices+"')";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:p1");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnAddproduct,"AddProductSucess!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnAddproduct.setBounds(27, 205, 89, 23);
		panel.add(btnAddproduct);
		
		final JButton btnViewproduct = new JButton("ViewProduct");
		btnViewproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				try
				{
					String pid=textField.getText();
					String str="select pname,prices from product where pid='"+pid+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:p1");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					textField_1.setText(rs.getString(1));
					textField_2.setText(rs.getString(2));
					JOptionPane.showMessageDialog(btnViewproduct, "ViewUrData");
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnViewproduct.setBounds(147, 205, 115, 23);
		panel.add(btnViewproduct);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String str="update product set pname='"+pname+"' where pid='"+pid+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:p1");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnUpdate, "UpdateSucess!!");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(285, 205, 89, 23);
		panel.add(btnUpdate);
	}

}