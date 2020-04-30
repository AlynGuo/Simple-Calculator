package packages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Calculator {

	private JFrame frmCalculator;
	private JTextField tf;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCalculator.getContentPane().setLayout(null);
		
		/*    ---------------------------Row one------------------------------      */
		tf = new JTextField();
		tf.setBounds(10, 11, 262, 45);
		frmCalculator.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn7.getText();
				tf.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 123, 61, 45);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn8.getText();
				tf.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(81, 123, 56, 45);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn9.getText();
				tf.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(147, 123, 56, 45);
		frmCalculator.getContentPane().add(btn9);
		
		JButton plusBtn = new JButton("+");
		plusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				operation = "+";
			}
		});
		plusBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    plusBtn.setBounds(213, 67, 59, 45);
	    
	    frmCalculator.getContentPane().add(plusBtn);
		
		/*    ---------------------------Row two------------------------------      */
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn4.getText();
				tf.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 179, 61, 45);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn5.getText();
				tf.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(81, 179, 56, 45);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn6.getText();
				tf.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(147, 179, 56, 45);
		frmCalculator.getContentPane().add(btn6);
		
		JButton minusBtn = new JButton("-");
		minusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				operation = "-";
			}
		});
		minusBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		minusBtn.setBounds(213, 123, 59, 45);
		frmCalculator.getContentPane().add(minusBtn);
		
		/*    ---------------------------Row three------------------------------      */
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn1.getText();
				tf.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 235, 61, 45);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn2.getText();
				tf.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(81, 235, 56, 45);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn3.getText();
				tf.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(147, 235, 56, 45);
		frmCalculator.getContentPane().add(btn3);
		
		JButton multiplyBtn = new JButton("*");
		multiplyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				operation = "*";
			}
		});
		multiplyBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		multiplyBtn.setBounds(213, 179, 59, 45);
		frmCalculator.getContentPane().add(multiplyBtn);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + btn0.getText();
				tf.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 291, 61, 45);
		frmCalculator.getContentPane().add(btn0);
		
		JButton dotBtn = new JButton(".");
		dotBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tf.getText() + dotBtn.getText();
				tf.setText(EnterNumber);
			}
		});
		dotBtn.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dotBtn.setBounds(81, 291, 56, 45);
		frmCalculator.getContentPane().add(dotBtn);
		
		JButton clearBtn = new JButton("C");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf.setText(null);
			}
		});
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		clearBtn.setBounds(147, 291, 56, 45);
		frmCalculator.getContentPane().add(clearBtn);
		
		JButton equalBtn = new JButton("=");
		equalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(tf.getText());
				
				if(operation == "+") {
					
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					tf.setText(answer);
				}
				
				else if(operation == "-") {
					
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					tf.setText(answer);
				}
				
				else if(operation == "*") {
					
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					tf.setText(answer);
				}
				
				else if(operation == "/") {
					
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					tf.setText(answer);
				}
				
				
			}
		});
		equalBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		equalBtn.setBounds(213, 291, 59, 45);
		frmCalculator.getContentPane().add(equalBtn);
		
		JButton divideBtn = new JButton("/");
		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				operation = "/";
			}
		});
		divideBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		divideBtn.setBounds(213, 235, 59, 45);
		frmCalculator.getContentPane().add(divideBtn);
		
		JButton eraseBtn = new JButton("←");
		eraseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(tf.getText().length() > 0) {
					
					StringBuilder strB = new StringBuilder(tf.getText());
					strB.deleteCharAt(tf.getText().length() - 1);
					backspace = strB.toString();
					tf.setText(backspace);
				}
			}
		});
		eraseBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		eraseBtn.setBounds(147, 67, 56, 45);
		frmCalculator.getContentPane().add(eraseBtn);
		
		/*----------------------------------row four ------------------------------------*/
		
		
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 298, 386);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
