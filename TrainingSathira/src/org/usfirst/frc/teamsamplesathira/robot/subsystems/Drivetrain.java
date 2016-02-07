/*
* Copyright (c) 2016, Sathira Katugaha Robotics, Canada. All rights reserved.
* This information contained herein may not be used in whole or in part without the
* express written consent of the Sathira Katugaha Robotics, Canada.
* Sathira Katugaha Robotics
* Java Development Standards | Internal | Page 9
*/
package org.usfirst.frc.teamsamplesathira.robot.subsystems;

import org.usfirst.frc.teamsamplesathira.robot.GamePadConstants;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
* This class allows the robot to move via its drive train
*
* @author Sathira Katugaha
* @version 1.0
*/
public class Drivetrain extends Subsystem {
	
	private SpeedController front_left_motor, front_right_motor,back_left_motor,back_right_motor;
	private RobotDrive drive;
	
	/**
	* Is the constructor method for the Drivetrain class
	*
	* @since 1.0
	*/
	public Drivetrain(){
		
	}
	
	
	/**
	* The default command for when the class is iniated
	* 
	* @since 1.0
	*/
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	/**
	* Controls the drive train via tank drive inputs
	*
	* @param left
	* the left motor's drive distance
	* @param right
	* the right motor's drive distance
	*
	* This is used to control the tank drive system
	*
	* @since 1.0
	*/
	public void drive(double left, double right){
		drive.tankDrive(left, right);
	}
	
	/**
	* Controls the drive train via joystick inputs
	*
	* @param joy
	* the joystick used to control the drive train
	* 
	* This is used to obtain a joystick object to control the drive train.
	*
	* @since 1.0
	*/
	public void drive(Joystick joy){
		drive(joy.getY(), joy.getAxis(AxisType.kThrottle) );
		System.out.println("drive has been callede!");
	}
	
}
