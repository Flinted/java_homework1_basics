public class Knight {
  private String name;
  private Horse[] stable;

  public Knight(String name){
    this.name = name;
    this.stable = new Horse[4];
  }

  public String getName(){
    return "Sir " + this.name;
  }

  public void buyHorse(Horse horse){
    if(checkStableFull()) return;
    int index = ownedHorses();
    stable[index] = horse;
  }

  public int ownedHorses(){
    int count = 0;
    for(Horse horse: stable){
      if(horse != null){
        count++;
      }
    }
    return count;
  }

  public boolean checkStableFull(){
    return ownedHorses() >= 4;  
  }
}