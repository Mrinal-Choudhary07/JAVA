package MiniProjects.Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Gallery extends JFrame {

	private JPanel contentPane;
	private ImageIcon icon[];
	private int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gallery frame = new Gallery();
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
	public Gallery() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1060, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 10, 1033, 715);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gallery");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 60));
		lblNewLabel.setBounds(10, 10, 1013, 122);
		panel.add(lblNewLabel);
		
		icon = new ImageIcon[4];
		icon[0] = new ImageIcon( Gallery.class.getResource("img1.jpg") );
		icon[1] = new ImageIcon( Gallery.class.getResource("img2.jpg") );
		icon[2] = new ImageIcon( Gallery.class.getResource("img3.jpg") );
		icon[3] = new ImageIcon( Gallery.class.getResource("img4.jpg") );
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_1.setIcon( icon[0] );
		lblNewLabel_1.setBounds(10, 142, 1013, 507);
		panel.add(lblNewLabel_1);
		
		JButton rightBtn = new JButton("Right");
		rightBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		rightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{					
				if( i==3 )
					JOptionPane.showMessageDialog(rightBtn, "LAST IMAGE OF GALLERY");
				else
				{
					i++;
					lblNewLabel_1.setIcon(icon[i]);
				}
				
			}
		});
		rightBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		rightBtn.setBounds(547, 659, 110, 46);
		panel.add(rightBtn);
		
		JButton btnLeft = new JButton("Left");
		btnLeft.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{				
				if( i == 0)
					JOptionPane.showMessageDialog(btnLeft, "FIRST IMAGE OF GALLERY");
				else
				{
					i--;
					lblNewLabel_1.setIcon(icon[i]);					
				}
			}
		});
		btnLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnLeft.setBounds(354, 659, 110, 46);
		panel.add(btnLeft);
	}
}
