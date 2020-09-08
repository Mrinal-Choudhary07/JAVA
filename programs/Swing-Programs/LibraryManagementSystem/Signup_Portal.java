package MiniProjects.LibraryManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import MiniProjects.Todo_List.CreateConnection;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.SystemColor;

public class Signup_Portal extends JFrame {

	private JPanel contentPane;
	private JTextField unameText;
	private JTextField pswdText;
	private JTextField questionText;
	private Connection connection = null;
	private static Signup_Portal frame;
	private Thread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Signup_Portal();
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
	public Signup_Portal() throws Exception {
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		t = new Thread();
		setTitle("Signup Portal");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 596, 572);
		contentPane.add(panel);

		JLabel lblSignup = new JLabel("Signup");
		lblSignup.setForeground(Color.BLACK);
		lblSignup.setFont(new Font("Bodoni MT", Font.PLAIN, 50));
		lblSignup.setBounds(426, 10, 160, 62);
		panel.add(lblSignup);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(31, 36, 393, 1);
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

		JLabel lblNewLabel_1_2 = new JLabel("Username");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(42, 151, 160, 30);
		panel.add(lblNewLabel_1_2);

		unameText = new JTextField();
		unameText.setForeground(SystemColor.desktop);
		unameText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		unameText.setColumns(10);
		unameText.setBounds(317, 151, 206, 30);
		panel.add(unameText);

		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(42, 230, 160, 30);
		panel.add(lblNewLabel_1_1_1);

		pswdText = new JTextField();
		pswdText.setForeground(SystemColor.desktop);
		pswdText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pswdText.setColumns(10);
		pswdText.setBounds(317, 230, 206, 30);
		panel.add(pswdText);

		String question[] = { "Secuirty Question.", "What is your school name?", "Which is your favourite animal?",
				"Who is your favourite teacher?", "Which is your favourite movie?" };
		JComboBox comboBox = new JComboBox(question);
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		comboBox.setBounds(42, 313, 269, 30);
		panel.add(comboBox);

		questionText = new JTextField();
		questionText.setForeground(SystemColor.desktop);
		questionText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		questionText.setColumns(10);
		questionText.setBounds(317, 313, 206, 30);
		panel.add(questionText);

		JButton btnSignup = new JButton("");
		btnSignup.addActionListener(new ActionListener() {			

			public void actionPerformed(ActionEvent e) {
				String uname = unameText.getText(), pswd = pswdText.getText(),
						que = (String) comboBox.getSelectedItem(), ans = questionText.getText();
				String pswdRegex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
				JLabel jLabel;
				boolean flag=false;

				try {
					if (uname.length() == 0) {
						jLabel = new JLabel("Please enter Username");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(lblNewLabel_1_2, jLabel);
						flag = true;
					}
					if (!pswd.matches(pswdRegex)) {
						String s = "Password must be 8 characters long, must contains"
								+ " 1 Capital letter, 1 Small letter, 1 Number and 1 Special Character";
						jLabel = new JLabel(s);
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(lblNewLabel_1_1_1, jLabel);
						flag = true;
					}
					if( comboBox.getSelectedIndex() == 0 )
					{
						jLabel = new JLabel("Please Select Security Question");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(comboBox, jLabel);
						flag = true;
					}	
					if (ans.length() == 0) {
						jLabel = new JLabel("Please enter answer for security question");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(comboBox, jLabel);
						flag = true;
					}
					
					if(flag)return; // Validation
					
					PreparedStatement ps = connection.prepareStatement("select * from signup");
					ResultSet result = ps.executeQuery();
					
					while( result.next() )
					{
						String checkUname = result.getString("uname");
						if( checkUname.equals(uname) )
						{
							jLabel = new JLabel("Username:- ' " + uname + " ' already exists.");
							jLabel.setFont(new Font("Arial", Font.BOLD, 18));
							jLabel.setForeground(Color.black);
							JOptionPane.showMessageDialog(comboBox, jLabel);
							return;
						}
					}
					
					ps = connection.prepareStatement("insert into signup values(?,?,?,?)");
					ps.setString(1, uname);
					ps.setString(2, pswd);
					ps.setString(3, que);
					ps.setString(4, ans);

					int i = ps.executeUpdate();
					System.out.println( (i==1)?"Insert into signup table" :"Error" );
					
					ps = connection.prepareStatement("insert into login values(?,?)");
					ps.setString(1, uname);
					ps.setString(2, pswd);
					
					i = ps.executeUpdate();
					System.out.println( (i==1)?"Insert into login table" :"Error" );
										
					Login_Portal.main(new String[0]);					
					setVisible(false);
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnSignup.setIcon(new ImageIcon(
				Signup_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/signupBlueBtn.jpg")));
		btnSignup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSignup.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSignup.setBounds(165, 426, 120, 40);
		panel.add(btnSignup);
		
		JButton btnSignup_1 = new JButton("");
		btnSignup_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login_Portal.main(new String[0]);
			}
		});
		btnSignup_1.setIcon(new ImageIcon(Signup_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/backBtn.jpg")));
		btnSignup_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSignup_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSignup_1.setBounds(317, 426, 120, 40);
		panel.add(btnSignup_1);
		
	}	
}
