/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
//import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AutoDrivingSubsystem extends SubsystemBase {
  //Declares left motors 
  public WPI_TalonSRX leftMotor1 = new WPI_TalonSRX(Constants.leftMotor1);
  public WPI_TalonSRX leftMotor2 = new WPI_TalonSRX(Constants.leftMotor2);
  public WPI_TalonSRX leftMotor3 = new WPI_TalonSRX(Constants.leftMotor3);
  
  //Groups the left motors together
  public SpeedControllerGroup leftGroup = new SpeedControllerGroup(leftMotor1, leftMotor2, leftMotor3);

  //Delcares right motors
  public WPI_TalonSRX rightMotor1 = new WPI_TalonSRX(Constants.rightMotor1);
  public WPI_TalonSRX rightMotor2 = new WPI_TalonSRX(Constants.rightMotor2);
  public WPI_TalonSRX rightMotor3 = new WPI_TalonSRX(Constants.rightMotor3);

  //Encoder Motor Controller

  public WPI_TalonSRX leftEncoder = new WPI_TalonSRX(Constants.leftEncoder);
  public WPI_TalonSRX rightEncoder = new WPI_TalonSRX(Constants.rightEncoder);
  
  //Groups the right motors together
  public SpeedControllerGroup rightGroup = new SpeedControllerGroup(rightMotor1, rightMotor2, rightMotor3);

  //Combines the left and right groups of motors
  DifferentialDrive oDrive = new DifferentialDrive(leftGroup, rightGroup);


  public AutoDrivingSubsystem() {

  }

  public void teleopDrive2(double yMove1, double yMove2) {
    //Configures the groups of motors to work with tank drive
    oDrive.tankDrive(yMove1, yMove2);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}