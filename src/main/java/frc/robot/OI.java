/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  Joystick joy1 = new Joystick(0);
  JoystickButton btn1 = new JoystickButton(joy1, 1);
  JoystickButton btn2 = new JoystickButton(joy1, 2);
  JoystickButton btn3 = new JoystickButton(joy1, 3);
  JoystickButton btn4 = new JoystickButton(joy1, 4);
  JoystickButton btn5 = new JoystickButton(joy1, 5);
  JoystickButton btn6 = new JoystickButton(joy1, 6);
  JoystickButton btn7 = new JoystickButton(joy1, 7);
  JoystickButton btn8 = new JoystickButton(joy1, 8);
  JoystickButton btn9 = new JoystickButton(joy1, 9);
  JoystickButton btn10 = new JoystickButton(joy1, 10);
  JoystickButton btn11 = new JoystickButton(joy1, 11);
  JoystickButton btn12 = new JoystickButton(joy1, 12);

  Joystick leftArcade = new  Joystick(1);

  Joystick rightArcade = new Joystick(2);
  JoystickButton arcadeBtn1 = new JoystickButton(rightArcade, 1);
  JoystickButton arcadeBtn2 = new JoystickButton(rightArcade, 2);
  JoystickButton arcadeBtn3 = new JoystickButton(rightArcade, 3);
  JoystickButton arcadeBtn4 = new JoystickButton(rightArcade, 4);
  JoystickButton arcadeBtn5 = new JoystickButton(rightArcade, 5);
  JoystickButton arcadeBtn6 = new JoystickButton(rightArcade, 6);
  JoystickButton arcadeBtn7 = new JoystickButton(rightArcade, 7);
  JoystickButton arcadeBtn8 = new JoystickButton(rightArcade, 8);
  JoystickButton arcadeBtn9 = new JoystickButton(rightArcade, 9);
  
  
  public OI() {
    joy1 = new Joystick(0);
    leftArcade = new Joystick(1);
    rightArcade = new Joystick(2);

    //btn1.whenPressed(new whateverCommand());
    //btn2.whenPressed(new whateverCommand());
    //btn3.whenPressed(new whateverCommand());
    //btn4.whenPressed(new whateverCommand());
    //btn5.whenPressed(new whateverCommand());
    //btn6.whenPressed(new whateverCommand());
    //btn7.whenPressed(new whateverCommand());
    //btn8.whenPressed(new whateverCommand()); 
    //btn9.whileHeld(new whateverCommand());
    //btn10.whileHeld(new whateverCommand());

    
    //arcadeBtn1.whenPressed(new whateverCommand());
    //arcadeBtn2.whenPressed(new whateverCommand());
    //arcadeBtn3.whenPressed(new whateverCommand());
    //arcadeBtn4.whenPressed(new whateverCommand());
    //arcadeBtn5.whenPressed(new whateverCommand());
    //arcadeBtn6.whenPressed(new whateverCommand());
    //arcadeBtn7.whenPressed(new whateverCommand());
    //arcadeBtn8.whileHeld(new whateverCommand());
    //arcadeBtn8.whileHeld(new whateverCommand());
    

  }

  public Joystick getJoystick0() {
    return joy1;
  }

  public Joystick getJoystick1() {
    return leftArcade;
  }

  public Joystick getJoystick2() {
    return rightArcade;
  }
}
