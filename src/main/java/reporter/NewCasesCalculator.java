package reporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewCasesCalculator {
    protected final Map<String, Integer> stateCounts = new HashMap<>();
    protected final List<County> counties = new ArrayList<>();
    protected int totalCases;

    protected void calculateCounties(String[] countyLines) {
        totalCases = 0;
        stateCounts.clear();
        counties.clear();

        for (String countyLine : countyLines) {
            counties.add(calculateCounty(countyLine));
        }
    }

    private County calculateCounty(String line) {
        County county = new County();
        String[] tokens = line.split(",");
        county.county = tokens[0].trim();
        county.state = tokens[1].trim();

        county.rollingAverage = calculateRollingAverage(tokens);

        int cases = calculateSumOfCases(tokens);
        totalCases += cases;
        incrementStateCounter(county.state, cases);

        return county;
    }

    private double calculateRollingAverage(String[] tokens) {
        int lastDay = tokens.length - 1;
        int firstDay = lastDay - 7 + 1;
        if (firstDay < 2)
            firstDay = 2;
        double n = lastDay - firstDay + 1;
        int sum = 0;
        for (int day = firstDay; day <= lastDay; day++)
            sum += Integer.parseInt(tokens[day].trim());
        return (sum / n);
    }

    private int calculateSumOfCases(String[] tokens) {
        int cases = 0;
        for (int i = 2; i < tokens.length; i++)
            cases += (Integer.parseInt(tokens[i].trim()));
        return cases;
    }

    private void incrementStateCounter(String state, int cases) {
        int stateCount = stateCounts.getOrDefault(state, 0);
        stateCounts.put(state, stateCount + cases);
    }

    public static class County {
        public String county = null;
        public String state = null;
        public double rollingAverage = Double.NaN;
    }
}
