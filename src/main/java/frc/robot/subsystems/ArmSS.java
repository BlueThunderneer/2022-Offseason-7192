package frc.robot.subsystems;
import frc.robot.commands.armdown;
import frc.robot.commands.armup;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXSimCollection;
import com.ctre.phoenix.motorcontrol.GroupMotorControllers;


//Remove comment flags for all spark max items and comment talon lines to switch to the neo moving the arm
//import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;




public class ArmSS extends SubsystemBase{
    /*private TalonSRX talon0;
    private TalonSRX talon1;*/
    private DoubleSolenoid DS1;
    private DoubleSolenoid DS2;
    //private CANSparkMax m_sMax;


public ArmSS() {
   /* talon0 = new TalonSRX(30); 
    talon1 = new TalonSRX(31);
    talon1.set(ControlMode.Follower, talon0.getDeviceID()); */
    DS1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 30, 31); //30 is forward and 31 is reverse 
    DS2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 28, 29);// 28 is forward and 29 is reverse
    //m_sMax = new CANSparkMax(33, MotorType.kBrushless);
    //m_sMax.restoreFactoryDefaults();
 }

public void initialize(){
    DS1.set(kReverse);
    DS2.set(kReverse);
}

public void armup(){
  //  talon0.set(ControlMode.PercentOutput, 0.75);
    //m_sMax.set(.5);
    DS1.set(kForward);
    DS2.set(kForward);
    
}

public void armdown(){

    //talon0.set(ControlMode.PercentOutput, -0.75);
    //m_sMax.set(-0.5);
   // talon0.set(ControlMode.PercentOutput, -0.75);

   DS1.set(kReverse);
   DS2.set(kReverse);
}

public void stop() {
    //talon0.set(ControlMode.PercentOutput, 0.0);

    //m_sMax.set(0);

    DS1.set(kReverse);
    DS2.set(kReverse);
  }
}


