package com.niit;

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

public class ULogin extends JFrame {

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
					ULogin frame = new ULogin();
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
	public ULogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserlogin = new JLabel("UserLogin");
		lblUserlogin.setBounds(156, 11, 81, 23);
		contentPane.add(lblUserlogin);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(26, 65, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(93, 62, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(26, 125, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 122, 144, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try
				{ 
					String uname=textField.getText();
					String pass=textField_1.getText();
					String str="select uname,pass from ureg where uname='"+uname+"' AND pass='"+pass+"'";
					 Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  ResultSet rs=stm.executeQuery(str);
					  rs.next();
					  String u=rs.getString(1);
					  String p=rs.getString(2);
					  if(u.equals(uname)||p.equals(pass))
					  {
						 
						  JOptionPane.showMessageDialog(btnLogin, "LoginSucee!!!");
						  new ViewLoginDetails().setVisible(true);
						  
					  }
					 
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin, "LoginFail!!"); 
				}
			}
		});
		btnLogin.setBounds(109, 192, 89, 23);
		contentPane.add(btnLogin);
	}
}