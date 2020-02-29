/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SpinningSubsystem extends SubsystemBase {
  

  //New spinning motor, spinning piston, and a new color sensor 
  public WPI_TalonSRX spinningMotor = new WPI_TalonSRX(Constants.spinningMotor);
  //public DoubleSolenoid spinngingPiston = new DoubleSolenoid(Constants.spinnerPnuematicPort1, Constants.spinnerPnuematicPort2);
  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);

  //Reads the color sensor values and prints them to the terminal
  public void readColorSensor(){
    Color detectedColor = m_colorSensor.getColor();
    System.out.println(detectedColor);
  }

  public SpinningSubsystem() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  //Extends the spinning motor
  public void extendSpinnerMotor(){
   // spinngingPiston.set(Value.kForward);
  }

  //Retracts the spinning motor
  public void retractSpinnerMotor(){
   // spinngingPiston.set(Value.kReverse);
  }

  //Sets the spinning motor to a specific speed
  public void DriveSpinningMotor(double speed){
    spinningMotor.set(speed);
  }
  
}
