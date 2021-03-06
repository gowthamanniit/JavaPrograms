package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
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

public class ViewUserDetails extends JFrame {

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
					ViewUserDetails frame = new ViewUserDetails();
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
	public ViewUserDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 339);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblViewuserdetails = new JLabel("ViewUserDetails");
		lblViewuserdetails.setBounds(162, 11, 84, 14);
		panel.add(lblViewuserdetails);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(41, 55, 60, 22);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(135, 56, 135, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(41, 133, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 130, 135, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnViewdetails = new JButton("ViewDetails");
		btnViewdetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String uname=textField.getText();
					String str="select pass from ureg where uname='"+uname+"'";
				    	Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  ResultSet rs=stm.executeQuery(str);
					  rs.next();
					  textField_1.setText(rs.getString(1).trim());
					  JOptionPane.showMessageDialog(btnViewdetails, "Views");
				}
				
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnViewdetails.setBounds(41, 212, 89, 23);
		panel.add(btnViewdetails);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String uname=textField.getText();
					String pass=textField_1.getText();
					String gen=textField_2.getText();
					String str="update ureg set pass='"+pass+"',gender='"+gen+"' where uname='"+uname+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnUpdate, "UpdateSucess!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(174, 212, 89, 23);
		panel.add(btnUpdate);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String uname=textField.getText();
					String str="delete from ureg where uname='"+uname+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnDelete, "deleted..");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnDelete.setBounds(302, 212, 89, 23);
		panel.add(btnDelete);
		
		JLabel lblGender = new JLabel("gender");
		lblGender.setBounds(41, 177, 74, 14);
		panel.add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 174, 135, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}
