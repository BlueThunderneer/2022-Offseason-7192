package frc.robot.commands;

import frc.robot.subsystems.IntakeSS;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class LaunchBallTime extends CommandBase {
 // The subsystem the command runs on
 private final IntakeSS m_intakess;
 private final double m_duration;
 private long m_startTime;

 public LaunchBallTime(double time,IntakeSS subsystem) {
   m_intakess = subsystem;
   m_duration = time * 1000;
   addRequirements(m_intakess);
 }

 @Override
 //runs once when the command is called. 
 //If the button is held this will be called everytime the scheduler runs (~20ms)
 public void initialize() {
    m_startTime = System.currentTimeMillis();
    if (System.currentTimeMillis() - m_startTime >= 500{       //will only proceed once a .5 second or 500 millisecond delay has occurred
      m_intakess.launchBall();
   }
 }

 @Override
 //runs at the end and stops the intake from running when button is released
 public void end(boolean interrupted) {
   m_intakess.stop();
 }


@Override
// Returns true when the command should end after set duration
public boolean isFinished() {
    return (System.currentTimeMillis() - m_startTime) >= m_duration;  
 }
}
