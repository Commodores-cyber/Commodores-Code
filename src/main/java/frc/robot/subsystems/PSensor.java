package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.lib.PressureSensor;

/**
 * Add your docs here.
 */
public class PSensor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  PressureSensor sensor;

  public PSensor() {
		sensor = new PressureSensor(0);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public double getPressure()
  {
    return sensor.getAirPressurePsi();
  }
}