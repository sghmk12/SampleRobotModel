package org.usfirst.frc.teamsamplesathira.robot.subsystems;

import org.usfirst.frc.teamsamplesathira.robot.GamePadConstants;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	
	private SpeedController front_left_motor, front_right_motor,back_left_motor,back_right_motor;
	private RobotDrive drive;
	
	public Drivetrain(){
		
	}
	
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void drive(double left, double right){
		drive.tankDrive(left, right);
	}
	
	public void drive(Joystick joy){
		drive(joy.getY(), joy.getAxis(AxisType.kThrottle) );
		System.out.println("drive has been callede!");
	}
	
}
