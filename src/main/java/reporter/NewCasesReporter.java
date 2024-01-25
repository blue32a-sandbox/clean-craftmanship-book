package reporter;

import java.util.*;

public class NewCasesReporter extends NewCasesCalculator {
    public String makeReport(String countyCsv) {
        String[] countyLines = countyCsv.split("\n");
        calculateCounties(countyLines);

        StringBuilder report = makeHeader();
        report.append(makeCountyDetails());
        report.append("\n");
        report.append(makeStateTotals());
        report.append(String.format("Total Cases: %d\n", totalCases));
        return report.toString();
    }

    private StringBuilder makeHeader() {
        return new StringBuilder("" +
                "County State Avg New Cases\n" +
                "====== ===== =============\n");
    }

    private StringBuilder makeCountyDetails() {
        StringBuilder countyDetails = new StringBuilder();
        for (County county : counties) {
            countyDetails.append(String.format("%-11s%-10s%.2f\n",
                    county.county,
                    county.state,
                    county.rollingAverage));
        }
        return countyDetails;
    }

    private StringBuilder makeStateTotals() {
        StringBuilder stateTotals = new StringBuilder();
        TreeSet<String> states = new TreeSet<>(stateCounts.keySet());
        for (String state : states)
            stateTotals.append(String.format("%s cases: %d\n",
                    state, stateCounts.get(state)));
        return stateTotals;
    }
}
