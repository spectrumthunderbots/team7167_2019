/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Sub_Compressor extends Subsystem {

  Compressor compressor = null;

  public Sub_Compressor() {
    compressor = new Compressor();
  }

  public void Start() {
    compressor.start();
  }

  public void Stop() {
    compressor.stop();
  }

  @Override
  public void initDefaultCommand() {
  }
}
