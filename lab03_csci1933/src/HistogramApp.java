import java.util.Scanner;
public class HistogramApp{
  public static void main(String [] args){
    System.out.println("Enter lowerbound:");
    Scanner myScanner = new Scanner(System.in);
    int user_lower = myScanner.nextInt();
    System.out.println("Enter upperbound:");
    int user_upper = myScanner.nextInt();
    myScanner.nextLine();
    String user_input = " ";
    Histogram userHis = new Histogram(user_lower, user_upper);
    System.out.println("Enter a command: ");

    System.out.println("--HISTOGRAM CONSOLE--");
    System.out.println("Options: ");
    System.out.println("add - used to add to the histogram");
    System.out.println("print - prints the histogram to the screen");
    System.out.println("quit - leaves the program");

    while(!user_input.equals("quit")){
      user_input = myScanner.nextLine();
      if(user_input.equals("add")){ //can't use ==
        System.out.println("Enter a number to add to the histogram ");
        int user_add = myScanner.nextInt();
        myScanner.nextLine();
        userHis.add(user_add);
      }
      if (user_input.equals("print")){
        System.out.println(userHis);
      }
      System.out.println("Enter a command: ");
      //user_input = myScanner.nextLine();

    }

    System.out.println("--HISTOGRAM CONSOLE--");
    System.out.println("Options: ");
    System.out.println("add - used to add to the histogram");
    System.out.println("print - prints the histogram to the screen");
    System.out.println("quit - leaves the program");

  }
}

