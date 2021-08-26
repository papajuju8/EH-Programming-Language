import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingDemo {
   private JFrame mainFrame;
   private JLabel statusLabel;
   private JPanel controlPanel;
   public SwingDemo() {
      prepareGUI();
   }
   public static void main(String[] args) {
      SwingDemo demo = new SwingDemo();
      demo.showTextAreaDemo();
   }
   private void prepareGUI() {
      mainFrame = new JFrame("IDE_Test");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
         }
      });
      statusLabel = new JLabel("",JLabel.CENTER);
      statusLabel.setSize(350,100);
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }
   private void showTextAreaDemo() {
      JLabel commentlabel= new JLabel("", JLabel.RIGHT);
      final JTextArea commentTextArea =
      new JTextArea("",5,20);
      JScrollPane scrollPane = new JScrollPane(commentTextArea);
      JButton showButton = new JButton("Show");
      showButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText(commentTextArea.getText());
         }
      });
      controlPanel.add(commentlabel);
      controlPanel.add(scrollPane);
      controlPanel.add(showButton);
      mainFrame.setVisible(true);
   }
}