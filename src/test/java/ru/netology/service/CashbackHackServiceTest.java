package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = CashbackHackService.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain2() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = CashbackHackService.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain3() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = CashbackHackService.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }
}