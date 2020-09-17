package MiniProjects.LibraryManagementSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

import MiniProjects.Todo_List.CreateConnection;

public class AddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField idText;
	private JTextField nameText;
	private JTextField phoneText;
	private static AddStudent frame;
	private File file = null;
	private boolean uploadFlag = false;
	private Connection connection = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddStudent();
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
	public AddStudent() throws Exception {
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 678, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 667, 664);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Add-Student");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(196, 0, 256, 78);
		panel.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 33, 190, 4);
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
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(97, 116, 179, 30);
		panel.add(lblNewLabel_1);

		idText = new JTextField();
		idText.setBackground(Color.WHITE);
		idText.setEditable(false);
		idText.setBorder(new LineBorder(Color.BLACK, 2, true));
		idText.setForeground(SystemColor.desktop);
		idText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		idText.setBounds(352, 116, 180, 30);
		panel.add(idText);
		idText.setColumns(10);

		updateID();

		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(97, 175, 179, 30);
		panel.add(lblNewLabel_1_1);

		nameText = new JTextField();
		nameText.setBorder(new LineBorder(Color.BLACK, 2, true));
		nameText.setForeground(SystemColor.desktop);
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameText.setColumns(10);
		nameText.setBounds(352, 175, 180, 30);
		panel.add(nameText);

		JLabel lblNewLabel_1_2 = new JLabel("Class");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(97, 236, 179, 30);
		panel.add(lblNewLabel_1_2);

		String classes[] = { "Select Class", "BSc I year", "BSc II year", "BSc III year" };
		JComboBox classComboBox = new JComboBox(classes);
		classComboBox.setBackground(Color.WHITE);
		classComboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		classComboBox.setForeground(SystemColor.desktop);
		classComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		classComboBox.setBounds(352, 236, 180, 30);
		panel.add(classComboBox);

		String subjects[] = { "Select Group", "PCsM", "PCM", "PEM", "PSM" };
		JComboBox subjectComboBox = new JComboBox(subjects);
		subjectComboBox.setBackground(Color.WHITE);
		subjectComboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		subjectComboBox.setForeground(SystemColor.desktop);
		subjectComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		subjectComboBox.setBounds(352, 297, 180, 30);
		panel.add(subjectComboBox);

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
		phoneText.setBorder(new LineBorder(Color.BLACK, 2, true));
		phoneText.setForeground(SystemColor.desktop);
		phoneText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phoneText.setColumns(10);
		phoneText.setBounds(352, 357, 180, 30);
		panel.add(phoneText);

		JLabel imageLabel = new JLabel("");
		imageLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		imageLabel.setBounds(352, 414, 180, 150);
		panel.add(imageLabel);

		final JFileChooser fileDialog = new JFileChooser();

		JButton uploadBtn = new JButton("Upload File");
		uploadBtn.setHorizontalAlignment(SwingConstants.LEFT);
		uploadBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));

		uploadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uploadFlag = true;
				int returnVal = fileDialog.showOpenDialog(frame);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					file = fileDialog.getSelectedFile();
					Image img = null;
					try {
						img = ImageIO.read(file);
						imageLabel.setIcon(new ImageIcon(img));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {

				}
			}
		});
		uploadBtn.setBounds(97, 454, 137, 30);
		panel.add(uploadBtn);

		JButton addBtn = new JButton("");
		addBtn.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		addBtn.setIcon(
				new ImageIcon(AddStudent.class.getResource("/MiniProjects/LibraryManagementSystem/img/addStu.png")));
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idText.getText();
				String name = nameText.getText();
				String classes = (String) classComboBox.getSelectedItem();
				String subjects = (String) subjectComboBox.getSelectedItem();
				String phone = phoneText.getText();
				FileInputStream image = null;
				long idNumber = 0, phoneNumber = 0;

				// Check all fields are empty or not?
				if (!checkEmpty(id, name, classes, subjects, phone, file))
					return;

				try {
					image = new FileInputStream(file);
					idNumber = Long.valueOf(id);
					phoneNumber = Long.valueOf(phone);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (NumberFormatException nfe) {
					nfe.printStackTrace();
				}

				// Validations of all fields
				if (!validation(id, name, phone))
					return;

				// Creating the queries
				try {
					Statement stmt = connection.createStatement();
					ResultSet result = stmt.executeQuery("select phone from addStudent");
					long phoneDB = 0;
					boolean idCheck = true;
					while (result.next()) {
						phoneDB = result.getLong("phone");
						if ((phoneDB == phoneNumber)) {
							idCheck = false;
							break;
						}
					}
					if (idCheck) {
						PreparedStatement ps = connection
								.prepareStatement("insert into addStudent values(?,?,?,?,?,?)");
						ps.setLong(1, idNumber);
						ps.setString(2, name);
						ps.setString(3, classes);
						ps.setString(4, subjects);
						ps.setLong(5, phoneNumber);
						ps.setBinaryStream(6, image);

						int check = ps.executeUpdate();

						System.out.println((check == 1) ? "Inserted into addStudent" : "Error");

						JLabel jLabel = new JLabel("Inserted successfully.");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(classComboBox, jLabel);
						updateID();
					} else {
						JLabel jLabel = new JLabel("Entered phone number is already existed.");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(phoneText, jLabel);
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			private boolean validation(String id, String name, String phone) {
				JLabel jLabel;
				boolean flag = true;
				String idRegex = "[\\d]+";
				String nameRegex = "[\\D]+";
				String phoneRegex = "[\\d]{10}";
				if (!id.matches(idRegex)) {
					jLabel = new JLabel("Invalid ID card (must contain only numbers!)");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(idText, jLabel);
					flag = false;
				}
				if (!name.matches(nameRegex)) {
					jLabel = new JLabel("Invalid name (Must contains only characters!)");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(nameText, jLabel);
					flag = false;
				}
				if (!phone.matches(phoneRegex)) {
					jLabel = new JLabel("Invalid phone number(Must contains 10 digits!)");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(phoneText, jLabel);
					flag = false;
				}
				return flag;
			}

			private boolean checkEmpty(String id, String name, String classes, String subjects, String phone,
					File file) {
				JLabel jLabel;
				boolean flag = true;
				if (id.length() == 0) {
					jLabel = new JLabel("Please enter ID card number");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(idText, jLabel);
					flag = false;
				}
				if (name.length() == 0) {
					jLabel = new JLabel("Please enter your name");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(nameText, jLabel);
					flag = false;
				}
				if (classComboBox.getSelectedIndex() == 0) {
					jLabel = new JLabel("Please select your class");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(classComboBox, jLabel);
					flag = false;
				}
				if (subjectComboBox.getSelectedIndex() == 0) {
					jLabel = new JLabel("Please select your subjects()");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(subjectComboBox, jLabel);
					flag = false;
				}
				if (phone.length() == 0) {
					jLabel = new JLabel("Please enter your phone number");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(phoneText, jLabel);
					flag = false;
				}
				if (file == null) {
					jLabel = new JLabel("Please upload your image");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(imageLabel, jLabel);
					flag = false;
				}
				return flag;
			}
		});
		addBtn.setBackground(Color.WHITE);
		addBtn.setFont(new Font("Courier New", Font.BOLD, 30));
		addBtn.setBounds(229, 588, 150, 40);
		panel.add(addBtn);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				AddStudent.class.getResource("/MiniProjects/LibraryManagementSystem/img/addStudent2.png")));
		lblNewLabel_2.setBounds(448, 0, 70, 78);
		panel.add(lblNewLabel_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(520, 33, 137, 4);
		panel.add(separator_3);
	}

	private void updateID() {
		try {
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery("select id from addstudent");
			long idDB = 0;

			while (result.next())
				idDB = result.getLong("id");

			idText.setText(String.valueOf(idDB + 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
