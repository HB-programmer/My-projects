import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TPOLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TPOLogin window = new TPOLogin();
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
	public TPOLogin() {
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
//		frame.setBounds(100, 100, 1143, 780);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\images.jfif"));
		lblNewLabel.setBounds(139, 166, 225, 315);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setBounds(503, 220, 172, 66);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setBounds(503, 376, 137, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setForeground(Color.BLACK);
		textField.setBounds(973, 239, 144, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		passwordField.setBounds(973, 375, 144, 30);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("TPO LOG IN");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.RED);
		lblNewLabel_3.setBounds(698, 81, 194, 52);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Lon IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String pwd = passwordField.getText();
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/placementmanagement", "root", "My$q|95#");//Establishing connection
					PreparedStatement add = connection.prepareStatement("select T_name, T_pwd from tpo where T_name=? and T_pwd=?");
					add.setString(1,username);
					add.setString(2, pwd);
					ResultSet res = add.executeQuery();
					if(res.next()) {
						JOptionPane.showMessageDialog(btnNewButton, "You have successfully Logged In.");
						
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "Sorry wrong credentials.");
						
					}
					}
					catch( SQLException ae) {
						System.out.println("Somethinf is wrong!!");
					}
				
				
				frame.dispose();
				new CompnayDt();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(724, 503, 138, 37);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\download.jfif"));
		lblNewLabel_2_1.setBounds(10, 1, 226, 129);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\accredited.jpg"));
		lblNewLabel_3_1.setBounds(1351, 1, 175, 129);
		frame.getContentPane().add(lblNewLabel_3_1);
	}
}
