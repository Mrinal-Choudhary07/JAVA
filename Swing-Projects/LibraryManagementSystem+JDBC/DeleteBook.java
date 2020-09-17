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
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class DeleteBook extends JFrame {

	private JPanel contentPane;
	private JTextField idText;
	private JTextField bookText;
	private JTextField authorText;
	private JTextField langText;
	private JTextField quanText;
	private Connection connection;
	protected long idNumber;
	private JButton delBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteBook frame = new DeleteBook();
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
	public DeleteBook() throws Exception {
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 684, 697);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 673, 661);
		contentPane.add(panel);

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
		idText.setForeground(SystemColor.desktop);
		idText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		idText.setColumns(10);
		idText.setBorder(new LineBorder(Color.BLACK, 2, true));
		idText.setBounds(354, 155, 180, 30);
		panel.add(idText);

		JLabel lblNewLabel_1_1 = new JLabel("Book Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(99, 214, 179, 30);
		panel.add(lblNewLabel_1_1);

		bookText = new JTextField();
		bookText.setBackground(Color.WHITE);
		bookText.setEditable(false);
		bookText.setForeground(SystemColor.desktop);
		bookText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bookText.setColumns(10);
		bookText.setBorder(new LineBorder(Color.BLACK, 2, true));
		bookText.setBounds(354, 214, 180, 30);
		panel.add(bookText);

		JLabel lblNewLabel_1_2 = new JLabel("Author Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(99, 275, 179, 30);
		panel.add(lblNewLabel_1_2);

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

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 33, 179, 2);
		panel.add(separator);

		JLabel lblDeletebook = new JLabel("Delete-Book");
		lblDeletebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeletebook.setForeground(Color.BLACK);
		lblDeletebook.setFont(new Font("Consolas", Font.BOLD, 40));
		lblDeletebook.setBounds(161, 0, 312, 78);
		panel.add(lblDeletebook);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(
				new ImageIcon(DeleteBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/delBook2.png")));
		lblNewLabel_2.setBounds(450, 0, 70, 78);
		panel.add(lblNewLabel_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(520, 33, 137, 2);
		panel.add(separator_3);

		authorText = new JTextField();
		authorText.setForeground(SystemColor.desktop);
		authorText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		authorText.setEditable(false);
		authorText.setColumns(10);
		authorText.setBorder(new LineBorder(Color.BLACK, 2, true));
		authorText.setBackground(Color.WHITE);
		authorText.setBounds(354, 275, 180, 30);
		panel.add(authorText);

		langText = new JTextField();
		langText.setForeground(SystemColor.desktop);
		langText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		langText.setEditable(false);
		langText.setColumns(10);
		langText.setBorder(new LineBorder(Color.BLACK, 2, true));
		langText.setBackground(Color.WHITE);
		langText.setBounds(354, 336, 180, 30);
		panel.add(langText);

		quanText = new JTextField();
		quanText.setForeground(SystemColor.desktop);
		quanText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		quanText.setEditable(false);
		quanText.setColumns(10);
		quanText.setBorder(new LineBorder(Color.BLACK, 2, true));
		quanText.setBackground(Color.WHITE);
		quanText.setBounds(354, 396, 180, 30);
		panel.add(quanText);

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
					ResultSet result = stmt.executeQuery("select id from addBook");
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
						PreparedStatement ps = connection.prepareStatement("select * from addBook where id = ?");
						ps.setLong(1, idNumber);

						result = ps.executeQuery();
						result.next();
						String bookDB = result.getString("bookname");
						String authorDB = result.getString("authorName");
						String langDB = result.getString("language");
						long quanDB = result.getLong("quantity");

						bookText.setText(bookDB);
						authorText.setText(authorDB);
						langText.setText(langDB);
						quanText.setText(String.valueOf(quanDB));

						delBtn.setVisible(true);
					} else {
						JLabel jLabel = new JLabel("Entered Book ID number is not existed.");
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
					JLabel jLabel = new JLabel("Invalid Book ID (must contain only numbers!)");
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
					jLabel = new JLabel("Please enter Book ID");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(idText, jLabel);
					flag = false;
				}
				return flag;
			}
		});
		enterBtn.setIcon(
				new ImageIcon(DeleteBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/enter.png")));
		enterBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		enterBtn.setBackground(Color.WHITE);
		enterBtn.setBounds(544, 155, 80, 30);
		panel.add(enterBtn);

		delBtn = new JButton("");
		delBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JLabel jLabel = new JLabel("Are you sure to delete?");
				jLabel.setFont(new Font("Arial", Font.BOLD, 16));
				jLabel.setForeground(Color.black);
				int check = JOptionPane.showConfirmDialog(idText, jLabel);
				if (check == 0) {
					try {
						PreparedStatement ps = connection.prepareStatement("delete from addbook where id=?");
						ps.setLong(1, idNumber);
						ps.executeUpdate();
						jLabel = new JLabel("Book details having Id number " + idNumber + " is deleted successfully.");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(idText, jLabel);
						
						delBtn.setVisible(false);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		delBtn.setVisible(false);
		delBtn.setIcon(new ImageIcon(
				DeleteBook.class.getResource("/MiniProjects/LibraryManagementSystem/img/delBookBtn.png")));
		delBtn.setFont(new Font("Courier New", Font.BOLD, 30));
		delBtn.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		delBtn.setBackground(Color.WHITE);
		delBtn.setBounds(240, 523, 150, 40);
		panel.add(delBtn);
	}
}
