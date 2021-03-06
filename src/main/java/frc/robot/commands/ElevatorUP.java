package org.usfirst.frc.team6651.robot.commands;

import org.usfirst.frc.team6651.robot.Robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class ElevatorUP extends Command {
	// Encoders for elevator
	Encoder ElevatorEncoder;
	double countElevator, Top=2000; /* Top is the value to get ot the top */
		
	public ElevatorUP() {
    		requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		ElevatorEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    			countElevator = ElevatorEncoder.get();
    			if(countElevator<(Top*0.9))
    				Robot.elevator.elevator_up(RobotMap.MAX_SPEED_ELEVATOR_UP);
    			else if(countElevator<Top)
					Robot.elevator.elevator_up(RobotMap.MAX_SPEED_ELEVATOR_UP/2);
				if(countElevator>Top)
					Robot.elevator.hold_position();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
			countElevator = ElevatorEncoder.get();
    		if (countElevator>Top)
    			return true;
    		else
    			return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    		Robot.elevator.stop();
    }
    
}