package MiniProjects.Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class RoomBooking extends JFrame {

	private JPanel contentPane;
	private JTextField tname;
	private JTextField tnumber;
	private JTextField tadhar;
	private JTextField tnop;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomBooking frame = new RoomBooking();
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
	public RoomBooking() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1451, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 10, 1417, 670);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel head = new JLabel("Room Booking Services");
		head.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		head.setForeground(new Color(255, 255, 0));
		head.setFont(new Font("Algerian", Font.PLAIN, 60));
		head.setHorizontalAlignment(SwingConstants.CENTER);
		head.setBounds(10, 10, 1397, 162);
		panel.add(head);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(10, 182, 682, 478);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 14, 220, 25);
		panel_1.add(lblNewLabel);
		
		tname = new JTextField();
		tname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tname.setHorizontalAlignment(SwingConstants.LEFT);
		tname.setToolTipText("Enter name");
		tname.setForeground(new Color(0, 0, 0));
		tname.setBounds(255, 14, 300, 25);
		panel_1.add(tname);
		tname.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber.setBounds(10, 63, 220, 25);
		panel_1.add(lblPhoneNumber);
		
		tnumber = new JTextField();
		tnumber.setToolTipText("Enter number");
		tnumber.setHorizontalAlignment(SwingConstants.LEFT);
		tnumber.setForeground(Color.BLACK);
		tnumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tnumber.setColumns(10);
		tnumber.setBounds(255, 63, 300, 25);
		panel_1.add(tnumber);
		
		JLabel lblAdharNumber = new JLabel("Adhaar number");
		lblAdharNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdharNumber.setForeground(Color.WHITE);
		lblAdharNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAdharNumber.setBounds(10, 112, 220, 25);
		panel_1.add(lblAdharNumber);
		
		tadhar = new JTextField();
		tadhar.setToolTipText("Enter adhaar");
		tadhar.setHorizontalAlignment(SwingConstants.LEFT);
		tadhar.setForeground(Color.BLACK);
		tadhar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tadhar.setColumns(10);
		tadhar.setBounds(255, 112, 300, 25);
		panel_1.add(tadhar);
		
		JLabel lblNoOfPerson = new JLabel("No of person");
		lblNoOfPerson.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoOfPerson.setForeground(Color.WHITE);
		lblNoOfPerson.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNoOfPerson.setBounds(10, 161, 220, 25);
		panel_1.add(lblNoOfPerson);
		
		tnop = new JTextField();
		tnop.setToolTipText("Enter no of person");
		tnop.setHorizontalAlignment(SwingConstants.LEFT);
		tnop.setForeground(Color.BLACK);
		tnop.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tnop.setColumns(10);
		tnop.setBounds(255, 161, 300, 25);
		panel_1.add(tnop);
		
		JLabel lblFoodIncludeyn = new JLabel("Food include");
		lblFoodIncludeyn.setHorizontalAlignment(SwingConstants.LEFT);
		lblFoodIncludeyn.setForeground(Color.WHITE);
		lblFoodIncludeyn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFoodIncludeyn.setBounds(10, 208, 220, 25);
		panel_1.add(lblFoodIncludeyn);
		
		JRadioButton radioYes = new JRadioButton("Yes");
		buttonGroup.add(radioYes);
		radioYes.setForeground(Color.WHITE);
		radioYes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioYes.setBackground(new Color(220, 20, 60));
		radioYes.setBounds(255, 208, 103, 25);
		panel_1.add(radioYes);
		
		JRadioButton radioNo = new JRadioButton("No");
		buttonGroup.add(radioNo);
		radioNo.setForeground(Color.WHITE);
		radioNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioNo.setBackground(new Color(220, 20, 60));
		radioNo.setBounds(375, 208, 103, 25);
		panel_1.add(radioNo);
		
		JLabel lblHowManyDays = new JLabel("How many days");
		lblHowManyDays.setHorizontalAlignment(SwingConstants.LEFT);
		lblHowManyDays.setForeground(Color.WHITE);
		lblHowManyDays.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblHowManyDays.setBounds(10, 253, 220, 25);
		panel_1.add(lblHowManyDays);
		
		JLabel lblRoomType = new JLabel("Room type");
		lblRoomType.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomType.setForeground(Color.WHITE);
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRoomType.setBounds(10, 304, 220, 25);
		panel_1.add(lblRoomType);
		
		String room[] = {"Select Room Type","Single-Bed","Double-Bed","Family","Couple"};
		JComboBox comboBoxRoom = new JComboBox(room);
		comboBoxRoom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxRoom.setBounds(255, 304, 300, 25);
		panel_1.add(comboBoxRoom);
		
		JLabel lblPhoneNumber_1 = new JLabel("Payment");
		lblPhoneNumber_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber_1.setForeground(Color.WHITE);
		lblPhoneNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNumber_1.setBounds(10, 356, 220, 25);
		panel_1.add(lblPhoneNumber_1);
		
		String payment[] = {"Select Payment Method","GPay","PhonePe","Paytm","Net-Banking","Offline-Deposit"};
		JComboBox comboBoxPayment = new JComboBox(payment);
		comboBoxPayment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxPayment.setBounds(255, 356, 300, 25);
		panel_1.add(comboBoxPayment);
		
		JSlider sliderDays = new JSlider();
		sliderDays.setMajorTickSpacing(1);
		sliderDays.setPaintLabels(true);
		sliderDays.setValue(1);
		sliderDays.setMaximum(10);
		sliderDays.setMinimum(1);
		sliderDays.setPaintTicks(true);
		sliderDays.setBounds(257, 239, 298, 44);
		panel_1.add(sliderDays);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1.setBackground(new Color(220, 20, 60));
		panel_1_1.setBounds(725, 182, 682, 478);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtArea.setBounds(10, 92, 662, 376);
		panel_1_1.add(txtArea);
		
		JLabel lblNewLabel_1 = new JLabel("Your Bill");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 662, 72);
		panel_1_1.add(lblNewLabel_1);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameRegex = "[a-zA-Z]+";
				String phoneRegex = "[0-9]{10}";
				String adharRegex = "[0-9]{12}";
				String nopRegex =    "[0-9]+";		
				String food="";
				
				 if( radioYes.isSelected() ) food = "YES";
				 else food = "NO";
				
				if( !tname.getText().matches(nameRegex)  || !tnumber.getText().matches(phoneRegex)
				   || !tadhar.getText().matches(adharRegex)	 || !tnop.getText().matches(nopRegex)
				   || ( !radioYes.isSelected() && !radioNo.isSelected() )
				   || comboBoxRoom.getSelectedIndex() == 0 
				   || comboBoxPayment.getSelectedIndex() == 0)				
				{
					JLabel jLabel = new JLabel("Please fill all details carefully.");
				    jLabel.setFont(new Font("Arial",Font.BOLD,20));
				    jLabel.setForeground(Color.black);
				    JOptionPane jOptionPane = new JOptionPane(jLabel);
				    JDialog dialog = jOptionPane.createDialog(null,"Warning");
					dialog.setLocation(500,400);
				    dialog.setVisible(true);					
				}
				else
				{
					txtArea.setText("\tHotel Renaissance\n"
							  +"----------------------------------------------------------------------\n"
							  + "Name :- "+tname.getText()+"\n"
							  + "Phone no :- "+tnumber.getText()+"\n"
							  + "Adhaar no :- "+tadhar.getText()+"\n"
							  + "No of people :- "+tnop.getText()+"\n"
							  + "Food :- "+food+"\n"
							  + "No of days :- "+sliderDays.getValue()+"\n"
							  + "Room type :- "+(String)comboBoxRoom.getEditor().getItem()+"\n"
							  + "Payment type :- "+(String)comboBoxPayment.getEditor().getItem());
					
					try {						
						FileWriter fileWriter = new FileWriter("E:\\Programming\\Eclipse\\Project\\src\\MiniProjects\\Hotel\\ReservationData.txt");
						fileWriter.write( txtArea.getText() );
						fileWriter.close();
						
					} catch (IOException e1) {						
						e1.printStackTrace();
					}
				}
			}
		});
		btnBook.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBook.setBounds(185, 430, 113, 38);
		panel_1.add(btnBook);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tname.setText("");
				tnumber.setText("");
				tadhar.setText("");
				tnop.setText("");
				sliderDays.setValue(1);
			}
		});		
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnReset.setBounds(344, 430, 113, 38);
		panel_1.add(btnReset);
	}
}
