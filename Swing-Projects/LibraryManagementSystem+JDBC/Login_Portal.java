package MiniProjects.LibraryManagementSystem;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login_Portal {

	public JFrame frmLogin;
	private JTextField psdText;
	private JTextField userText;
	private Connection connection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Portal window = new Login_Portal();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws Exception
	 */
	public Login_Portal() throws Exception {
		connection = CreateConnection.getConnection("LibraryManagementSystem");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.WHITE);
		frmLogin.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 596, 572);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 50));
		lblNewLabel.setBounds(451, 10, 135, 62);
		panel.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(31, 36, 420, 1);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(31, 537, 504, 1);
		panel.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBounds(533, 68, 1, 470);
		panel.add(separator_2);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(31, 36, 1, 502);
		panel.add(separator_2_1);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(90, 151, 145, 30);
		panel.add(lblNewLabel_1);
		
		JButton forgetBtn = new JButton("Forgot Password..?");
		forgetBtn.setForeground(SystemColor.desktop);
		forgetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgetPswd_Portal forgetPswd_Portal;
				try {
					forgetPswd_Portal = new ForgetPswd_Portal();
					forgetPswd_Portal.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmLogin.setVisible(false);
			}
		});
		forgetBtn.setVisible(false);
		forgetBtn.setBackground(new Color(154, 205, 50));
		forgetBtn.setFont(new Font("Tahoma", Font.PLAIN, 22));
		forgetBtn.setBorder(null);
		forgetBtn.setBounds(167, 418, 199, 40);
		panel.add(forgetBtn);

		JButton btnLogin = new JButton("");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = userText.getText(), pswd = psdText.getText();
				boolean flag = false;
				
				try {
					PreparedStatement ps = connection.prepareStatement("select * from login");
					ResultSet result = ps.executeQuery();

					while (result.next()) {
						String unameDB = result.getString("uname");
						String pswdDB  = result.getString("pswd");
						if( uname.equals(unameDB) && pswd.equals(pswdDB) )
						{
							flag = true;
							break;
						}
					}					
					if( flag )
					{
						forgetBtn.setVisible(false);
						frmLogin.setVisible(false);
						SplashScreen screen = new SplashScreen();
						screen.setVisible(true);
					}
					else
					{
						forgetBtn.setVisible(true);
						JLabel jLabel = new JLabel("Invalid Username or Password");
						jLabel.setFont(new Font("Arial", Font.BOLD, 16));
						jLabel.setForeground(Color.black);
						JOptionPane.showMessageDialog(lblNewLabel_1, jLabel);						
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnLogin.setIcon(new ImageIcon(
				Login_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/loginBlueBtn.jpg")));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLogin.setBounds(115, 354, 120, 40);
		panel.add(btnLogin);

		JButton btnSignup = new JButton("");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup_Portal portal;
				try {
					portal = new Signup_Portal();
					portal.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmLogin.setVisible(false);
			}
		});
		btnSignup.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSignup.setIcon(new ImageIcon(
				Login_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/signupBlueBtn.jpg")));
		btnSignup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSignup.setBounds(304, 354, 120, 40);
		panel.add(btnSignup);

		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(90, 212, 145, 30);
		panel.add(lblNewLabel_1_1);

		psdText = new JTextField();
		psdText.setForeground(SystemColor.desktop);
		psdText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		psdText.setColumns(10);
		psdText.setBounds(245, 212, 206, 30);
		panel.add(psdText);

		userText = new JTextField();
		userText.setForeground(SystemColor.desktop);
		userText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userText.setColumns(10);
		userText.setBounds(245, 151, 206, 30);
		panel.add(userText);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(
				new ImageIcon(Login_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/user.png")));
		lblNewLabel_2.setBounds(455, 151, 30, 30);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(
				new ImageIcon(Login_Portal.class.getResource("/MiniProjects/LibraryManagementSystem/img/pswd.png")));
		lblNewLabel_2_1.setBounds(455, 212, 30, 30);
		panel.add(lblNewLabel_2_1);

		
		frmLogin.setForeground(Color.BLACK);
		frmLogin.setTitle("Login Portal");
		frmLogin.setType(Type.UTILITY);
		frmLogin.setResizable(false);
		frmLogin.setBounds(100, 100, 600, 600);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
