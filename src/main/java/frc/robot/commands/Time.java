import 
  
public class time{
  long start;
  double Time;
  
  public boolean Time(double elapse){
    start = System.currentTimeMillis();
    Time = start / 1000;
    when (Time >= elapse)
      return true;
  }
}
