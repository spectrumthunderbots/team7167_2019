/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Sub_Claw extends Subsystem {

  VictorSP claw = null;

  public Sub_Claw() {
    claw = new VictorSP(RobotMap.m_claw);
  }

  public void In() {
    claw.set(0.2);
  }

  public void Out() {
    claw.set(-1);
  }

  public void Stop() {
    claw.set(0);
  }

  @Override
  public void initDefaultCommand() {
  }
}
