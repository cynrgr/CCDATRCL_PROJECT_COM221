import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class sticketsEnhaSeats extends JFrame {
    JFrame frame;
    static int numSelected = 0;
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
//                String royalty = "Royalty Standing A";  // Example section
//                int price = 15000;  // Example price per seat
//                new sticketsEnhaSeats(royalty, price);
            	Map<String, Integer> sectionPrices = new HashMap<>();
                sectionPrices.put("Royalty Standing A", 15000);  // Example section and price
                sectionPrices.put("Royalty Standing B", 15000);
                sectionPrices.put("VIP Standing", 10000);
                sectionPrices.put("VIP Seated 201", 12500);
                sectionPrices.put("VIP Seated 202", 12500);
                sectionPrices.put("VIP Seated 203", 12500);
                sectionPrices.put("VIP Seated 204", 12500);
                sectionPrices.put("VIP Seated 205", 12500);
                sectionPrices.put("VIP Seated 206", 12500);
                sectionPrices.put("LOWER BOX 203", 11000);
                sectionPrices.put("LOWER BOX 204", 11000);
                sectionPrices.put("LOWER BOX 219", 11000);
                sectionPrices.put("LOWER BOX 220", 11000);
                new sticketsEnhaSeats(sectionPrices);
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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JLayeredPane layeredPane = new JLayeredPane();
        frame.getContentPane().add(layeredPane, BorderLayout.NORTH);

        JPanel seatPanel = new JPanel();
        seatPanel.setBounds(0, 0, 586, 297);

        seatButton = new JButton[8][7];
        availableSeats = new LinkedList<>();
        seatPrices = new HashMap<>();
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                seatButton[i][j] = new JButton("Seat " + (i * 7 + j + 1));
                seatButton[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton) e.getSource();
                        if (availableSeats.contains(button)) {
                            // Seat is already booked
                            button.setEnabled(false);
                            availableSeats.remove(button);
                            numSelected--;
                        } else {
                            // Seat is available, book it
                            availableSeats.add(button);
                            button.setEnabled(false);
                            numSelected++;
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
    }

    public sticketsEnhaSeats(Map<String, Integer> sectionPrices) {
		// TODO Auto-generated constructor stub
	}

	private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
    }
        
}
