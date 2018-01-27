package org.usfirst.frc3550.Mihai2018.subsystems;

import org.usfirst.frc3550.Mihai2018.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PinceSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final SpeedController m_PinceRight = RobotMap.m_PinceRight;
	private final SpeedController m_PinceLeft = RobotMap.m_PinceLeft;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void stop(){
    	m_PinceRight.set(0);
    	m_PinceLeft.set(0);
    }
    public void PickupCube(){
    	m_PinceRight.set(0.9);
    	m_PinceLeft.set(0.9);
    }
    public void DropCube(){
    	m_PinceRight.set(-0.9);
    	m_PinceLeft.set(-0.9);
    }
}

