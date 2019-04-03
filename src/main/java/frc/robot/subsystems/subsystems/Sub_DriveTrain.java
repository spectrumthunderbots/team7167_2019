/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.DriveSlow;


public class Sub_DriveTrain extends Subsystem {

  Spark mc_leftFront = null;
  Spark mc_leftBack = null;
  Spark mc_rightFront = null;
  Spark mc_rightBack = null;

  DifferentialDrive diffDrive = null;

  public Sub_DriveTrain() {

    mc_leftFront = new Spark(RobotMap.m_leftFront);
    mc_leftBack = new Spark(RobotMap.m_leftBack);
    mc_rightFront = new Spark(RobotMap.m_rightFront);
    mc_rightBack = new Spark(RobotMap.m_rightBack);

    SpeedControllerGroup left = new SpeedControllerGroup(mc_leftFront, mc_leftBack);
    SpeedControllerGroup right = new SpeedControllerGroup(mc_rightFront, mc_rightBack);

    diffDrive = new DifferentialDrive(left, right);

  }

  public void arcadeDrive(double speed, double turn) {
    diffDrive.arcadeDrive(speed, turn);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveSlow());
  }
}
