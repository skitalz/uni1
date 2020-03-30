package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
    CashbackHackService cashbackHackService = new CashbackHackService();
    int boundary = 1000;

    int actual = cashbackHackService.remain(boundary);
    int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    void remain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 900;

        int actual = cashbackHackService.remain(boundary);
        int expected = 100;

        assertEquals(expected,actual);
    }
    @Test
    void remain3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 854;

        int actual = cashbackHackService.remain(boundary);
        int expected = 146;

        assertEquals(expected,actual);
    }
}