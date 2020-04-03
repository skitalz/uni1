package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {

    @Test
    void testSeviceWhenBoundaryEquals() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;
        int actual = cashbackHackService.remain(boundary);
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void testSeviceWhenSmallerAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 900;
        int actual = cashbackHackService.remain(boundary);
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    void testWhenAmountNotUneven() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 854;
        int actual = cashbackHackService.remain(boundary);
        int expected = 146;
        assertEquals(expected, actual);
    }
}