package MiniProjects;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JProgressBar;

public class RailwayTicketSystem {

	private JFrame frame;
	private JTextField tname;
	private JTextField tcontact;
	private JTextField temail;
	private JTextField tnop;
	private JTextField tage;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RailwayTicketSystem window = new RailwayTicketSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RailwayTicketSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setType(Type.UTILITY);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(RailwayTicketSystem.class.getResource("/MiniProjects/logo.png")));
		frame.setBounds(100, 100, 1517, 859);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelHeading = new JPanel();
		panelHeading.setBackground(Color.WHITE);
		panelHeading.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panelHeading.setBounds(10, 10, 1483, 172);
		frame.getContentPane().add(panelHeading);
		panelHeading.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Railway Ticket Booking");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 50));
		lblNewLabel.setBounds(240, 10, 1135, 151);
		panelHeading.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 10, 220, 151);
		panelHeading.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(RailwayTicketSystem.class.getResource("/MiniProjects/logo.png")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 5));
		
		JPanel panelDetails = new JPanel();
		panelDetails.setBackground(new Color(0, 128, 128));
		panelDetails.setBounds(10, 192, 836, 630);
		frame.getContentPane().add(panelDetails);
		panelDetails.setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setForeground(SystemColor.text);
		name.setHorizontalAlignment(SwingConstants.LEFT);
		name.setFont(new Font("Courier New", Font.BOLD, 25));
		name.setBounds(10, 32, 176, 25);
		panelDetails.add(name);
		
		tname = new JTextField();
		tname.setHorizontalAlignment(SwingConstants.LEFT);
		tname.setToolTipText("Enter name");
		tname.setForeground(Color.BLACK);
		tname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tname.setBounds(253, 31, 310, 25);
		panelDetails.add(tname);
		tname.setColumns(10);
		
		JLabel nameWarn = new JLabel("");
		nameWarn.setForeground(new Color(255, 255, 0));
		nameWarn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameWarn.setBounds(565, 32, 250, 25);
		panelDetails.add(nameWarn);
		
		tcontact = new JTextField();
		tcontact.setToolTipText("Enter contact no");
		tcontact.setHorizontalAlignment(SwingConstants.LEFT);
		tcontact.setForeground(Color.BLACK);
		tcontact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tcontact.setColumns(10);
		tcontact.setBounds(253, 79, 310, 25);
		panelDetails.add(tcontact);
		
		JLabel contact = new JLabel("Contact");
		contact.setHorizontalAlignment(SwingConstants.LEFT);
		contact.setForeground(Color.WHITE);
		contact.setFont(new Font("Courier New", Font.BOLD, 25));
		contact.setBounds(10, 80, 176, 25);
		panelDetails.add(contact);
		
		JTextArea taddress = new JTextArea();
		taddress.setForeground(Color.BLACK);
		taddress.setToolTipText("Enter address");
		taddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		taddress.setBounds(253, 180, 310, 55);
		panelDetails.add(taddress);
		
		JLabel address = new JLabel("Address");
		address.setHorizontalAlignment(SwingConstants.LEFT);
		address.setForeground(Color.WHITE);
		address.setFont(new Font("Courier New", Font.BOLD, 25));
		address.setBounds(9, 180, 177, 25);
		panelDetails.add(address);
		
		JLabel email = new JLabel("Email");
		email.setHorizontalAlignment(SwingConstants.LEFT);
		email.setForeground(Color.WHITE);
		email.setFont(new Font("Courier New", Font.BOLD, 25));
		email.setBounds(10, 132, 177, 25);
		panelDetails.add(email);
		
		temail = new JTextField();
		temail.setToolTipText("Enter email");
		temail.setHorizontalAlignment(SwingConstants.LEFT);
		temail.setForeground(Color.BLACK);
		temail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		temail.setColumns(10);
		temail.setBounds(253, 131, 310, 25);
		panelDetails.add(temail);
		
		JLabel age = new JLabel("Age");
		age.setHorizontalAlignment(SwingConstants.LEFT);
		age.setForeground(Color.WHITE);
		age.setFont(new Font("Courier New", Font.BOLD, 25));
		age.setBounds(10, 265, 177, 25);
		panelDetails.add(age);
		
		JLabel gender = new JLabel("Gender");
		gender.setHorizontalAlignment(SwingConstants.LEFT);
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Courier New", Font.BOLD, 25));
		gender.setBounds(10, 313, 176, 25);
		panelDetails.add(gender);
		
		JLabel nop = new JLabel("No of passenger");
		nop.setHorizontalAlignment(SwingConstants.LEFT);
		nop.setForeground(Color.WHITE);
		nop.setFont(new Font("Courier New", Font.BOLD, 25));
		nop.setBounds(10, 370, 228, 25);
		panelDetails.add(nop);
		
		JLabel depart = new JLabel("Depart On");
		depart.setHorizontalAlignment(SwingConstants.LEFT);
		depart.setForeground(Color.WHITE);
		depart.setFont(new Font("Courier New", Font.BOLD, 25));
		depart.setBounds(10, 477, 176, 25);
		panelDetails.add(depart);
		
		JDateChooser date = new JDateChooser();		
//		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");		
//		String datestr = d.format(date.getDate());
//		Date date2 = date.getDate();
//		String datestr = (String)date.toString(); 
		date.setBounds(253, 477, 117, 25);
		panelDetails.add(date);
		
		JLabel from = new JLabel("From");
		from.setHorizontalAlignment(SwingConstants.LEFT);
		from.setForeground(Color.WHITE);
		from.setFont(new Font("Courier New", Font.BOLD, 25));
		from.setBounds(10, 424, 176, 25);
		panelDetails.add(from);
		
		String fromArr[] = {"Nagpur","Mumbai","Wardha","Akola","Amrawati"};		
		JComboBox cbfrom = new JComboBox(fromArr);
		cbfrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbfrom.setBounds(253, 424, 117, 25);
		panelDetails.add(cbfrom);
		
		JLabel to = new JLabel("To");
		to.setHorizontalAlignment(SwingConstants.CENTER);
		to.setForeground(Color.WHITE);
		to.setFont(new Font("Courier New", Font.BOLD, 25));
		to.setBounds(380, 424, 52, 25);
		panelDetails.add(to);
		
		String toArr[] = {"Delhi","Chennai","Banglore","Haryana","Shimla"};
		JComboBox cbto = new JComboBox(toArr);
		cbto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbto.setBounds(446, 424, 117, 25);
		panelDetails.add(cbto);
		
		tnop = new JTextField();
		tnop.setToolTipText("Enter passengers");
		tnop.setHorizontalAlignment(SwingConstants.LEFT);
		tnop.setForeground(Color.BLACK);
		tnop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tnop.setColumns(10);
		tnop.setBounds(253, 369, 84, 25);
		panelDetails.add(tnop);
		
		JRadioButton male = new JRadioButton("Male");
		male.setSelected(true);
		buttonGroup.add(male);
		male.setForeground(Color.WHITE);
		male.setFont(new Font("Courier New", Font.BOLD, 25));
		male.setBackground(new Color(0, 128, 128));
		male.setBounds(253, 308, 117, 35);
		panelDetails.add(male);
		
		tage = new JTextField();
		tage.setToolTipText("Enter age");
		tage.setHorizontalAlignment(SwingConstants.LEFT);
		tage.setForeground(Color.BLACK);
		tage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tage.setColumns(10);
		tage.setBounds(253, 264, 84, 25);
		panelDetails.add(tage);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setForeground(Color.WHITE);
		female.setFont(new Font("Courier New", Font.BOLD, 25));
		female.setBackground(new Color(0, 128, 128));
		female.setBounds(372, 308, 117, 35);
		panelDetails.add(female);
		
		JLabel contactWarn = new JLabel("");
		contactWarn.setForeground(Color.YELLOW);
		contactWarn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contactWarn.setBounds(565, 79, 250, 25);
		panelDetails.add(contactWarn);
		
		JLabel emailWarn = new JLabel("");
		emailWarn.setForeground(Color.YELLOW);
		emailWarn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailWarn.setBounds(565, 132, 250, 25);
		panelDetails.add(emailWarn);
		
		JLabel addressWarn = new JLabel("");
		addressWarn.setForeground(Color.YELLOW);
		addressWarn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressWarn.setBounds(565, 180, 250, 25);
		panelDetails.add(addressWarn);
		
		JLabel ageWarn = new JLabel("");
		ageWarn.setForeground(Color.YELLOW);
		ageWarn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ageWarn.setBounds(565, 265, 250, 25);
		panelDetails.add(ageWarn);
		
		JLabel nopWarn = new JLabel("");
		nopWarn.setForeground(Color.YELLOW);
		nopWarn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nopWarn.setBounds(565, 369, 250, 25);
		panelDetails.add(nopWarn);
		
		JPanel panelTicket = new JPanel();
		panelTicket.setBackground(new Color(0, 128, 128));
		panelTicket.setBounds(856, 192, 637, 620);
		frame.getContentPane().add(panelTicket);
		panelTicket.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("E-Ticket");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Courier New", Font.BOLD, 40));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(62, 10, 532, 64);
		panelTicket.add(lblNewLabel_3);
		
		JTextArea tticket = new JTextArea();
		tticket.setFont(new Font("Book Antiqua", Font.PLAIN, 25));
		tticket.setBounds(20, 103, 607, 387);
		panelTicket.add(tticket);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tname.setText("");
				tcontact.setText("");
				temail.setText("");
				taddress.setText("");
				tage.setText("");
				tnop.setText("");	
				tticket.setText("");
			}
		});
		
		btnReset.setFont(new Font("Courier New", Font.BOLD, 21));
		btnReset.setBounds(409, 551, 124, 35);
		panelDetails.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tticket.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		btnPrint.setFont(new Font("Courier New", Font.BOLD, 21));
		btnPrint.setBounds(269, 551, 124, 35);
		panelTicket.add(btnPrint);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.infoText);
		separator.setForeground(SystemColor.menuText);
		separator.setBounds(0, 84, 637, 2);
		panelTicket.add(separator);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try
				{
					String gender ="";
					if( male.isSelected() )gender = "Male";
					else gender = "Female";		
					String from = null,to=null;
					from = (String) cbfrom.getEditor().getItem();
					to = (String) cbto.getEditor().getItem();
					
					String regex = "^\\d{10}$";
					
					if( tname.getText().length() == 0 )
						nameWarn.setText("*Please Enter Your Name");	
					else
						nameWarn.setText("");					
					if( !tcontact.getText().matches(regex) && ( tcontact.getText().length()  < 10 || tcontact.getText().length() > 10  ) )
						   contactWarn.setText("*Please enter valid Contact No");
					else
						contactWarn.setText("");
					if( !temail.getText().contains("@gmail.com") )
						emailWarn.setText("*Please enter valid Email");
					else
						emailWarn.setText("");	
					if( taddress.getText().length() < 10 )
						addressWarn.setText("*Please enter valid Address");
					else
						addressWarn.setText("");
					if( tage.getText().length() == 0 || Integer.parseInt( tage.getText() ) < 0 || Integer.parseInt( tage.getText() ) > 120 )
						ageWarn.setText("*Please enter valid Age");
					else
						ageWarn.setText("");
					if( tnop.getText().length() == 0 || Integer.parseInt( tnop.getText() ) < 0 )
						nopWarn.setText("*Please enter no of passenger");
					else
						nopWarn.setText("");	
					
					if( tname.getText().length() > 0 && tcontact.getText().matches(regex) &&
						temail.getText().contains("@gmail.com") && taddress.getText().length() > 10 &&
						(Integer.parseInt( tage.getText() ) > 0 || Integer.parseInt( tage.getText() ) <= 120) &&
						Integer.parseInt( tnop.getText() ) > 0 && from != null && to != null)
						tticket.setText("\t                  Train-E-Ticket\n"
								         + "-------------------------------------------------------------------------------\n"
								         +"NAME :- "+tname.getText()+"\nCONTACT NO :- "+tcontact.getText()
								         +"\nEMAIL :- "+temail.getText()+"\nADDRESS :- "+taddress.getText()
								         +"\nAGE :- "+tage.getText()+"\nGENDER :- "+gender
								         +"\nNo Of PASSENGER :- "+tnop.getText()+"\nFROM :- "+from+"\nTO :- "+to
								         +"\nDATE :- "+date );
					else
						tticket.setText("");
				}
				catch(Exception ex)
				{
										
				}
			}
		});
		
		btnSubmit.setFont(new Font("Courier New", Font.BOLD, 21));
		btnSubmit.setBounds(253, 551, 124, 35);
		panelDetails.add(btnSubmit);
	}
}
