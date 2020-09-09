package MiniProjects.LibraryManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import MiniProjects.Todo_List.CreateConnection;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class DeleteStudent extends JFrame {

	private JPanel contentPane;
	private JTextField idText;
	private JTextField nameText;
	private JTextField phoneText;
	private JTextField classText;
	private JTextField subText;
	private Connection connection;
	private JButton btnHello;
	private long idNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent frame = new DeleteStudent();
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
	public DeleteStudent() throws Exception {
		setResizable(false);
		setType(Type.UTILITY);
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 688, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 673, 661);
		contentPane.add(panel);
		
		JLabel lblDeletestudent = new JLabel("Delete-Student");
		lblDeletestudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeletestudent.setForeground(Color.BLACK);
		lblDeletestudent.setFont(new Font("Consolas", Font.BOLD, 40));
		lblDeletestudent.setBounds(140, 0, 312, 78);
		panel.add(lblDeletestudent);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 35, 131, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 33, 2, 611);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 642, 647, 2);
		panel.add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(655, 33, 2, 611);
		panel.add(separator_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Id card number");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(97, 116, 179, 30);
		panel.add(lblNewLabel_1);
		
		idText = new JTextField();
		idText.setForeground(SystemColor.desktop);
		idText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		idText.setColumns(10);
		idText.setBorder(new LineBorder(Color.BLACK, 2, true));
		idText.setBounds(352, 116, 180, 30);
		panel.add(idText);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(97, 175, 179, 30);
		panel.add(lblNewLabel_1_1);
		
		nameText = new JTextField();
		nameText.setBackground(Color.WHITE);
		nameText.setEditable(false);
		nameText.setForeground(SystemColor.desktop);
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nameText.setColumns(10);
		nameText.setBorder(new LineBorder(Color.BLACK, 2, true));
		nameText.setBounds(352, 175, 180, 30);
		panel.add(nameText);
		
		JLabel lblNewLabel_1_2 = new JLabel("Class");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(97, 236, 179, 30);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Subjects(Group)");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(97, 297, 179, 30);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone number");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(97, 357, 179, 30);
		panel.add(lblNewLabel_1_1_1);
		
		phoneText = new JTextField();
		phoneText.setBackground(Color.WHITE);
		phoneText.setEditable(false);
		phoneText.setForeground(SystemColor.desktop);
		phoneText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phoneText.setColumns(10);
		phoneText.setBorder(new LineBorder(Color.BLACK, 2, true));
		phoneText.setBounds(352, 357, 180, 30);
		panel.add(phoneText);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		imageLabel.setBounds(352, 414, 180, 150);
		panel.add(imageLabel);		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
String id = idText.getText();				
				
				// Check id field is empty or not?
				if (!checkEmpty(id) )
					return;
				
				if (!validation(id))
					return;
				
				try {
					idNumber = Long.parseLong(id);
					
					Statement stmt = connection.createStatement();
					ResultSet result = stmt.executeQuery("select id from addStudent");
					long idDB=0;
					boolean idCheck = false;
					while( result.next() )
					{
						idDB = result.getLong("id");
						if( ( idDB == idNumber ) )
						{
							idCheck = true;
							break;							
						}
					}
					if( idCheck ) {
						PreparedStatement ps = connection.prepareStatement("select * from addstudent where id = ?");
						ps.setLong(1, idNumber);
						
					    result = ps.executeQuery();
						result.next();						
						String nameDB = result.getString("name");
						String classDB = result.getString("class");
						String subjectDB = result.getString("subject");
						long phoneDB = result.getLong("phone");
						byte img[] = result.getBytes("image");
						Image image = getToolkit().createImage(img);
						
						nameText.setText(nameDB);
						classText.setText(classDB);
						subText.setText(subjectDB);
						phoneText.setText( String.valueOf(phoneDB) );						
						imageLabel.setIcon( new ImageIcon(image) );
						
						btnHello.setVisible(true);
					}
					else {
						JLabel jLabel = new JLabel("Entered ID card number is not existed.");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(idText, jLabel);						
					}
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				} 
			}

			private boolean validation(String id) {
				String idRegex = "[\\d]+";				
				if (!id.matches(idRegex)) {
					JLabel jLabel = new JLabel("Invalid ID card (must contain only numbers!)");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(idText, jLabel);
					return false;
				}				
				return true;
			}

			private boolean checkEmpty(String id) {
				JLabel jLabel;
				boolean flag = true;
				if (id.length() == 0) {
					jLabel = new JLabel("Please enter ID card number");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(idText, jLabel);
					flag = false;
				}				
				return flag;
			}
			
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setIcon(new ImageIcon(DeleteStudent.class.getResource("/MiniProjects/LibraryManagementSystem/img/enter.png")));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(542, 116, 80, 30);
		panel.add(btnNewButton);
		
		btnHello = new JButton("");
		btnHello.setVisible(false);
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel jLabel = new JLabel("Are you sure to delete?");
				jLabel.setFont(new Font("Arial", Font.BOLD, 16));
				jLabel.setForeground(Color.black);
				int check = JOptionPane.showConfirmDialog(idText, jLabel);
				if( check == 0 )
				{
					try {
						PreparedStatement ps = connection.prepareStatement("delete from addstudent where id=?");
						ps.setLong(1, idNumber);
						ps.executeUpdate();
						
						jLabel = new JLabel("Student details having Id Card number "+idNumber+" is deleted");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(idText, jLabel);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}				
			}
		});
		btnHello.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnHello.setIcon(new ImageIcon(DeleteStudent.class.getResource("/MiniProjects/LibraryManagementSystem/img/delStu.png")));		
		btnHello.setFont(new Font("Courier New", Font.BOLD, 30));
		btnHello.setBackground(Color.WHITE);
		btnHello.setBounds(229, 588, 150, 40);
		panel.add(btnHello);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DeleteStudent.class.getResource("/MiniProjects/LibraryManagementSystem/img/delStudent2.png")));
		lblNewLabel_2.setBounds(450, 0, 70, 78);
		panel.add(lblNewLabel_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(520, 33, 137, 4);
		panel.add(separator_3);
		
		classText = new JTextField();
		classText.setForeground(SystemColor.desktop);
		classText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		classText.setEditable(false);
		classText.setColumns(10);
		classText.setBorder(new LineBorder(Color.BLACK, 2, true));
		classText.setBackground(Color.WHITE);
		classText.setBounds(352, 236, 180, 30);
		panel.add(classText);
		
		subText = new JTextField();
		subText.setForeground(SystemColor.desktop);
		subText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		subText.setEditable(false);
		subText.setColumns(10);
		subText.setBorder(new LineBorder(Color.BLACK, 2, true));
		subText.setBackground(Color.WHITE);
		subText.setBounds(352, 297, 180, 30);
		panel.add(subText);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Your photo");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(97, 464, 179, 30);
		panel.add(lblNewLabel_1_1_1_1);	
		
	}
}
