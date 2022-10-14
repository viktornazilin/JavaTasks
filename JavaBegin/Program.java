package JavaBegin;

public class Program {
   
    public static void main(String[] args) 
    {
          System.out.println("Hello world!"); 
          System.out.println(mthPower(2,3)); 
        
    }
    
    public static double mthPower(double a, int b) {
      if (a == 0 & b == 0)
          return Double.NaN;
      if (b == 0)
          return 1;
      if (b < 0)
          return mthPower(1 / a, -b);
      double res = mthPower(a, b / 2);
      if (b % 2 == 0)
          return res * res;
      else
          return res * res * a;
  }
}
