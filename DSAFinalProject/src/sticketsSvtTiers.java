import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;

public class sticketsSvtTiers {

	JFrame frame;
	private JPanel seatPanel;
	private JButton[][] seatButtons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sticketsSvtTiers window = new sticketsSvtTiers();
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
	public sticketsSvtTiers() {
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
		
		Panel panel = new Panel();
		panel.setBackground(new Color(203, 108, 230));
		panel.setBounds(0, 112, 1178, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel svtSeatsPoster = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/svtseat2.jpg"));
		svtSeatsPoster.setIcon(img);
		svtSeatsPoster.setBounds(26, 76, 291, 400);
		panel.add(svtSeatsPoster);
		
		JLabel lblLogo = new JLabel("");
		ImageIcon logo = new ImageIcon(this.getClass().getResource("/logo.png"));
		lblLogo.setIcon(logo);
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setBounds(0, 0, 170, 106);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblVipGold = new JLabel("VIP GOLD");
		lblVipGold.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVipGold.setForeground(Color.WHITE);
		lblVipGold.setBounds(347, 87, 258, 38);
		panel.add(lblVipGold);

		JButton vipGoldBtn = new JButton("SELECT SEATS");
		vipGoldBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipGoldBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		vipGoldBtn.setEnabled(false);
		vipGoldBtn.setBounds(968, 91, 161, 38);
		panel.add(vipGoldBtn);
		
		JComboBox vipGCbox = new JComboBox();
		vipGCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipGCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "VIP Gold"}));
		vipGCbox.setToolTipText("");
		vipGCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vipGoldBtn.setEnabled(true);
			}
		});
		vipGCbox.setBounds(615, 92, 182, 37);
		panel.add(vipGCbox);
		
		JLabel eventSeatLbl = new JLabel("SEAT PLAN");
		eventSeatLbl.setForeground(Color.WHITE);
		eventSeatLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		eventSeatLbl.setBounds(26, 11, 258, 38);
		panel.add(eventSeatLbl);
		
		JLabel lblTickets = new JLabel("TICKETS");
		lblTickets.setForeground(Color.WHITE);
		lblTickets.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTickets.setBounds(320, 11, 98, 38);
		panel.add(lblTickets);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setForeground(new Color(102, 51, 102));
		lblLocation.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblLocation.setBounds(347, 50, 103, 38);
		panel.add(lblLocation);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(new Color(102, 51, 102));
		lblSection.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblSection.setBounds(615, 50, 103, 38);
		panel.add(lblSection);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(102, 51, 102));
		lblPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblPrice.setBounds(849, 50, 103, 38);
		panel.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(102, 51, 102));
		lblQuantity.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblQuantity.setBounds(968, 50, 103, 38);
		panel.add(lblQuantity);
		
		JLabel lblVipGoldPrice = new JLabel("₱19,000");
		lblVipGoldPrice.setForeground(Color.WHITE);
		lblVipGoldPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVipGoldPrice.setBounds(849, 87, 98, 38);
		panel.add(lblVipGoldPrice);
		
		JLabel lblVipSilver = new JLabel("VIP SILVER");
		lblVipSilver.setForeground(Color.WHITE);
		lblVipSilver.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVipSilver.setBounds(347, 129, 258, 38);
		panel.add(lblVipSilver);
		
		JLabel lblFloorA = new JLabel("FLOOR STANDING A, B, C, D");
		lblFloorA.setForeground(Color.WHITE);
		lblFloorA.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblFloorA.setBounds(347, 173, 258, 38);
		panel.add(lblFloorA);
		
		JLabel lblFloorE = new JLabel("FLOOR STANDING E, F");
		lblFloorE.setForeground(Color.WHITE);
		lblFloorE.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblFloorE.setBounds(347, 217, 258, 38);
		panel.add(lblFloorE);
		
		JLabel lblFloorG = new JLabel("FLOOR STANDING G, H");
		lblFloorG.setForeground(Color.WHITE);
		lblFloorG.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblFloorG.setBounds(347, 261, 258, 38);
		panel.add(lblFloorG);
		
		JLabel lblMid1 = new JLabel("BLEACHERS MID 1");
		lblMid1.setForeground(Color.WHITE);
		lblMid1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblMid1.setBounds(347, 349, 258, 38);
		panel.add(lblMid1);
		
		JLabel lblCenter1 = new JLabel("BLEACHERS CENTER 1");
		lblCenter1.setForeground(Color.WHITE);
		lblCenter1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblCenter1.setBounds(347, 395, 258, 38);
		panel.add(lblCenter1);
		
// VIP STANDING
		JButton vipSilverBtn = new JButton("SELECT SEATS");
		vipSilverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		vipSilverBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipSilverBtn.setEnabled(false);
		vipSilverBtn.setBounds(968, 133, 161, 38);
		panel.add(vipSilverBtn);
		
		JComboBox vipSCbox = new JComboBox();
		vipSCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vipSilverBtn.setEnabled(true);
			}
		});
		vipSCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipSCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "VIP Silver"}));
		vipSCbox.setToolTipText("");
		vipSCbox.setBounds(615, 134, 182, 37);
		panel.add(vipSCbox);
		
// VIP SEATED	
		JButton floorABtn = new JButton("SELECT SEATS");
		floorABtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		floorABtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		floorABtn.setEnabled(false);
		floorABtn.setBounds(968, 175, 161, 38);
		panel.add(floorABtn);
		
		JComboBox floorACbox = new JComboBox();
		floorACbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				floorABtn.setEnabled(true);
			}
		});
		floorACbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		floorACbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "Floor Standing A", "Floor Standing B", "Floor Standing C", "Floor Standing D"}));
		floorACbox.setToolTipText("");
		floorACbox.setBounds(615, 178, 182, 37);
		panel.add(floorACbox);
		
// LOWER BOX
		JButton floorEBtn = new JButton("SELECT SEATS");
		floorEBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		floorEBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		floorEBtn.setEnabled(false);
		floorEBtn.setBounds(968, 219, 161, 38);
		panel.add(floorEBtn);
		
		JComboBox floorECbox = new JComboBox();
		floorECbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				floorEBtn.setEnabled(true);
			}
		});
		floorECbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		floorECbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "Floor Standing E", "Floor Standing F"}));
		floorECbox.setToolTipText("");
		floorECbox.setBounds(615, 222, 182, 37);
		panel.add(floorECbox);
		
// UPPER BOX A
		JButton floorGBtn = new JButton("SELECT SEATS");
		floorGBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		floorGBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		floorGBtn.setEnabled(false);
		floorGBtn.setBounds(968, 263, 161, 38);
		panel.add(floorGBtn);
		
		JComboBox floorGCbox = new JComboBox();
		floorGCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				floorGBtn.setEnabled(true);
			}
		});
		floorGCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		floorGCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "Floor Standing G", "Floor Standing H"}));
		floorGCbox.setToolTipText("");
		floorGCbox.setBounds(615, 266, 182, 37);
		panel.add(floorGCbox);
		
// GENERAL AD
		JButton mid1Btn = new JButton("SELECT SEATS");
		mid1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		mid1Btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mid1Btn.setEnabled(false);
		mid1Btn.setBounds(968, 351, 161, 38);
		panel.add(mid1Btn);
		
		JComboBox mid1Cbox = new JComboBox();
		mid1Cbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mid1Btn.setEnabled(true);
			}
		});
		mid1Cbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mid1Cbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "Bleachers Mid 1 110", "Bleachers Mid 1 111", "Bleachers Mid 1 112", "Bleachers Mid 1 113", "Bleachers Mid 1 130", "Bleachers Mid 1 131", "Bleachers Mid 1 132", "Bleachers Mid 1 133"}));
		mid1Cbox.setToolTipText("");
		mid1Cbox.setBounds(615, 354, 182, 37);
		panel.add(mid1Cbox);
		
// GENERIC AD
		JButton center1Btn = new JButton("SELECT SEATS");
		center1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		center1Btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		center1Btn.setEnabled(false);
		center1Btn.setBounds(968, 397, 161, 38);
		panel.add(center1Btn);
		
		JComboBox center1Cbox = new JComboBox();
		center1Cbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				center1Btn.setEnabled(true);
			}
		});
		center1Cbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		center1Cbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "Bleachers Center 1 114", "Bleachers Center 1 115", "Bleachers Center 1 116", "Bleachers Center 1 117", "Bleachers Center 1 118", "Bleachers Center 1 119", "Bleachers Center 1 120", "Bleachers Center 1 121", "Bleachers Center 1 122", "Bleachers Center 1 123", "Bleachers Center 1 124", "Bleachers Center 1 125", "Bleachers Center 1 126", "Bleachers Center 1 127", "Bleachers Center 1 128", "Bleachers Center 1 129"}));
		center1Cbox.setToolTipText("");
		center1Cbox.setBounds(615, 398, 182, 37);
		panel.add(center1Cbox);
		
// UPPER BOX B
		JLabel lblPremium1 = new JLabel("BLEACHERS PREMIUM 1");
		lblPremium1.setForeground(Color.WHITE);
		lblPremium1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblPremium1.setBounds(347, 305, 258, 38);
		panel.add(lblPremium1);
		
		JButton premium1Btn = new JButton("SELECT SEATS");
		premium1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		premium1Btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		premium1Btn.setEnabled(false);
		premium1Btn.setBounds(968, 307, 161, 38);
		panel.add(premium1Btn);
		
		JComboBox premium1Cbox = new JComboBox();
		premium1Cbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				premium1Btn.setEnabled(true);
			}
		});
		premium1Cbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		premium1Cbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "Bleachers Premium 1 107", "Bleachers Premium 1 108", "Bleachers Premium 1 109", "Bleachers Premium 1 134", "Bleachers Premium 1 135", "Bleachers Premium 1 136"}));
		premium1Cbox.setToolTipText("");
		premium1Cbox.setBounds(615, 310, 182, 37);
		panel.add(premium1Cbox);
		
		JLabel lblVipSilvPrice = new JLabel("₱18,500");
		lblVipSilvPrice.setForeground(Color.WHITE);
		lblVipSilvPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVipSilvPrice.setBounds(849, 129, 98, 38);
		panel.add(lblVipSilvPrice);
		
		JLabel lblFloorAPrice = new JLabel("₱14,750");
		lblFloorAPrice.setForeground(Color.WHITE);
		lblFloorAPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblFloorAPrice.setBounds(849, 173, 98, 38);
		panel.add(lblFloorAPrice);
		
		JLabel lblFloorEPrice = new JLabel("₱14,250");
		lblFloorEPrice.setForeground(Color.WHITE);
		lblFloorEPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblFloorEPrice.setBounds(849, 217, 98, 38);
		panel.add(lblFloorEPrice);
		
		JLabel lblFloorGPrice = new JLabel("₱13,550");
		lblFloorGPrice.setForeground(Color.WHITE);
		lblFloorGPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblFloorGPrice.setBounds(849, 261, 98, 38);
		panel.add(lblFloorGPrice);
		
		JLabel lblPremium1Price = new JLabel("₱11,550");
		lblPremium1Price.setForeground(Color.WHITE);
		lblPremium1Price.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblPremium1Price.setBounds(849, 305, 98, 38);
		panel.add(lblPremium1Price);
		
		JLabel lblMid1Price = new JLabel("₱10,050");
		lblMid1Price.setForeground(Color.WHITE);
		lblMid1Price.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblMid1Price.setBounds(849, 349, 98, 38);
		panel.add(lblMid1Price);
		
		JLabel lblCenter1Price = new JLabel("₱8,550");
		lblCenter1Price.setForeground(Color.WHITE);
		lblCenter1Price.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblCenter1Price.setBounds(849, 395, 98, 38);
		panel.add(lblCenter1Price);
		
// TITLE		
		JLabel enhaConLbl = new JLabel("SEVENTEEN: FOLLOW");
		enhaConLbl.setBounds(445, 27, 377, 61);
		enhaConLbl.setForeground(new Color(204, 0, 255));
		enhaConLbl.setBackground(new Color(255, 255, 255));
		enhaConLbl.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
		frame.getContentPane().add(enhaConLbl);
		
		JLabel svtLocLbl = new JLabel("Philippine Sports Stadium");
		svtLocLbl.setForeground(new Color(204, 0, 255));
		svtLocLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		svtLocLbl.setBackground(Color.WHITE);
		svtLocLbl.setBounds(500, 46, 377, 61);
		frame.getContentPane().add(svtLocLbl);

		
	}
}