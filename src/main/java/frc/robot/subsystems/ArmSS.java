package frc.robot.subsystems;
import frc.robot.commands.armdown;
import frc.robot.commands.armup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXSimCollection;
import com.ctre.phoenix.motorcontrol.GroupMotorControllers;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;


public class ArmSS extends SubsystemBase{
    private TalonSRX talon0;
    private TalonSRX talon1;
    
    DigitalInput limitSwitchUP = new DigitalInput(6);   //change number
    Counter counterUP = new Counter(limitSwitchUP);

    DigitalInput limitSwitchDown = new DigitalInput(7);     //change number
    Counter counterDown = new Counter(limitSwitchDown);

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
  
    
public boolean UPSwitchSet(){       //Upper switch returns a 1 when triggered and a 0 when not
      return counterUP.get() > 0;
  }

public boolean DownSwitchSet(){       //Lower switch returns a 1 when triggered and a 0 when not
    return counterDown.get() > 0;
}

public void initalizeCounterUP(){     //reset the Upper counter
    counterUP.reset();
}

public void initalizeCounterDown(){     //reset the Lower counter
    counterUP.reset();
}
}
