/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class ArcadeDrive extends Command {
  public ArcadeDrive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
   //final int toggle = 0;
   //double tgl = 0.65;
  }

  @Override
  protected void execute() {
    double speed = Robot.oi.stick.getRawAxis(RobotMap.joy_left_y);
    //speed = speed*tgl;
    double turn = Robot.oi.stick.getRawAxis(RobotMap.joy_right_x);
    turn = (turn*0.7);
    Robot.driveTrain.arcadeDrive(speed, turn);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.driveTrain.arcadeDrive(0, 0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
