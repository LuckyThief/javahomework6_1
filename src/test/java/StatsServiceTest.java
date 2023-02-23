import org.example.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTotalOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotalOfAllSales = 180;
        int actualTotalOfAllSales = service.totalOfAllSales(sales);

        Assertions.assertEquals(expectedTotalOfAllSales, actualTotalOfAllSales);
    }

    @Test
    public void shouldFindAverageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageAmountOfSalesPerMonth = 15;
        int actualAverageAmountOfSalesPerMonth = service.averageAmountOfSalesPerMonth(sales);

        Assertions.assertEquals(expectedAverageAmountOfSalesPerMonth, actualAverageAmountOfSalesPerMonth);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldFindTotalOfMonthsMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotalOfMonthsMinSales = 5;
        int actualTotalOfMonthsMinSales = service.totalOfMonthsMinSales(sales);

        Assertions.assertEquals(expectedTotalOfMonthsMinSales, actualTotalOfMonthsMinSales);
    }

    @Test
    public void shouldFindTotalOfMonthsMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotalOfMonthsMaxSales = 5;
        int actualTotalOfMonthsMaxSales = service.totalOfMonthsMaxSales(sales);

        Assertions.assertEquals(expectedTotalOfMonthsMaxSales, actualTotalOfMonthsMaxSales);
    }
}
