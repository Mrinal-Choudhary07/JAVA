package MiniProjects.Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 10, 1033, 715);
		contentPane.add(panel);
		
		JLabel lblAboutus = new JLabel("About-us");
		lblAboutus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutus.setForeground(Color.YELLOW);
		lblAboutus.setFont(new Font("Algerian", Font.PLAIN, 60));
		lblAboutus.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblAboutus.setBounds(10, 10, 1013, 122);
		panel.add(lblAboutus);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		textArea.setTabSize(2);
		textArea.setRows(4);
		textArea.setText("\n\nEstd. In 1988 Hotel Renaissance, located in the heart of"
				+ " ‘Orange City’ has been a pioneer\nin the hospitality industry in"
				+ " Central India. Since its inception in 1988, this deluxe hotel\nhas "
				+ "strived for quality products and services thereby enhancing the "
				+ "overall experience\nof the guest. Our professional and well-trained "
				+ "staff are committed to deliver impeccable,\ndetailed and personalized "
				+ "service with a touch of informality keeping in mind the guest’s\nneeds,"
				+ " be it business or pleasure. Our “Never say no” attitude has helped "
				+ "us garner\na loyal list of guests who can vouch for our warmth, comfort"
				+ " and charm. Our homely\nenvironment blends with modern technology, "
				+ "ensuring that we meet and exceed our\nguest’s expectations.");
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(220, 20, 60));
		textArea.setBounds(10, 142, 1013, 563);
		panel.add(textArea);
	}
}
