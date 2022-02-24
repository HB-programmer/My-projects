import java.awt.EventQueue;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StRegister {
	int flag = 0;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static final String regex_2 = "^^0\\d{9}|\\d{10}$";
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StRegister window = new StRegister();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public StRegister() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
//		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setForeground(new Color(255, 127, 80));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(619, 34, 359, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 127, 80));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBackground(new Color(255, 127, 80));
		lblNewLabel_1.setBounds(73, 176, 120, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Roll No.");
		lblNewLabel_1_1.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_1.setBounds(73, 279, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("E-mail");
		lblNewLabel_1_2.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_2.setBounds(73, 381, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Course");
		lblNewLabel_1_3.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_3.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_3.setBounds(782, 176, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Branch");
		lblNewLabel_1_4.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_4.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_4.setBounds(782, 279, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Contact No.");
		lblNewLabel_1_5.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_5.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_5.setBounds(782, 381, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Current Year");
		lblNewLabel_1_6.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_6.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_6.setBounds(73, 463, 166, 27);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Aggregate %");
		lblNewLabel_1_7.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_7.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_7.setBounds(782, 463, 166, 27);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Password");
		lblNewLabel_1_8.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_8.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_8.setBounds(73, 555, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Confirm Password");
		lblNewLabel_1_9.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_9.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_9.setBounds(782, 543, 192, 27);
		frame.getContentPane().add(lblNewLabel_1_9);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name , RollNo  ,Email  ,CurrentYear ,Course, Branch,ContactNo,aggPer ,pwd,confpwd;
				Name = textField.getText();
				RollNo = textField_1.getText();
				Email = textField_2.getText();
				CurrentYear = textField_3.getText();
				Course = textField_4.getText();
				Branch = textField_5.getText();
				ContactNo = textField_6.getText();
				aggPer = textField_7.getText();
				pwd = passwordField.getText();
				confpwd = passwordField_1.getText();
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/placementmanagement", "root", "My$q|95#");//Establishing connection
					String query = "INSERT INTO student(s_name,s_rollno,s_email,s_year,s_course,s_branch,s_contactno,s_aggper,s_pwd,s_confpwd) " + "VALUES(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement add = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
					
					
//					PreparedStatement add = connection.prepareStatement("INSERT INTO 'students'('S_RollNo','S_Name','S_Email','S_ContactNo','S_Course','S_Branch','S_Year','S_aggPer','S_pwd') values(?,?,?,?,?,?,?,?,?)");
//					ResultSet res = add.executeQuery();
					add.setString(1, Name);
					add.setString(2, RollNo);
					add.setString(3, Email);
					add.setString(4, CurrentYear);
					add.setString(5, Course);
					add.setString(6, Branch);
					add.setString(7, ContactNo);
					add.setString(8, aggPer);
					add.setString(9, pwd);
					add.setString(10, confpwd);
					Pattern pattern = Pattern.compile(regex);
					Pattern pattern_2 = Pattern.compile(regex_2);
					
					Matcher matcher = pattern.matcher(Email);
					Matcher matcher_2 = pattern_2.matcher(ContactNo);
					
					if(!matcher.matches()) {
						flag = 1;
						JOptionPane.showMessageDialog(btnNewButton,"Invalid Email");
					}
					if(!matcher_2.matches()) {
						flag = 1;
						JOptionPane.showMessageDialog(btnNewButton,"Invalid Contact NO.");
					}
					else{
						
						if(pwd.equals(confpwd)) {
							int rowAffected = add.executeUpdate();
							if(rowAffected==1) {
								JOptionPane.showMessageDialog(btnNewButton, "You have successfully Registered yourself.");
								
							}
							else {
								flag = 1;
								JOptionPane.showMessageDialog(btnNewButton, "Sorry there is some problem.");
								
							}
						}
//						else if(pwd != confpwd) {
//							flag = 1;
//							JOptionPane.showMessageDialog(btnNewButton, "Your password did not match!!");
//						}
						else {
							flag = 1;
							JOptionPane.showMessageDialog(btnNewButton, "Sorry!! Your password did not match!!");
							
						}
						}
					}
					catch( SQLException ae) {
						flag = 1;
						System.out.println("SQL Error "+ae);
					}
				if(flag==0) {
					frame.dispose();
					new StLogin();
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Sorry there is some problem.");
				}
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(595, 649, 153, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBounds(275, 177, 226, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(275, 279, 226, 27);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(275, 381, 226, 27);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(275, 463, 226, 27);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(1068, 175, 226, 27);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(1068, 278, 226, 27);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(1068, 380, 226, 27);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(1068, 462, 226, 27);
		frame.getContentPane().add(textField_7);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(275, 555, 226, 28);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField_1.setBounds(1068, 543, 226, 28);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\accredited.jpg"));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(1359, 10, 166, 129);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\download.jfif"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(13, 10, 226, 129);
		frame.getContentPane().add(lblNewLabel_2_1);
//		frame.setBounds(100, 100, 1143, 778);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
