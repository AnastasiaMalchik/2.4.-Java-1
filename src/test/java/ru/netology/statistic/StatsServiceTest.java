package ru.netology.statistic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    protected long[] purchases;

    protected StatsService statsService;

    @BeforeEach
    void setUp() {
        statsService = new StatsService();

        purchases = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    }

    @Test
    void testAmountPurchases() {
        long expected = 180;
        long actual = statsService.amountPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testAverageAmountPurchases() {
        double expected = 15;
        double actual = statsService.averageAmountPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testMonthWithMaxPurchases() {
        int expected = 7;
        int actual = statsService.monthWithMaxPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testMonthWithMinPurchases() {
        int expected = 8;
        int actual = statsService.monthWithMinPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testQuantityMonthsWithMinPurchases() {
        int expected = 5;
        int actual = statsService.quantityMonthsWithMinPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testQuantityMonthsWithMaxPurchases() {
        int expected = 5;
        int actual = statsService.quantityMonthsWithMaxPurchases(purchases);
        assertEquals(expected, actual);
    }

}