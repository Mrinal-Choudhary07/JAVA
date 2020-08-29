package MiniProjects.Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;

public class Reservation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation frame = new Reservation();
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
	public Reservation() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1448, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 10, 1424, 668);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblReservation = new JLabel("Reservation");
		lblReservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservation.setForeground(Color.YELLOW);
		lblReservation.setFont(new Font("Algerian", Font.PLAIN, 60));
		lblReservation.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblReservation.setBounds(10, 10, 1404, 162);
		panel.add(lblReservation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(10, 182, 1404, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2.setBackground(new Color(220, 20, 60));
		panel_2.setBounds(0, 0, 475, 476);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Banquet");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(0, 0, 475, 75);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 85, 220, 25);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("Enter name");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(255, 85, 210, 25);
		panel_2.add(textField);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber.setBounds(10, 134, 220, 25);
		panel_2.add(lblPhoneNumber);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter number");
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(255, 134, 210, 25);
		panel_2.add(textField_1);
		
		JLabel lblAdharNumber = new JLabel("Adhaar number");
		lblAdharNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdharNumber.setForeground(Color.WHITE);
		lblAdharNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAdharNumber.setBounds(10, 183, 220, 25);
		panel_2.add(lblAdharNumber);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Enter adhaar");
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(255, 183, 210, 25);
		panel_2.add(textField_2);
		
		JLabel lblTypeOfEvent = new JLabel("Type of event");
		lblTypeOfEvent.setHorizontalAlignment(SwingConstants.LEFT);
		lblTypeOfEvent.setForeground(Color.WHITE);
		lblTypeOfEvent.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTypeOfEvent.setBounds(10, 233, 220, 25);
		panel_2.add(lblTypeOfEvent);
		
		String room[] = {"Select Event Type","Business-Meetings","Parties","Family-Celebrations","Marriage"};
		JComboBox comboBoxEvent1 = new JComboBox(room);
		comboBoxEvent1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxEvent1.setBounds(255, 233, 210, 25);
		panel_2.add(comboBoxEvent1);
		
		JLabel lblPhoneNumber_1 = new JLabel("Max size of people");
		lblPhoneNumber_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_1.setForeground(Color.WHITE);
		lblPhoneNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_1.setBounds(10, 285, 220, 25);
		panel_2.add(lblPhoneNumber_1);
		
		String size[] = {"Select Size","5-25 people","10-100 people","100-300 people","300+ people"};
		JComboBox comboBoxSize1 = new JComboBox(size);
		comboBoxSize1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxSize1.setBounds(255, 285, 210, 25);
		panel_2.add(comboBoxSize1);
		
		JButton btnBookbanquet = new JButton("Book-Banquet");
		btnBookbanquet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameRegex = "[a-zA-Z]+";
				String phoneRegex = "[0-9]{10}";
				String adharRegex = "[0-9]{12}";
				
				if( !textField.getText().matches(nameRegex)  || !textField_1.getText().matches(phoneRegex)
						   || !textField_2.getText().matches(adharRegex) 
						   || comboBoxEvent1.getSelectedIndex() == 0
						   || comboBoxSize1.getSelectedIndex() == 0)				
						{
							JLabel jLabel = new JLabel("Please fill all details carefully for Banquet.");
						    jLabel.setFont(new Font("Arial",Font.BOLD,20));
						    jLabel.setForeground(Color.black);
						    JOptionPane jOptionPane = new JOptionPane(jLabel);
						    JDialog dialog = jOptionPane.createDialog(null,"BANQUET");
							dialog.setLocation(100,400);
						    dialog.setVisible(true);					
						}
				else
				{
					JLabel jLabel = new JLabel("Reservation successfull for Banquet.");
				    jLabel.setFont(new Font("Arial",Font.BOLD,20));
				    jLabel.setForeground(Color.black);
				    JOptionPane jOptionPane = new JOptionPane(jLabel);
				    JDialog dialog = jOptionPane.createDialog(null,"BANQUET");
					dialog.setLocation(100,400);
				    dialog.setVisible(true);
				}
			}
		});
		btnBookbanquet.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBookbanquet.setBounds(141, 395, 186, 38);
		panel_2.add(btnBookbanquet);
		
		JDateChooser dateChooser1 = new JDateChooser();
		dateChooser1.setBounds(255, 335, 210, 25);
		panel_2.add(dateChooser1);
		
		JLabel lblPhoneNumber_1_3 = new JLabel("Select Date");
		lblPhoneNumber_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_1_3.setForeground(Color.WHITE);
		lblPhoneNumber_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_1_3.setBounds(10, 335, 220, 25);
		panel_2.add(lblPhoneNumber_1_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2_1.setBackground(new Color(220, 20, 60));
		panel_2_1.setBounds(471, 0, 468, 476);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblDining = new JLabel("Dining");
		lblDining.setForeground(SystemColor.desktop);
		lblDining.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblDining.setHorizontalAlignment(SwingConstants.CENTER);
		lblDining.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblDining.setBounds(0, 0, 468, 75);
		panel_2_1.add(lblDining);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(10, 85, 220, 25);
		panel_2_1.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Enter name");
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(255, 85, 203, 25);
		panel_2_1.add(textField_3);
		
		JLabel lblPhoneNumber_2 = new JLabel("Phone number");
		lblPhoneNumber_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_2.setForeground(Color.WHITE);
		lblPhoneNumber_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_2.setBounds(10, 134, 220, 25);
		panel_2_1.add(lblPhoneNumber_2);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Enter number");
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(255, 134, 203, 25);
		panel_2_1.add(textField_4);
		
		JLabel lblAdharNumber_1 = new JLabel("Adhaar number");
		lblAdharNumber_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdharNumber_1.setForeground(Color.WHITE);
		lblAdharNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAdharNumber_1.setBounds(10, 183, 220, 25);
		panel_2_1.add(lblAdharNumber_1);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Enter adhaar");
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setForeground(Color.BLACK);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(255, 183, 203, 25);
		panel_2_1.add(textField_5);
		
		JLabel lblCategories = new JLabel("Category");
		lblCategories.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategories.setForeground(Color.WHITE);
		lblCategories.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCategories.setBounds(10, 233, 220, 25);
		panel_2_1.add(lblCategories);
		
		String category[] = {"Select-Category","Family","Friends"};
		JComboBox comboBoxEvent2 = new JComboBox(category);
		comboBoxEvent2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxEvent2.setBounds(255, 233, 203, 25);
		panel_2_1.add(comboBoxEvent2);
		
		JLabel lblPhoneNumber_1_1 = new JLabel("Max size of people");
		lblPhoneNumber_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_1_1.setForeground(Color.WHITE);
		lblPhoneNumber_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_1_1.setBounds(10, 285, 220, 25);
		panel_2_1.add(lblPhoneNumber_1_1);
		
		JComboBox comboBoxSize2 = new JComboBox(size);
		comboBoxSize2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxSize2.setBounds(255, 285, 203, 25);
		panel_2_1.add(comboBoxSize2);
		
		JLabel lblPhoneNumber_1_3_1 = new JLabel("Select Date");
		lblPhoneNumber_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_1_3_1.setForeground(Color.WHITE);
		lblPhoneNumber_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_1_3_1.setBounds(10, 337, 220, 25);
		panel_2_1.add(lblPhoneNumber_1_3_1);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(255, 337, 203, 25);
		panel_2_1.add(dateChooser_1);
		
		JButton btnBookdining = new JButton("Book-Dining");
		btnBookdining.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameRegex = "[a-zA-Z]+";
				String phoneRegex = "[0-9]{10}";
				String adharRegex = "[0-9]{12}";
				
				if( !textField_3.getText().matches(nameRegex)  || !textField_4.getText().matches(phoneRegex)
						   || !textField_5.getText().matches(adharRegex) 
						   || comboBoxEvent2.getSelectedIndex() == 0
						   || comboBoxSize2.getSelectedIndex() == 0)				
						{
							JLabel jLabel = new JLabel("Please fill all details carefully for Dining.");
						    jLabel.setFont(new Font("Arial",Font.BOLD,20));
						    jLabel.setForeground(Color.black);
						    JOptionPane jOptionPane = new JOptionPane(jLabel);
						    JDialog dialog = jOptionPane.createDialog(null,"DINING");
							dialog.setLocation(600,400);
						    dialog.setVisible(true);					
						}
				else
				{
					JLabel jLabel = new JLabel("Reservation successfull for Dining.");
				    jLabel.setFont(new Font("Arial",Font.BOLD,20));
				    jLabel.setForeground(Color.black);
				    JOptionPane jOptionPane = new JOptionPane(jLabel);
				    JDialog dialog = jOptionPane.createDialog(null,"DINING");
					dialog.setLocation(600,400);
				    dialog.setVisible(true);
				}
			}
		});
		btnBookdining.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBookdining.setBounds(143, 395, 176, 38);
		panel_2_1.add(btnBookdining);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2_2.setBackground(new Color(220, 20, 60));
		panel_2_2.setBounds(936, 0, 468, 476);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblEliteclub = new JLabel("Elite-Club");
		lblEliteclub.setForeground(SystemColor.desktop);
		lblEliteclub.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblEliteclub.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliteclub.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblEliteclub.setBounds(0, 0, 468, 75);
		panel_2_2.add(lblEliteclub);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(10, 85, 220, 25);
		panel_2_2.add(lblNewLabel_1_2);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("Enter name");
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setForeground(Color.BLACK);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(255, 85, 203, 25);
		panel_2_2.add(textField_6);
		
		JLabel lblPhoneNumber_3 = new JLabel("Phone number");
		lblPhoneNumber_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_3.setForeground(Color.WHITE);
		lblPhoneNumber_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_3.setBounds(10, 134, 220, 25);
		panel_2_2.add(lblPhoneNumber_3);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("Enter number");
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setForeground(Color.BLACK);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(255, 134, 203, 25);
		panel_2_2.add(textField_7);
		
		JLabel lblAdharNumber_2 = new JLabel("Adhaar number");
		lblAdharNumber_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdharNumber_2.setForeground(Color.WHITE);
		lblAdharNumber_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAdharNumber_2.setBounds(10, 183, 220, 25);
		panel_2_2.add(lblAdharNumber_2);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("Enter adhaar");
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setForeground(Color.BLACK);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(255, 183, 203, 25);
		panel_2_2.add(textField_8);
		
		JLabel lblTypeOfEvent_2 = new JLabel("Type of event");
		lblTypeOfEvent_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTypeOfEvent_2.setForeground(Color.WHITE);
		lblTypeOfEvent_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTypeOfEvent_2.setBounds(10, 233, 220, 25);
		panel_2_2.add(lblTypeOfEvent_2);
		
		JComboBox comboBoxEvent3 = new JComboBox(room);
		comboBoxEvent3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxEvent3.setBounds(255, 233, 203, 25);
		panel_2_2.add(comboBoxEvent3);
		
		JLabel lblPhoneNumber_1_2 = new JLabel("Max size of people");
		lblPhoneNumber_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_1_2.setForeground(Color.WHITE);
		lblPhoneNumber_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_1_2.setBounds(10, 285, 220, 25);
		panel_2_2.add(lblPhoneNumber_1_2);
		
		JComboBox comboBoxSize3 = new JComboBox(size);
		comboBoxSize3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxSize3.setBounds(255, 285, 203, 25);
		panel_2_2.add(comboBoxSize3);
		
		JLabel lblPhoneNumber_1_3_1_1 = new JLabel("Select Date");
		lblPhoneNumber_1_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_1_3_1_1.setForeground(Color.WHITE);
		lblPhoneNumber_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_1_3_1_1.setBounds(10, 338, 220, 25);
		panel_2_2.add(lblPhoneNumber_1_3_1_1);
		
		JDateChooser dateChooser_1_1 = new JDateChooser();
		dateChooser_1_1.setBounds(255, 338, 203, 25);
		panel_2_2.add(dateChooser_1_1);
		
		JButton btnBookclub = new JButton("Book-Club");
		btnBookclub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameRegex = "[a-zA-Z]+";
				String phoneRegex = "[0-9]{10}";
				String adharRegex = "[0-9]{12}";
				
				if( !textField_6.getText().matches(nameRegex)  || !textField_7.getText().matches(phoneRegex)
						   || !textField_8.getText().matches(adharRegex) 
						   || comboBoxEvent3.getSelectedIndex() == 0
						   || comboBoxSize3.getSelectedIndex() == 0)				
						{
							JLabel jLabel = new JLabel("Please fill all details carefully for Elite-Club.");
						    jLabel.setFont(new Font("Arial",Font.BOLD,20));
						    jLabel.setForeground(Color.black);
						    JOptionPane jOptionPane = new JOptionPane(jLabel);
						    JDialog dialog = jOptionPane.createDialog(null,"ELITE-CLUB");
							dialog.setLocation(1000,400);
						    dialog.setVisible(true);					
						}
				else
				{
					JLabel jLabel = new JLabel("Reservation successfull for Elite-Club.");
				    jLabel.setFont(new Font("Arial",Font.BOLD,20));
				    jLabel.setForeground(Color.black);
				    JOptionPane jOptionPane = new JOptionPane(jLabel);
				    JDialog dialog = jOptionPane.createDialog(null,"ELITE-CLUB");
					dialog.setLocation(1000,400);
				    dialog.setVisible(true);
				}
			}
		});
		btnBookclub.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBookclub.setBounds(161, 395, 149, 38);
		panel_2_2.add(btnBookclub);
	}
}
