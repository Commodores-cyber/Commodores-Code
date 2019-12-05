/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import frc.robot.commands.*;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SPI;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public final double driveTrainGain = .015;
  

  private final WPI_TalonSRX leftMaster = RobotMap.driveTrainLeftMaster;
  private final WPI_TalonSRX rightMaster = RobotMap.driveTrainRightMaster;
  
  private final DifferentialDrive m_drive;

    
  public DriveTrain() {
    m_drive = new DifferentialDrive(leftMaster, rightMaster);
    m_drive.setSafetyEnabled(false);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveManual());
  }

  public void driveTank(double left, double right){
    m_drive.tankDrive(left, right);
  }
    
  public void driveCurvature(double speed, double  rotation, boolean quickTurn){
    m_drive.curvatureDrive(speed, rotation, quickTurn);
  }

  public void stop() {
    m_drive.stopMotor();
  }

}