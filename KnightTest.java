import static org.junit.Assert.assertEquals;
import org.junit.*;

public class KnightTest{
  Knight knight;
  Horse horse1;
  Horse horse2;
  Horse horse3;
  Horse horse4;
  Horse horse5;

  @Before
  public void before(){
    knight = new Knight("John");
    horse1 = new Horse("Betsy");
    horse2 = new Horse("Malcolm");
    horse3 = new Horse("Trotalot");
    horse4 = new Horse("Clopsy");
    horse5 = new Horse("Murdo");
  }

  @Test
  public void knightShouldGiveName(){
    assertEquals("Sir John", knight.getName());
  }

  @Test
  public void knightShouldGetHorse(){
    knight.buyHorse(horse1);
    assertEquals(1, knight.ownedHorses());
  }

  @Test
  public void stableShouldRefuseHorsesOnceFull(){
    knight.buyHorse(horse1);
    knight.buyHorse(horse2);
    knight.buyHorse(horse3);
    knight.buyHorse(horse4);
    knight.buyHorse(horse5);
    assertEquals(4, knight.ownedHorses());
  }

  
}
