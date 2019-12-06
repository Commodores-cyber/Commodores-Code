/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Compressor;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //driveTrain
  public static WPI_TalonSRX driveTrainLeftMaster;
  public static WPI_TalonSRX driveTrainLeftSlave1;
  public static WPI_TalonSRX driveTrainLeftSlave2;

  public static WPI_TalonSRX driveTrainRightMaster;
  public static WPI_TalonSRX driveTrainRightSlave1;
  public static WPI_TalonSRX driveTrainRightSlave2;

  //sensors and misc devices
  public static Compressor compressor;

  public static void init(){

    //driveTrain device initialization
    driveTrainLeftMaster = new WPI_TalonSRX(4);
    driveTrainLeftSlave1 = new WPI_TalonSRX(3);
    driveTrainLeftSlave2 = new WPI_TalonSRX(5);

    driveTrainRightMaster = new WPI_TalonSRX(2);
    driveTrainRightSlave1 = new WPI_TalonSRX(0);
    driveTrainRightSlave2 = new WPI_TalonSRX(1);

    driveTrainLeftMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,  0);
    driveTrainRightMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,  0);

    driveTrainRightMaster.setInverted(false);
    driveTrainRightSlave1.setInverted(false);
    driveTrainRightSlave2.setInverted(false);
    driveTrainLeftMaster.setInverted(false);
    driveTrainLeftSlave1.setInverted(false);
    driveTrainLeftSlave2.setInverted(false);

    driveTrainLeftMaster.setSensorPhase(true);
    driveTrainRightMaster.setSensorPhase(false);

    //driveTrainRightMaster.configOpenloopRamp(.35);
    //driveTrainLeftMaster.configOpenloopRamp(.35);

    driveTrainLeftSlave1.follow(driveTrainLeftMaster);
    driveTrainLeftSlave2.follow(driveTrainLeftMaster);
    driveTrainRightSlave1.follow(driveTrainRightMaster);
    driveTrainRightSlave2.follow(driveTrainRightMaster);
    
    driveTrainRightMaster.setNeutralMode(NeutralMode.Brake);
    driveTrainRightSlave1.setNeutralMode(NeutralMode.Brake);
    driveTrainRightSlave2.setNeutralMode(NeutralMode.Brake);
    driveTrainLeftMaster.setNeutralMode(NeutralMode.Brake);
    driveTrainLeftSlave1.setNeutralMode(NeutralMode.Brake);
    driveTrainLeftSlave2.setNeutralMode(NeutralMode.Brake);
    
    //sensors and misc device initialization
    compressor = new Compressor(0);
    
  }
}
