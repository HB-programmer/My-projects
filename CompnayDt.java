import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.regex.*;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompnayDt {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static final String regex_2 = "^^0\\d{9}|\\d{10}$";
	
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CompnayDt window = new CompnayDt();
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
	public CompnayDt() {
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
		
		JLabel lblNewLabel = new JLabel("COMPANY DETAILS");
		lblNewLabel.setForeground(new Color(255, 127, 80));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(578, 43, 359, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C_Name");
		lblNewLabel_1.setForeground(new Color(255, 127, 80));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBackground(new Color(255, 127, 80));
		lblNewLabel_1.setBounds(73, 176, 120, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Job Location");
		lblNewLabel_1_1.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_1.setBounds(73, 279, 153, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("HR E-mail");
		lblNewLabel_1_2.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_2.setBounds(73, 381, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("C_Position");
		lblNewLabel_1_3.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_3.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_3.setBounds(769, 175, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Branch");
		lblNewLabel_1_4.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_4.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_4.setBounds(769, 279, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Contact No.");
		lblNewLabel_1_5.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_5.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_5.setBounds(769, 381, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Est. Year");
		lblNewLabel_1_6.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_6.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_6.setBounds(73, 463, 166, 27);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Aggregate %");
		lblNewLabel_1_7.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_7.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_7.setBounds(769, 463, 166, 27);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Salary ");
		lblNewLabel_1_8.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_8.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_8.setBounds(73, 555, 120, 27);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("For More Info");
		lblNewLabel_1_9.setForeground(new Color(255, 127, 80));
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_9.setBackground(new Color(255, 127, 80));
		lblNewLabel_1_9.setBounds(769, 555, 192, 27);
		frame.getContentPane().add(lblNewLabel_1_9);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Cname,loc, hrmail,estyear, post, branch,contactno, aggper,sal , web;
				Cname = textField.getText();
				loc = textField_1.getText();
				hrmail = textField_2.getText();
				estyear = textField_3.getText();
				post = textField_4.getText();
				branch = textField_5.getText();
				contactno = textField_6.getText();
				aggper = textField_7.getText();
				sal = textField_8.getText();
				web = textField_9.getText();
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/placementmanagement", "root", "My$q|95#");//Establishing connection
					String query = "INSERT INTO company(c_name,c_loc,c_hremail,c_estyear,c_post,c_branch,c_contactno,c_aggper,c_sal,c_web) " + "VALUES(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement add = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
					
					
					
//					PreparedStatement add = connection.prepareStatement("INSERT INTO 'company'('C_Name','C_HR_Email','C_JobLoc','C_Post','C_Sal','C_Website') values(?,?,?,?,?,?)");
//					ResultSet res = add.executeQuery();
					add.setString(1, Cname);
					add.setString(2, loc);
					add.setString(3, hrmail);
					add.setString(4, estyear);
					add.setString(5, post);
					add.setString(6, branch);
					add.setString(7, contactno);
					add.setString(8, aggper);
					add.setString(9, sal);
					add.setString(10, web);
					
					int rowAffected = add.executeUpdate();
					
					Pattern pattern = Pattern.compile(regex);
					Pattern pattern_2 = Pattern.compile(regex_2);
					
					Matcher matcher = pattern.matcher(hrmail);
					Matcher matcher_2 = pattern_2.matcher(contactno);
					
					if(!matcher.matches()) {
//						flag = 1;
						JOptionPane.showMessageDialog(btnNewButton,"Invalid Email");
					}
					if(!matcher_2.matches()) {
//						flag = 1;
						JOptionPane.showMessageDialog(btnNewButton,"Invalid Contact NO.");
					}
					else if(rowAffected==1) {
						JOptionPane.showMessageDialog(btnNewButton, "You have successfully updated the company info.");
						frame.dispose();
						
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "Sorry there is some problem");
						
					}
					}
					catch( SQLException ae) {
						System.out.println("SQL Error "+ae);
					}
//					frame.dispose();
//					new StLogin();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(624, 645, 153, 21);
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
		textField_4.setBounds(1072, 175, 226, 27);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(1072, 278, 226, 27);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(1072, 380, 226, 27);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(1072, 462, 226, 27);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(275, 555, 226, 27);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(1072, 554, 226, 27);
		frame.getContentPane().add(textField_9);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\download.jfif"));
		lblNewLabel_2.setBounds(10, 10, 226, 129);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\accredited.jpg"));
		lblNewLabel_3.setBounds(1355, 3, 175, 129);
		frame.getContentPane().add(lblNewLabel_3);
//		frame.setBounds(100, 100, 1143, 778);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
