/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println(isNiven(336)); 
  }

  public static boolean isNiven (int number){
    int digitTotal = 0;
    int temp = Math.abs(number);
    while (temp > 0){
      digitTotal = digitTotal + (temp % 10);
      temp = temp /10;
    }
    System.out.println (digitTotal);
    if(number % digitTotal ==0){
      return true;
    }else{
      return false;
    }
  }
}
