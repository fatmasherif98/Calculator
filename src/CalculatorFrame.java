import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;

public class CalculatorFrame  {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame window = new CalculatorFrame();
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
	public CalculatorFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 421, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(25, 11, 345, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(331, 249, 48, 48);
		frame.getContentPane().add(btnClear);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setLocation(99, 73);
		btn1.setSize(48, 48);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setLocation(157, 73);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setSize(48, 48);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setLocation(215, 73);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setSize(48, 48);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setLocation(99, 132);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setSize(48, 48);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setLocation(157, 132);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setSize(48, 48);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setLocation(215, 132);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setSize(48, 48);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
			
		});
		btn7.setLocation(99, 192);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setSize(48, 48);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setLocation(157, 192);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setSize(48, 48);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setLocation(215, 192);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setSize(48, 48);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setLocation(99, 249);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setSize(48, 48);
		frame.getContentPane().add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setLocation(157, 249);
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPoint.setSize(48, 48);
		frame.getContentPane().add(btnPoint);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(215, 249, 48, 48);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(41, 73, 48, 48);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtract.setBounds(41, 132, 48, 48);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(41, 192, 48, 48);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(41, 249, 48, 48);
		frame.getContentPane().add(btnDivide);
		
		JButton btnUp = new JButton("U");
		btnUp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUp.setBounds(273, 73, 48, 48);
		frame.getContentPane().add(btnUp);
		
		JButton btnDown = new JButton("D");
		btnDown.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDown.setBounds(273, 132, 48, 48);
		frame.getContentPane().add(btnDown);
		
		JButton btnLeft = new JButton("L");
		btnLeft.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLeft.setBounds(273, 192, 48, 48);
		frame.getContentPane().add(btnLeft);
		
		JButton btnRight = new JButton("R");
		btnRight.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRight.setBounds(273, 249, 48, 48);
		frame.getContentPane().add(btnRight);
	}
}
