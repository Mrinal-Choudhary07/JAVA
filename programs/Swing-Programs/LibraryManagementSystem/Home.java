package MiniProjects.LibraryManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1286, 713);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/logoutBtn.png")));
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 16));
		btnNewButton.setBounds(1185, 148, 91, 41);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Library Management System");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 65));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 10, 984, 128);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/books.png")));
		lblNewLabel_1.setBounds(1004, 10, 272, 128);
		panel.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(22, 687, 576, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(20, 224, 2, 465);
		panel.add(separator_2);
		
		JLabel lblNewLabel_2 = new JLabel("Student");
		lblNewLabel_2.setForeground(new Color(138, 43, 226));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 178, 201, 50);
		panel.add(lblNewLabel_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(770, 208, 483, 2);
		panel.add(separator_3);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(670, 687, 580, 2);
		panel.add(separator_1_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(669, 224, 2, 465);
		panel.add(separator_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Book");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(new Color(138, 43, 226));
		lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		lblNewLabel_2_1.setBounds(659, 178, 201, 50);
		panel.add(lblNewLabel_2_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_2_2.setForeground(Color.BLACK);
		separator_2_2.setBackground(Color.BLACK);
		separator_2_2.setBounds(596, 208, 2, 481);
		panel.add(separator_2_2);
		
		JSeparator separator_2_2_1 = new JSeparator();
		separator_2_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_2_1.setForeground(Color.BLACK);
		separator_2_2_1.setBackground(Color.BLACK);
		separator_2_2_1.setBounds(1251, 208, 2, 481);
		panel.add(separator_2_2_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(0, 0, 0));
		separator_4.setBackground(new Color(0, 0, 0));
		separator_4.setBounds(20, 152, 1158, 1);
		panel.add(separator_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent addStudent;
				try {
					addStudent = new AddStudent();
					addStudent.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/addStudent.png")));
		btnNewButton_1.setBounds(51, 238, 200, 185);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent deleteStudent;
				try {
					deleteStudent = new DeleteStudent();
					deleteStudent.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/delStudent.png")));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(359, 238, 200, 185);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statistics statistics;
				try {
					statistics = new Statistics();
					statistics.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			}
		});
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/statistics.png")));
		btnNewButton_2.setBounds(196, 448, 200, 200);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/addBook.png")));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(705, 224, 200, 200);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/delBook.png")));
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(1013, 224, 200, 185);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setIcon(new ImageIcon(Home.class.getResource("/MiniProjects/LibraryManagementSystem/img/issueBook.png")));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBounds(850, 463, 200, 185);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Add Student");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(86, 413, 135, 35);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Delete Student");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(389, 413, 147, 35);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Statistics");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(222, 643, 147, 35);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Add Student");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(742, 417, 135, 35);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Delete Student");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_2.setBounds(1031, 413, 147, 35);
		panel.add(lblNewLabel_3_1_2);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(Color.BLACK);
		separator_1_2.setBounds(185, 208, 413, 2);
		panel.add(separator_1_2);
	}
}
