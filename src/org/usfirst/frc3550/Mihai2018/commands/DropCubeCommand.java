package org.usfirst.frc3550.Mihai2018.commands;

import org.usfirst.frc3550.Mihai2018.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DropCubeCommand extends Command {

    public DropCubeCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.pinceSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(3);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.pinceSubsystem.DropCube();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pinceSubsystem.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
