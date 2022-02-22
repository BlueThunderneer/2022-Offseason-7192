package frc.robot.commands;
import frc.robot.subsystems.ClimbSS;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ClimbUp extends CommandBase{

    private final ClimbSS m_climbss; 

        public ClimbUp(ClimbSS subsystem){

            m_climbss = subsystem;
            addRequirements(m_climbss);
        }


        @Override
        public void initialize(){
            m_climbss.ClimbUp();
        }

        @Override 
        public void end(boolean interupted){
            m_climbss.stop();
        }
}
