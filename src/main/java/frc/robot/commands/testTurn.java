package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class testTurn extends SequentialCommandGroup{
    
    public testTurn(Drivetrain param2) {
        addCommands(
        new TurnToAngle(90, param2)
         ); //end of addCommands
      
   }  
}

