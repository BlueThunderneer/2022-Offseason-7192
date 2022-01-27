package frc.robot.commands;

import frc.robot.subsystems.IntakeSS;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * A simple command that grabs a hatch with the {@link HatchSubsystem}. Written explicitly for
 * pedagogical purposes. Actual code should inline a command this simple with {@link
 * edu.wpi.first.wpilibj2.command.InstantCommand}.
 */
public class LaunchBall extends CommandBase {
  // The subsystem the command runs on
  private final IntakeSS m_intakess;

  public LaunchBall(IntakeSS subsystem) {
    m_intakess = subsystem;
    addRequirements(m_intakess);
  }

  @Override
  //runs once when the command is called. 
  //If the button is held this will be called everytime the scheduler runs (~20ms)
  public void initialize() {
    m_intakess.launchBall();
  }

  @Override
  //runs at the end and stops the intake from running when button is released
  public void end(boolean interrupted) {
    m_intakess.stop();
  }
}