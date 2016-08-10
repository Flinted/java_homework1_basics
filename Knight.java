import java.util.*;


public class Knight {
  private String name;
  private ArrayList<Horse> stable;

  public Knight(String name){
    this.name = name;
    this.stable = new ArrayList<Horse>();
  }

  public String getName(){
    return "Sir " + this.name;
  }

  public void buyHorse(Horse horse){
    if(checkStableFull()) return;
    stable.add(horse);
  }

  public int ownedHorses(){
    return stable.size();
  }

  public boolean checkStableFull(){
    return ownedHorses() >= 4;  
  }
}