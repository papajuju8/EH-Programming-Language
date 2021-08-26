package me.buildproglang.eh.tokenizer;

import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;

import me.buildproglang.eh.tokenizer.Token;
import me.buildproglang.eh.tokenizer.Tokenizer;

class text extends JFrame implements ActionListener { 

	static JFrame eh_frame;
	static JButton eh_button;
	static JLabel eh_label;
	static JTextArea eh_textarea; 
 
	text() 
	{ 
	} 
 
	public static void main (String[] args) 
	{
		String code;
		Tokenizer tokenizer = new Tokenizer(code);
		String errorsyntax;
		
		eh_frame = new JFrame(".eh IDE_Test"); 
		eh_label = new JLabel("");
		eh_button = new JButton("Submit"); 
		text inputtext = new text(); 
		eh_button.addActionListener(inputtext); 
		eh_textarea = new JTextArea(20, 20); 
		JPanel p = new JPanel(); 
 
		p.add(eh_textarea); 
		p.add(eh_button); 
		p.add(eh_label); 

		eh_frame.add(p);  
		eh_frame.setSize(500, 500); 

		eh_frame.show(); 
	} 
 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 
		if (s.equals("Submit")) {
			//eh_label.setText(eh_textarea.getText());
			while (tokenizer.hasNextToken()) {
				try {
					Token t = tokenizer.nextToken();
					eh_label.setText(t.getType() + " -> " + t.getToken());
				}
				catch (Exception e) {
					errorsyntax = Tokenizer.getErrorSyntax();
					eh_label.setText("Syntax Error! \"" + errorsyntax + "\" unknown syntax! \n");
					break;
				}
			}
		}
	}
}
