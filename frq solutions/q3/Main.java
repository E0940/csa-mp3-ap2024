import java.util.*;
public class Main {
  public static void main(String[] args) {
    ArrayList<String> w=new ArrayList<String>();
    w.add("an");
    w.add("band");
    w.add("band");
    w.add("abandon");
    WordChecker a=new WordChecker(w);
    System.out.println(a.isWordChain());

    ArrayList<String> w2=new ArrayList<String>();
    w2.add("to");
    w2.add("too");
    w2.add("stool");
    w2.add("tools");
    WordChecker a2=new WordChecker(w2);
    System.out.println(a2.isWordChain());

    ArrayList<String> w3=new ArrayList<String>();
    w3.add("catch");
    w3.add("bobcat");
    w3.add("catchacat");
    w3.add("cat");
    w3.add("at");
    WordChecker a3=new WordChecker(w3);
    System.out.println(a3.createList("cat"));
    System.out.println(a3.createList("catch"));
    System.out.println(a3.createList("dog"));

  }
}
