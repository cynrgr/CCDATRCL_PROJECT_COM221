import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class sticketsCheckoutPage extends JFrame{

	JFrame frame;
	JLabel txtSec;
	JLabel txtPrice;
	
	
	
	// Declare and initialize userinput
	   
	String section = "";
    String location = "";
    String price = "";
    String userinput = ""; // change this value as needed

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					sticketsCheckoutPage window = new sticketsCheckoutPage();
//					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @paramtotalPrice 
	 * @paramavailableSeats 
	 * @paramselectedSection 
	 * @wbp.parser.entryPoint
	 */
	public sticketsCheckoutPage(String selectedSection, Map<JButton, Integer> selectedSeatsWithPrices) {
		initialize(selectedSection, selectedSeatsWithPrices);
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	
	private void initialize(String selectedSection, Map<JButton, Integer> selectedSeatsWithPrices) {
		StringBuilder sectionBuilder = new StringBuilder();
		StringBuilder priceBuilder = new StringBuilder();
		
		for (Map.Entry<JButton, Integer> entry : selectedSeatsWithPrices.entrySet()) {
			JButton seatButton = entry.getKey();
			int seatPrice = entry.getValue();
			
			sectionBuilder.append(seatButton.getText()).append(", ");
			priceBuilder.append("P").append(seatPrice).append(", ");
			
			String selectedSections = sectionBuilder.toString().replaceAll(", P", "");
			String selectedPrices = priceBuilder.toString().replaceAll(", P", "");
			
			String price = selectedSeatsWithPrices.getOrDefault(sectionBuilder, seatPrice).toString();

	    // Remove the currency symbol and commas
	 	String priceWithoutSymbol = price.replaceAll("[^0-9]", "");

	 	// Parse the remaining string as an integer
	 	int priceInt = Integer.parseInt(priceWithoutSymbol);
	 	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1192, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sticketsMainPage window = new sticketsMainPage();
				window.frame.setVisible(true);
			}
		});
		ImageIcon logo = new ImageIcon(this.getClass().getResource("/logo.png"));
		lblLogo.setIcon(logo);
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setBounds(0, 0, 170, 106);
		frame.getContentPane().add(lblLogo);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(203, 108, 230));
		panel.setBounds(0, 106, 1178, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		// SELECTED TICKETS LABELS
		JLabel lblSelected = new JLabel("Selected tickets");
		lblSelected.setForeground(new Color(64, 0, 128));
		lblSelected.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSelected.setBounds(300, 10, 240, 40);
		panel.add(lblSelected);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setForeground(new Color(64, 0, 128));
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLocation.setBounds(340, 45, 110, 30);
		panel.add(lblLocation);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(new Color(64, 0, 128));
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSection.setBounds(595, 45, 100, 30);
		panel.add(lblSection);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(64, 0, 128));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(850, 45, 70, 30);
		panel.add(lblPrice);
		
		// SELECTED TICKETS INPUT
		JLabel txtLocation = new JLabel("Mall of Asia Arena");
		txtLocation.setForeground(new Color(0, 0, 0));
		txtLocation.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLocation.setBackground(new Color(255, 255, 255));
		txtLocation.setBounds(340, 80, 215, 30);
		panel.add(txtLocation);
		
		txtSec = new JLabel();
		txtSec.setText(selectedSection);
		txtSec.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSec.setBackground(new Color(255, 255, 255));
		txtSec.setBounds(595, 80, 215, 30);
		panel.add(txtSec);
		
		txtPrice = new JLabel();
		txtPrice.setText(price);
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPrice.setBackground(new Color(255, 255, 255));
		txtPrice.setBounds(850, 80, 180, 30);
		panel.add(txtPrice);
		
		// ORDER SUMMARY LABEL
		JLabel lblOrderSummary = new JLabel("Order Summary");
		lblOrderSummary.setForeground(new Color(64, 0, 128));
		lblOrderSummary.setBackground(new Color(203, 108, 230));
		lblOrderSummary.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblOrderSummary.setBounds(300, 110, 250, 40);
		panel.add(lblOrderSummary);
		
		// ORDER SUMMARY INPUT
		JLabel txtEvent = new JLabel();
		txtEvent.setText("ENHYPEN: MANIFESTO");
		txtEvent.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEvent.setBackground(new Color(255, 255, 255));
		txtEvent.setBounds(340, 145, 500, 35);
		panel.add(txtEvent);
		
		JLabel txtEventDate = new JLabel();
		txtEventDate.setText("February 4-5, 2023");
		txtEventDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEventDate.setBackground(new Color(255, 255, 255));
		txtEventDate.setBounds(340, 170, 250, 25);
		panel.add(txtEventDate);
		
		JLabel txtSection = new JLabel();
		txtSection.setText(selectedSection);
		txtSection.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSection.setBackground(new Color(255, 255, 255));
		txtSection.setBounds(340, 240, 250, 30);
		panel.add(txtSection);
		
		JLabel txtSecPrice = new JLabel();
		txtSecPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSecPrice.setBackground(new Color(255, 255, 255));
		txtSecPrice.setText(sticketsEnhaSeats.numSelected + " x " + (Integer.parseInt(price)/sticketsEnhaSeats.numSelected));
		txtSecPrice.setBounds(630, 240, 170, 30);
		panel.add(txtSecPrice);
		
		JLabel txtFinalPrice = new JLabel();
		txtFinalPrice.setText(price);
		txtFinalPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFinalPrice.setBackground(new Color(255, 255, 255));
		txtFinalPrice.setBounds(845, 240, 170, 30);
		panel.add(txtFinalPrice);
		
		// ONLINE FEE LABEL AND INPUT
		JLabel lblOnlineFee = new JLabel("Online Fee");
		lblOnlineFee.setForeground(new Color(64, 0, 128));
		lblOnlineFee.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOnlineFee.setBounds(340, 295, 115, 20);
		panel.add(lblOnlineFee);
		
		JLabel txtOlFee = new JLabel();
		txtOlFee.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtOlFee.setText(sticketsEnhaSeats.numSelected + " x  ₱ 100.00");
		txtOlFee.setBackground(new Color(255, 255, 255));
		txtOlFee.setBounds(630, 290, 150, 30);
		panel.add(txtOlFee);
		
		JLabel txtFinalOl = new JLabel();
		txtFinalOl.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFinalOl.setText("₱ " + sticketsEnhaSeats.numSelected * 100);
		txtFinalOl.setBackground(new Color(255, 255, 255));
		txtFinalOl.setBounds(845, 290, 150, 30);
		panel.add(txtFinalOl);
		
		// TOTAL TICKET PRICE LABEL AND INPUT
		JLabel lblTotalPrice = new JLabel("Total Ticket Price");
		lblTotalPrice.setForeground(new Color(64, 0, 128));
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalPrice.setBounds(340, 340, 180, 20);
		panel.add(lblTotalPrice);
		
		JLabel txtTixPrice = new JLabel();
		txtTixPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTixPrice.setText("₱" + (priceInt + (sticketsEnhaSeats.numSelected * 100)));
		txtTixPrice.setBackground(new Color(255, 255, 255));
		txtTixPrice.setBounds(630, 335, 150, 29);
		panel.add(txtTixPrice);
		
		
		// PAYMENT LABEL
		JLabel lblPayment = new JLabel("Choose Payment Method");
		lblPayment.setForeground(new Color(64, 0, 128));
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPayment.setBounds(300, 370, 300, 40);
		panel.add(lblPayment);
		
		JLabel lblVisa = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/rsz_visa.png")).getImage();
		lblVisa.setIcon(new ImageIcon(img));
		lblVisa.setBounds(365, 410, 197, 65);
		panel.add(lblVisa);
		
		JLabel lblGCash = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/rsz_gcash.png")).getImage();
		lblGCash.setIcon(new ImageIcon(img1));
		lblGCash.setBounds(610, 422, 120, 40);
		panel.add(lblGCash);
		
		JLabel lblMaya = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/rsz_maya.jpg")).getImage();
		lblMaya.setIcon(new ImageIcon(img2));
		lblMaya.setBounds(780, 410, 150, 65);
		panel.add(lblMaya);
		
		JRadioButton radioBtnGCash = new JRadioButton("");
		radioBtnGCash.setBackground(new Color(203, 108, 230));
		radioBtnGCash.setBounds(590, 432, 20, 20);
		panel.add(radioBtnGCash);
		
		JRadioButton radioBtnVisa = new JRadioButton("");
		radioBtnVisa.setBackground(new Color(203, 108, 230));
		radioBtnVisa.setBounds(344, 432, 20, 20);
		panel.add(radioBtnVisa);
		
		JRadioButton radioBtnMaya = new JRadioButton("");
		radioBtnMaya.setBackground(new Color(203, 108, 230));
		radioBtnMaya.setBounds(760, 432, 20, 20);
		panel.add(radioBtnMaya);
		
		// TEXT AREAS
		JTextArea txtAreaNotice = new JTextArea();
		txtAreaNotice.setForeground(new Color(255, 255, 255));
		txtAreaNotice.setWrapStyleWord(true);
		txtAreaNotice.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtAreaNotice.setBackground(new Color(203, 108, 230));
		txtAreaNotice.setText("NOTICE TO ALL ONLINE  CUSTOMERS:");
		txtAreaNotice.setLineWrap(true);
		txtAreaNotice.setBounds(20, 20, 200, 50);
		panel.add(txtAreaNotice);
		
		JTextArea txtAreaGuidelines = new JTextArea();
		txtAreaGuidelines.setForeground(new Color(255, 255, 255));
		txtAreaGuidelines.setText("Guidelines for Online Ticket Purchase.");
		txtAreaGuidelines.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAreaGuidelines.setBackground(new Color(203, 108, 230));
		txtAreaGuidelines.setLineWrap(true);
		txtAreaGuidelines.setWrapStyleWord(true);
		txtAreaGuidelines.setBounds(20, 80, 200, 50);
		panel.add(txtAreaGuidelines);
		
		JTextArea txtAreaDetails = new JTextArea();
		txtAreaDetails.setWrapStyleWord(true);
		txtAreaDetails.setText("To protect all users from fraud and unintended misuse of credit cards, please note that the following should ALL bear the SAME NAME when buying tickets online: ");
		txtAreaDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAreaDetails.setBounds(20, 130, 200, 78);
		txtAreaDetails.setForeground(new Color(255, 255, 255));
		txtAreaDetails.setBackground(new Color(203, 108, 230));
		txtAreaDetails.setLineWrap(true);
		panel.add(txtAreaDetails);
		
		JTextArea txtAreaUsers = new JTextArea();
		txtAreaUsers.setWrapStyleWord(true);
		txtAreaUsers.setText("1. Stickets user account \n2. Credit card to be used \n3. One (1) valid government ID to be presented for redemption "
				+ "\n\nTicket redemption through a representative is NOT allowed. Only the cardholder who transacted online can redeem the ticket. To avoid any inconvenience, we request our patrons to comply with the above guidelines. The safety and security of our customers is always our top priority. By proceeding to payment, you agree with the above redemption process. Price is inclusive of standard ticket charges.");
		txtAreaUsers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAreaUsers.setBounds(20, 210, 200, 275);
		txtAreaUsers.setForeground(new Color(255, 255, 255));
		txtAreaUsers.setBackground(new Color(203, 108, 230));
		txtAreaUsers.setLineWrap(true);
		panel.add(txtAreaUsers);
		
		JLabel checkout = new JLabel("CHECKOUT");
		checkout.setBounds(445, 30, 377, 61);
		checkout.setForeground(new Color(204, 0, 255));
		checkout.setBackground(new Color(255, 255, 255));
		checkout.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
		frame.getContentPane().add(checkout);
	
		
		}
	}

	
}
