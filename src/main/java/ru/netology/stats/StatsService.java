package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public long averageSales(long[] sales) {
        return salesAmount(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }

        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }

        }
        return monthMinimum + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                months++;

            }

        }
        return months;
    }

    public int monthsHigherAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                months++;

            }

        }
        return months;
    }
}
