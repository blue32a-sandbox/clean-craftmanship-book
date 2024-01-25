package reporter;

import java.util.*;

public class NewCasesReporter {
    public String makeReport(String countyCsv) {
        int totalCases = 0;
        Map<String, Integer> stateCounts = new HashMap<>();
        List<County> counties = new ArrayList<>();

        String[] lines = countyCsv.split("\n");
        for (String line : lines) {
            String[] tokens = line.split(",");
            County county = new County();
            county.county = tokens[0].trim();
            county.state = tokens[1].trim();
            // compute rolling average
            int lastDay = tokens.length - 1;
            int firstDay = lastDay - 7 + 1;
            if (firstDay < 2)
                firstDay = 2;
            double n = lastDay - firstDay + 1;
            int sum = 0;
            for (int day = firstDay; day <= lastDay; day++)
                sum += Integer.parseInt(tokens[day].trim());
            county.rollingAverage = (sum / n);

            // compute sum of cases.
            int cases = 0;
            for (int i = 2; i < tokens.length; i++)
                cases += (Integer.parseInt(tokens[i].trim()));
            totalCases += cases;
            int stateCount = stateCounts.getOrDefault(county.state, 0);
            stateCounts.put(county.state, stateCount + cases);
            counties.add(county);
        }
        StringBuilder report = new StringBuilder("" +
                "County State Avg New Cases\n" +
                "====== ===== =============\n");
        for (County county : counties) {
            report.append(String.format("%-11s%-10s%.2f\n",
                    county.county,
                    county.state,
                    county.rollingAverage));
        }
        report.append("\n");
        TreeSet<String> states = new TreeSet<>(stateCounts.keySet());
        for (String state : states)
            report.append(String.format("%s cases: %d\n",
                    state, stateCounts.get(state)));
        report.append(String.format("Total Cases: %d\n", totalCases));
        return report.toString();
    }
    public static class County {
        public String county = null;
        public String state = null;
        public double rollingAverage = Double.NaN;
    }
}
