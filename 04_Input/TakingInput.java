import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
      int a = obj.nextInt();
      float b = obj.nextFloat();
      double e = obj.nextDouble();
      String c = obj.next();
      char d = obj.next().charAt(0);
      System.out.println("Integer: " + a);
      System.out.println("Float: " + b);
      System.out.println("String: " + c);
      System.out.println("Character: " + d);
      System.out.println("Double: " + e);
    }
}