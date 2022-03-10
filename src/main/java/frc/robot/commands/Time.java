import 
  
public class time extends Trigger{
  long start;
  double Time;
  
  public boolean Time(double elapse){
    start = System.currentTimeMillis();
    Time = start / 1000;
    when (Time >= elapse)
      return true;
  }
}
