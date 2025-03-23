import java.util.Random;
class Event{
  private int eventCash=0;
  public double eventNumber=0;
  public int eventRoll(){
  eventNumber = Math.floor(Math.random()*(20-0+1)+0);
  if(eventNumber==1){
    System.out.println("You decided to walk around town and you managed to pickpocket a very wealthy man. Guess it is yours now.");
    System.out.println("+1000 pounds");
    eventCash = 1000;
    return eventCash;
    }
    else if(eventNumber==2){
      System.out.println("You decided to walk around town and you managed to pickpocket a very wealthy man. You try and steal it and you were caught. Now you are forced to pay up 200 pounds to be released");
    System.out.println("-200");
      eventCash=-200;
      return eventCash;
    }
    return 1;
    }
}