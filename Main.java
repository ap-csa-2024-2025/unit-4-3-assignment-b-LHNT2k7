import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
  }

  public static boolean isPrime(int N)
  {
    if (N == 1)
    {
      return false;
    }
    for (int i =2; i< N; i++)
    {
      if (n % i ==0)
      {
        return false;
      }
    }
  }
  return true;
}