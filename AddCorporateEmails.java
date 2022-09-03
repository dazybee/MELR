


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AddCorporateEmails extends JFrame {

	private JPanel contentPane;
	private JTextField name_of_staff;
	private JTextField corporate_email_address;
	
	String getText(JTextField text) {
		return text.getText();
	}
	
	void setText(JTextField text) {
		text.setText("");
	}
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCorporateEmails frame = new AddCorporateEmails();
					frame.pack();
					frame.setSize(528,738);
					frame.setLocationRelativeTo(null);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddCorporateEmails() {
		setTitle("Add Corporate Email-~dazyb~");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 528, 738);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Corporate Email");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 494, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNameOfStaff = new JLabel("Name Of Staff");
		lblNameOfStaff.setForeground(Color.BLUE);
		lblNameOfStaff.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNameOfStaff.setBackground(Color.WHITE);
		lblNameOfStaff.setBounds(37, 150, 136, 33);
		contentPane.add(lblNameOfStaff);
		
		name_of_staff = new JTextField();
		name_of_staff.setBorder(null);
		name_of_staff.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		name_of_staff.setForeground(Color.BLUE);
		name_of_staff.setBounds(37, 182, 441, 25);
		contentPane.add(name_of_staff);
		name_of_staff.setColumns(10);
		
		JLabel lblCorporateEmail = new JLabel("Corporate Email Address");
		lblCorporateEmail.setForeground(Color.BLUE);
		lblCorporateEmail.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCorporateEmail.setBackground(Color.WHITE);
		lblCorporateEmail.setBounds(37, 276, 212, 33);
		contentPane.add(lblCorporateEmail);
		
		corporate_email_address = new JTextField();
		corporate_email_address.setForeground(Color.BLUE);
		corporate_email_address.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		corporate_email_address.setColumns(10);
		corporate_email_address.setBorder(null);
		corporate_email_address.setBounds(37, 310, 441, 25);
		contentPane.add(corporate_email_address);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				if(!(getText(name_of_staff).isEmpty())&&!(getText(corporate_email_address).isEmpty())) {
					Database db=new Database();
					db.add_corporate_email(getText(name_of_staff), getText(corporate_email_address));
					setText(name_of_staff);
					setText(corporate_email_address);
					
					Database err=new Database();
					if(!err.errorMsg) {
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
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnNewButton.setBounds(199, 575, 128, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("_________________________________________________________________________________________");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(37, 205, 441, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("_________________________________________________________________________________________");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setBounds(37, 335, 441, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("__________________________________________");
		lblNewLabel_1_3.setForeground(Color.BLUE);
		lblNewLabel_1_3.setBounds(122, 34, 302, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(getText(name_of_staff).isEmpty())&&!(getText(corporate_email_address).isEmpty())) {
					Database db=new Database();
					db.removeCorporateEmail(getText(name_of_staff), getText(corporate_email_address));
					setText(name_of_staff);
					setText(corporate_email_address);
					Database err=new Database();
					if(!err.errorMsg) {
						final JOptionPane pane =new JOptionPane("  Removed Successfully  ");
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
		btnRemove.setForeground(Color.BLUE);
		btnRemove.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnRemove.setBackground(Color.WHITE);
		btnRemove.setBounds(350, 575, 128, 33);
		contentPane.add(btnRemove);
	}
}
