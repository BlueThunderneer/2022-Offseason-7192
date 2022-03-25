package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class Time extends CommandBase{
    
    private final double elapse;
   
    private long startTime;

   public Time(double time){
       elapse = time * 1000;
   }

   @Override
   public void initialize(){
       startTime = System.currentTimeMillis();
   }

   @Override
   public void end(boolean interrupted){
        //Command has ended
   }

   @Override
   public boolean isFinished(){
        return(System.currentTimeMillis()-startTime)>= elapse;
    }
}
