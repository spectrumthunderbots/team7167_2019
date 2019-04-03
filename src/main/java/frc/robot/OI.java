/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.Claw_In;
import frc.robot.commands.Claw_Out;
import frc.robot.commands.DriveSlow;
import frc.robot.commands.Group_Fold;
import frc.robot.commands.Group_Unfold;
import frc.robot.commands.Lift_Down;
import frc.robot.commands.Lift_Up;
import frc.robot.commands.Piston_Down;
import frc.robot.commands.Piston_Up;


public class OI {

  public Joystick stick = new Joystick(RobotMap.controller);

  Button piston_Up = new JoystickButton(stick, RobotMap.button_Start);
  Button piston_Down = new JoystickButton(stick, RobotMap.button_Back);

  Button claw_In = new JoystickButton(stick, RobotMap.button_RightBumper);
  Button claw_Out = new JoystickButton(stick, RobotMap.button_LeftBumper);

  Button lift_Up = new JoystickButton(stick, RobotMap.button_Y);
  Button lift_Down = new JoystickButton(stick, RobotMap.button_A);

  Button tog = new JoystickButton(stick, RobotMap.button_B);

  public OI() {

    piston_Up.whenPressed(new Group_Unfold());
    piston_Down.whenPressed(new Group_Fold());

    claw_In.whileHeld(new Claw_In());
    claw_Out.whileHeld(new Claw_Out());

    lift_Up.whileHeld(new Lift_Up());
    lift_Down.whileHeld(new Lift_Down());

    tog.toggleWhenPressed(new ArcadeDrive());

  }
}
