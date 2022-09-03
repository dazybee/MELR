import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.time.LocalDate;

import javax.swing.JDialog;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class Home extends JFrame {

	
	//methods
	
	public boolean verified=false;
	
	
	
	
	
	void setIcon(JLabel label) {
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/accept1.png"));
	}
	
	String expired_date(JTextField f) {
		LocalDate date=LocalDate.now().plusDays(Integer.parseInt(f.getText()));
		return date.toString();
	}
	
	String show_current_date() {
		LocalDate date=LocalDate.now();
		return date.toString();
	}
	int convertString(JTextField f) 
	{
		int converted=Integer.parseInt(f.getText());
		return converted;
	}
	String getText(JTextField f)
	{
		return f.getText();
	}
	void setText(JLabel label,String text) {
		label.setText(text);
	}
	void setText(JTextField f,String Text) 
	{
		f.setText(Text);
	}
	void setColor(JPanel panel) 
	{
		panel.setBackground(new Color(103, 157, 247));
	}
	void resetColor(JPanel panel) 
	{
		panel.setBackground(new Color(66, 133, 244));
	}
	void clear(JTextField f) 
	{
		f.setText("");
	}
	
	private JPanel contentPane;
	private JTextField model_F;
	private JTextField sn_F;
	private JTextField licenceF;
	private JTextField userName_F;
	private JTextField unit_F;
	private JTextField staffID_F;
	private JTextField deviceC_F;
	private JTextField antiVirus_F;
	private JTextField OS_F;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField rSN_F;
	private JTextField date_F;
	private JTable table;
	private JTable table_1;
	private JTextField searchField;
	private JTextField searchFieldC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("~dazyb~");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1401, 775);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Database db=new Database();
		
//		declare
		JPanel addPanel = new JPanel();
		JPanel dashPanel = new JPanel();
		JPanel viewPanel = new JPanel();
		JPanel removePanel = new JPanel();
		JPanel settingsPanel = new JPanel();
		
		
		
		JPanel buttom_panel = new JPanel();
		buttom_panel.setBackground(new Color(255, 255, 255));
		buttom_panel.setBounds(10, 101, 1367, 627);
		contentPane.add(buttom_panel);
		buttom_panel.setLayout(new CardLayout(0, 0));
		
		JPanel addArea = new JPanel();
		addArea.setBackground(Color.WHITE);
		buttom_panel.add(addArea, "addCard");
		addArea.setLayout(null);
		
		JLabel model = new JLabel("Model  Name");
		model.setBounds(127, 66, 260, 32);
		model.setForeground(Color.BLUE);
		model.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model);
		
		model_F = new JTextField();
		model_F.setBounds(127, 95, 263, 32);
		model_F.setBorder(null);
		model_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		addArea.add(model_F);
		model_F.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("____________________________________________");
		lblNewLabel.setBounds(127, 122, 260, 13);
		addArea.add(lblNewLabel);
		
		JLabel model_1 = new JLabel("Serial Number");
		model_1.setBounds(545, 66, 260, 32);
		model_1.setForeground(Color.BLUE);
		model_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1);
		
		sn_F = new JTextField();
		sn_F.setBounds(545, 95, 263, 32);
		sn_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		sn_F.setColumns(10);
		sn_F.setBorder(null);
		addArea.add(sn_F);
		
		JLabel lblNewLabel_2 = new JLabel("____________________________________________");
		lblNewLabel_2.setBounds(545, 122, 260, 13);
		addArea.add(lblNewLabel_2);
		
		licenceF = new JTextField();
		licenceF.setBounds(977, 95, 263, 32);
		licenceF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		licenceF.setColumns(10);
		licenceF.setBorder(null);
		addArea.add(licenceF);
		
		JLabel lblNewLabel_2_1 = new JLabel("____________________________________________");
		lblNewLabel_2_1.setBounds(980, 122, 260, 13);
		addArea.add(lblNewLabel_2_1);
		
		JLabel model_1_1_1 = new JLabel("User's Name");
		model_1_1_1.setBounds(127, 225, 260, 32);
		model_1_1_1.setForeground(Color.BLUE);
		model_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1_1_1);
		
		userName_F = new JTextField();
		userName_F.setBounds(127, 256, 263, 32);
		userName_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		userName_F.setColumns(10);
		userName_F.setBorder(null);
		addArea.add(userName_F);
		
		JLabel lblNewLabel_3 = new JLabel("____________________________________________");
		lblNewLabel_3.setBounds(127, 282, 260, 13);
		addArea.add(lblNewLabel_3);
		
		JLabel model_1_1_1_1 = new JLabel("Department/Unit");
		model_1_1_1_1.setBounds(545, 225, 260, 32);
		model_1_1_1_1.setForeground(Color.BLUE);
		model_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1_1_1_1);
		
		JLabel model_1_1_1_2 = new JLabel("Signature(Initials)");
		model_1_1_1_2.setBounds(980, 225, 260, 32);
		model_1_1_1_2.setForeground(Color.BLUE);
		model_1_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1_1_1_2);
		
		unit_F = new JTextField();
		unit_F.setBounds(545, 256, 263, 32);
		unit_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		unit_F.setColumns(10);
		unit_F.setBorder(null);
		addArea.add(unit_F);
		
		staffID_F = new JTextField();
		staffID_F.setBounds(977, 256, 263, 32);
		staffID_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		staffID_F.setColumns(10);
		staffID_F.setBorder(null);
		addArea.add(staffID_F);
		
		JLabel lblNewLabel_3_1 = new JLabel("____________________________________________");
		lblNewLabel_3_1.setBounds(545, 282, 260, 13);
		addArea.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("____________________________________________");
		lblNewLabel_3_2.setBounds(977, 282, 260, 13);
		addArea.add(lblNewLabel_3_2);
		
		JLabel model_1_1_1_3 = new JLabel("Device Condition");
		model_1_1_1_3.setBounds(127, 378, 260, 32);
		model_1_1_1_3.setForeground(Color.BLUE);
		model_1_1_1_3.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1_1_1_3);
		
		JLabel model_1_1_1_4 = new JLabel("AntiVirus Status(Kaspersky)");
		model_1_1_1_4.setBounds(545, 378, 260, 32);
		model_1_1_1_4.setForeground(Color.BLUE);
		model_1_1_1_4.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1_1_1_4);
		
		JLabel model_1_1_1_5 = new JLabel("OS Status(Windows)");
		model_1_1_1_5.setBounds(977, 378, 260, 32);
		model_1_1_1_5.setForeground(Color.BLUE);
		model_1_1_1_5.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1_1_1_5);
		
		deviceC_F = new JTextField();
		deviceC_F.setBounds(127, 410, 263, 32);
		deviceC_F.setText("Good/Bad");
		deviceC_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		deviceC_F.setColumns(10);
		deviceC_F.setBorder(null);
		addArea.add(deviceC_F);
		
		antiVirus_F = new JTextField();
		antiVirus_F.setBounds(545, 410, 263, 32);
		antiVirus_F.setText("Activated/Not Activated");
		antiVirus_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		antiVirus_F.setColumns(10);
		antiVirus_F.setBorder(null);
		addArea.add(antiVirus_F);
		
		OS_F = new JTextField();
		OS_F.setBounds(977, 410, 263, 32);
		OS_F.setText("Activated/Not Activated");
		OS_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		OS_F.setColumns(10);
		OS_F.setBorder(null);
		addArea.add(OS_F);
		
		JLabel lblNewLabel_3_3 = new JLabel("____________________________________________");
		lblNewLabel_3_3.setBounds(127, 435, 260, 13);
		addArea.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("____________________________________________");
		lblNewLabel_3_4.setBounds(545, 435, 260, 13);
		addArea.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("____________________________________________");
		lblNewLabel_3_5.setBounds(977, 435, 260, 13);
		addArea.add(lblNewLabel_3_5);
		
		JLabel model_1_1_2 = new JLabel("AntiVirus Licence Duration(Days)");
		model_1_1_2.setBounds(977, 66, 260, 32);
		model_1_1_2.setForeground(Color.BLUE);
		model_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
		addArea.add(model_1_1_2);
		
		JLabel model_1_1_1_3_1 = new JLabel("Date");
		model_1_1_1_3_1.setForeground(Color.BLUE);
		model_1_1_1_3_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		model_1_1_1_3_1.setBounds(127, 501, 260, 32);
		addArea.add(model_1_1_1_3_1);
		
		date_F = new JTextField();
		date_F.setText(show_current_date());
		date_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		date_F.setColumns(10);
		date_F.setBorder(null);
		date_F.setBounds(127, 531, 263, 32);
		addArea.add(date_F);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("____________________________________________");
		lblNewLabel_3_3_1.setBounds(127, 554, 260, 13);
		addArea.add(lblNewLabel_3_3_1);
		
		JButton addDevicebtn = new JButton("Add Device");
		addDevicebtn.setBackground(Color.WHITE);
		addDevicebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(getText(model_F).isEmpty())&&!(getText(licenceF).isEmpty())&&!(getText(sn_F).isEmpty())&&(!(getText(userName_F).isEmpty()))&&(!(getText(unit_F).isEmpty()))&&(!(getText(staffID_F).isEmpty()))&&((deviceC_F.getText().length()==4)||(deviceC_F.getText().length()==3))&&((antiVirus_F.getText().length()==9)||(antiVirus_F.getText().length()==13))&&((OS_F.getText().length()==9)||(OS_F.getText().length()==13))){
					Database db=new Database();
					db.add_device_to_database(getText(date_F),getText(model_F),getText(sn_F), expired_date(licenceF), getText(userName_F), getText(unit_F), getText(staffID_F), getText(deviceC_F), getText(antiVirus_F), getText(OS_F));
					clear(model_F);
					clear(licenceF);
					clear(sn_F);
					clear(userName_F);
					clear(unit_F);
					clear(staffID_F);
					setText(deviceC_F,"Good/Bad");
					setText(antiVirus_F,"Activated/Not Activated");
					setText(OS_F,"Activated/Not Activated");
					if(Database.dialog_message!=null) {
						final JOptionPane pane =new JOptionPane("   Added Successfully  ");
						final JDialog d=pane.createDialog((JFrame)null,"Message");
						d.setLocationRelativeTo(null);
						d.setVisible(true);
					}else {
						final JOptionPane pane =new JOptionPane("An Error Occurred");
						final JDialog d=pane.createDialog((JFrame)null,"Message");
						d.setLocationRelativeTo(null);
						d.setVisible(true);
						
					}
					}else {
						final JOptionPane pane =new JOptionPane("Please fill in the blank spaces");
						final JDialog d=pane.createDialog((JFrame)null,"Message");
						d.setLocationRelativeTo(null);
						d.setVisible(true);
					}
				}
			
		});
		addDevicebtn.setForeground(Color.BLUE);
		addDevicebtn.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		addDevicebtn.setBounds(1074, 532, 137, 32);
		addArea.add(addDevicebtn);
		
		JPanel dashArea = new JPanel();
		dashArea.setBackground(Color.WHITE);
		buttom_panel.add(dashArea, "dashCard");
		dashArea.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(66, 133, 244));
		panel.setBounds(10, 30, 1347, 51);
		dashArea.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Summary");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 10, 1327, 31);
		panel.add(lblNewLabel_5);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 91, 1316, 526);
		dashArea.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(44, 32, 239, 143);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("1000");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(10, 10, 219, 87);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Computers Logged");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.BLUE);
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 107, 219, 26);
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(367, 32, 239, 143);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("1000");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.BLUE);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6_1.setBounds(10, 10, 219, 87);
		panel_2_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("In Good Health\r\n");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setForeground(Color.BLUE);
		lblNewLabel_7_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7_1.setBounds(10, 107, 219, 26);
		panel_2_1.add(lblNewLabel_7_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(698, 32, 239, 143);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("1000");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setForeground(Color.BLUE);
		lblNewLabel_6_2.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6_2.setBounds(10, 10, 219, 87);
		panel_2_2.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("AntiVirus Activated");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setForeground(Color.BLUE);
		lblNewLabel_7_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7_2.setBounds(10, 107, 219, 26);
		panel_2_2.add(lblNewLabel_7_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBounds(1030, 32, 239, 143);
		panel_1.add(panel_2_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("1000");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setForeground(Color.BLUE);
		lblNewLabel_6_3.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6_3.setBounds(10, 10, 219, 87);
		panel_2_3.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("Windows Activated");
		lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3.setForeground(Color.BLUE);
		lblNewLabel_7_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7_3.setBounds(10, 107, 219, 26);
		panel_2_3.add(lblNewLabel_7_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(66, 133, 244));
		panel_3.setBounds(10, 227, 1296, 48);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Number of Computers(Unit)");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(10, 10, 1276, 28);
		panel_3.add(lblNewLabel_8);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBackground(Color.WHITE);
		panel_2_4.setBounds(44, 329, 239, 143);
		panel_1.add(panel_2_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("1000");
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_4.setForeground(Color.BLUE);
		lblNewLabel_6_4.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6_4.setBounds(10, 10, 219, 87);
		panel_2_4.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_7_4 = new JLabel("F&A");
		lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4.setForeground(Color.BLUE);
		lblNewLabel_7_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7_4.setBounds(10, 107, 219, 26);
		panel_2_4.add(lblNewLabel_7_4);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setLayout(null);
		panel_2_5.setBackground(Color.WHITE);
		panel_2_5.setBounds(367, 329, 239, 143);
		panel_1.add(panel_2_5);
		
		JLabel lblNewLabel_6_5 = new JLabel("1000");
		lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5.setForeground(Color.BLUE);
		lblNewLabel_6_5.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6_5.setBounds(10, 10, 219, 87);
		panel_2_5.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_7_5 = new JLabel("RSIM");
		lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_5.setForeground(Color.BLUE);
		lblNewLabel_7_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7_5.setBounds(10, 107, 219, 26);
		panel_2_5.add(lblNewLabel_7_5);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setLayout(null);
		panel_2_6.setBackground(Color.WHITE);
		panel_2_6.setBounds(698, 329, 239, 143);
		panel_1.add(panel_2_6);
		
		JLabel lblNewLabel_6_6 = new JLabel("1000");
		lblNewLabel_6_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_6.setForeground(Color.BLUE);
		lblNewLabel_6_6.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6_6.setBounds(10, 10, 219, 87);
		panel_2_6.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_7_6 = new JLabel("PPME");
		lblNewLabel_7_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_6.setForeground(Color.BLUE);
		lblNewLabel_7_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7_6.setBounds(10, 107, 219, 26);
		panel_2_6.add(lblNewLabel_7_6);
		
		JPanel panel_2_7 = new JPanel();
		panel_2_7.setLayout(null);
		panel_2_7.setBackground(Color.WHITE);
		panel_2_7.setBounds(1030, 329, 239, 143);
		panel_1.add(panel_2_7);
		
		JLabel lblNewLabel_6_7 = new JLabel("1000");
		lblNewLabel_6_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_7.setForeground(Color.BLUE);
		lblNewLabel_6_7.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_6_7.setBounds(10, 10, 219, 87);
		panel_2_7.add(lblNewLabel_6_7);
		
		JLabel lblNewLabel_7_7 = new JLabel("Audit Unit");
		lblNewLabel_7_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_7.setForeground(Color.BLUE);
		lblNewLabel_7_7.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7_7.setBounds(10, 107, 219, 26);
		panel_2_7.add(lblNewLabel_7_7);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText(lblNewLabel_6_4,db.get_department(lblNewLabel_7_4.getText()));
				setText(lblNewLabel_6_5,db.get_department(lblNewLabel_7_5.getText()));
				setText(lblNewLabel_6_6,db.get_department(lblNewLabel_7_6.getText()));
				setText(lblNewLabel_6_7,db.get_department(lblNewLabel_7_7.getText()));
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnNewButton.setBounds(24, 482, 130, 34);
		panel_1.add(btnNewButton);
		
		JPanel viewArea = new JPanel();
		viewArea.setBackground(new Color(255, 255, 255));
		buttom_panel.add(viewArea, "viewCard");
		viewArea.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 1347, 574);
		viewArea.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		table.setForeground(Color.BLUE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Date", "ModelName", "SerialNumber", "ProductID", "Username", "Department/Unit", "Signature", "DeviceCondition", "AntiVirus", "OS"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, true, true, true, true, true, false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(0).setMinWidth(75);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setMinWidth(75);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setMinWidth(75);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setMinWidth(75);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setMinWidth(75);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setMinWidth(75);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setMinWidth(75);
		table.getColumnModel().getColumn(7).setPreferredWidth(100);
		table.getColumnModel().getColumn(7).setMinWidth(75);
		table.getColumnModel().getColumn(8).setResizable(false);
		table.getColumnModel().getColumn(8).setPreferredWidth(100);
		table.getColumnModel().getColumn(8).setMinWidth(75);
		table.getColumnModel().getColumn(9).setResizable(false);
		table.getColumnModel().getColumn(9).setPreferredWidth(100);
		table.getColumnModel().getColumn(9).setMinWidth(75);
		scrollPane.setViewportView(table);
		
		searchField = new JTextField();
		searchField.setBounds(972, 10, 228, 23);
		viewArea.add(searchField);
		searchField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!searchField.toString().isEmpty()) {
					FillTable ft=new FillTable();
					ft.searchQuery(getText(searchField), table);
				}
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(1210, 10, 114, 23);
		viewArea.add(btnNewButton_2);
		
		JTextArea txtrSearchRecordsUsing = new JTextArea();
		txtrSearchRecordsUsing.setForeground(Color.BLUE);
		txtrSearchRecordsUsing.setEditable(false);
		txtrSearchRecordsUsing.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtrSearchRecordsUsing.setText("Search records using Username, ModelName, SerialNumber or Department");
		txtrSearchRecordsUsing.setBounds(457, 11, 491, 22);
		viewArea.add(txtrSearchRecordsUsing);
		
		JPanel removeArea = new JPanel();
		removeArea.setBackground(Color.WHITE);
		buttom_panel.add(removeArea, "removeCard");
		removeArea.setLayout(null);
		
		JLabel model_2 = new JLabel("User's Name");
		model_2.setForeground(Color.BLUE);
		model_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
		model_2.setBounds(157, 91, 260, 32);
		removeArea.add(model_2);
		
		textField_8 = new JTextField();
		textField_8.setText("\r\n");
		textField_8.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBounds(157, 117, 263, 32);
		removeArea.add(textField_8);
		
		JLabel model_2_1 = new JLabel("Department/Unit");
		model_2_1.setForeground(Color.BLUE);
		model_2_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		model_2_1.setBounds(614, 91, 260, 32);
		removeArea.add(model_2_1);
		
		JLabel model_2_2 = new JLabel("Signature");
		model_2_2.setForeground(Color.BLUE);
		model_2_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
		model_2_2.setBounds(1012, 91, 260, 32);
		removeArea.add(model_2_2);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBounds(614, 117, 263, 32);
		removeArea.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBounds(1012, 117, 263, 32);
		removeArea.add(textField_10);
		
		JLabel lblNewLabel_4_1 = new JLabel("____________________________________________");
		lblNewLabel_4_1.setBounds(157, 144, 260, 13);
		removeArea.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("____________________________________________");
		lblNewLabel_4_2.setBounds(614, 144, 260, 13);
		removeArea.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("____________________________________________");
		lblNewLabel_4_3.setBounds(1012, 144, 260, 13);
		removeArea.add(lblNewLabel_4_3);
		
		JLabel model_2_3 = new JLabel("Product ID");
		model_2_3.setForeground(Color.BLUE);
		model_2_3.setFont(new Font("Segoe UI", Font.BOLD, 17));
		model_2_3.setBounds(157, 235, 260, 32);
		removeArea.add(model_2_3);
		
		JLabel model_2_4 = new JLabel("Serial Number");
		model_2_4.setForeground(Color.BLUE);
		model_2_4.setFont(new Font("Segoe UI", Font.BOLD, 17));
		model_2_4.setBounds(614, 235, 260, 32);
		removeArea.add(model_2_4);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBorder(null);
		textField_11.setBounds(157, 261, 263, 32);
		removeArea.add(textField_11);
		
		rSN_F = new JTextField();
		rSN_F.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		rSN_F.setColumns(10);
		rSN_F.setBorder(null);
		rSN_F.setBounds(614, 261, 263, 32);
		removeArea.add(rSN_F);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("____________________________________________");
		lblNewLabel_4_1_1.setBounds(157, 289, 260, 13);
		removeArea.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("____________________________________________");
		lblNewLabel_4_1_2.setBounds(617, 289, 260, 13);
		removeArea.add(lblNewLabel_4_1_2);
		
		JButton btnRemoveDevice = new JButton("Remove Device");
		btnRemoveDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!rSN_F.getText().isEmpty()) {
					Database db=new Database();
					db.remove_device_from_database(getText(rSN_F));
					clear(rSN_F);
					clear(textField_8);
					clear(textField_9);
					clear(textField_10);
					clear(textField_11);
					if(Database.dialog_message1!=null) {
						final JOptionPane pane =new JOptionPane("Removed Successfully");
						final JDialog d=pane.createDialog((JFrame)null,"Message");
						d.setLocationRelativeTo(null);
						d.setVisible(true);
					}else {
						final JOptionPane pane =new JOptionPane("An Error Occurred");
						final JDialog d=pane.createDialog((JFrame)null,"Message");
						d.setLocationRelativeTo(null);
						d.setVisible(true);
						
					}
				}else {
					final JOptionPane pane =new JOptionPane("Please fill in at least the serial number space to proceed ");
					final JDialog d=pane.createDialog((JFrame)null,"Message");
					d.setLocationRelativeTo(null);
					d.setVisible(true);
				}
			}
		});
		btnRemoveDevice.setForeground(Color.BLUE);
		btnRemoveDevice.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnRemoveDevice.setBackground(Color.WHITE);
		btnRemoveDevice.setBounds(1012, 503, 137, 32);
		removeArea.add(btnRemoveDevice);
		
		JPanel corporateEmail_C = new JPanel();
		corporateEmail_C.setBackground(Color.WHITE);
		buttom_panel.add(corporateEmail_C, "settingsCard");
		corporateEmail_C.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 43, 1347, 532);
		corporateEmail_C.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setRowSelectionAllowed(false);
		table_1.setForeground(Color.BLUE);
		table_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Name", "Email Address", "Password"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(0).setMinWidth(150);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(1).setMinWidth(150);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(2).setMinWidth(150);
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_1 = new JButton("Add ");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCorporateEmails adce=new AddCorporateEmails();
				adce.pack();
				adce.setSize(528,738);
				adce.setLocationRelativeTo(null);
				adce.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnNewButton_1.setBounds(1227, 585, 130, 32);
		corporateEmail_C.add(btnNewButton_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Refresh");
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CorporateEmail ce=new CorporateEmail();
				ce.fill_with_passwords(table_1);
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnNewButton_1_1_1.setBounds(1075, 585, 130, 32);
		corporateEmail_C.add(btnNewButton_1_1_1);
		
		searchFieldC = new JTextField();
		searchFieldC.setColumns(10);
		searchFieldC.setBounds(955, 10, 228, 23);
		corporateEmail_C.add(searchFieldC);
		
		JButton btnNewButton_2_1 = new JButton("Search");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!searchFieldC.toString().isEmpty()) {
					CorporateEmail ce=new CorporateEmail();
					ce.searchQuery(searchFieldC.getText(), table_1);
				}
			}
		});
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(1196, 10, 114, 23);
		corporateEmail_C.add(btnNewButton_2_1);
		
		JTextArea txtrSearchRecordsUsing_2 = new JTextArea();
		txtrSearchRecordsUsing_2.setText("Search records using Name or Email Address");
		txtrSearchRecordsUsing_2.setForeground(Color.BLUE);
		txtrSearchRecordsUsing_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtrSearchRecordsUsing_2.setEditable(false);
		txtrSearchRecordsUsing_2.setBounds(657, 11, 275, 22);
		corporateEmail_C.add(txtrSearchRecordsUsing_2);
		
		JPanel top_panel = new JPanel();
		top_panel.setBackground(new Color(66, 133, 244));
		top_panel.setBounds(45, 10, 1283, 92);
		contentPane.add(top_panel);
		top_panel.setLayout(null);
		
		
		addPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(addPanel);
				resetColor(dashPanel);
				resetColor(viewPanel);
				resetColor(removePanel);
				resetColor(settingsPanel);
				CardLayout card;
				card=(CardLayout)(buttom_panel.getLayout());
				card.show(buttom_panel, "addCard");
				
			}
			
		});
		addPanel.setBackground(new Color(66, 133, 244));
		addPanel.setLayout(null);
		addPanel.setBounds(21, 10, 267, 72);
		top_panel.add(addPanel);
		
		JLabel addIcon = new JLabel("");
		ImageIcon add=new ImageIcon(this.getClass().getResource("/add-files0.png"));
		addIcon.setIcon(add);
		addIcon.setHorizontalAlignment(SwingConstants.CENTER);
		addIcon.setBounds(10, 10, 45, 52);
		addPanel.add(addIcon);
		
		JLabel lblNewLabel_1_4 = new JLabel("Add Device\r\n\r\n");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblNewLabel_1_4.setBounds(61, 10, 196, 52);
		addPanel.add(lblNewLabel_1_4);
		
		
		dashPanel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				setColor(dashPanel);
//			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Database db=new Database();
				setColor(dashPanel);
				resetColor(addPanel);
				resetColor(viewPanel);
				resetColor(removePanel);
				resetColor(settingsPanel);
				CardLayout card;
				card=(CardLayout)(buttom_panel.getLayout());
				card.show(buttom_panel, "dashCard");
				setText(lblNewLabel_6,db.get_number_department());
				setText(lblNewLabel_6_1,db.get_condition());
				setText(lblNewLabel_6_2,db.get_AntiVirus());
				setText(lblNewLabel_6_3,db.get_OS());
				setText(lblNewLabel_6_4,db.get_department(lblNewLabel_7_4.getText()));
				setText(lblNewLabel_6_5,db.get_department(lblNewLabel_7_5.getText()));
				setText(lblNewLabel_6_6,db.get_department(lblNewLabel_7_6.getText()));
				setText(lblNewLabel_6_7,db.get_department(lblNewLabel_7_7.getText()));

				
				
			}
		});
		dashPanel.setBackground(new Color(66, 133, 244));
		dashPanel.setLayout(null);
		dashPanel.setBounds(298, 10, 229, 72);
		top_panel.add(dashPanel);
		
		JLabel dashIcon = new JLabel("");
		ImageIcon dash=new ImageIcon(this.getClass().getResource("/dashboard-report1.png"));
		dashIcon.setIcon(dash);
		dashIcon.setHorizontalAlignment(SwingConstants.CENTER);
		dashIcon.setBounds(10, 10, 45, 52);
		dashPanel.add(dashIcon);
		
		JLabel lblNewLabel_1 = new JLabel("Dashboard");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(60, 10, 159, 52);
		dashPanel.add(lblNewLabel_1);
		
		
		viewPanel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				setColor(viewPanel);
//			}
			@Override
			public void mousePressed(MouseEvent e) {
				FillTable ft=new FillTable();
				setColor(viewPanel);
				resetColor(dashPanel);
				resetColor(addPanel);
				resetColor(removePanel);
				resetColor(settingsPanel);
				CardLayout card;
				card=(CardLayout)(buttom_panel.getLayout());
				card.show(buttom_panel, "viewCard");
				ft.fill(table);
				
			}
		});
		viewPanel.setBackground(new Color(66, 133, 244));
		viewPanel.setLayout(null);
		viewPanel.setBounds(537, 10, 229, 72);
		top_panel.add(viewPanel);
		
		JLabel viewIcon = new JLabel("\r\n");
		ImageIcon view=new ImageIcon(this.getClass().getResource("/list-view1.png"));
		viewIcon.setIcon(view);
		viewIcon.setHorizontalAlignment(SwingConstants.CENTER);
		viewIcon.setBounds(10, 10, 45, 52);
		viewPanel.add(viewIcon);
		
		JLabel lblNewLabel_1_1 = new JLabel("View Devices");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(60, 10, 159, 52);
		viewPanel.add(lblNewLabel_1_1);
		
		
		removePanel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				setColor(removePanel);
//			}
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(removePanel);
				resetColor(dashPanel);
				resetColor(viewPanel);
				resetColor(addPanel);
				resetColor(settingsPanel);
				CardLayout card;
				card=(CardLayout)(buttom_panel.getLayout());
				card.show(buttom_panel, "removeCard");
			}
		});
		removePanel.setBackground(new Color(66, 133, 244));
		removePanel.setLayout(null);
		removePanel.setBounds(781, 10, 229, 72);
		top_panel.add(removePanel);
		
		JLabel removeIcon = new JLabel("");
		ImageIcon remove=new ImageIcon(this.getClass().getResource("/garbage1.png"));
		removeIcon.setIcon(remove);
		removeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		removeIcon.setBounds(10, 10, 45, 52);
		removePanel.add(removeIcon);
		
		JLabel lblNewLabel_1_2 = new JLabel("Remove Device\r\n");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblNewLabel_1_2.setBounds(60, 10, 159, 52);
		removePanel.add(lblNewLabel_1_2);
		
		
		settingsPanel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				setColor(settingsPanel);
//			}
			@Override
			public void mousePressed(MouseEvent e) {
				CorporateEmail ce=new CorporateEmail();
				setColor(settingsPanel);
				resetColor(dashPanel);
				resetColor(viewPanel);
				resetColor(removePanel);
				resetColor(addPanel);
				CardLayout card;
				card=(CardLayout)(buttom_panel.getLayout());
				card.show(buttom_panel, "settingsCard");
				ce.fill_with_passwords(table_1);;
				
			}
			
		});
		settingsPanel.setBackground(new Color(66, 133, 244));
		settingsPanel.setLayout(null);
		settingsPanel.setBounds(1030, 10, 243, 72);
		top_panel.add(settingsPanel);
		
		JLabel settingsIcon = new JLabel("");
		ImageIcon settings=new ImageIcon(this.getClass().getResource("/PVtR.png"));
		settingsIcon.setIcon(settings);
		settingsIcon.setHorizontalAlignment(SwingConstants.CENTER);
		settingsIcon.setBounds(10, 10, 45, 52);
		settingsPanel.add(settingsIcon);
		
		JLabel lblNewLabel_1_3 = new JLabel("Corporate Emails");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblNewLabel_1_3.setBounds(60, 10, 193, 52);
		settingsPanel.add(lblNewLabel_1_3);
	
		
		JPanel leftSide_panel = new JPanel();
		leftSide_panel.setBackground(new Color(255, 255, 255));
		leftSide_panel.setBounds(10, 40, 37, 62);
		contentPane.add(leftSide_panel);
		
		JPanel rightSide_panel = new JPanel();
		rightSide_panel.setBackground(new Color(255, 255, 255));
		rightSide_panel.setBounds(1327, 40, 50, 62);
		contentPane.add(rightSide_panel);
	}
}
