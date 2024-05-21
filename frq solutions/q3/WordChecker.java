import java.util.*;
public class WordChecker{
  //instance var
  private ArrayList<String> wordList;
  public WordChecker(ArrayList<String> i){
    wordList=i;
  }
  //part a
  public boolean isWordChain(){ 
    for(int i=0; i<wordList.size()-1;i++){
      if(wordList.get(i+1).indexOf(wordList.get(i))==-1){
        return false;
      }
    }
    return true;
  }
  //part b
  public ArrayList<String> createList(String target){
    ArrayList<String> result=new ArrayList<String>();
    for(int i=0;i<wordList.size();i++){
      if(target.length()<=wordList.get(i).length()){
        if(target.equals(wordList.get(i).substring(0, target.length()))){
          result.add(wordList.get(i).substring(target.length()));
        }
      }
    }
    return result;
  }
}
