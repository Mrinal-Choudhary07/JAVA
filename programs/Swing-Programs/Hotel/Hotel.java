package MiniProjects.Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class Hotel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel frame = new Hotel();
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
	public Hotel() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1382, 817);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 10, 1348, 770);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel loginTitle = new JLabel("Hotel Renaissance");
		loginTitle.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		loginTitle.setBounds(10, 10, 1328, 214);
		loginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		loginTitle.setForeground(new Color(255, 255, 0));
		loginTitle.setFont(new Font("Algerian", Font.PLAIN, 60));
		loginTitle.setBackground(Color.BLACK);
		panel.add(loginTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(10, 234, 212, 526);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new LineBorder(Color.BLACK, 1, true));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 10, 192, 55);
		panel_1.add(btnNewButton);
		
		JButton btnRoomBooking = new JButton("Room Booking");
		btnRoomBooking.setBorder(new LineBorder(Color.BLACK, 1, true));
		btnRoomBooking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRoomBooking.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnRoomBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomBooking booking = new RoomBooking();
				booking.setVisible(true);
			}
		});
		btnRoomBooking.setBounds(10, 91, 192, 55);
		panel_1.add(btnRoomBooking);
		
		JButton btnReservation = new JButton("Reservation");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservation reservation = new Reservation();
				reservation.setVisible(true);
			}
		});
		btnReservation.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnReservation.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReservation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnReservation.setBounds(10, 172, 192, 55);
		panel_1.add(btnReservation);
		
		JButton btnGallery = new JButton("Gallery");
		btnGallery.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnGallery.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGallery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gallery gallery = new Gallery();
				gallery.setVisible(true);
			}
		});
		btnGallery.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnGallery.setBounds(10, 338, 192, 55);
		panel_1.add(btnGallery);
		
		JButton btnAboutUs = new JButton("About us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs aboutUs = new AboutUs();
				aboutUs.setVisible(true);
			}
		});
		btnAboutUs.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAboutUs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAboutUs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnAboutUs.setBounds(10, 422, 192, 55);
		panel_1.add(btnAboutUs);
		
		JButton btnOurfood = new JButton("Menu-Card");
		btnOurfood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCard card = new  MenuCard();
				card.setVisible(true);
			}
		});
		btnOurfood.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnOurfood.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnOurfood.setBounds(10, 255, 192, 55);
		panel_1.add(btnOurfood);
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		logoutBtn.setBounds(1230, 234, 108, 32);
		panel.add(logoutBtn);
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel_Login frame = new Hotel_Login();
				frame.setVisible(true);				
			}
		});
		logoutBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 20, 60));
		panel_2.setBounds(232, 234, 982, 526);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setIcon(new ImageIcon(Hotel.class.getResource("/MiniProjects/Hotel/homeImg.jpg")));
		lblNewLabel.setBounds(0, 0, 982, 526);
		panel_2.add(lblNewLabel);
	}
}
