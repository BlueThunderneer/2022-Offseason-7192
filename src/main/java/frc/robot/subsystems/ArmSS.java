package frc.robot.subsystems;
import frc.robot.commands.armdown;
import frc.robot.commands.armup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;


public class ArmSS extends SubsystemBase{
    private Talon talon0;
    private Talon talon1;
    private MotorControllerGroup armmotors;

public ArmSS() {
    talon0 = new Talon(6); 
    addChild("talon0", talon0 );
    talon0.setInverted(false);

    talon1 = new Talon(7);
    addChild("talon1", talon1);
    talon1.setInverted(true);

    armmotors = new MotorControllerGroup(talon0, talon1);
    addChild("armmotors", armmotors);
}

public void armup(){
    armmotors.set(.5);
}

public void armdown(){
    armmotors.set(-.5);
}

public void stop() {
    armmotors.set(0.0);
  }
}
