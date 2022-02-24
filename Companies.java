import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Companies {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Companies window = new Companies();
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
	public Companies() {
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
	}
//		initialize();


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String[] columnNames = {"c_name","c_loc","c_hremail","c_estyear","c_post","c_branch","c_contactno","c_aggper","c_sal","c_web"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);

		table = new JTable(model);
		table_1 = new JTable();
		table_1.setForeground(Color.YELLOW);
		table_1.setBackground(Color.DARK_GRAY);
		table_1.setBounds(266, 197, 936, 568);
		table_1.setModel(model); 
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table_1.setFillsViewportHeight(true);
//		JScrollPane scroll = new JScrollPane(table);
//		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
//		String textvalue = textbox.getText();
		String c_name= "";
		String c_loc= "";
		String c_hremail = "";
		String c_estyear = "";
		String c_post = "";
		String c_branch = "";
		String c_contactno = "";
		String c_aggper = "";
		String c_sal = "";
		String c_web = "";
		try
		{ 
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/placementmanagement", "root", "My$q|95#");
			String sql = "select * from company ";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			if(rs.next())
			{
				c_name = rs.getString("c_name");
				c_loc = rs.getString("c_loc");
				c_hremail = rs.getString("c_hremail");
				c_estyear = rs.getString("c_estyear"); 
				c_post = rs.getString("c_post");
				c_branch = rs.getString("c_branch");
				c_contactno = rs.getString("c_contactno");
				c_aggper = rs.getString("c_aggper");
				c_sal = rs.getString("c_sal");
				c_web = rs.getString("c_web");
				model.addRow(new Object[]{c_name,c_loc,c_hremail,c_estyear,c_post,c_branch,c_contactno,c_aggper,c_sal,c_web});
				i++; 
			}
			if(i <1)
			{
				JOptionPane.showMessageDialog(null, "No Record Found","Error",
				JOptionPane.ERROR_MESSAGE);
			}
//			if(i ==1)
//			{
//				System.out.println(i+" Record Found");
//			}
//			else
//			{
//				System.out.println(i+" Records Found");
//			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		}
//		table = new JTable();
//		table.setBounds(197, 244, 848, 456);
		frame.getContentPane().add(table_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\download.jfif"));
		lblNewLabel_2_1.setBounds(10, 10, 226, 129);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("D:\\JAVA + DBMS PROJECT\\accredited.jpg"));
		lblNewLabel_3_1.setBounds(1352, 10, 175, 129);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel = new JLabel("COMPANIES");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(627, 79, 271, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C_Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(274, 162, 53, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("C_Loc");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setBounds(381, 162, 53, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("C_HR Email");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setBounds(469, 167, 59, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("C_EstYear");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setBounds(564, 167, 59, 13);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("C_Branch");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setBounds(745, 167, 53, 13);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("C_ContactNo");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5.setForeground(Color.RED);
		lblNewLabel_1_5.setBounds(826, 167, 84, 13);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("C_AggPer");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_6.setForeground(Color.RED);
		lblNewLabel_1_6.setBounds(931, 167, 59, 13);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("C_Sal");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setForeground(Color.RED);
		lblNewLabel_1_7.setBounds(1027, 167, 53, 13);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("C_Web");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setForeground(Color.RED);
		lblNewLabel_1_8.setBounds(1101, 168, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("C_Post");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_9.setForeground(Color.RED);
		lblNewLabel_1_9.setBounds(651, 167, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_9);
	}
}
