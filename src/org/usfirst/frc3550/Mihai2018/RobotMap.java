// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3550.Mihai2018;

import org.usfirst.frc3550.Mihai2018.subsystems.DriveTrain;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController RearLeft;
    public static SpeedController RearRight;
    public static SpeedController FrontLeft;
    public static SpeedController FrontRight;
    public static SpeedControllerGroup m_LeftMotors;
    public static SpeedControllerGroup m_RightMotors;
    public static DifferentialDrive m_drive;
    public static SpeedController m_PinceRight;
    public static SpeedController m_PinceLeft;
    public static DigitalInput cubeDetect;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        m_PinceRight = new VictorSP(0);
        m_PinceLeft = new VictorSP(1);
        RearLeft = new WPI_TalonSRX(1);
        RearRight = new WPI_TalonSRX(4);
        FrontLeft = new WPI_TalonSRX(2);
        FrontRight = new WPI_TalonSRX(3);
        m_LeftMotors = new SpeedControllerGroup (FrontLeft, RearLeft);
        m_RightMotors = new SpeedControllerGroup (FrontRight, RearRight);
        cubeDetect = new DigitalInput(0);
        m_LeftMotors.setInverted(true);
        m_RightMotors.setInverted(false);
        m_drive = new DifferentialDrive(m_LeftMotors, m_RightMotors);
        m_drive.setSafetyEnabled(true);
        m_drive.setExpiration(0.1);
        m_drive.setMaxOutput(1.0);
        }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
}
