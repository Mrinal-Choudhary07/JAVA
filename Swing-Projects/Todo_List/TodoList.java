package MiniProjects.Todo_List;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TodoList {

	private JFrame frame;
	private static int srno = 0;
	private Connection connection = null;
	private JTable imp;
	private JTable other;
	private int tablenum = 0;
	private String prevtxt = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TodoList window = new TodoList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws Exception
	 */
	public TodoList() throws Exception {
		connection = CreateConnection.getConnection();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1225, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(0, 10, 1211, 649);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Todo-List");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 55));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(472, 10, 299, 73);
		panel.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 91, 1191, 2);
		panel.add(separator);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 183, 375, 371);
		panel.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		textArea.setForeground(SystemColor.desktop);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);

		JLabel lblNewLabel_1 = new JLabel("Write-Tasks");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(60, 131, 200, 42);
		panel.add(lblNewLabel_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setName("");
		scrollPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		scrollPane_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		scrollPane_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane_1.setBounds(526, 183, 333, 426);
		panel.add(scrollPane_1);

		imp = new JTable();
		imp.setForeground(SystemColor.desktop);
		imp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tablenum = 1;

				DefaultTableModel table = (DefaultTableModel) imp.getModel();
				int selected = imp.getSelectedRow();
				textArea.setText(table.getValueAt(selected, 0).toString());

				prevtxt = textArea.getText();
			}
		});
		imp.setRowHeight(30);
		imp.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		scrollPane_1.setViewportView(imp);
		imp.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "IMPORTANT-TASKS" }));
		imp.setBorder(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		scrollPane_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		scrollPane_2.setBounds(858, 183, 333, 425);
		panel.add(scrollPane_2);

		other = new JTable();
		other.setForeground(SystemColor.desktop);
		other.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tablenum = 2;

				DefaultTableModel table = (DefaultTableModel) other.getModel();
				int selected = other.getSelectedRow();
				textArea.setText(table.getValueAt(selected, 0).toString());

				prevtxt = textArea.getText();
			}
		});
		other.setRowHeight(30);
		other.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		scrollPane_2.setViewportView(other);
		other.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "REGULAR-TASKS" }));

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel jLabel;

				if (textArea.getText().length() == 0) {
					jLabel = new JLabel("Please enter some tasks.!");
					jLabel.setFont(new Font("Arial", Font.BOLD, 20));
					jLabel.setForeground(SystemColor.BLACK);
					JOptionPane.showMessageDialog(textArea, jLabel);
				} else {
					// INSERTING INTO DB
					String text = textArea.getText();
					jLabel = new JLabel("Mark it as important?");
					jLabel.setFont(new Font("Arial", Font.BOLD, 18));
					jLabel.setForeground(SystemColor.BLACK);
					int i = JOptionPane.showConfirmDialog(textArea, jLabel);

					try {
						PreparedStatement ps;
						if (i == 0) {
							ps = connection.prepareStatement("insert into imp values(?)");
							ps.setString(1, text);

							ps.executeUpdate();
							textArea.setText("");
							jLabel = new JLabel("Task-Added.");
							jLabel.setFont(new Font("Arial", Font.BOLD, 18));
							jLabel.setForeground(SystemColor.BLACK);
							JOptionPane.showMessageDialog(textArea, jLabel);
						} else {
							ps = connection.prepareStatement("insert into other values(?)");
							ps.setString(1, text);

							ps.executeUpdate();
							textArea.setText("");
							jLabel = new JLabel("Task-Added.");
							jLabel.setFont(new Font("Arial", Font.BOLD, 18));
							jLabel.setForeground(SystemColor.BLACK);
							JOptionPane.showMessageDialog(textArea, jLabel);
						}
						// RETERIVING FROM DB

						ps = connection.prepareStatement("select * from imp");
						ResultSet result = ps.executeQuery();

						ResultSetMetaData rd = (ResultSetMetaData) result.getMetaData();
						int a = rd.getColumnCount();

						DefaultTableModel table = (DefaultTableModel) imp.getModel();
						table.setRowCount(0);

						while (result.next()) {
							Vector<String> s = new Vector<>();

							for (int x = 1; x <= a; x++) {
								s.add(result.getString("imptask"));
							}
							table.addRow(s);
						}

						// RETERIVING FROM DB

						ps = connection.prepareStatement("select * from other");
						result = ps.executeQuery();

						rd = (ResultSetMetaData) result.getMetaData();
						a = rd.getColumnCount();

						table = (DefaultTableModel) other.getModel();
						table.setRowCount(0);

						while (result.next()) {
							Vector<String> s = new Vector<>();

							for (int x = 1; x <= a; x++) {
								s.add(result.getString("othertask"));
							}
							table.addRow(s);
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(60, 564, 100, 33);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement stmt;
				String newtxt = textArea.getText();
				try {
					if (tablenum == 1) {
						stmt = connection.createStatement();
						stmt.executeUpdate("update imp set imptask= '" + newtxt + "' where imptask= '" + prevtxt + "'");
						PreparedStatement ps = connection.prepareStatement("select * from imp");
						ResultSet result = ps.executeQuery();

						ResultSetMetaData rd = (ResultSetMetaData) result.getMetaData();
						int a = rd.getColumnCount();

						DefaultTableModel table = (DefaultTableModel) imp.getModel();
						table.setRowCount(0);

						while (result.next()) {
							Vector<String> s = new Vector<>();

							for (int x = 1; x <= a; x++) {
								s.add(result.getString("imptask"));
							}
							table.addRow(s);
						}
					} else if(tablenum==2){
						stmt = connection.createStatement();
						stmt.executeUpdate("update other set othertask= '" + newtxt + "' where othertask= '" + prevtxt + "'");
						
						PreparedStatement ps = connection.prepareStatement("select * from other");
						ResultSet result = ps.executeQuery();

						ResultSetMetaData rd = (ResultSetMetaData) result.getMetaData();
						int a = rd.getColumnCount();

						DefaultTableModel table = (DefaultTableModel) other.getModel();
						table.setRowCount(0);

						while (result.next()) {
							Vector<String> s = new Vector<>();

							for (int x = 1; x <= a; x++) {
								s.add(result.getString("othertask"));
							}
							table.addRow(s);
					    }
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(119, 607, 100, 33);
		panel.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Show");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// RETERIVING FROM DB

					PreparedStatement ps = connection.prepareStatement("select * from imp");
					ResultSet result = ps.executeQuery();

					ResultSetMetaData rd = (ResultSetMetaData) result.getMetaData();
					int a = rd.getColumnCount();

					DefaultTableModel table = (DefaultTableModel) imp.getModel();
					table.setRowCount(0);

					while (result.next()) {
						Vector<String> s = new Vector<>();

						for (int x = 1; x <= a; x++) {
							s.add(result.getString("imptask"));
						}
						table.addRow(s);
					}

					// RETERIVING FROM DB

					ps = connection.prepareStatement("select * from other");
					result = ps.executeQuery();

					rd = (ResultSetMetaData) result.getMetaData();
					a = rd.getColumnCount();

					table = (DefaultTableModel) other.getModel();
					table.setRowCount(0);

					while (result.next()) {
						Vector<String> s = new Vector<>();

						for (int x = 1; x <= a; x++) {
							s.add(result.getString("othertask"));
						}
						table.addRow(s);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(335, 564, 100, 33);
		panel.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String deltxt = textArea.getText();
				Statement stmt;
				try {
					if (tablenum == 1) {
						stmt = connection.createStatement();
						stmt.executeUpdate("delete from imp where imptask= '" + deltxt + "'");
						
						// RETERIVING FROM DB

						PreparedStatement ps = connection.prepareStatement("select * from imp");
						ResultSet result = ps.executeQuery();

						ResultSetMetaData rd = (ResultSetMetaData) result.getMetaData();
						int a = rd.getColumnCount();

						DefaultTableModel table = (DefaultTableModel) imp.getModel();
						table.setRowCount(0);

						while (result.next()) {
							Vector<String> s = new Vector<>();

							for (int x = 1; x <= a; x++) {
								s.add(result.getString("imptask"));
							}
							table.addRow(s);
						}
						
					} else if(tablenum==2) {
						stmt = connection.createStatement();
						stmt.executeUpdate("delete from other where othertask= '" + deltxt + "'");
						
						PreparedStatement ps = connection.prepareStatement("select * from other");
						ResultSet result = ps.executeQuery();

						ResultSetMetaData rd = (ResultSetMetaData) result.getMetaData();
						int a = rd.getColumnCount();

						DefaultTableModel table = (DefaultTableModel) other.getModel();
						table.setRowCount(0);

						while (result.next()) {
							Vector<String> s = new Vector<>();

							for (int x = 1; x <= a; x++) {
								s.add(result.getString("othertask"));
							}
							table.addRow(s);
					    }
				  }
				}catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					textArea.setText("");
				}				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(275, 607, 100, 33);
		panel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Your-Tasks");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(526, 131, 200, 42);
		panel.add(lblNewLabel_1_1);

	}
}
