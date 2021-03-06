package org.usfirst.frc.team6651.robot;

public class RobotMap {
	
	public static int YAXIS = 0;
	public static int XAXIS = 1;
	public static int ROTATION = 2;
	public static int THROTTLE = 3;

	public static final int DRIVER_USB_PORT = 0;
	
/**********************************************************/
/*                       Drive Train                      */

	public static int DRIVETRAIN_TALON_LEFT_FRONT = 10;
	public static int DRIVETRAIN_TALON_LEFT_BACK = 11;
	public static int DRIVETRAIN_TALON_RIGHT_FRONT = 12;
	public static int DRIVETRAIN_TALON_RIGHT_BACK = 13;

	public static double MAX_SPEED = 1;

/**********************************************************/
/*                       Elevator                         */	

	public static double MAX_SPEED_ELEVATOR_UP = 1;
	public static double MAX_SPEED_ELEVATOR_DOWN = 1;
	public static double ELEVATOR_CAN_ID = 21;
	public static double BUTTON_UP = 1;
	public static double BUTTON_DOWN = 2;
}	
	