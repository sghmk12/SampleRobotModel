package org.usfirst.frc.teamsamplesathira.robot.commands;


import org.usfirst.frc.teamsamplesathira.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDriveWithJoyStick extends Command{
	
	public TankDriveWithJoyStick(){
		requires(Robot.drivetrain);
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.drivetrain.drive(Robot.oi.getJoystick());
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.drivetrain.drive(0,0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
	}

}
