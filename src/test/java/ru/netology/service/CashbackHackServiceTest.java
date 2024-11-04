package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain1() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = CashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void remain2() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = CashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void remain3() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = CashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }
}