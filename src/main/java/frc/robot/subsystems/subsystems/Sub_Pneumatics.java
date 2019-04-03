/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Sub_Pneumatics extends Subsystem {

  DoubleSolenoid piston = null;

  public Sub_Pneumatics() {
    piston = new DoubleSolenoid(RobotMap.sol_up, RobotMap.sol_down);
  }

  public void Up() {
    piston.set(Value.kReverse);
  }

  public void Down() {
    piston.set(Value.kForward);
  }

  @Override
  public void initDefaultCommand() {
  }
}
