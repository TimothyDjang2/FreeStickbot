package org.usfirst.frc.team997.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	public VictorSP leftMotor, rightMotor;
	
	public double[] getVoltages() {
		double[] speeds[];
		double Whee = 0;
		speeds[0] = leftMotor.get();
		speeds[1] = rightMotor.get();
	}
	
	public void setVoltages(double leftSpeed, double rightSpeed) {
		
		leftMotor.set(leftSpeed);
		rightMotor.set(rightSpeed);
		
	}
	
	
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

