package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.IntakeSS;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonTime extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on time. This will drive out for a period of time, turn
   * around for time (equivalent to time to turn around) and drive forward again. This should mimic
   * driving out, turning around and driving back.
   *
   * 
   */
  public AutonTime(Drivetrain m_drivetrain, IntakeSS m_intakess) {
      addCommands(
        // new RaiseArm(), //Raise the Cargo arm to shoot need to add this subsystem to the contstructor)
        new LaunchBallTime(2.0, m_intakess),  //Launch the Ball into Hub
        new DriveTime(0.75, 0.0, 5.0, m_drivetrain) //Drive using these params (speed,Rotation,Time,Subsystem used)
      );
  }    
}