package com.jrdomingos.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalcController implements ActionListener {
	
	
	
	private JTextField txtNum1 = new JTextField(30);
	private JTextField txtNum2 = new JTextField(30);
	private JComboBox op = new JComboBox();
	
	public CalcController(JTextField txtNum1,JTextField txtNum2, JComboBox op ) {
		this.txtNum1 = txtNum1;
		this.txtNum2 = txtNum2;
		     this.op = op;
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer result = 0;
		Integer num1 = this.txtNum1.getText() == null ? 0 : Integer.parseInt(this.txtNum1.getText());
		Integer num2 = this.txtNum1.getText() == null ? 0 : Integer.parseInt(this.txtNum2.getText());
		String op = this.op.getSelectedItem().toString();
		
		switch (op) {
		case "+":
			  result = num1 + num2;
			  break;
		case "-":
			  result = num1 - num2;
			  break;
		case "*":
			  result = num1 * num2;
			  break;
		case "/":
			  result = num1 / num2;
			  break;
		
		}
		
		
		
	}

}















