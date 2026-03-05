package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        // This will be red in Android Studio because the method doesn't exist
        assertEquals(1, list.countCities());
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Regina", "SK");
        list.addCity(city);

        // Test successful deletion
        list.deleteCity(city);
        assertFalse(list.hasCity(city));

        // Test that deleting a non-existent city throws an exception
        // (This matches your Lab 6 logic)
        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(new City("Vancouver", "BC"));
        });
    }
}
