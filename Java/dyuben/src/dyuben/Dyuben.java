/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dyuben;
import java.applet.*;
import java.awt.*; // abstract window toolkit
import java.awt.event.*;
/**
 *
 * @author Informatics
 */


public class Dyuben extends Applet implements ActionListener
	{
		Label lbl1;
		Label lbl2;
		TextField txt1;
		Button btn1;
		
		public void init()
		{
			lbl1 = new Label("Enter a number: ");
			txt1 = new TextField(10);
			btn1 = new Button("check");
			lbl2 = new Label(" ");
			
			add(lbl1);
			add(txt1);
			add(btn1);
			add(lbl2);
			
			txt1.addActionListener(this);
			btn1.addActionListener(this);
			
		}
		
		public void actionPerformed(ActionEvent e)
			{
				int x = Integer.parseInt(txt1.getText());
				lbl2.setText(x+ " is the number");
			}
	}
	
