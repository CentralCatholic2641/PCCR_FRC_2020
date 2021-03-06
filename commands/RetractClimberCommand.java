/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class RetractClimberCommand extends CommandBase {

  public RetractClimberCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectClimberSubsystem);
  }

  @Override
  public void initialize() {

  }

  // Retracts the climber
  @Override
  public void execute() {
    Robot.objectClimberSubsystem.RetractClimber();
  }

  @Override
  public void end(boolean interrupted) {
    Robot.objectClimberSubsystem.StopWinch();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
