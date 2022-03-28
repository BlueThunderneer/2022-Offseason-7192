package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;


public class ClimbSS extends SubsystemBase{

        private CANSparkMax m_sMax;
       // private SparkMaxPIDController m_PidController;
       // public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;
        //private RelativeEncoder m_encoder;
        private DoubleSolenoid DS3;
        private DoubleSolenoid DS4;
        //Compressor air;

        
        public ClimbSS(){
            m_sMax = new CANSparkMax(32, MotorType.kBrushless);
            m_sMax.restoreFactoryDefaults();
            //m_PidController = m_sMax.getPIDController();
            //m_encoder = m_sMax.getEncoder();
            DS3 = new DoubleSolenoid(6, PneumaticsModuleType.CTREPCM, 4, 5); //0 is forward and 1 is reverse 
            DS4 = new DoubleSolenoid(6, PneumaticsModuleType.CTREPCM, 6, 7); //2 is forward and 3 is reverse
            //air = new Compressor(6, PneumaticsModuleType.CTREPCM);
            /*kP = 0.1; 
            kI = 1e-4;
            kD = 1; 
            kIz = 0; 
            kFF = 0; 
            kMaxOutput = 1; 
            kMinOutput = -1;

            m_PidController.setP(kP);
            m_PidController.setI(kI);
            m_PidController.setD(kD);
            m_PidController.setIZone(kIz);
            m_PidController.setFF(kFF);
            m_PidController.setOutputRange(kMinOutput, kMaxOutput);

            SmartDashboard.putNumber("P Gain", kP);
            SmartDashboard.putNumber("I Gain", kI);
            SmartDashboard.putNumber("D Gain", kD);
            SmartDashboard.putNumber("I Zone", kIz);
            SmartDashboard.putNumber("Feed Forward", kFF);
            SmartDashboard.putNumber("Max Output", kMaxOutput);
            SmartDashboard.putNumber("Min Output", kMinOutput);
            SmartDashboard.putNumber("Set Rotations", 0);*/

        }
    public void grab(){
        DS3.set(kForward);
        DS4.set(kForward);
    }
    
    public void letgo(){
        DS3.set(kReverse);
        DS4.set(kReverse);
    }

    @Override

    public void periodic(){
      // read PID coefficients from SmartDashboard
     /* double p = SmartDashboard.getNumber("P Gain", 0);
      double i = SmartDashboard.getNumber("I Gain", 0);
      double d = SmartDashboard.getNumber("D Gain", 0);
      double iz = SmartDashboard.getNumber("I Zone", 0);
      double ff = SmartDashboard.getNumber("Feed Forward", 0);
      double max = SmartDashboard.getNumber("Max Output", 0);
      double min = SmartDashboard.getNumber("Min Output", 0);
      double rotations = SmartDashboard.getNumber("Set Rotations", 0);
  
      // if PID coefficients on SmartDashboard have changed, write new values to controller
      if((p != kP)) { m_PidController.setP(p); kP = p; }
      if((i != kI)) { m_PidController.setI(i); kI = i; }
      if((d != kD)) { m_PidController.setD(d); kD = d; }
      if((iz != kIz)) { m_PidController.setIZone(iz); kIz = iz; }
      if((ff != kFF)) { m_PidController.setFF(ff); kFF = ff; }
      if((max != kMaxOutput) || (min != kMinOutput)) { 
        m_PidController.setOutputRange(min, max); 
        kMinOutput = min; kMaxOutput = max; 
      }

        SmartDashboard.putNumber("SetPoint", rotations);
        SmartDashboard.putNumber("ProcessVariable", m_encoder.getPosition());
*/
    }

  public void ClimbUp(){
    m_sMax.set(1);
    // set at 200 velocity; needs to be changed with real deal
    }
  
    public void ClimbDown(){
        m_sMax.set(-1);
        //set to -200 velocity; needs to be chnaged with real deal
    }
    public void stop() {
        m_sMax.set(0);
        // set to 0 velocity when stop
    }
}
