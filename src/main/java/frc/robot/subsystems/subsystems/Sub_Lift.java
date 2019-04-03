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
//import edu.wpi.first.wpilibj.Encoder;

public class Sub_Lift extends Subsystem {
  //private Encoder lift_encoder= new Encoder(0, 1);
  VictorSP m_lift = null;

  public Sub_Lift() {
    m_lift = new VictorSP(RobotMap.m_lift);
    //lift_encoder.setDistancePerPulse(4*Math.PI); 

  }
  
  public void move(double speed) {
    m_lift.set(speed);
    //addChild("Encoder", lift_encoder);
  }
  //public double getDistance(){
    //return lift_encoder.getDistance();

 // public void reset() {
    //lift_encoder.reset();
  //}
  //}
  @Override
  public void initDefaultCommand() {
    
  }
  
}
