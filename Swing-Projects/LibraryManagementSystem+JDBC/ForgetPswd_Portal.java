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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ForgetPswd_Portal extends JFrame {

	private JPanel contentPane;
	private JTextField unameText;
	private JTextField getPswdText;
	private JTextField questionText;
	private Connection connection;
	private String uname = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetPswd_Portal frame = new ForgetPswd_Portal();
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
	public ForgetPswd_Portal() throws Exception {
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 607, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 596, 572);
		contentPane.add(panel);

		JLabel lblForgot = new JLabel("Forgot Password");
		lblForgot.setForeground(Color.BLACK);
		lblForgot.setFont(new Font("Bodoni MT", Font.PLAIN, 50));
		lblForgot.setBounds(201, 10, 370, 62);
		panel.add(lblForgot);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(31, 36, 160, 1);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(31, 537, 504, 1);
		panel.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(533, 68, 1, 470);
		panel.add(separator_2);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(31, 36, 1, 502);
		panel.add(separator_2_1);

		JLabel lblNewLabel_1_2 = new JLabel("Enter username");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(SystemColor.desktop);
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(42, 145, 229, 36);
		panel.add(lblNewLabel_1_2);

		unameText = new JTextField();
		unameText.setForeground(SystemColor.desktop);
		unameText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		unameText.setColumns(10);
		unameText.setBounds(320, 154, 204, 30);
		panel.add(unameText);

		JLabel quesLabel = new JLabel("Security Question");
		quesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		quesLabel.setForeground(Color.BLACK);
		quesLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		quesLabel.setBounds(42, 262, 268, 40);
		panel.add(quesLabel);

		JButton btnSearch = new JButton("");
		btnSearch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				uname = unameText.getText();
				JLabel jLabel;
				if (uname.length() == 0) {
					jLabel = new JLabel("Please enter Username");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(unameText, jLabel);
				} else {
					try {
						PreparedStatement ps = connection
								.prepareStatement("select question from signup where uname = ?");
						ps.setString(1, uname);

						ResultSet result = ps.executeQuery();
						result.next(); // IMP LINE

						String quesDB = "";
						try {
							quesDB = result.getString("question");
							quesLabel.setText(quesDB);
						} catch (SQLException sqlex) {
							jLabel = new JLabel("Inavalid Username..!");
							jLabel.setFont(new Font("Arial", Font.BOLD, 16));
							jLabel.setForeground(Color.black);
							JOptionPane.showMessageDialog(btnSearch, jLabel);
							unameText.setText("");
						}
						// System.out.println(quesDB); Debug

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		btnSearch.setIcon(new ImageIcon(ForgetPswd_Portal.class
				.getResource("/MiniProjects/LibraryManagementSystem/img/questionForgetBtn.jpg")));
		btnSearch.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnSearch.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSearch.setBounds(177, 207, 166, 40);
		panel.add(btnSearch);

		JLabel lblNewLabel_1_2_1 = new JLabel("Your password");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(42, 387, 229, 40);
		panel.add(lblNewLabel_1_2_1);

		getPswdText = new JTextField();
		getPswdText.setForeground(SystemColor.desktop);
		getPswdText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		getPswdText.setColumns(10);
		getPswdText.setBounds(320, 398, 204, 30);
		panel.add(getPswdText);

		questionText = new JTextField();
		questionText.setForeground(SystemColor.desktop);
		questionText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		questionText.setColumns(10);
		questionText.setBounds(320, 271, 204, 30);
		panel.add(questionText);

		JButton btnPswd = new JButton("");
		btnPswd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel jLabel;
				if (questionText.getText().toString().length() == 0) {
					jLabel = new JLabel("Please enter answer of question");
					jLabel.setFont(new Font("Arial", Font.BOLD, 16));
					jLabel.setForeground(Color.black);
					JOptionPane.showMessageDialog(questionText, jLabel);
				} else {
					try {
						PreparedStatement ps = connection.prepareStatement("select answer from signup where uname = ?");
						ps.setString(1, uname);

						ResultSet result = ps.executeQuery();
						result.next();

						String ansDB = "";
						ansDB = result.getString("answer");

						try {
							if (questionText.getText().toString().equals(ansDB)) {
								ps = connection
										.prepareStatement("SELECT pswd FROM signup WHERE uname = '"+uname+"'");
								result = ps.executeQuery();
								result.next();
								getPswdText.setText(result.getString("pswd"));
							}
							else
							{
								jLabel = new JLabel("Invalid Answer..!");
								jLabel.setFont(new Font("Arial", Font.BOLD, 16));
								jLabel.setForeground(Color.black);
								JOptionPane.showMessageDialog(btnSearch, jLabel);
								getPswdText.setText("");
							}
						} catch (SQLException sqlex) {
														
						}

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		btnPswd.setIcon(new ImageIcon(
				ForgetPswd_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/psdForgetBtn.jpg")));
		btnPswd.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnPswd.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnPswd.setBounds(177, 337, 166, 40);
		panel.add(btnPswd);

		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Portal.main(new String[0]);
				setVisible(false);
			}
		});
		btnBack.setIcon(new ImageIcon(ForgetPswd_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/back.jpg")));
		btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnBack.setBounds(201, 452, 120, 40);
		panel.add(btnBack);
	}
}
