public class Scoreboard {
  private String t1;
  private String t2;
  private int t1Score;
  private int t2Score;
  private String active;

  public Scoreboard(String t1,String t2){
    this.t1=t1;
    this.t2=t2;
    t1Score=0;
    t2Score=0;
    active=t1;
  }

  public String getScore(){
    return t1Score+"-"+t2Score+"-"+active;
  }

  public void recordPlay(int num){
    if(active.equals(t1)){
      t1Score+=num;
      if(num==0){
        active=t2;
      }
    }
    else{
      t2Score+=num;
      if(num==0){
        active=t1;
      }
    }
  }
}
