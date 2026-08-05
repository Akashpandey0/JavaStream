import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Olympics {
    private String country;
    private String sports;
    private int medals;

    public Olympics(String country, String sports, int medals) {
        this.country = country;
        this.sports = sports;
        this.medals = medals;
    }
    public String getCountry() {
        return country;
    }

    public String getSports() {
        return sports;
    }

    public int getMedals() {
        return medals;
    }
}

public class OlympicsMain {
    public static void main(String[] args) {
        List<Olympics> olympicsList = Arrays.asList(
                new Olympics("USA", "Swimming", 10),
                new Olympics("China", "Table Tennis", 8),
                new Olympics("Russia", "Gymnastics", 6),
                new Olympics("USA", "Athletics", 12),
                new Olympics("China", "Diving", 9)
        );

        // Grouping by country and summing medals
        Map<String, IntSummaryStatistics> medalsByCountry = olympicsList.stream()
                .collect(Collectors.groupingBy(Olympics::getCountry, Collectors.summarizingInt(Olympics::getMedals)
            ));

        System.out.println("Total Medals by Country:");
        medalsByCountry.forEach((country, totalMedals) ->
            System.out.println(country + ": " + totalMedals.getSum()));
    }
}
