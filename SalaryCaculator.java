import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		annSal.setBounds(200, 120, 125, 25);
		myFrame.add(annSal);
		
		JTextField nameTxtFld =  new JTextField();
		nameTxtFld.setBounds(125, 30, 100, 30);
		myFrame.add(nameTxtFld);

		JTextField phoneTxtFld =  new JTextField();
		phoneTxtFld.setBounds(125, 60, 100, 30);
		myFrame.add(phoneTxtFld);
		
		JCheckBox fullTime = new JCheckBox("Full Time");
		fullTime.setBounds(40, 90, 125, 25);
		myFrame.add(fullTime);
		
		JButton calc = new JButton("Calculate");
		calc.setBounds(40, 120, 125, 25);
		myFrame.add(calc);

		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
