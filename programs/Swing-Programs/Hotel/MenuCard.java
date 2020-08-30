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
import javax.swing.ImageIcon;

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
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(10, 131, 1404, 592);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_3.setBackground(new Color(220, 20, 60));
		panel_3.setBounds(10, 10, 357, 572);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Starters");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 10, 134, 39);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Crispy-Veg");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(10, 73, 196, 27);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("120/-");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(285, 73, 62, 27);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Paneer-Tikka");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1.setBounds(10, 110, 196, 27);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("150/-");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(285, 110, 62, 27);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Veg-Roll");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1.setBounds(10, 147, 196, 27);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("80/-");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1.setBounds(285, 147, 62, 27);
		panel_3.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Paneer-Chilli");
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1.setBounds(10, 184, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("120/-");
		lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1.setBounds(285, 184, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Paneer-Pakoda");
		lblNewLabel_3_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_1.setBounds(10, 221, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("120/-");
		lblNewLabel_4_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_1.setBounds(285, 221, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Veg-Manchow");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_2.setBounds(10, 258, 196, 27);
		panel_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("150/-");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_2.setBounds(285, 258, 62, 27);
		panel_3.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Vegetable-Sizzler");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_2.setBounds(10, 295, 196, 27);
		panel_3.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("200/-");
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_2.setBounds(285, 295, 62, 27);
		panel_3.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Samosa");
		lblNewLabel_3_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_2.setBounds(10, 332, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("80/-");
		lblNewLabel_4_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_2.setBounds(285, 332, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("Dahi-Vada");
		lblNewLabel_3_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_2.setBounds(10, 369, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_2 = new JLabel("80/-");
		lblNewLabel_4_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_2.setBounds(285, 369, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Idli-Sambar");
		lblNewLabel_3_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_1_1.setBounds(10, 406, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1 = new JLabel("80/-");
		lblNewLabel_4_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_1_1.setBounds(285, 406, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("Sambar-Vada");
		lblNewLabel_3_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_2_1.setBounds(10, 443, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_2_1);
		
		JLabel lblNewLabel_4_1_1_2_1 = new JLabel("80/-");
		lblNewLabel_4_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_2_1.setBounds(285, 443, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_2_1);
		
		JLabel lblNewLabel_3_1_1_1_2_1 = new JLabel("Uttapam");
		lblNewLabel_3_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_2_1.setBounds(10, 480, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_1_2_1);
		
		JLabel lblNewLabel_4_1_1_1_2_1 = new JLabel("100/-");
		lblNewLabel_4_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_2_1.setBounds(285, 480, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_1_2_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("Paneer-Manchurian");
		lblNewLabel_3_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_1_1_1.setBounds(10, 517, 196, 27);
		panel_3.add(lblNewLabel_3_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1 = new JLabel("150/-");
		lblNewLabel_4_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_1_1_1.setBounds(285, 517, 62, 27);
		panel_3.add(lblNewLabel_4_1_1_1_1_1_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_3_1.setBackground(new Color(220, 20, 60));
		panel_3_1.setBounds(387, 299, 640, 283);
		panel_1.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_4_4 = new JLabel("100/-");
		lblNewLabel_4_4.setForeground(Color.WHITE);
		lblNewLabel_4_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_4.setBounds(452, 59, 62, 27);
		panel_3_1.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("100/-");
		lblNewLabel_4_1_4.setForeground(Color.WHITE);
		lblNewLabel_4_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_4.setBounds(452, 96, 62, 27);
		panel_3_1.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_4_1_1_4 = new JLabel("100/-");
		lblNewLabel_4_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_4.setBounds(452, 133, 62, 27);
		panel_3_1.add(lblNewLabel_4_1_1_4);
		
		JLabel lblNewLabel_4_1_1_1_4 = new JLabel("150/-");
		lblNewLabel_4_1_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_4.setBounds(452, 170, 62, 27);
		panel_3_1.add(lblNewLabel_4_1_1_1_4);
		
		JLabel lblNewLabel_4_1_1_1_1_3 = new JLabel("100/-");
		lblNewLabel_4_1_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_1_3.setBounds(452, 207, 62, 27);
		panel_3_1.add(lblNewLabel_4_1_1_1_1_3);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("100/-");
		lblNewLabel_4_2_2.setForeground(Color.WHITE);
		lblNewLabel_4_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_2_2.setBounds(452, 244, 62, 27);
		panel_3_1.add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Desert");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(70, 10, 168, 39);
		panel_3_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("Gulab-Jamun");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_4.setBounds(70, 59, 196, 27);
		panel_3_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Ras-Malai");
		lblNewLabel_3_1_4.setForeground(Color.WHITE);
		lblNewLabel_3_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_4.setBounds(70, 96, 196, 27);
		panel_3_1.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_3_1_1_4 = new JLabel("Rabdi-Jalebi");
		lblNewLabel_3_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_4.setBounds(70, 133, 196, 27);
		panel_3_1.add(lblNewLabel_3_1_1_4);
		
		JLabel lblNewLabel_3_1_1_1_4 = new JLabel("Pastery");
		lblNewLabel_3_1_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_4.setBounds(70, 170, 196, 27);
		panel_3_1.add(lblNewLabel_3_1_1_1_4);
		
		JLabel lblNewLabel_3_1_1_1_1_3 = new JLabel("Ice-Cream");
		lblNewLabel_3_1_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_1_3.setBounds(70, 207, 196, 27);
		panel_3_1.add(lblNewLabel_3_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Cham-Cham");
		lblNewLabel_3_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_2_2.setBounds(70, 244, 196, 27);
		panel_3_1.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuCard.class.getResource("/MiniProjects/Hotel/pbm.jpg")));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setBounds(377, 10, 310, 279);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel_1.setIcon(new ImageIcon(MenuCard.class.getResource("/MiniProjects/Hotel/veg.jpg")));
		lblNewLabel_1.setBounds(717, 10, 310, 279);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(220, 20, 60));
		panel_3_2.setBounds(1037, 10, 357, 572);
		panel_1.add(panel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Main-Course");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(10, 10, 250, 39);
		panel_3_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Paneer-Butter-Masala");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_3.setBounds(10, 73, 250, 27);
		panel_3_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("300/-");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_3.setBounds(285, 73, 62, 27);
		panel_3_2.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Kadhai-Paneer");
		lblNewLabel_3_1_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_3.setBounds(10, 110, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("300/-");
		lblNewLabel_4_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_3.setBounds(285, 110, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_3_1_1_1_3 = new JLabel("Mix-Veg");
		lblNewLabel_3_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_3.setBounds(10, 184, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_1_3);
		
		JLabel lblNewLabel_4_1_1_1_3 = new JLabel("250/-");
		lblNewLabel_4_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_3.setBounds(285, 184, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_1_3);
		
		JLabel lblNewLabel_3_1_1_1_1_2 = new JLabel("Dal-Tadka");
		lblNewLabel_3_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_1_2.setBounds(10, 221, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_1_2 = new JLabel("250/-");
		lblNewLabel_4_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_1_2.setBounds(285, 221, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Dal-Fry");
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_2_1.setBounds(10, 258, 196, 27);
		panel_3_2.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("200/-");
		lblNewLabel_4_2_1.setForeground(Color.WHITE);
		lblNewLabel_4_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_2_1.setBounds(285, 258, 62, 27);
		panel_3_2.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Dal-Makhani");
		lblNewLabel_3_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_2_1.setBounds(10, 295, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("250/-");
		lblNewLabel_4_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_2_1.setBounds(285, 295, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_2_1);
		
		JLabel lblNewLabel_3_1_1_2_2 = new JLabel("Masala-Mushroom");
		lblNewLabel_3_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_2_2.setBounds(10, 332, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_2_2);
		
		JLabel lblNewLabel_4_1_1_2_2 = new JLabel("250/-");
		lblNewLabel_4_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_2_2.setBounds(285, 332, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_2_2);
		
		JLabel lblNewLabel_3_1_1_1_2_2 = new JLabel("Veg-Kolhapuri");
		lblNewLabel_3_1_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_2_2.setBounds(10, 369, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_1_2_2);
		
		JLabel lblNewLabel_4_1_1_1_2_2 = new JLabel("250/-");
		lblNewLabel_4_1_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_2_2.setBounds(285, 369, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_1_2_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_2 = new JLabel("Alu-Mutter");
		lblNewLabel_3_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_1_1_2.setBounds(10, 406, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_1_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_1_1_2 = new JLabel("200/-");
		lblNewLabel_4_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_1_1_2.setBounds(285, 406, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_2_1_1 = new JLabel("Channa-Masala");
		lblNewLabel_3_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_2_1_1.setBounds(10, 480, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_1_2_1_1);
		
		JLabel lblNewLabel_4_1_1_1_2_1_1 = new JLabel("200/-");
		lblNewLabel_4_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_2_1_1.setBounds(285, 480, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_1_2_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("Alu-Gobi");
		lblNewLabel_3_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_1_1_1_1_1.setBounds(10, 517, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1 = new JLabel("200/-");
		lblNewLabel_4_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1_1_1_1_1.setBounds(285, 517, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("Malai-Kofta");
		lblNewLabel_3_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_3.setBounds(10, 443, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_3);
		
		JLabel lblNewLabel_4_1_1_3 = new JLabel("250/-");
		lblNewLabel_4_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_3.setBounds(285, 443, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_3);
		
		JLabel lblNewLabel_3_1_1_3_1 = new JLabel("Palak-Paneer");
		lblNewLabel_3_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1_1_3_1.setBounds(10, 147, 196, 27);
		panel_3_2.add(lblNewLabel_3_1_1_3_1);
		
		JLabel lblNewLabel_4_1_1_3_1 = new JLabel("300/-");
		lblNewLabel_4_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1_3_1.setBounds(285, 147, 62, 27);
		panel_3_2.add(lblNewLabel_4_1_1_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 20, 60));
		panel_2.setBounds(10, 10, 1407, 111);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTastyfood = new JLabel("Tasty-Food");
		lblTastyfood.setBounds(0, 0, 1407, 111);
		panel_2.add(lblTastyfood);
		lblTastyfood.setHorizontalAlignment(SwingConstants.CENTER);
		lblTastyfood.setForeground(Color.YELLOW);
		lblTastyfood.setFont(new Font("Algerian", Font.PLAIN, 60));
		lblTastyfood.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	}
}
