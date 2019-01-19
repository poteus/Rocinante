package org.usfirst.frc.team6651.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team6651.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */


public class OI 
{

	public Joystick DriverController = new Joystick(RobotMap.DRIVER_USB_PORT);
		

	public OI()
	{
		
	}
}