import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
//import javax.swing.JPanel;
//import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage window = new homePage();
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
	public homePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
//		frame.setBounds(100, 100, 1151, 784);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GEETA ENGINEERING COLLEGE");
		lblNewLabel_1.setForeground(new Color(255, 127, 80));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 32, 291, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Student Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new StLogin();
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(255, 127, 80));
		btnNewButton.setBounds(891, 28, 155, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Admin Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new TPOLogin();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 127, 80));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1097, 28, 155, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Student Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new StRegister();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 99, 71));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(1290, 28, 217, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(124, -27, 1609, 851);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\plms.png"));
	}
}
