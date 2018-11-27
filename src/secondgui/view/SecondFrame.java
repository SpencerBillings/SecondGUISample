package secondgui.view;

import javax.swing.JFrame;
import secondgui.controller.SecondGUIController;
import java.awt.*;

public class SecondFrame extends JFrame
{
	private SecondGUIController appController;
	private SecondPanel appPanel;
	
	public SecondFrame(SecondGUIController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new SecondPanel(appController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("Second GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
}
