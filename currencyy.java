import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class currencyy extends JFrame {

    private JTextField jtxtAmount;
    private JTextField jtxtAmountConverted;
    private JComboBox<String> jFromCurrency;
    private JComboBox<String> jToCurrency;

    public currencyy() {
        setTitle("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 420);
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(new Color(242, 245, 249));
        setContentPane(contentPanel);

        Color accent = new Color(30, 144, 255);

        JLabel lblTitle = new JLabel("Currency Converter");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 38));
        lblTitle.setForeground(accent);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblAmount = new JLabel("Amount");
        JLabel lblFromCurrency = new JLabel("From Currency");
        JLabel lblToCurrency = new JLabel("To Currency");
        JLabel lblAmountConverted = new JLabel("Amount Converted");
        for (JLabel lbl : new JLabel[]{lblAmount, lblFromCurrency, lblToCurrency, lblAmountConverted}) {
            lbl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            lbl.setForeground(new Color(33, 44, 50));
        }

        jtxtAmount = new JTextField(12);
        jtxtAmount.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jtxtAmount.setToolTipText("Enter amount to convert");

        jtxtAmountConverted = new JTextField(12);
        jtxtAmountConverted.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jtxtAmountConverted.setEditable(false);
        jtxtAmountConverted.setToolTipText("Converted amount will appear here");

        String[] currencies = {"KWD-Kuwaiti Dinar", "BHD-Baharaini Dinar", "USD-United States Dollar",
                "CHF-Swiss Franc", "AUD-Australian", "INR-Indian Rupee"};
        jFromCurrency = new JComboBox<>(currencies);
        jFromCurrency.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jFromCurrency.setSelectedIndex(2);
        jFromCurrency.setToolTipText("Select the source currency");

        jToCurrency = new JComboBox<>(currencies);
        jToCurrency.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jToCurrency.setSelectedIndex(5);
        jToCurrency.setToolTipText("Select the destination currency");

        JButton btnConvert = createAccentButton("Convert", accent);
        JButton btnReset = createAccentButton("Reset", accent);
        JButton btnExit = createAccentButton("Exit", accent);

        btnConvert.setToolTipText("Convert currency");
        btnReset.setToolTipText("Clear all fields");
        btnExit.setToolTipText("Quit the application");

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(255,255,255));
        mainPanel.setBorder(new EmptyBorder(16, 16, 16, 16));

        GroupLayout layout = new GroupLayout(mainPanel);
        mainPanel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(255,255,255));
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));
        btnConvert.setPreferredSize(new Dimension(120,40));
        btnReset.setPreferredSize(new Dimension(120,40));
        btnExit.setPreferredSize(new Dimension(120,40));
        buttonPanel.add(btnConvert);
        buttonPanel.add(btnReset);
        buttonPanel.add(btnExit);

        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(lblTitle)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAmount)
                        .addComponent(lblFromCurrency)
                        .addComponent(lblToCurrency)
                        .addComponent(lblAmountConverted)
                    )
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jtxtAmount)
                        .addComponent(jFromCurrency)
                        .addComponent(jToCurrency)
                        .addComponent(jtxtAmountConverted)
                    )
                )
                .addComponent(buttonPanel)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(15)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(jtxtAmount)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFromCurrency)
                    .addComponent(jFromCurrency)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToCurrency)
                    .addComponent(jToCurrency)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmountConverted)
                    .addComponent(jtxtAmountConverted)
                )
                .addGap(20)
                .addComponent(buttonPanel)
        );
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(mainPanel, BorderLayout.CENTER);

        btnConvert.addActionListener(e -> {
            String amountText = jtxtAmount.getText();
            if (containsAlphabet(amountText)) {
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid positive number.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    double amount = Double.parseDouble(jtxtAmount.getText());

                    if (amount <= 0) {
                        JOptionPane.showMessageDialog(this, "Amount must be positive!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    String fromCur = (String) jFromCurrency.getSelectedItem();
                    String toCur = (String) jToCurrency.getSelectedItem();

                    long startTime = System.nanoTime();
                    double rate = getLiveRate(fromCur, toCur);
                    long endTime = System.nanoTime();

                    if (rate == 0.0) {
                        JOptionPane.showMessageDialog(this, "Could not retrieve live exchange rate. Check internet connection or try again.", "Error", JOptionPane.ERROR_MESSAGE);
                        jtxtAmountConverted.setText("");
                        return;
                    }

                    double tot = amount * rate;

                    long duration = endTime - startTime;
                    System.out.println("Conversion took " + duration / 1_000_000 + " milliseconds");
                    jtxtAmountConverted.setText(String.format("%.4f", tot));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid positive number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnReset.addActionListener(e -> {
            jtxtAmount.setText("");
            jtxtAmountConverted.setText("");
            jFromCurrency.setSelectedIndex(2);
            jToCurrency.setSelectedIndex(5);
        });

        btnExit.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(this, "Confirm if you want to exit", "Currency Converter", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }

    private JButton createAccentButton(String text, Color accent) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btn.setBackground(accent);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(new RoundedBorder(18, accent));
        return btn;
    }

    private boolean containsAlphabet(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) return true;
        }
        return false;
    }

    private String currencyCode(String str) {
        if (str.startsWith("USD")) return "USD";
        if (str.startsWith("INR")) return "INR";
        if (str.startsWith("KWD")) return "KWD";
        if (str.startsWith("BHD")) return "BHD";
        if (str.startsWith("CHF")) return "CHF";
        if (str.startsWith("AUD")) return "AUD";
        return "USD";
    }
    private double getLiveRate(String from, String to) {
    try {
        String fromCode = currencyCode(from);
        String toCode = currencyCode(to);
        String apiUrl = "https://api.frankfurter.app/latest?amount=1&from=" + fromCode + "&to=" + toCode;
        
        java.net.URI uri = java.net.URI.create(apiUrl);
        java.net.URL url = uri.toURL();

        java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream()));
        String inputLine, response = "";
        while ((inputLine = in.readLine()) != null)
            response += inputLine;
        in.close();
        
        int idx = response.indexOf(toCode);
        if (idx != -1) {
            String part = response.substring(idx);
            String[] tokens = part.split(":");
            String val = tokens[1].replaceAll("[^0-9.]", "");
            return Double.parseDouble(val);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0.0;
}


    static class RoundedBorder extends LineBorder {
        public RoundedBorder(int radius, Color color) {
            super(color, 1, true);
            this.radius = radius;
        }
        private int radius;
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(lineColor);
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            currencyy frame = new currencyy();
            frame.setVisible(true);
        });
    }
}
