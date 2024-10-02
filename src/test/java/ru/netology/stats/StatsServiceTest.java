package ru.netology.stats;

import org.junit.Test;
import static org.junit.Assert.*;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Месяц с максимальными продажами (нумерация с 1)
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    // Дополнительные тесты на другие методы...
}

