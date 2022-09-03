import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class Loader extends JFrame {

	private JPanel contentPane;
	private static JLabel progress_label;
	private static JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				int i;
					Loader frame = new Loader();
					frame.pack();
 					frame.setSize(501, 330);
  					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
					try {
						for(i=0;i<=100;i++) 
						{
							Thread.sleep(15);
							Loader.progressBar.setValue(i);
							Loader.progress_label.setText(Integer.toString(i)+"%");
							if(i==100) 
							{
								frame.dispose();
								Home home=new Home();
								home.pack();
								home.setSize(1401,775);
								home.setLocationRelativeTo(null);
								home.setVisible(true);
								
							}
							
						}
					}catch (InterruptedException e) {
							e.printStackTrace();
						}		
		}

	/**
	 * Create the frame.
	 */
	public Loader() {
		setAlwaysOnTop(true);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 188, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel loader_name_label = new JLabel("~dazyb~");
		loader_name_label.setForeground(Color.WHITE);
		loader_name_label.setHorizontalAlignment(SwingConstants.CENTER);
		loader_name_label.setFont(new Font("Segoe UI", Font.BOLD, 52));
		loader_name_label.setBounds(10, 10, 481, 162);
		contentPane.add(loader_name_label);
		
		progress_label = new JLabel("50%");
		progress_label.setHorizontalAlignment(SwingConstants.CENTER);
		progress_label.setFont(new Font("Segoe UI", Font.BOLD, 28));
		progress_label.setForeground(Color.WHITE);
		progress_label.setBounds(10, 213, 481, 50);
		contentPane.add(progress_label);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.WHITE);
		progressBar.setBackground(new Color(34, 188, 255));
		progressBar.setBounds(10, 284, 481, 34);
		contentPane.add(progressBar);
	}
}
