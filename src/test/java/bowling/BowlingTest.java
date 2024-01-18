package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private Game g;

    @BeforeEach
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void gutterGame() throws Exception {
        for (int i = 0; i < 20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
}
