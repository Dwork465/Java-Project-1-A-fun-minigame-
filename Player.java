import java.util.Random;
class Player{
  private double money;
  public Player(){
    money=Math.floor(Math.random()*(500-0+1)+0);
  }
  public void addMoney(int n){
    money= money + n;
  }
  public double getMoney(){
    return money;
  }
  public void newDay(){
    money=money-50;
  }
}