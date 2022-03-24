package frc.robot.commands;
import frc.robot.subsystems.ArmSS;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class airOFF extends CommandBase{
    private final ArmSS m_armss;

    public airOFF(ArmSS subsytem){
        m_armss = subsytem;
        addRequirements(m_armss);
    }

    @Override
    public void initialize(){
        m_armss.airOFF();
    }
}
