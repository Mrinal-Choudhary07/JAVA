package MiniProjects.LibraryManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class AddBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBook frame = new AddBook();
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
	public AddBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 667, 664);
		contentPane.add(panel);
		
		JLabel lblAddbook = new JLabel("Add-Book");
		lblAddbook.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddbook.setForeground(Color.BLACK);
		lblAddbook.setFont(new Font("Consolas", Font.BOLD, 40));
		lblAddbook.setBounds(196, 0, 256, 78);
		panel.add(lblAddbook);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 33, 224, 4);
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
		
		JLabel lblNewLabel_1 = new JLabel("Book ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(97, 116, 179, 30);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.desktop);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(Color.BLACK, 2, true));
		textField.setBounds(352, 116, 180, 30);
		panel.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Book Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(97, 175, 179, 30);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(SystemColor.desktop);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		textField_1.setBounds(352, 175, 180, 30);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Author Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(97, 236, 179, 30);
		panel.add(lblNewLabel_1_2);
		
		JComboBox subjectComboBox = new JComboBox(new Object[]{});
		subjectComboBox.setForeground(SystemColor.desktop);
		subjectComboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		subjectComboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		subjectComboBox.setBounds(352, 297, 180, 30);
		panel.add(subjectComboBox);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Language");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(97, 297, 179, 30);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(97, 357, 179, 30);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(SystemColor.desktop);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(Color.BLACK, 2, true));
		textField_2.setBounds(352, 357, 180, 30);
		panel.add(textField_2);
		
		JButton addBtn = new JButton("");
		addBtn.setFont(new Font("Courier New", Font.BOLD, 30));
		addBtn.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		addBtn.setBackground(Color.WHITE);
		addBtn.setBounds(229, 588, 150, 40);
		panel.add(addBtn);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AddBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/addBook2.png")));
		lblNewLabel_2.setBounds(418, 0, 70, 78);
		panel.add(lblNewLabel_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(498, 33, 159, 4);
		panel.add(separator_3);
		
		textField_3 = new JTextField();
		textField_3.setForeground(SystemColor.desktop);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(Color.BLACK, 2, true));
		textField_3.setBounds(352, 236, 180, 30);
		panel.add(textField_3);
	}

}
