package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.lib.LIDARLite;

/**
 * Add your docs here.
 */
public class LIDAR extends Subsystem {
  	LIDARLite lidar;
	
	public LIDAR() {
		lidar = new LIDARLite(0);
	}
	
	public double getDistance() {
		return lidar.getDistanceIn(true);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	
	}
}