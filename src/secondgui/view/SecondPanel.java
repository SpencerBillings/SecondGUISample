package secondgui.view;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import secondgui.controller.SecondGUIController;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Component;

public class SecondPanel extends JPanel
{
	private SecondGUIController appController;
	private JButton myButton;
	private JLabel nextLabel;
	private JLabel labelOne;
	private JLabel labelTwo;
	private JLabel labelThree;
	private JLabel labelFour;
	private JLabel labelFive;
	private JLabel myLabel;
	private SpringLayout appLayout;
//	private boolean bgBool;
	
	public SecondPanel(SecondGUIController appController)
	{
		super();
		setPreferredSize(new Dimension(800, 800));
		this.appController = appController;
		
		myButton = new JButton("Click Here");
		myButton.setPreferredSize(new Dimension(100, 25));
		myButton.setSize(new Dimension(50, 50));
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		labelOne = new JLabel("Mondo Cool");
		labelOne.setHorizontalTextPosition(SwingConstants.CENTER);
		labelOne.setHorizontalAlignment(SwingConstants.CENTER);
		labelOne.setForeground(Color.RED);
		labelOne.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		
		labelTwo = new JLabel("Mondo Cool");
		labelTwo.setHorizontalTextPosition(SwingConstants.CENTER);
		labelTwo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTwo.setForeground(Color.GREEN);
		labelTwo.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		
		labelThree = new JLabel("Mondo Cool");
		labelThree.setHorizontalTextPosition(SwingConstants.CENTER);
		labelThree.setHorizontalAlignment(SwingConstants.CENTER);
		labelThree.setForeground(Color.GREEN);
		labelThree.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		
		labelFour = new JLabel("Mondo Cool");
		labelFour.setHorizontalTextPosition(SwingConstants.CENTER);
		labelFour.setHorizontalAlignment(SwingConstants.CENTER);
		labelFour.setForeground(Color.RED);
		labelFour.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		
		labelFive = new JLabel("Mondo Cool");
		labelFive.setHorizontalTextPosition(SwingConstants.CENTER);
		labelFive.setHorizontalAlignment(SwingConstants.CENTER);
		labelFive.setForeground(Color.GREEN);
		labelFive.setFont(new Font("Lucida Grande", Font.PLAIN, 99));

		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, myButton, 56, SpringLayout.SOUTH, labelThree);
		appLayout.putConstraint(SpringLayout.WEST, myButton, 248, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, myButton, -34, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, myButton, -245, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, labelFive, 0, SpringLayout.WEST, labelOne);
		appLayout.putConstraint(SpringLayout.SOUTH, labelFive, 0, SpringLayout.NORTH, labelOne);
		appLayout.putConstraint(SpringLayout.NORTH, labelThree, 6, SpringLayout.SOUTH, labelFour);
		appLayout.putConstraint(SpringLayout.WEST, labelThree, 0, SpringLayout.WEST, labelOne);
		appLayout.putConstraint(SpringLayout.NORTH, labelFour, 4, SpringLayout.SOUTH, labelTwo);
		appLayout.putConstraint(SpringLayout.EAST, labelFour, 0, SpringLayout.EAST, labelOne);
		appLayout.putConstraint(SpringLayout.NORTH, labelTwo, 306, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, labelOne, -1, SpringLayout.NORTH, labelTwo);
		appLayout.putConstraint(SpringLayout.EAST, labelTwo, 0, SpringLayout.EAST, labelOne);
		appLayout.putConstraint(SpringLayout.WEST, labelOne, 100, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
//	public boolean bgBool()
//	{
//		return bgBool;
//	}
	
	private void setupPanel()
	{
		this.add(myButton);
		this.add(labelOne);
		this.add(labelTwo);
		this.add(labelThree);
		this.add(labelFour);
		this.add(labelFive);
		this.setLayout(appLayout);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
//		if(this.bgBool)
//		{
//			this.setBackground(Color.GREEN);
//			this.bgBool = false;
//		}
//		else
//		{
//			this.setBackground(Color.RED);
//			bgBool = true;
//		}
		this.setBackground(new Color(red, green, blue));
	}
	
//	private void bgBool(boolean bgBoolean)
//	{
//		this.bgBool = bgBoolean;
//	}
	
	private void setupListeners()
	{
		myButton.addActionListener(new ActionListener()
		{		
				public void actionPerformed(ActionEvent mouseClick)
				{
					changeColor();
					System.out.println("I clicked a button!");
				}
		});
	}
	
}
