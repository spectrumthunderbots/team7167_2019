/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.commands.Piston_Up;
import frc.robot.subsystems.Sub_Claw;
import frc.robot.subsystems.Sub_Compressor;
import frc.robot.subsystems.Sub_DriveTrain;
import frc.robot.subsystems.Sub_Lift;
import frc.robot.subsystems.Sub_Pneumatics;


public class Robot extends TimedRobot {
  
  public static Sub_DriveTrain driveTrain = null;
  //public static Sub_Compressor compressor = null;
  //public static Sub_Pneumatics pneumatics = null;
  //public static Sub_Lift lift = null;
  public static Sub_Claw claw = null;
  public static OI oi = null;
  public Timer timer = null;  


  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();


  @Override
  public void robotInit() {

    driveTrain = new Sub_DriveTrain();
    //compressor = new Sub_Compressor();
    //pneumatics = new Sub_Pneumatics();
    //lift = new Sub_Lift();
    claw = new Sub_Claw();
    oi = new OI();
    timer = new Timer();

    CameraServer.getInstance().startAutomaticCapture();

  }


  @Override
  public void robotPeriodic() {
  }


  @Override
  public void disabledInit() {
  }


  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }


  @Override
  public void autonomousInit() {
   //m_autonomousCommand = new Piston_Up();
  }


  @Override
  public void autonomousPeriodic() {
     Scheduler.getInstance().run();
  }


  @Override
  public void teleopInit() {

    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }

  }


  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }


  @Override
  public void testPeriodic() {
  }
}
