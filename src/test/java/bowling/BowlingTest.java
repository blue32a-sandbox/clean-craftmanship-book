package bowling;

import org.junit.jupiter.api.Test;

public class BowlingTest {
    @Test
    public void canCreateGame() throws Exception {
        Game g = new Game();
    }

    @Test
    public void canRoll() throws Exception {
        Game g = new Game();
        g.roll(0);
    }
}
