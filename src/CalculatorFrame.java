import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import java.util.StringTokenizer;

public class CalculatorFrame {

	private JFrame frame;
	private JTextField textField;

	Calculator cal = new Calculator();

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

	double firstNum;
	double SecondNum;
	String firstNumS;
	String result;
	String operations;
	String answer;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 347, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(20, 11, 291, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setLocation(77, 274);
		btn1.setSize(55, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setLocation(134, 274);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setSize(55, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setLocation(191, 274);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setSize(55, 50);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setLocation(77, 225);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setSize(55, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setLocation(134, 225);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setSize(55, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setLocation(191, 225);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setSize(55, 50);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}

		});
		btn7.setLocation(77, 170);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setSize(55, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setLocation(134, 170);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setSize(55, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setLocation(191, 170);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setSize(55, 50);
		frame.getContentPane().add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setLocation(20, 274);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setSize(55, 50);
		frame.getContentPane().add(btn0);

		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btnPoint.getText();
				textField.setText(EnterNumber);
			}
		});
		btnPoint.setLocation(20, 115);
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPoint.setSize(55, 50);
		frame.getContentPane().add(btnPoint);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String warningMessage;
				warningMessage = cal.checkingExpression(textField.getText(), firstNumS);

				if (warningMessage == null) {

					try {
						String temp = textField.getText();
						StringTokenizer st = new StringTokenizer(temp, "+/*-");
						st.nextToken();
						String secNumtemp = st.nextToken();

						SecondNum = Double.parseDouble(secNumtemp);
						SecondNum = cal.negativeNumber(temp, firstNumS, SecondNum);
						if (operations.equals("/") && (SecondNum == 0)) {
							if (firstNum == 0)
								warningMessage = "Undefined!";
							else
								warningMessage = "Math Error!";
						} else {
							double ans = cal.Operations(firstNum, SecondNum, operations);
							result = Double.toString(ans);
							result = "=" + result;
							String EnterNumber = textField.getText() + result;
							textField.setText(EnterNumber);
							cal.history(EnterNumber);
						}

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(frame, "Invalid Input");
					}
				}
				if (warningMessage != null) {
					if (warningMessage == "special case") {
						String screen = textField.getText();
						screen = screen + "=" + screen;
						textField.setText(screen);
						cal.history(screen);
					} else {
						JOptionPane.showMessageDialog(frame, warningMessage);
					}
				}

			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(134, 115, 112, 50);
		frame.getContentPane().add(btnEqual);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = true;

				check = cal.checkingInput(textField.getText());
				if (check) {
					firstNumS = textField.getText();
					firstNum = Double.parseDouble(firstNumS);
					operations = "+";
					String EnterNumber = textField.getText() + btnPlus.getText();
					textField.setText(EnterNumber);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid input, please enter only one operator.");
				}

			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlus.setBounds(256, 225, 55, 50);
		frame.getContentPane().add(btnPlus);

		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean check = true;
				check = cal.checkingInput(textField.getText());
				if (check) {

					firstNumS = textField.getText();
					firstNum = Double.parseDouble(firstNumS);

					operations = "-";

					String EnterNumber = textField.getText() + btnSubtract.getText();
					textField.setText(EnterNumber);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid input, please enter only one operator.");
				}

			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtract.setBounds(256, 274, 55, 50);
		frame.getContentPane().add(btnSubtract);

		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = true;
				check = cal.checkingInput(textField.getText());
				if (check) {
					firstNumS = textField.getText();
					firstNum = Double.parseDouble(firstNumS);
					operations = "*";
					String EnterNumber = textField.getText() + btnMultiply.getText();
					textField.setText(EnterNumber);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid input, please enter only one operator");
				}
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(20, 170, 55, 50);
		frame.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = true;
				check = cal.checkingInput(textField.getText());
				if (check) {
					firstNumS = textField.getText();
					firstNum = Double.parseDouble(firstNumS);
					operations = "/";

					String EnterNumber = textField.getText() + btnDivide.getText();
					textField.setText(EnterNumber);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid input, please enter only one operator");
				}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(20, 225, 55, 50);
		frame.getContentPane().add(btnDivide);

		JButton btnLeft = new JButton("\u2190");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;

				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backspace = str.toString();
					textField.setText(backspace);
				}

			}
		});
		btnLeft.setFont(new Font("Arial", Font.BOLD, 21));
		btnLeft.setBounds(20, 60, 55, 50);
		frame.getContentPane().add(btnLeft);

		JButton btnUp = new JButton("\u2191");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = cal.previous();
				if (s1 != null) {
					textField.setText(s1);
					btnLeft.setEnabled(false);

				} else
					JOptionPane.showMessageDialog(frame, "There is no more previous history");
			}
		});
		btnUp.setFont(new Font("Arial", Font.BOLD, 25));
		btnUp.setBounds(77, 60, 55, 50);
		frame.getContentPane().add(btnUp);

		JButton btnDown = new JButton("\u2193");
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = cal.next();
				if (s1 != null) {
					textField.setText(s1);
					btnLeft.setEnabled(false);

				} else
					JOptionPane.showMessageDialog(frame, "There is no more history");
			}

		});
		btnDown.setFont(new Font("Arial", Font.BOLD, 25));
		btnDown.setBounds(77, 115, 55, 50);
		frame.getContentPane().add(btnDown);

		JButton btnve = new JButton("\u00B1");
		btnve.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + "-";
				textField.setText(EnterNumber);
			}
		});
		btnve.setBounds(256, 170, 55, 50);
		frame.getContentPane().add(btnve);

		JButton btnCurrent = new JButton("current");
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String current = cal.current();
				if (current != null) {
					textField.setText(current);
					btnLeft.setEnabled(false);
				} else
					JOptionPane.showMessageDialog(frame, "There is no current equation");
			}
		});
		btnCurrent.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 18));
		btnCurrent.setBounds(134, 60, 177, 50);
		frame.getContentPane().add(btnCurrent);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(null);
				btnLeft.setEnabled(true);
				firstNumS = null;

			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(256, 115, 55, 50);
		frame.getContentPane().add(btnClear);
	}
}
