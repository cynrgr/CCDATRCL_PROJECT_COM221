import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Panel;

public class sticketsMainPage {

	JFrame frame;
	private Panel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sticketsMainPage window = new sticketsMainPage();
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
	public sticketsMainPage() {
		initialize();
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1192, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		ImageIcon logo = new ImageIcon(this.getClass().getResource("/logo.png"));
		lblLogo.setIcon(logo);
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setBounds(0, 0, 170, 106);
		frame.getContentPane().add(lblLogo);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(203, 108, 230));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(885, 31, 116, 45);
		frame.getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSignUp.setBackground(new Color(203, 108, 230));
		btnSignUp.setBounds(1000, 31, 154, 45);
		frame.getContentPane().add(btnSignUp);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(203, 108, 230));
		panel.setBounds(0, 106, 1178, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblEvents = new JLabel("EVENTS");
		lblEvents.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEvents.setForeground(new Color(255, 255, 255));
		lblEvents.setBounds(20, 10, 150, 43);
		panel.add(lblEvents);
		
		JLabel imgSvt = new JLabel("");
		ImageIcon svt = new ImageIcon(this.getClass().getResource("/svt.jpg"));
		imgSvt.setIcon(svt);
		imgSvt.setBounds(134, 63, 213, 300);
		panel.add(imgSvt);
		
		JLabel lblSvtTitle = new JLabel("SEVENTEEN: Follow Tour");
		lblSvtTitle.setForeground(Color.WHITE);
		lblSvtTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSvtTitle.setBounds(134, 358, 215, 38);
		panel.add(lblSvtTitle);
		
		JLabel lblSvtLoc = new JLabel("Philippine Sports Stadium");
		lblSvtLoc.setForeground(Color.WHITE);
		lblSvtLoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSvtLoc.setBounds(134, 384, 213, 27);
		panel.add(lblSvtLoc);
		
		JLabel lblSvtDate = new JLabel("January 13, 2024");
		lblSvtDate.setForeground(Color.WHITE);
		lblSvtDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSvtDate.setBounds(134, 405, 213, 27);
		panel.add(lblSvtDate);
		
		JButton btnSvtBuy = new JButton("BUY TICKETS");
		btnSvtBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsSvtTiers window = new sticketsSvtTiers();
				window.frame.setVisible(true);
			}
		});
		btnSvtBuy.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSvtBuy.setForeground(new Color(203, 108, 230));
		btnSvtBuy.setBackground(new Color(255, 255, 255));
		btnSvtBuy.setBounds(134, 440, 213, 43);
		panel.add(btnSvtBuy);
		
		JLabel imgEnha = new JLabel("");
		ImageIcon enha = new ImageIcon(this.getClass().getResource("/enha.jpg"));
		imgEnha.setIcon(enha);
		imgEnha.setBounds(481, 63, 213, 300);
		panel.add(imgEnha);
		
		JLabel lblEnhaTitle = new JLabel("ENHYPEN: Manifesto");
		lblEnhaTitle.setForeground(Color.WHITE);
		lblEnhaTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnhaTitle.setBounds(481, 358, 215, 38);
		panel.add(lblEnhaTitle);
		
		JLabel lblEnhaLoc = new JLabel("Mall of Asia Arena");
		lblEnhaLoc.setForeground(Color.WHITE);
		lblEnhaLoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnhaLoc.setBounds(481, 384, 213, 27);
		panel.add(lblEnhaLoc);
		
		JLabel lblEnhaDate = new JLabel("February 4-5, 2023");
		lblEnhaDate.setForeground(Color.WHITE);
		lblEnhaDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnhaDate.setBounds(481, 405, 213, 27);
		panel.add(lblEnhaDate);
		
		JButton btnEnhaBuy = new JButton("BUY TICKETS");
		btnEnhaBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaTiers window = new sticketsEnhaTiers();
				window.frame.setVisible(true);
			}
		});
		btnEnhaBuy.setForeground(new Color(203, 108, 230));
		btnEnhaBuy.setBackground(new Color(255, 255, 255));
		btnEnhaBuy.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEnhaBuy.setBounds(481, 440, 213, 43);
		panel.add(btnEnhaBuy);
		
		JLabel imgHarry = new JLabel("");
		ImageIcon harry = new ImageIcon(this.getClass().getResource("/harry.png"));
		imgHarry.setIcon(harry);
		imgHarry.setBounds(828, 63, 213, 300);
		panel.add(imgHarry);
		
		JLabel lblHarryTitle = new JLabel("Harry Styles: Love on Tour");
		lblHarryTitle.setForeground(Color.WHITE);
		lblHarryTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHarryTitle.setBounds(828, 358, 215, 38);
		panel.add(lblHarryTitle);
		
		JLabel lblHarryLoc = new JLabel("Philippine Arena");
		lblHarryLoc.setForeground(Color.WHITE);
		lblHarryLoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHarryLoc.setBounds(828, 384, 213, 27);
		panel.add(lblHarryLoc);
		
		JLabel lblHarryDate = new JLabel("March 14, 2023");
		lblHarryDate.setForeground(Color.WHITE);
		lblHarryDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHarryDate.setBounds(828, 405, 213, 27);
		panel.add(lblHarryDate);
		
		JButton btnHarryBuy = new JButton("BUY TICKETS");
		btnHarryBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsHarryTiers window = new sticketsHarryTiers();
				window.frame.setVisible(true);
			}
		});
		btnHarryBuy.setForeground(new Color(203, 108, 230));
		btnHarryBuy.setBackground(new Color(255, 255, 255));
		btnHarryBuy.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHarryBuy.setBounds(828, 440, 213, 43);
		panel.add(btnHarryBuy);
	}
}
