import org.example.ConsoleWinnerWriter;
import org.example.Toy;
import org.example.ToyRaffle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class ToyRaffleTest {
    private ToyRaffle toyStore;
    private Toy toy1;
    private Toy toy2;
    private Toy toy3;

    @Before
    public void setUp() {
        toyStore = new ToyRaffle(new ConsoleWinnerWriter());

        toy1 = new Toy(1, "Doll", 10);
        toy2 = new Toy(2, "Action Figure", 5);
        toy3 = new Toy(3, "Puzzle", 8);

        toyStore.putToy(toy1);
        toyStore.putToy(toy2);
        toyStore.putToy(toy3);
    }

    @Test
    public void testPutToy() {
        assertEquals(3, toyStore.showAllToys().size());
    }

    @Test
    public void testChangeToyCount() {
        toyStore.changeToyCount(1, 15);
        assertEquals(15, toy1.getCountToys());
    }

    @Test
    public void testRunRaffle() {
        assertNotNull(toyStore.runRaffle());
    }

    @Test
    public void testRemoveToy() {
        toyStore.runRaffle();
        assertEquals(2, toyStore.showAllToys().size());
    }
}

