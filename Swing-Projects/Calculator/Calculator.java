package MiniProjects;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Window.Type;

public class Calculator {

	private JFrame frmCalculator;	
	private double first = 0 , second = 0;
	private char operator = ' ';

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(100, 100, 414, 468);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JPanel textPanel = new JPanel();
		textPanel.setBounds(10, 0, 380, 77);
		frmCalculator.getContentPane().add(textPanel);
		textPanel.setLayout(null);
		
		JTextField text = new JTextField();
		text.setToolTipText("Enter Numbers");
		text.setHorizontalAlignment(SwingConstants.RIGHT);
		text.setFont(new Font("Calibri", Font.BOLD, 20));
		text.setBounds(0, 38, 380, 39);
		textPanel.add(text);
		text.setColumns(10);
		
		JLabel warning = new JLabel("");
		warning.setHorizontalAlignment(SwingConstants.RIGHT);
		warning.setFont(new Font("Calibri", Font.BOLD, 17));
		warning.setForeground(Color.RED);
		warning.setBounds(132, 10, 238, 29);
		textPanel.add(warning);
		
		JPanel numberPanel = new JPanel();
		numberPanel.setBackground(Color.WHITE);
		numberPanel.setBounds(10, 120, 380, 303);
		frmCalculator.getContentPane().add(numberPanel);
		numberPanel.setLayout(null);
		
		JButton clearBtn = new JButton("C");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				warning.setText("");
				text.setText("");
			}
		});
		clearBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		clearBtn.setBounds(85, 23, 65, 47);
		numberPanel.add(clearBtn);
		
		JButton backBtn = new JButton("<-");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				warning.setText("");
				String str = text.getText();
				str = str.substring(0, Math.max(0, str.length()-1) );
				text.setText(str);
			}
		});
		backBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		backBtn.setBounds(10, 23, 65, 47);
		numberPanel.add(backBtn);
		
		JButton remainderBtn = new JButton("%");
		remainderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("%");
				  first = Double.parseDouble( text.getText() );		
				  operator = '%';
				  text.setText("");
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		remainderBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		remainderBtn.setBounds(305, 137, 65, 47);
		numberPanel.add(remainderBtn);
		
		JButton sevenBtn = new JButton("7");
		sevenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"7" );
			}
		});
		sevenBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		sevenBtn.setBounds(10, 80, 65, 47);
		numberPanel.add(sevenBtn);
		
		JButton eightBtn = new JButton("8");
		eightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"8" );
			}
		});
		eightBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		eightBtn.setBounds(85, 80, 65, 47);
		numberPanel.add(eightBtn);
		
		JButton nineBtn = new JButton("9");
		nineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"9" );
			}
		});
		nineBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		nineBtn.setBounds(160, 80, 65, 47);
		numberPanel.add(nineBtn);
		
		JButton fourBtn = new JButton("4");
		fourBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"4" );
			}
		});
		fourBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		fourBtn.setBounds(10, 137, 65, 47);
		numberPanel.add(fourBtn);
		
		JButton fiveBtn = new JButton("5");
		fiveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"5" );
			}
		});
		fiveBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		fiveBtn.setBounds(85, 137, 65, 47);
		numberPanel.add(fiveBtn);
		
		JButton sixBtn = new JButton("6");
		sixBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"6" );
			}
		});
		sixBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		sixBtn.setBounds(160, 137, 65, 47);
		numberPanel.add(sixBtn);
		
		JButton zeroBtn = new JButton("0");
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"0" );
			}
		});
		zeroBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		zeroBtn.setBounds(85, 249, 65, 47);
		numberPanel.add(zeroBtn);
		
		JButton oneBtn = new JButton("1");
		oneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"1" );
			}
		});
		oneBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		oneBtn.setBounds(10, 194, 65, 47);
		numberPanel.add(oneBtn);
		
		JButton twoBtn = new JButton("2");
		twoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"2" );
			}
		});
		twoBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		twoBtn.setBounds(85, 194, 65, 47);
		numberPanel.add(twoBtn);
		
		JButton plusminusBtn = new JButton("+/-");
		plusminusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					double value = Double.parseDouble( text.getText() );					
					text.setText( Integer.toString( (int) (value * -1) ) );
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		plusminusBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		plusminusBtn.setBounds(10, 249, 65, 47);
		numberPanel.add(plusminusBtn);
		
		JButton dotBtn = new JButton(".");
		dotBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String str = text.getText();
					if( !str.contains(".") && str.length() > 0 )
						text.setText( str+"." );					
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		dotBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		dotBtn.setBounds(160, 249, 65, 47);
		numberPanel.add(dotBtn);
		
		JButton subtractBtn = new JButton("-");
		subtractBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("-");
				  first = Double.parseDouble( text.getText() );		
				  operator = '-';
				  text.setText("");
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		subtractBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		subtractBtn.setBounds(235, 194, 65, 47);
		numberPanel.add(subtractBtn);
		
		JButton plusBtn = new JButton("+");
		plusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					first = Double.parseDouble( text.getText() );		
					operator = '+';
					warning.setText("+");
					text.setText("");					
				}				
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		plusBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		plusBtn.setBounds(235, 249, 65, 47);
		numberPanel.add(plusBtn);
		
		JButton divideBtn = new JButton("/");
		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("/");
				  first = Double.parseDouble( text.getText() );		
				  operator = '/';
				  text.setText("");
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		divideBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		divideBtn.setBounds(235, 137, 65, 47);
		numberPanel.add(divideBtn);
		
		JButton andBtn = new JButton("&");
		andBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("&");
				  first = Double.parseDouble( text.getText() );		
				  operator = '&';
				  text.setText("");
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		andBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		andBtn.setBounds(160, 23, 65, 47);
		numberPanel.add(andBtn);
		
		JButton sqBtn = new JButton("x^2");
		sqBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("square");
				  first = Double.parseDouble(text.getText());
				  text.setText( String.format("%.2f", first * first ) );
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		sqBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		sqBtn.setBounds(235, 80, 65, 47);
		numberPanel.add(sqBtn);
		
		JButton threeBtn = new JButton("3");
		threeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText( text.getText()+"3" );
			}
		});
		threeBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		threeBtn.setBounds(160, 194, 65, 47);
		numberPanel.add(threeBtn);
		
		JButton cubeBtn = new JButton("x^3");
		cubeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("cube");
				  first = Double.parseDouble(text.getText());
				  text.setText( String.format("%.2f", first * first * first ) );
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		cubeBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		cubeBtn.setBounds(305, 80, 65, 47);
		numberPanel.add(cubeBtn);
		
		JButton orBtn = new JButton("|");
		orBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("|");
				  first = Double.parseDouble( text.getText() );		
				  operator = '|';
				  text.setText("");
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		orBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		orBtn.setBounds(235, 23, 65, 47);
		numberPanel.add(orBtn);
		
		JButton xorBtn = new JButton("^");
		xorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("^");
				  first = Double.parseDouble( text.getText() );		
				  operator = '^';
				  text.setText("");
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		xorBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		xorBtn.setBounds(305, 23, 65, 47);
		numberPanel.add(xorBtn);
		
		JButton equalBtn = new JButton("=");
		equalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{				  
				  warning.setText("=");
				  second = Double.parseDouble( text.getText() );
				
				  switch( operator )
				  {
				       case '+' :				       
					   text.setText( String.format("%.2f", first + second ) );
					   break;
					   
				       case '-' :				       
					   text.setText( String.format("%.2f", first - second ) );
					   break;
					   
				       case '*' :
					   text.setText( String.format("%.2f", first * second ) );
					   break;
					   
				       case '/' :
					   text.setText( String.format("%.2f", first / second ) );
					   break;
					   
				       case '%' :
					   text.setText( String.format("%.2f", first % second ) );
					   break;
					   
				       case '&' :
					   text.setText( Integer.toString( (int)first & (int)second ) );
					   break;
					   
				       case '|' :
					   text.setText( Integer.toString( (int)first | (int)second ) );
					   break;
					   
				       case '^' :
					   text.setText( Integer.toString( (int)first ^ (int)second ) );
					   break;					   
				  }
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}				
			}			
		});
		equalBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		equalBtn.setBounds(305, 249, 65, 47);
		numberPanel.add(equalBtn);
		
		JButton multiplyBtn = new JButton("*");
		multiplyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				  warning.setText("*");
				  first = Double.parseDouble( text.getText() );		
				  operator = '*';
				  text.setText("");
				}
				catch(Exception ex)
				{
					warning.setText("Enter some number to perform");
				}
			}
		});
		multiplyBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		multiplyBtn.setBounds(305, 194, 65, 47);
		numberPanel.add(multiplyBtn);
		
		JRadioButton on = new JRadioButton("ON");
		on.addItemListener( new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				plusminusBtn.setEnabled(true);				
				dotBtn.setEnabled(true);
				plusBtn.setEnabled(true);
				equalBtn.setEnabled(true);
				subtractBtn.setEnabled(true);
				multiplyBtn.setEnabled(true);
				divideBtn.setEnabled(true);
				remainderBtn.setEnabled(true);
				sqBtn.setEnabled(true);
				cubeBtn.setEnabled(true);
				backBtn.setEnabled(true);
				clearBtn.setEnabled(true);
				andBtn.setEnabled(true);
				orBtn.setEnabled(true);
				xorBtn.setEnabled(true);
				
				zeroBtn.setEnabled(true);
				oneBtn.setEnabled(true);
				twoBtn.setEnabled(true);
				threeBtn.setEnabled(true);
				fourBtn.setEnabled(true);
				fiveBtn.setEnabled(true);
				sixBtn.setEnabled(true);
				sevenBtn.setEnabled(true);
				eightBtn.setEnabled(true);
				nineBtn.setEnabled(true);				
				
			}
		} );
		on.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		on.setBounds(10, 83, 57, 13);
		frmCalculator.getContentPane().add(on);
		
		JRadioButton of = new JRadioButton("OFF");
		of.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				text.setText("");
				warning.setText("");
				plusminusBtn.setEnabled(false);				
				dotBtn.setEnabled(false);
				plusBtn.setEnabled(false);
				equalBtn.setEnabled(false);
				subtractBtn.setEnabled(false);
				multiplyBtn.setEnabled(false);
				divideBtn.setEnabled(false);
				remainderBtn.setEnabled(false);
				sqBtn.setEnabled(false);
				cubeBtn.setEnabled(false);
				backBtn.setEnabled(false);
				clearBtn.setEnabled(false);
				andBtn.setEnabled(false);
				orBtn.setEnabled(false);
				xorBtn.setEnabled(false);
				
				zeroBtn.setEnabled(false);
				oneBtn.setEnabled(false);
				twoBtn.setEnabled(false);
				threeBtn.setEnabled(false);
				fourBtn.setEnabled(false);
				fiveBtn.setEnabled(false);
				sixBtn.setEnabled(false);
				sevenBtn.setEnabled(false);
				eightBtn.setEnabled(false);
				nineBtn.setEnabled(false);
				
			}
		});
		of.setSelected(true);
		of.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		of.setBounds(10, 98, 57, 21);
		frmCalculator.getContentPane().add(of);
		
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(on);
		btngroup.add(of);
	}	
}
