import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
/**
 * 
 * @author Kevin Guo Period 6 
 *
 */
public class SalaryCaculator {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Salary Calculator");
		myFrame.setLayout(null);
		myFrame.setBounds(400, 400, 400, 250);
		myFrame.setResizable(false);
		
		JLabel rtLbl = new JLabel("Hourly Rate:");
		rtLbl.setBounds(40, 30, 100, 30);
		myFrame.add(rtLbl);
		
		JLabel hrsLbl = new JLabel("Hours/Week:");
		hrsLbl.setBounds(40, 60, 100, 30);
		myFrame.add(hrsLbl);
		
		JLabel annSal = new JLabel("Annual Salary: $");
		annSal.setBounds(200, 120, 250, 25);
		myFrame.add(annSal);
		
		JTextField rtTxtFld =  new JTextField();
		rtTxtFld.setBounds(125, 30, 100, 30);
		myFrame.add(rtTxtFld);
		
		JTextField hrsTxtFld =  new JTextField();
		hrsTxtFld.setBounds(125, 60, 100, 30);
		myFrame.add(hrsTxtFld);
	
		JCheckBox fullTime = new JCheckBox("Full Time");
		fullTime.setBounds(40, 90, 125, 30);
		myFrame.add(fullTime);
		fullTime.addKeyListener (new KeyListener() {
			public void keyPressed(KeyEvent e) {
				fullTime.setSelected(false);
			}
			public void keyReleased(KeyEvent e) {
				fullTime.setSelected(false);
			}
			public void keyTyped(KeyEvent e) {
				fullTime.setSelected(false);
			}
		});
		fullTime.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fullTime.isSelected()) {
					hrsTxtFld.setText("");
				}
			}
		}));
		JButton calc = new JButton("Calculate");
		calc.setBounds(40, 120, 125, 25);
		myFrame.add(calc);
		calc.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String str1 = rtTxtFld.getText();
				String str2 = hrsTxtFld.getText();
				if (fullTime.isSelected()) { 
					if (str1.length() > 0) {
							double rt = Double.parseDouble(str1);
							double total = rt * 40 * 52;
							String result = String.format("%.2f", total);
							annSal.setText("Annual Salary: $" + result);
					}
				} else {
					if (str1.length() > 0 && str2.length() > 0) {
							double rt = Double.parseDouble(str1);
							double hrs = Double.parseDouble(str2);
							double total = rt * hrs * 52;
							String result2 = String.format("%.2f", total);
							annSal.setText("Annual Salary: $" + result2);
					}
				}
			}
		});
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
