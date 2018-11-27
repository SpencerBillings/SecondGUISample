package secondgui.controller;

import secondgui.model.Dog;
import secondgui.view.SecondFrame;

public class SecondGUIController 
{
	private Dog myDog;
	private SecondFrame appFrame;
	
	public SecondGUIController()
	{
		myDog = new Dog();
		appFrame = new SecondFrame(this);
	}
	
	public void Start()
	{
		
	}
}
