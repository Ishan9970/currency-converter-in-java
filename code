package ishan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class currencyy extends JFrame implements ActionListener {
	private JTextField jtxtAmount;
	private JTextField jtxtAmountConverted;
    currencyy()
 {
        setSize(1174,527);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 128, 255));
        panel.setBorder(new LineBorder(new Color(0, 128, 255), 10, true));
        panel.setBounds(10, 10, 1125, 75);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Currency Converter");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 52));
        lblNewLabel.setBounds(255, 10, 563, 55);
        panel.add(lblNewLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 128, 255), 10, true));
        panel_1.setBounds(10, 91, 1125, 228);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Amount");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblNewLabel_1.setBounds(53, 26, 192, 43);
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("From Currency");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblNewLabel_1_1.setBounds(47, 87, 281, 43);
        panel_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("To Currency");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblNewLabel_1_2.setBounds(52, 157, 293, 43);
        panel_1.add(lblNewLabel_1_2);
        
        jtxtAmount = new JTextField();
        jtxtAmount.setFont(new Font("Tahoma", Font.PLAIN, 30));
        jtxtAmount.setBounds(381, 26, 622, 36);
        panel_1.add(jtxtAmount);
        jtxtAmount.setColumns(10);
        
        JComboBox jFromCurrency = new JComboBox();
        jFromCurrency.setFont(new Font("Tahoma", Font.PLAIN, 30));
        jFromCurrency.setModel(new DefaultComboBoxModel(new String[] {"KWD-Kuwaiti Dinar", "BHD-Baharaini Dinar", "USD-United States Dollar", "CHF-Swiss Franc", "AUD-Australian", "INR-Indian Rupee"}));
        jFromCurrency.setBounds(381, 91, 623, 43);
        panel_1.add(jFromCurrency);
        
        JComboBox jToCurrency = new JComboBox();
        jToCurrency.setFont(new Font("Tahoma", Font.PLAIN, 30));
        jToCurrency.setModel(new DefaultComboBoxModel(new String[] {"KWD-Kuwaiti Dinar", "BHD-Baharaini Dinar", "USD-United States Dollar", "CHF-Swiss Franc", "AUD-Australian", "INR-Indian Rupee"}));
        jToCurrency.setBounds(380, 164, 623, 36);
        panel_1.add(jToCurrency);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 128, 255), 10, true));
        panel_2.setBounds(10, 411, 1125, 69);
        getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JButton btnNewButton = new JButton("Convert");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource() == btnNewButton)
        		{
        			String amountText = jtxtAmount.getText();
          			 if (containsAlphabet(amountText)) {
                           JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                       }
          			 else
          			 {
          				 try {
          				 Double tot; 
                Double amount = Double.parseDouble(jtxtAmount.getText());
                
                if(jFromCurrency.getSelectedItem().toString() == "USD-United States Dollar" && jToCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar")
                {
                    tot = amount * 0.31;
                   jtxtAmountConverted.setText(tot.toString());
                }
               else  if(jFromCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar" && jToCurrency.getSelectedItem().toString() == "USD-United States Dollar")
                {
                    tot = amount * 3.27;
                    jtxtAmountConverted.setText(tot.toString());
                } 
               else  if(jFromCurrency.getSelectedItem().toString() == "USD-United States Dollar" && jToCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar")
               {
                   tot = amount * 0.38;
                   jtxtAmountConverted.setText(tot.toString());
               }  
               else  if(jFromCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar" && jToCurrency.getSelectedItem().toString() == "USD-United States Dollar")
               {
                   tot = amount * 2.65;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "USD-United States Dollar" && jToCurrency.getSelectedItem().toString() == "CHF-Swiss Franc")
               {
                   tot = amount * 0.90;
                   jtxtAmountConverted.setText(tot.toString());
               }  
               else  if(jFromCurrency.getSelectedItem().toString() == "CHF-Swiss Franc" && jToCurrency.getSelectedItem().toString() == "USD-United States Dollar")
               {
                   tot = amount * 1.12;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "USD-United States Dollar" && jToCurrency.getSelectedItem().toString() == "AUD-Australian")
               {
                   tot = amount * 1.48;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "AUD-Australian" && jToCurrency.getSelectedItem().toString() == "USD-United States Dollar")
               {
                   tot = amount * 0.68;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "USD-United States Dollar" && jToCurrency.getSelectedItem().toString() == "INR-Indian Rupee")
               {
                   tot = amount * 83.50;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "INR-Indian Rupee" && jToCurrency.getSelectedItem().toString() == "USD-United States Dollar")
               {
                   tot = amount * 0.012;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar" && jToCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar")
               {
                   tot = amount * 1.23;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar" && jToCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar")
               {
                   tot = amount * 0.81;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar" && jToCurrency.getSelectedItem().toString() == "CHF-Swiss Franc")
               {
                   tot = amount * 2.93;
                   jtxtAmountConverted.setText(tot.toString());
               }  
               else  if(jFromCurrency.getSelectedItem().toString() == "CHF-Swiss Franc" && jToCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar")
               {
                   tot = amount * 0.34;
                   jtxtAmountConverted.setText(tot.toString());
               } 
               else  if(jFromCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar" && jToCurrency.getSelectedItem().toString() == "INR-Indian Rupee")
               {
                   tot = amount * 272.71;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "INR-Indian Rupee" && jToCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar")
               {
                   tot = amount * 0.0037;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar" && jToCurrency.getSelectedItem().toString() == "AUD-Australian")
               {
                   tot = amount * 4.84;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "AUD-Australian" && jToCurrency.getSelectedItem().toString() == "KWD-Kuwaiti Dinar")
               {
                   tot = amount * 0.21;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar" && jToCurrency.getSelectedItem().toString() == "CHF-Swiss Franc")
               {
                   tot = amount * 2.42;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "CHF-Swiss Franc" && jToCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar")
               {
                   tot = amount * 0.43;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar" && jToCurrency.getSelectedItem().toString() == "INR-Indian Rupee")
               {
                   tot = amount * 225.90;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "INR-Indian Rupee" && jToCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar")
               {
                   tot = amount * 0.0045;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar" && jToCurrency.getSelectedItem().toString() == "AUD-Australian")
               {
                   tot = amount * 3.93;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "AUD-Australian" && jToCurrency.getSelectedItem().toString() == "BHD-Baharaini Dinar")
               {
                   tot = amount * 0.25;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "CHF-Swiss Franc" && jToCurrency.getSelectedItem().toString() == "INR-Indian Rupee")
               {
                   tot = amount * 93.16;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "INR-Indian Rupee" && jToCurrency.getSelectedItem().toString() == "CHF-Swiss Franc")
               {
                   tot = amount * 0.011;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "CHF-Swiss Franc" && jToCurrency.getSelectedItem().toString() == "AUD-Australian")
               {
                   tot = amount * 1.65;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "AUD-Australian" && jToCurrency.getSelectedItem().toString() == "CHF-Swiss Franc")
               {
                   tot = amount * 0.61;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "INR-Indian Rupee" && jToCurrency.getSelectedItem().toString() == "AUD-Australian")
               {
                   tot = amount * 0.018;
                   jtxtAmountConverted.setText(tot.toString());
               }
               else  if(jFromCurrency.getSelectedItem().toString() == "AUD-Australian" && jToCurrency.getSelectedItem().toString() == "INR-Indian Rupee")
               {
                   tot = amount * 56.35;
                   jtxtAmountConverted.setText(tot.toString());
               }
        	}
          				catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
           			 }
        }}}});
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
        btnNewButton.setBounds(130, 21, 163, 32);
        panel_2.add(btnNewButton);
        
        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource()==btnReset)
        		{
        			jtxtAmount.setText("");
        			jtxtAmountConverted.setText("");
        			jFromCurrency.setSelectedIndex(-1);
        			jToCurrency.setSelectedIndex(-1);
        			
        		}
        	}
        });
        btnReset.setFont(new Font("Tahoma", Font.PLAIN, 30));
        btnReset.setBounds(442, 21, 163, 32);
        panel_2.add(btnReset);
        
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource()==btnExit)
        		{
        			JFrame frame = new JFrame("Exit");
        			if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit","Currency Converter", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        			{
        			System.exit(0);
        		}
        	}
        	}});
        btnExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
        btnExit.setBounds(785, 21, 163, 32);
        panel_2.add(btnExit);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 128, 255), 10, true));
        panel_3.setBounds(10, 325, 1125, 80);
        getContentPane().add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_1_3 = new JLabel("Amount Converted");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 36));
        lblNewLabel_1_3.setBounds(47, 10, 317, 50);
        panel_3.add(lblNewLabel_1_3);
        
        jtxtAmountConverted = new JTextField();
        jtxtAmountConverted.setFont(new Font("Tahoma", Font.PLAIN, 30));
        jtxtAmountConverted.setColumns(10);
        jtxtAmountConverted.setBounds(402, 21, 613, 33);
        panel_3.add(jtxtAmountConverted);
    }
    private boolean containsAlphabet(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                return true;
            }
        }
        return false;
    }
 
    
    public static void main(String[] args) {
        new currencyy();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
