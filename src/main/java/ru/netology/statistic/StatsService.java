package ru.netology.statistic;

public class StatsService {

    public long amountPurchases(long[] purchases) {
        long sum = 0;

        for (long purchase : purchases) {
            sum += purchase;
        }

        return sum;
    }

    public double averageAmountPurchases(long[] purchases) {
        return amountPurchases(purchases) % purchases.length;
    }

    public int monthWithMaxPurchases(long[] purchases) {
        int currentMax = 0;
        int index = 0;
        long maxValue = purchases[0];

        for (long purchase : purchases) {
            if (maxValue <= purchase) {
                currentMax = index;
                maxValue = purchase;
            }

            index++;
        }

        return currentMax;
    }

    public int monthWithMinPurchases(long[] purchases) {
        int currentMin = 0;
        int index = 0;
        long minValue = purchases[0];

        for (long purchase : purchases) {
            if (minValue >= purchase) {
                currentMin = index;
                minValue = purchase;
            }

            index++;
        }

        return currentMin;
    }

    public int quantityMonthsWithMinPurchases(long[] purchases) {
        double average = amountPurchases(purchases) % purchases.length;
        int months = 0;


        for (long purchase : purchases) {
            if (average < purchase) {
                months++;
            }
        }

        return months;
    }

    public int quantityMonthsWithMaxPurchases(long[] purchases) {
        double average = amountPurchases(purchases) % purchases.length;
        int months = 0;


        for (long purchase : purchases) {
            if (average > purchase) {
                months++;
            }
        }

        return months;
    }

}
