package MiniProjects.LibraryManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import MiniProjects.Todo_List.CreateConnection;
import javax.swing.border.LineBorder;
import java.awt.Window.Type;

public class Statistics extends JFrame {

	private JPanel contentPane;
	private JTable studentTable;
	private Connection connection = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistics frame = new Statistics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public Statistics() throws Exception {
		setResizable(false);
		setType(Type.UTILITY);
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1480, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 1466, 687);
		contentPane.add(panel);
		panel.setLayout(null);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 671, 1446, 2);
		panel.add(separator_2);

		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistics.setForeground(Color.BLACK);
		lblStatistics.setFont(new Font("Consolas", Font.BOLD, 40));
		lblStatistics.setBounds(564, 10, 256, 80);
		panel.add(lblStatistics);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				Statistics.class.getResource("/MiniProjects/LibraryManagementSystem/img/statistics2.png")));
		lblNewLabel_2.setBounds(807, 12, 70, 78);
		panel.add(lblNewLabel_2);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 46, 3, 627);
		panel.add(separator_1);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 46, 568, 2);
		panel.add(separator);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(887, 46, 569, 2);
		panel.add(separator_3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLACK, 2, true));
		scrollPane.setBounds(29, 173, 682, 488);
		panel.add(scrollPane);
		
		Object[][] data = null;
		String col[] =  { "ID", "Name", "Class", "Subjects", "Phone no", "Image" };
		
		DefaultTableModel model = new DefaultTableModel(data, col)
        {
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };
		studentTable = new JTable( model );		
		studentTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		studentTable.setRowHeight(200);
		studentTable.getColumnModel().getColumn(0).setPreferredWidth(28);
		studentTable.getColumnModel().getColumn(1).setPreferredWidth(130);
		studentTable.getColumnModel().getColumn(2).setPreferredWidth(73);
		studentTable.getColumnModel().getColumn(3).setPreferredWidth(80);
		studentTable.getColumnModel().getColumn(4).setPreferredWidth(87);
		studentTable.getColumnModel().getColumn(5).setPreferredWidth(200);
		scrollPane.setViewportView(studentTable);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		scrollPane_1.setBounds(750, 173, 682, 488);
		panel.add(scrollPane_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(1453, 46, 3, 627);
		panel.add(separator_4);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudent.setForeground(Color.BLACK);
		lblStudent.setFont(new Font("Consolas", Font.BOLD, 40));
		lblStudent.setBounds(29, 119, 256, 48);
		panel.add(lblStudent);
		
		JLabel lblBook = new JLabel("Book");
		lblBook.setHorizontalAlignment(SwingConstants.LEFT);
		lblBook.setForeground(Color.BLACK);
		lblBook.setFont(new Font("Consolas", Font.BOLD, 40));
		lblBook.setBounds(750, 115, 256, 48);
		panel.add(lblBook);

		// Connecting Connection

		try {
			PreparedStatement ps = connection.prepareStatement("select * from addStudent");
			ResultSet result = ps.executeQuery();

			DefaultTableModel table = (DefaultTableModel) studentTable.getModel();			
			table.setRowCount(0);

			while (result.next()) {
				String id = result.getString("id"); // 1 Col
				String name = result.getString("name");// 2 Col
				String classes = result.getString("class");// 3 Col
				String subjects = result.getString("subject");// 4 Col
				String phone = result.getString("phone");// 5 Col
				
				// FIRST METHOD TO ACCESS IMAGE FROM DB AND SHOW IT IN JTable
				byte arr[];
				Image img;
				
				arr = result.getBytes("image");// 6 Col				
				img = getToolkit().createImage(arr);				
				
				// SECOND METHOD TO ACCESS IMAGE FROM DB AND SHOW IT IN JTable 
//				Blob blob = (Blob) result.getBlob("image");
//				byte arr[] = blob.getBytes(1, (int) blob.length());
//				FileOutputStream fos = new FileOutputStream("E:\\Programming\\Eclipse\\sample.jpg");
//				fos.write(arr);//				
//				Image img = getToolkit().createImage( "E:\\Programming\\Eclipse\\sample.jpg" );
//				ImageIcon icon = new ImageIcon(img);
				
				table.addRow(new Object[] { id, name, classes, subjects, phone, new ImageIcon(img) });
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
