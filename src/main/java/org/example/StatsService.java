package org.example;

public class StatsService {
    public int totalOfAllSales(long[] sales) {
        long amount = 0;
        for (long s : sales) {
            amount += s;
        }
        return Math.toIntExact(amount);
    }

    public int averageAmountOfSalesPerMonth(long[] sales) {
        long amount = 0;
        for (long s : sales) {
            amount += s;
        }
        return Math.toIntExact(amount / sales.length);
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int totalOfMonthsMinSales(long[] sales) {
        long count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmountOfSalesPerMonth(sales)) {
                count++;
            }
        }
        return Math.toIntExact(count);
    }

    public int totalOfMonthsMaxSales(long[] sales) {
        long count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmountOfSalesPerMonth(sales)) {
                count++;
            }
        }
        return Math.toIntExact(count);
    }
}
