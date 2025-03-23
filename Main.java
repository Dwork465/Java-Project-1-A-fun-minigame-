import java.util.*;
class Main {
  public static void main(String[] args) {
    String check="";
    int turns =0, income=100, eventCash=0;
    Scanner sc = new Scanner(System.in);
    //You are citizen of London and you want to make money. Your goal is to make 5000 in the least amount of turns as possible. To make the game interesting, you will be starting with a random amount of money from 0 to 500 pounds.
    Player a = new Player();
    System.out.println("You are starting off with " + a.getMoney()+ " this time.");
    System.out.println("Press Enter to continue.");
    check = sc.nextLine();
    while(a.getMoney()<5000 && a.getMoney()>0){
      turns++;
      System.out.println("Cash: " + a.getMoney());
      System.out.println("What do you want to do today? (Enter 1 to work and 2 to get a random event)");
      check = sc.nextLine();
      if(check.equals("1")){
        a.addMoney(income);
        System.out.println("You made "+ income+" pounds today");
        income=income+10;
        System.out.println("Press Enter to continue.");
        check = sc.nextLine();
      }
      if(check.equals("2")){
        Event e = new Event();
        eventCash = e.eventRoll();
        a.addMoney(eventCash);
        System.out.println("Press Enter to continue.");
        check = sc.nextLine();
      }
      a.newDay();
    }
    if(a.getMoney()<0)
      System.out.println("You have fallen below 0 pounds and have have run out of money. It seems like you'll be joining the workhouses");
    else{
      System.out.println("Congratulations, you have made enough money to join the upper class.");
      System.out.println("It only took you "+turns +" turn(s). Thanks for playing!");
    }
  }
}