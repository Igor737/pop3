package ru.ga.sandbox;

import org.testng.annotations.Test;

public class SguareTest {


    @Test
    public void testArea(){
        Sguare s = new Sguare(5);
        assert s.area() == 25;
    }
}
