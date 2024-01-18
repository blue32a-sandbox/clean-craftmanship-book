package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {
    private Game g;

    @BeforeEach
    public void setUp() throws Exception {
        g = new Game();
    }
}
