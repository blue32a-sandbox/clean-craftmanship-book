package reporter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewCasesReporterTest {
    private final double DELTA = 0.0001;
    private NewCasesReporter reporter;

    @BeforeEach
    public void setUp() throws Exception {
        reporter = new NewCasesReporter();
    }

    @Test
    public void countyReport() throws Exception {
        String report = reporter.makeReport("" +
                "c1, s1, 1, 1, 1, 1, 1, 1, 1, 7\n" +
                "c2, s2, 2, 2, 2, 2, 2, 2, 2, 7");
        assertEquals("" +
                "County State Avg New Cases\n" +
                "====== ===== =============\n" +
                "c1         s1        1.86\n" +
                "c2         s2        2.71\n\n" +
                "s1 cases: 14\n" +
                "s2 cases: 21\n" +
                "Total Cases: 35\n",
                report);
    }

    @Test
    public void stateWithTwoCounties() throws Exception {
        String report = reporter.makeReport("" +
                "c1, s1, 1, 1, 1, 1, 1, 1, 1, 7\n" +
                "c2, s1, 2, 2, 2, 2, 2, 2, 2, 7");
        assertEquals("" +
                        "County State Avg New Cases\n" +
                        "====== ===== =============\n" +
                        "c1         s1        1.86\n" +
                        "c2         s1        2.71\n\n" +
                        "s1 cases: 35\n" +
                        "Total Cases: 35\n",
                report);
    }

    @Test
    public void statesWithShortLines() throws Exception {
        String report = reporter.makeReport("" +
                "c1, s1, 1, 1, 1, 1, 7\n" +
                "c2, s2, 7");
        assertEquals("" +
                        "County State Avg New Cases\n" +
                        "====== ===== =============\n" +
                        "c1         s1        2.20\n" +
                        "c2         s2        7.00\n\n" +
                        "s1 cases: 11\n" +
                        "s2 cases: 7\n" +
                        "Total Cases: 18\n",
                report);
    }
}