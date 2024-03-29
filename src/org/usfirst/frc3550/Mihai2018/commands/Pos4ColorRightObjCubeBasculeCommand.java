//// RobotBuilder Version: 2.0
////
//// This file was generated by RobotBuilder. It contains sections of
//// code that are automatically generated and assigned by robotbuilder.
//// These sections will be updated in the future when you export to
//// Java from RobotBuilder. Do not put any code or make any change in
//// the blocks indicating autogenerated code or it will be lost on an
//// update. Deleting the comments indicating the section will prevent
//// it from being updated in the future.
//
//package org.usfirst.frc3550.Mihai2018.commands;
//
//import org.usfirst.frc3550.Mihai2018.Robot;
//
////import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.command.CommandGroup;
//
////public final float INCHES2MM = 25.4;
//
///**
// *
// */
//public class Pos4ColorRightObjCubeBasculeCommand extends CommandGroup {
//
//    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
// 
//    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
//
//    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
//    public Pos4ColorRightObjCubeBasculeCommand() {
//
//    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
//    	addSequential(new DriveDistanceCommand(150, 1)); // 0:Backward / 1:Forward
//    	addSequential(new RotateController(90,   1));    // 0:Left     / 1:Right
//    	addSequential(new DriveDistanceCommand(20, 1)); // 0:Backward / 1:Forward
//    	addSequential(new OuvrePince());
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    	System.out.println("Running Pos4ColorRightObjCubeBasculeCommand.java");
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//        return false;
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    }
//}
