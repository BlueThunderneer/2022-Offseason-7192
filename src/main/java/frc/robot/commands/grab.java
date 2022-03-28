package frc.robot.commands;
import frc.robot.subsystems.ClimbSS;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class grab extends CommandBase{

    private final ClimbSS m_climbss; 

    public grab(ClimbSS subsytem){
        m_climbss = subsytem;
        addRequirements(m_climbss);
    }

    @Override
    public void initialize(){
        m_climbss.grab();
    }
    
    @Override
    public void end(boolean interrupted){
        
    }
}