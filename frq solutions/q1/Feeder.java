public class Feeder{
  //instance var
  private int currentFood;

  //constructer
  public Feeder(int food){
    currentFood=food;
  }
  
  //Part a
  public void simulateOneDay(int numBirds){
    int consumed=(int)(Math.random()*41)+10;
    int willConsume=numBirds*consumed;
    System.out.println("Num eat per bird: "+consumed); //for checking
    if((int)(Math.random()*100)<5){
      currentFood=0;
      System.out.println("Is bear: true"); //for checking
    }
    else if(willConsume>currentFood){
      currentFood=0;
    }
    else{
      currentFood-=willConsume;
    }
    System.out.println("Current food left: "+currentFood); //for checking
  }
  
  //Part b
  public int simulateManyDays(int numBirds, int numDays){
    int days=0;
    for(int i=0;i<numDays;i++){
      if(currentFood!=0){
        days++;
        System.out.println("\nDay number: "+days); //for checking
        simulateOneDay(numBirds);
      }
      else{
        return days;
      }
    }
    return days;
  }  
}
