package MiniProjects.LibraryManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MiniProjects.Todo_List.CreateConnection;
import java.awt.Window.Type;

public class ViewBook extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Connection connection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBook frame = new ViewBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public ViewBook() throws Exception {
		setType(Type.UTILITY);
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 747, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 733, 636);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBook = new JLabel("Book-Details");
		lblBook.setHorizontalAlignment(SwingConstants.LEFT);
		lblBook.setForeground(Color.BLACK);
		lblBook.setFont(new Font("Consolas", Font.PLAIN, 40));
		lblBook.setBounds(22, 73, 274, 48);
		panel.add(lblBook);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 23, 256, 2);
		panel.add(separator);
		
		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistics.setForeground(Color.BLACK);
		lblStatistics.setFont(new Font("Consolas", Font.BOLD, 40));
		lblStatistics.setBounds(253, -2, 256, 80);
		panel.add(lblStatistics);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ViewBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/statistics2.png")));
		lblNewLabel_2.setBounds(496, 0, 70, 78);
		panel.add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(576, 23, 147, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 24, 2, 600);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(10, 622, 713, 2);
		panel.add(separator_3);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(721, 24, 2, 600);
		panel.add(separator_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 120, 682, 487);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(20);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Book Name", "Author Name", "Written in", "Quantity"
			}
		));
		scrollPane.setViewportView(table);
		
		try {
			// BOOK TABLE
			DefaultTableModel table2 = (DefaultTableModel) table.getModel();
			table2.setRowCount(0);
			
			PreparedStatement ps = connection.prepareStatement("select * from addbook");
			ResultSet result = ps.executeQuery();
			

			while (result.next()) {
				String id = result.getString("id"); // 1 Col
				String book = result.getString("book");// 2 Col
				String author = result.getString("author");// 3 Col
				String lang = result.getString("lang");// 4 Col
				String quan = result.getString("quan");// 5 Col
				
				table2.addRow(new Object[] {id,book,author,lang,quan} );
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}
	}
}
