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
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddBook extends JFrame {

	private JPanel contentPane;
	private JTextField idText;
	private JTextField nameText;
	private JTextField authorText;
	private Connection connection;
	protected Long idNumber;

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
	 * 
	 * @throws Exception
	 */
	public AddBook() throws Exception {
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 676, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 667, 664);
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
		lblNewLabel_1.setBounds(99, 155, 179, 30);
		panel.add(lblNewLabel_1);

		idText = new JTextField();
		idText.setBackground(Color.WHITE);
		idText.setEditable(false);
		idText.setForeground(SystemColor.desktop);
		idText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		idText.setColumns(10);
		idText.setBorder(new LineBorder(Color.BLACK, 2, true));
		idText.setBounds(354, 155, 180, 30);
		panel.add(idText);
		
		updateID();		

		JLabel lblNewLabel_1_1 = new JLabel("Book Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(99, 214, 179, 30);
		panel.add(lblNewLabel_1_1);

		nameText = new JTextField();
		nameText.setForeground(SystemColor.desktop);
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameText.setColumns(10);
		nameText.setBorder(new LineBorder(Color.BLACK, 2, true));
		nameText.setBounds(354, 214, 180, 30);
		panel.add(nameText);

		JLabel lblNewLabel_1_2 = new JLabel("Author Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(99, 275, 179, 30);
		panel.add(lblNewLabel_1_2);

		JComboBox langComboBox = new JComboBox(new Object[] { "Select language", "English", "Hindi", "Marathi" });
		langComboBox.setForeground(SystemColor.desktop);
		langComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		langComboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		langComboBox.setBounds(354, 336, 180, 30);
		panel.add(langComboBox);

		JLabel lblNewLabel_1_2_1 = new JLabel("Language");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(99, 336, 179, 30);
		panel.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(99, 396, 179, 30);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(
				new ImageIcon(AddBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/addBook2.png")));
		lblNewLabel_2.setBounds(418, 0, 70, 78);
		panel.add(lblNewLabel_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(498, 33, 159, 4);
		panel.add(separator_3);

		authorText = new JTextField();
		authorText.setForeground(SystemColor.desktop);
		authorText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		authorText.setColumns(10);
		authorText.setBorder(new LineBorder(Color.BLACK, 2, true));
		authorText.setBounds(354, 275, 180, 30);
		panel.add(authorText);

		JSpinner quanSpinner = new JSpinner();
		quanSpinner.setForeground(SystemColor.desktop);
		quanSpinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		quanSpinner.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		quanSpinner.setBounds(354, 401, 180, 30);
		panel.add(quanSpinner);

		JButton addBtn = new JButton("");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = idText.getText();
				String name = nameText.getText();
				String Aname = authorText.getText();
				String lang = (String) langComboBox.getSelectedItem();
				int quan = (int) quanSpinner.getValue();				

				// Check all fields are empty or not?
				if (!checkEmpty(id, name, Aname, lang, quan))
					return;

				// Validate all fields
				if (!validation(id, name, Aname))
					return;

				try {
					idNumber = Long.valueOf(id);
					PreparedStatement ps = connection.prepareStatement("insert into addbook values(?,?,?,?,?)");
					ps.setLong(1, idNumber);
					ps.setString(2, name);
					ps.setString(3, Aname);
					ps.setString(4, lang);
					ps.setLong(5, quan);

					int check = ps.executeUpdate();

					System.out.println((check == 1) ? "Inserted into addBook" : "Error");

					JLabel jLabel = new JLabel("Inserted successfully.");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(langComboBox, jLabel);
					updateID();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			private boolean validation(String id, String name, String aname) {

				JLabel jLabel;
				boolean flag = true;
				String idRegex = "[\\d]+";
				String nameRegex = "[\\D]+";
				if (!id.matches(idRegex)) {
					jLabel = new JLabel("Invalid Book ID (must contain only numbers!)");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(idText, jLabel);
					flag = false;
				}
				if (!name.matches(nameRegex)) {
					jLabel = new JLabel("Invalid Book name (Must contains only characters!)");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(nameText, jLabel);
					flag = false;
				}
				if (!aname.matches(nameRegex)) {
					jLabel = new JLabel("Invalid Author name (Must contains only characters!)");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(authorText, jLabel);
					flag = false;
				}
				return flag;
			}

			private boolean checkEmpty(String id, String name, String aname, String lang, int quan) {
				JLabel jLabel;
				boolean flag = true;
				if (id.length() == 0) {
					jLabel = new JLabel("Please enter Book ID number");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(idText, jLabel);
					flag = false;
				}
				if (name.length() == 0) {
					jLabel = new JLabel("Please enter Book name");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(nameText, jLabel);
					flag = false;
				}
				if (aname.length() == 0) {
					jLabel = new JLabel("Please enter Author name");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(authorText, jLabel);
					flag = false;
				}
				if (langComboBox.getSelectedIndex() == 0) {
					jLabel = new JLabel("Please select Book language");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(langComboBox, jLabel);
					flag = false;
				}
				if (quan == 0) {
					jLabel = new JLabel("Please select quantity");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(quanSpinner, jLabel);
					flag = false;
				}
				return flag;
			}
		});
		addBtn.setIcon(
				new ImageIcon(AddBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/addBookBtn.png")));
		addBtn.setFont(new Font("Courier New", Font.BOLD, 30));
		addBtn.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		addBtn.setBackground(Color.WHITE);
		addBtn.setBounds(240, 523, 150, 40);
		panel.add(addBtn);
	}

	private void updateID() {
		try {
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery("select id from addbook");
			long idDB = 0;

			while (result.next())
				idDB = result.getLong("id");

			idText.setText(String.valueOf(idDB + 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
