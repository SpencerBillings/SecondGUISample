package secondgui.view;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import secondgui.controller.SecondGUIController;

public class SecondPanel extends JPanel
{
	private SecondGUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	
	public SecondPanel(SecondGUIController appController)
	{
		super();
		this.appController = appController;
		
		myButton = new JButton("Click Here");
		myLabel = new JLabel("[txeT_tresnI]");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.add(myButton);
		this.add(myLabel);
	}
	
	private void setupLayout()
	{
		this.setLayout(appLayout);
	}
	
	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		myButton.addActionListener(new ActionListener()
		{		
				public void actionPerformed(ActionEvent mouseClick)
				{
					changeColor();
				}
		});
	}
	
}
