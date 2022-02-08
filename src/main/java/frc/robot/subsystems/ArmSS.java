package frc.robot.subsystems;
import frc.robot.commands.armdown;
import frc.robot.commands.armup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXSimCollection;
import com.ctre.phoenix.motorcontrol.GroupMotorControllers;




public class ArmSS extends SubsystemBase{
    private TalonSRX talon0;
    private TalonSRX talon1;


public ArmSS() {
    talon0 = new TalonSRX(30); 
    talon1 = new TalonSRX(31);
    talon1.set(ControlMode.Follower, talon0.getDeviceID());
 }

public void armup(){
    talon0.set(ControlMode.PercentOutput, 0.5);
    
}

public void armdown(){
    talon0.set(ControlMode.PercentOutput, -0.5);
}

public void stop() {
    talon0.set(ControlMode.PercentOutput, 0.0);
  }
}
