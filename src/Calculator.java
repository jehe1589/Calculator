import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

/**
 * 
 * @Author: Jerker Hedenström
 * 
 * MANUAL
 * 
 * Calculator for simple equations involving two numbers. Input first number and select desired operation.
 * Then select the second number and press button '=' for results. Clear the text field and text display
 * with button 'C' before next operation. Parentheses are generated but not usable due to 
 * NumberFormatExceptions
 *
 */

public class Calculator {

	private JFrame window;
	private JTextField textField, textDisplay;
	private JButton button_0, button_1, button_2, button_3,
	                button_4, button_5, button_6, button_7,
	                button_8, button_9, button_addition,
	                button_subtraction, button_multiplication,
	                button_division, button_dot, button_clear,
	                button_backspace, button_left_parenthesis,
	                button_right_parenthesis, button_equals;
	private char operation;
	private double firstNum;
	private double secondNum;
	private double result;
	private String output;

	public static void main(String[] args) {                                        //CREATE THE WINDOW
		
		Calculator calc = new Calculator();
		calc.window.setVisible(true);
	}

	public Calculator() {                                                           //CONSTRUCTOR
		initialize();
	}

	private void initialize() {                                                     //INITIALIZATION
		
		window = new JFrame("Calculator");                                          //FRAME
		window.setBounds(100, 100, 253, 356);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		textField = new JTextField("");                                             //TEXT FIELD
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 36, 218, 30);
		textField.setColumns(10);
		textField.setEditable(false);
		window.getContentPane().add(textField);
		
		textDisplay = new JTextField("");
		textDisplay.setBackground(Color.WHITE);
		textDisplay.setForeground(Color.BLACK);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 6, 218, 30);
		textDisplay.setColumns(10);
		textDisplay.setEditable(false);
		window.getContentPane().add(textDisplay);
		
		button_0 = new JButton("0");                                                //BUTTONS 0-9
		button_0.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_0.setBounds(66, 270, 50, 39);
		window.getContentPane().add(button_0);
        button_0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_0.getText();
				textField.setText(entry);
			}
		});
		
		button_1 = new JButton("1");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBounds(10, 120, 50, 39);
		window.getContentPane().add(button_1);
        button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_1.getText();
				textField.setText(entry);
			}
		});
		
	    button_2 = new JButton("2");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBounds(66, 120, 50, 39);
		window.getContentPane().add(button_2);
        button_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_2.getText();
				textField.setText(entry);
			}
		});
		
		button_3 = new JButton("3");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBounds(122, 120, 50, 39);
		window.getContentPane().add(button_3);
        button_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				String entry = textField.getText() + button_3.getText();
				textField.setText(entry);
			}
		});
		
		button_4 = new JButton("4");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBounds(10, 170, 50, 39);
		window.getContentPane().add(button_4);
        button_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_4.getText();
				textField.setText(entry);
			}
		});
		
		button_5 = new JButton("5");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setBounds(66, 170, 50, 39);
		window.getContentPane().add(button_5);
        button_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_5.getText();
				textField.setText(entry);
			}
		});
		
		button_6 = new JButton("6");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_6.setBounds(122, 170, 50, 39);
		window.getContentPane().add(button_6);
        button_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_6.getText();
				textField.setText(entry);
			}
		});
		
		button_7 = new JButton("7");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_7.setBounds(10, 220, 50, 39);
		window.getContentPane().add(button_7);
        button_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_7.getText();
				textField.setText(entry);
			}
		});
		
		button_8 = new JButton("8");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_8.setBounds(66, 220, 50, 39);
		window.getContentPane().add(button_8);
        button_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_8.getText();
				textField.setText(entry);
			}
		});
		
		button_9 = new JButton("9");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_9.setBounds(122, 220, 50, 39);
		window.getContentPane().add(button_9);
        button_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_9.getText();
				textField.setText(entry);
			}
		});
		
		button_addition = new JButton("+");                                         //ADDITION
		button_addition.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_addition.setBounds(10, 70, 50, 39);
		window.getContentPane().add(button_addition);
		button_addition.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals("")) {
					
					firstNum = Double.parseDouble(textField.getText());
					textDisplay.setText(textField.getText() + " +");
					textField.setText("");
					operation = '+';
				}
			}
		});
		
		button_subtraction = new JButton("-");                                      //SUBTRACTION
		button_subtraction.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_subtraction.setBounds(66, 70, 50, 39);
		window.getContentPane().add(button_subtraction);
        button_subtraction.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals("")) {
					
					firstNum = Double.parseDouble(textField.getText());
					textDisplay.setText(textField.getText() + " -");
					textField.setText("");
					operation = '-';
				}
			}
		});
		
		button_multiplication = new JButton("*");                                   //MULTIPLICATION
		button_multiplication.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_multiplication.setBounds(122, 70, 50, 39);
		window.getContentPane().add(button_multiplication);
		button_multiplication.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals("")) {
					
					firstNum = Double.parseDouble(textField.getText());
					textDisplay.setText(textField.getText() + " *");
					textField.setText("");
					operation = '*';
				}
			}
		});
		
		button_division = new JButton("/");                                         //DIVISION
		button_division.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_division.setBounds(178, 70, 50, 39);
		window.getContentPane().add(button_division);
        button_division.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals("")) {
					
					firstNum = Double.parseDouble(textField.getText());
					textDisplay.setText(textField.getText() + " /");
					textField.setText("");
					operation = '/';
				}
			}
		});
		
		button_dot = new JButton(".");                                              //PUNCTUATION
		button_dot.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_dot.setBounds(122, 270, 50, 39);
		window.getContentPane().add(button_dot);
        button_dot.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String text = textField.getText();
				CharSequence dot = ".";
				
				if(!text.endsWith(".") && !text.isEmpty()) {
					
					if(!text.endsWith(")") && !text.contains(dot)) {
						
						String entry = textField.getText() + ".";
						textField.setText(entry);
					}
				}
			}
		});
		
		button_clear = new JButton("C");                                            //CLEAR TEXT FIELD
		button_clear.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_clear.setBounds(10, 270, 50, 39);
		window.getContentPane().add(button_clear);
		button_clear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textDisplay.setText("");
			}
		});
		
		button_backspace = new JButton("<");                                        //BACKSPACE
		button_backspace.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_backspace.setBounds(178, 120, 50, 39);
		window.getContentPane().add(button_backspace);
		button_backspace.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length() > 0) {
					
					String entry = textField.getText().substring(0, textField.getText().length() - 1);
					textField.setText(entry);
				}
			}
		});
		
		button_left_parenthesis = new JButton("(");                                 //LEFT PARENTHESIS
		button_left_parenthesis.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_left_parenthesis.setBounds(178, 170, 50, 39);
		window.getContentPane().add(button_left_parenthesis);
        button_left_parenthesis.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_left_parenthesis.getText();
				textField.setText(entry);
			}
		});
		
		button_right_parenthesis = new JButton(")");	                            //RIGHT PARENTHESIS
		button_right_parenthesis.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_right_parenthesis.setBounds(178, 220, 50, 39);
		window.getContentPane().add(button_right_parenthesis);
        button_right_parenthesis.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String entry = textField.getText() + button_right_parenthesis.getText();
				textField.setText(entry);
			}
		});
		
		button_equals = new JButton("=");                                           //EQUALS
		button_equals.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_equals.setBounds(178, 270, 50, 39);
		window.getContentPane().add(button_equals);
		button_equals.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals("")) {
					
					secondNum = Double.parseDouble(textField.getText());
					textDisplay.setText(textDisplay.getText() + " " + textField.getText() + " = ");
					
					switch (operation) {
					
					case '+':
						result = firstNum + secondNum;
						output = String.format("%.2f", result);
						textField.setText(output);
						firstNum = result;
						secondNum = 0;
						break;
					case '-':
						result = firstNum - secondNum;
						output = String.format("%.2f", result);
						textField.setText(output);
						firstNum = result;
						secondNum = 0;
						break;
					case '*':
						result = firstNum * secondNum;
						output = String.format("%.2f", result);
						textField.setText(output);
						firstNum = result;
						secondNum = 0;
						break;
					case '/':
						result = firstNum / secondNum;
						output = String.format("%.2f", result);
						textField.setText(output);
						firstNum = result;
						secondNum = 0;
						break;
					default: 
						break;
					}
				}
			}	
		});
	}
}
