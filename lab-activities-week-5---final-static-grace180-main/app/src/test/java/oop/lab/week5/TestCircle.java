package oop.lab.week5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCircle {
    public Circle circle;
    double radius;

    @BeforeEach
    public void Setup(){
        radius = 5.0;
        circle = new Circle(radius);
    }

    @Test
    public void testCalculateArea() {

        assertEquals(78.5, circle.calculateArea());
    }

    @Test
    public void testCalculatecircumference() {
        double expectedcircumference = 31.4 ;
        double actualcircumference = circle.calculatecircumference();
        assertEquals(expectedcircumference, actualcircumference,1);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    public void testFinalVariable() {
        try {
            Field field = circle.getClass().getDeclaredField("PI");
            assertTrue((field.getModifiers() & Modifier.FINAL) == Modifier.FINAL);
        } catch (NoSuchFieldException e) {
            fail("PI not found");
        }
    }
}

