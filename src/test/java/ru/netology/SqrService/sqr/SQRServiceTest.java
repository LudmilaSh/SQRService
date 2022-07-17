package ru.netology.SqrService.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalculateSmallLimitValues () {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(5, 10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBigLimitValues () {
        SQRService service = new SQRService();
        int expected = 9;
        int actual = service.calculate(500, 1000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateZeroLimitValues () {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(0, 1);

        Assertions.assertEquals(expected, actual);
    }
}