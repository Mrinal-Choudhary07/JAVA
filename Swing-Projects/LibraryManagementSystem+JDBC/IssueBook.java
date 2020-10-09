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

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import javax.swing.JComboBox;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class IssueBook extends JFrame {

	private JPanel contentPane;
	private JTextField idText;
	private JTextField stuNameText;
	private JTextField stuClassText;
	private JTextField stuSubText;
	protected long idNumber;
	private Connection connection;
	private JButton issueBtn;
	private JComboBox bookComboBox;
	private Vector<String> vector;
	private DefaultComboBoxModel<String> model = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
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
	public IssueBook() throws Exception {
		setResizable(false);
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 667, 664);
		contentPane.add(panel);

		JLabel lblIssuebook = new JLabel("Issue-Book");
		lblIssuebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssuebook.setForeground(Color.BLACK);
		lblIssuebook.setFont(new Font("Consolas", Font.BOLD, 40));
		lblIssuebook.setBounds(173, 0, 256, 78);
		panel.add(lblIssuebook);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 33, 179, 4);
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

		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(101, 179, 179, 30);
		panel.add(lblNewLabel_1);

		idText = new JTextField();
		idText.setForeground(SystemColor.desktop);
		idText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		idText.setColumns(10);
		idText.setBorder(new LineBorder(Color.BLACK, 2, true));
		idText.setBounds(356, 179, 180, 30);
		panel.add(idText);

		JLabel lblNewLabel_1_1 = new JLabel("Student Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(101, 236, 179, 30);
		panel.add(lblNewLabel_1_1);

		stuNameText = new JTextField();
		stuNameText.setBackground(Color.WHITE);
		stuNameText.setEditable(false);
		stuNameText.setForeground(SystemColor.desktop);
		stuNameText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		stuNameText.setColumns(10);
		stuNameText.setBorder(new LineBorder(Color.BLACK, 2, true));
		stuNameText.setBounds(356, 236, 180, 30);
		panel.add(stuNameText);

		JLabel lblNewLabel_1_2 = new JLabel("Book Names");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(101, 404, 179, 30);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(
				new ImageIcon(IssueBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/issueBook2.png")));
		lblNewLabel_2.setBounds(418, 0, 70, 78);
		panel.add(lblNewLabel_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(498, 33, 159, 4);
		panel.add(separator_3);

		bookComboBox = new JComboBox();
		bookComboBox.setEditable(true);
		bookComboBox.setBackground(Color.WHITE);
		bookComboBox.setForeground(SystemColor.desktop);
		bookComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bookComboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		bookComboBox.setBounds(356, 404, 270, 30);
		panel.add(bookComboBox);

		JButton enterBtn = new JButton("");
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = idText.getText();

				// Check id field is empty or not?
				if (!checkEmpty(id))
					return;

				if (!validation(id))
					return;

				try {
					idNumber = Long.parseLong(id);

					Statement stmt = connection.createStatement();
					ResultSet result = stmt.executeQuery("select id from addStudent");
					long idDB = 0;
					boolean idCheck = false;
					while (result.next()) {
						idDB = result.getLong("id");
						if ((idDB == idNumber)) {
							idCheck = true;
							break;
						}
					}
					if (idCheck) {
						PreparedStatement ps = connection.prepareStatement("select * from addstudent where id = ?");
						ps.setLong(1, idNumber);

						result = ps.executeQuery();
						result.next();
						String nameDB = result.getString("name");
						String classDB = result.getString("class");
						String subjectDB = result.getString("subject");

						stuNameText.setText(nameDB);
						stuClassText.setText(classDB);
						stuSubText.setText(subjectDB);

						ps = connection.prepareStatement("select book from addbook");
						result = ps.executeQuery();

						ps = connection.prepareStatement("select book , lang , quan , id from addbook");
						result = ps.executeQuery();

						bookComboBox.removeAllItems();
						bookComboBox.addItem("Select any book");
						while (result.next()) {
							// delete the book having zero quantity
							if (result.getInt("quan") <= 0) {
								long idnum = result.getLong("id");
								ps = connection.prepareStatement("delete from addbook where id = ?");
								ps.setLong(1, idnum);
								ps.executeUpdate();
							}
							// retrieve the book having more than zero quantity
							if (result.getInt("quan") > 0) {
								bookComboBox.addItem(
										result.getString("book") + "(written in:- " + result.getString("lang") + ")");
							}

						}
						issueBtn.setVisible(true);
					} else {
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

		enterBtn.setIcon(
				new ImageIcon(IssueBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/enter.png")));
		enterBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		enterBtn.setBackground(Color.WHITE);
		enterBtn.setBounds(546, 179, 80, 30);
		panel.add(enterBtn);

		JLabel lblNewLabel_1_1_2 = new JLabel("Student Class");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(101, 292, 179, 30);
		panel.add(lblNewLabel_1_1_2);

		stuClassText = new JTextField();
		stuClassText.setForeground(SystemColor.desktop);
		stuClassText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		stuClassText.setEditable(false);
		stuClassText.setColumns(10);
		stuClassText.setBorder(new LineBorder(Color.BLACK, 2, true));
		stuClassText.setBackground(Color.WHITE);
		stuClassText.setBounds(356, 292, 180, 30);
		panel.add(stuClassText);

		JLabel lblNewLabel_1_1_3 = new JLabel("Student Subjects");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(101, 348, 179, 30);
		panel.add(lblNewLabel_1_1_3);

		stuSubText = new JTextField();
		stuSubText.setForeground(SystemColor.desktop);
		stuSubText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		stuSubText.setEditable(false);
		stuSubText.setColumns(10);
		stuSubText.setBorder(new LineBorder(Color.BLACK, 2, true));
		stuSubText.setBackground(Color.WHITE);
		stuSubText.setBounds(356, 348, 180, 30);
		panel.add(stuSubText);

		issueBtn = new JButton("");
		issueBtn.addActionListener(new ActionListener() {
			private JLabel jLabel;

			public void actionPerformed(ActionEvent e) {
				if (bookComboBox.getSelectedIndex() == 0) {
					jLabel = new JLabel("Please select any book to issue.");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(bookComboBox, jLabel);
					return;
				}
				String bookName = (String) bookComboBox.getSelectedItem();
				bookName = bookName.replace("(written in:- ", " ");
				bookName = bookName.replace(")", "");
				String divideBookName[] = bookName.split(" ");

				try {
					PreparedStatement ps = connection
							.prepareStatement("select quan from addbook where book = ? and lang = ? ");
					ps.setString(1, divideBookName[0]);
					ps.setString(2, divideBookName[1]);
					ResultSet result = ps.executeQuery();
					result.next();
					int quan = result.getInt("quan");

					if (quan <= 0) {
						ps = connection.prepareStatement("delete from addbook where book = ? and lang = ? ");
						ps.setString(1, divideBookName[0]);
						ps.setString(2, divideBookName[1]);
						int check = ps.executeUpdate();
						System.out.println((check == 1) ? "DELETED BOOK WHERE QUANTITY = 0" : "ERROR");

						jLabel = new JLabel(divideBookName[0] + " is out of stock, sorry for inconvenience .");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(bookComboBox, jLabel);

					} else {
						ps = connection.prepareStatement("update addbook set quan = ? where book = ? and lang = ?");
						ps.setInt(1, --quan);
						ps.setString(2, divideBookName[0]);
						ps.setString(3, divideBookName[1]);

						int check = ps.executeUpdate();
						System.out.println((check == 1) ? "UPDATED QUANTITY INTO DB" : "ERROR");

						jLabel = new JLabel(divideBookName[0] + " book is issued to " + stuNameText.getText() + ".");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(bookComboBox, jLabel);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		issueBtn.setIcon(
				new ImageIcon(IssueBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/getBookBtn.png")));
		issueBtn.setVisible(false);
		issueBtn.setFont(new Font("Courier New", Font.BOLD, 30));
		issueBtn.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		issueBtn.setBackground(Color.WHITE);
		issueBtn.setBounds(240, 523, 150, 40);
		panel.add(issueBtn);
	}
}
