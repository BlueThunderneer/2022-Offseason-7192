package frc.robot.commands;

import frc.robot.subsystems.ArmSS;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class armup extends CommandBase{

    private final ArmSS m_armss;

    public armup(ArmSS subsytem){
        m_armss = subsytem;
        addRequirements(m_armss);
    }

    @Override
    public void initialize(){
        m_armss.initalizeCounterUP();     //reset the counter
        m_armss.armup();
    }
    
        @Override
    public boolean isFinished(){        //if returns true - calls end
        return m_armss.UPSwitchSet();
    }
    
    @Override
    public void end(boolean interrupted){
        m_armss.stop();
    }
}
