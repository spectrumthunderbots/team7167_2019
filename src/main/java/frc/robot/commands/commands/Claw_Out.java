/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Claw_Out extends Command {
  public Claw_Out() {
    requires(Robot.claw);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.claw.Out();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.claw.Stop();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
