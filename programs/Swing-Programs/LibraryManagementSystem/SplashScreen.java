package MiniProjects.LibraryManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class SplashScreen extends JFrame implements Runnable{

	private JPanel contentPane;
	private JProgressBar progressBar;
	Thread t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen frame = new SplashScreen();
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
	public SplashScreen() {
		t1 = new Thread(this);
		t1.start();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 607, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();		
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 596, 572);
		contentPane.add(panel);
		panel.setLayout(null);
		
		progressBar = new JProgressBar(0,100);
		progressBar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		progressBar.setValue(0);		
		progressBar.setForeground(new Color(148, 0, 211));		
		progressBar.setBounds(20, 451, 541, 22);
		panel.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SplashScreen.class.getResource("/MiniProjects/LibraryManagementSystem/img/book.gif")));
		lblNewLabel.setBounds(166, 164, 250, 180);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 30, 289, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(284, 545, 289, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 30, 2, 259);
		panel.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Library-Management-System");
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 46, 552, 108);
		panel.add(lblNewLabel_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(572, 288, 2, 259);
		panel.add(separator_2_1);
	}

	@Override
	public void run() {		
			 int i=1;
			while( i<101 )
			{
				final int x = i;
				SwingUtilities.invokeLater(new Runnable() {					
					@Override
					public void run() {
						progressBar.setValue(x+10);
					}
				});
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i+=10;
			}
			dispose();
			// HOME PAGE
			Home home = new Home();
			home.setVisible(true);
	}
}
