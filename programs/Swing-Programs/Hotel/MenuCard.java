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

public class MenuCard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCard frame = new MenuCard();
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
	public MenuCard() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1451, 790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 10, 1427, 733);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTastyfood = new JLabel("Tasty-Food");
		lblTastyfood.setHorizontalAlignment(SwingConstants.CENTER);
		lblTastyfood.setForeground(Color.YELLOW);
		lblTastyfood.setFont(new Font("Algerian", Font.PLAIN, 60));
		lblTastyfood.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblTastyfood.setBounds(10, 10, 1404, 162);
		panel.add(lblTastyfood);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(10, 182, 1404, 541);
		panel.add(panel_1);
	}

}
