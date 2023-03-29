package oop.lab.week5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProductTaxService {

    Product p;
    
    @BeforeEach
    public void Setup(){
        p = new Product(1, "Mouse", "This is a Mouse", 150.0);
    }

    @Test
    public void testProduct() {
        assertEquals(1, p.getId());
        assertEquals("Test mouse", p.getName());
        assertEquals("This is a test mouse.", p.getDescription());
        assertEquals(150.0, p.getPrice(), 0.001);
        assertEquals(165.0, p.getPriceWithTax(), 0.001);
        assertEquals(173.25, p.getPriceWithService(),0.001);
    }

    @Test
    public void testFinalVariable() {
        try {
            Field field = p.getClass().getDeclaredField("Tax");
            assertTrue((field.getModifiers() & Modifier.FINAL) == Modifier.FINAL);
        } catch (NoSuchFieldException e) {
            fail("Tax not found");
        }

        try {
            Field field = p.getClass().getDeclaredField("Service");
            assertTrue((field.getModifiers() & Modifier.FINAL) == Modifier.FINAL);
        } catch (NoSuchFieldException e) {
            fail("Tax not found");
        }
    }
    
}
