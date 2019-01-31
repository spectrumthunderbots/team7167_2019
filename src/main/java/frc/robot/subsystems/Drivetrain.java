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
import frc.robot.commands.DriveArcade;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Spark left1 = null;
  Spark left2 = null;
  Spark right1 = null;
  Spark right2 = null;

  DifferentialDrive difDrive = null;

  public Drivetrain() {

    left1 = new Spark(RobotMap.leftDrive1);
    left2 = new Spark(RobotMap.leftDrive2);
    right1 = new Spark(RobotMap.rightDrive1);
    right2 = new Spark(RobotMap.rightDrive2);

    SpeedControllerGroup left = new SpeedControllerGroup(left1, left2);
    SpeedControllerGroup right= new SpeedControllerGroup(right1, right2);

    difDrive = new DifferentialDrive(left, right); 

  }

  public void arcadeDrive(double speed, double turn) {

    difDrive.arcadeDrive(speed, turn);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveArcade());

  }
}
