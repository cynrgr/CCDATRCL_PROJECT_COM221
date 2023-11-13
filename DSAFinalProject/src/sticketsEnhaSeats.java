import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class sticketsEnhaSeats extends JFrame {
    JFrame frame;
    private JButton[][] seatButton;
    private LinkedList<JButton> availableSeats;
    private JButton confirmButton;
//    private static String selectedSection;
//    private static int price;
    private Map<JButton, Integer> seatPrices;
    private Map<JButton, Integer> selectedSeatsWithPrices;

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                String selectedSection1 = "Royalty Standing A";  // Example section
                int price = 15000;  // Example price per seat
                new sticketsEnhaSeats(selectedSection1, price);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * @wbp.parser.entryPoint
     */
    public sticketsEnhaSeats(String selectedSection, int price) {
        initialize();
//    	sticketsEnhaSeats.selectedSection = selectedSection;
//        sticketsEnhaSeats.price = price;
//        initialize();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JLayeredPane layeredPane = new JLayeredPane();
        frame.getContentPane().add(layeredPane, BorderLayout.NORTH);

        JPanel seatPanel = new JPanel();
        seatPanel.setBounds(0, 0, 586, 297);

        seatButton = new JButton[8][7];
        availableSeats = new LinkedList<>();
        seatPrices = new HashMap<>();
        
        
//        JButton checkout = new JButton("PROCEED TO CHECKOUT");
        
        

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                seatButton[i][j] = new JButton("Seat " + (i * 7 + j + 1));
                seatButton[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton) e.getSource();
                        if (availableSeats.contains(button)) {
                            // Seat is already booked
                            button.setEnabled(true);
                            availableSeats.remove(button);
                        } else {
                            // Seat is available, book it
                            availableSeats.add(button);
                            button.setEnabled(false);
                        }
                    }
                });
                seatPanel.add(seatButton[i][j]);
            }
        }

        seatButton[1][2].setEnabled(false);
        seatButton[1][3].setEnabled(false);
        seatButton[3][5].setEnabled(false);
        seatButton[3][6].setEnabled(false);

        frame.getContentPane().add(seatPanel, BorderLayout.CENTER);

        confirmButton = new JButton("Confirm");
        confirmButton.setVerticalAlignment(SwingConstants.BOTTOM);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                int remainingSeats = seatButton.length * seatButton[0].length - availableSeats.size() - 4;
                String message = "Selected Seats:\n";
                int totalPrice = price * availableSeats.size();

                selectedSeatsWithPrices = new HashMap<>();
//                selectedSeatsWithPrices.put(, totalPrice);

                for (JButton seat : availableSeats) {
                    message += seat.getText() + "\n";
                    selectedSeatsWithPrices.put(seat, totalPrice);
                }

                message += "\nRemaining Seats: " + remainingSeats + "\nTotal Price: P" + (totalPrice);
                JOptionPane.showMessageDialog(frame, message);

                // Pass the data to sticketsCheckoutPage
                sticketsCheckoutPage window = new sticketsCheckoutPage(selectedSection, selectedSeatsWithPrices);
                window.frame.setVisible(true);
            }
        });

        frame.getContentPane().add(confirmButton, BorderLayout.SOUTH);
        frame.setVisible(true);
        
        
//        checkout.setVerticalAlignment(SwingConstants.BOTTOM);
//        checkout.setEnabled(true);
//        checkout.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
///* sticketsCheckoutPage window = new sticketsCheckoutPage(selectedSection, seatPrices);
//			window.frame.setVisible(true); */
//				sticketsCheckoutPage window = new sticketsCheckoutPage(selectedSection, selectedSeatsWithPrices);
//                window.frame.setVisible(true);
//		
//				sticketsCheckout();
//		
//			}
//		});
//        checkout.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        //checkout.setBounds(968, 307, 161, 38);
//		seatPanel.add(checkout);
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
//    public void sticketsCheckout() {
//
//    	sticketsCheckoutPage SticketsCheckoutPage = new sticketsCheckoutPage(this);
//    	SticketsCheckoutPage.setVisible(true);
//    	
//    }
        
}
