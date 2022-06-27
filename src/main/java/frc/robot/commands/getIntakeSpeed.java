package frc.robot.commands;

import frc.robot.subsystems.IntakeSS;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class getIntakeSpeed extends CommandBase{

    private final IntakeSS m_intakess;

    public getIntakeSpeed(IntakeSS subsystem) {
        m_intakess = subsystem;
        addRequirements(m_intakess);
      }

      @Override
      //runs once when the command is called. 
      //If the button is held this will be called everytime the scheduler runs (~20ms)
      public void initialize() {
        m_intakess.getSpeed();
      }
    
      @Override
      //runs at the end and stops the intake from running when button is released
      public void end(boolean interrupted) {
        //m_intakess.stop();
      }
}