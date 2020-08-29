package MiniProjects.Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Hotel_Login extends JFrame {

	private JPanel contentPane;
	private JTextField tname;
	private JPasswordField tpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel_Login frame = new Hotel_Login();
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
	public Hotel_Login() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(10, 10, 885, 467);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel loginTitle = new JLabel("Hotel Renaissance");
		loginTitle.setFont(new Font("Algerian", Font.PLAIN, 50));
		loginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		loginTitle.setForeground(new Color(240, 230, 140));
		loginTitle.setBackground(Color.BLACK);
		loginTitle.setBounds(10, 10, 865, 83);
		panel.add(loginTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 0));
		panel_1.setBounds(140, 155, 607, 302);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 37, 179, 39);
		panel_1.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblPassword.setBounds(10, 157, 179, 39);
		panel_1.add(lblPassword);
		
		tname = new JTextField();
		tname.setForeground(new Color(0, 0, 0));
		tname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tname.setHorizontalAlignment(SwingConstants.LEFT);
		tname.setToolTipText("Enter name");
		tname.setBounds(290, 37, 226, 39);
		panel_1.add(tname);
		tname.setColumns(10);
		
		tpassword = new JPasswordField();
		tpassword.setForeground(new Color(0, 0, 0));
		tpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tpassword.setToolTipText("Enter password");
		tpassword.setBounds(290, 157, 226, 39);
		panel_1.add(tpassword);
		
		JLabel nameWarn = new JLabel("");
		nameWarn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameWarn.setHorizontalAlignment(SwingConstants.LEFT);
		nameWarn.setForeground(Color.WHITE);
		nameWarn.setBounds(290, 79, 226, 19);
		panel_1.add(nameWarn);
		
		JLabel passWarn = new JLabel("");
		passWarn.setHorizontalAlignment(SwingConstants.LEFT);
		passWarn.setForeground(Color.WHITE);
		passWarn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passWarn.setBounds(290, 201, 226, 19);
		panel_1.add(passWarn);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setForeground(Color.BLACK);
		loginBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name = tname.getText();
				String pass = tpassword.getText();
				
				if( name.equals("Mrinal") && pass.equals("1234") )
				{
					Hotel frame = new Hotel();
					frame.setVisible(true);	
				}
				else
				{
					if( !name.equals("Mrinal") && !pass.equals("1234") )
					{
						nameWarn.setText("Invalid Name..!");
						passWarn.setText("Invalid Password..!");
					}					
					else if( !pass.equals("1234") )
						passWarn.setText("Invalid Password..!");
					else if( !name.equals("Mrinal") )						  
					nameWarn.setText("Invalid Name..!"); 
					else
					{
						nameWarn.setText("");
						passWarn.setText("");											
					}
				}
			}
		});
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setBounds(203, 258, 170, 34);
		panel_1.add(loginBtn);
	}
}
