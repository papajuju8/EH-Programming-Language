
public class Tokenizer_Text_Area {

	import java.awt.event.*; 
	import java.awt.*; 
	import javax.swing.*;

	class text extends JFrame implements ActionListener { 

		static JFrame eh_frame;
		static JButton eh_button;
		static JLabel eh_label;
		static JTextArea eh_textarea; 
	 
		text() 
		{ 
		} 
	 
		public static void main(String[] args) 
		{  
			eh_frame = new JFrame(".eh IDE_Test"); 
			eh_label = new JLabel("");
			eh_button = new JButton("Submit"); 
			text te = new text(); 
			eh_button.addActionListener(te); 
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
				eh_label.setText(eh_textarea.getText()); 
			} 
		} 
	} 
}