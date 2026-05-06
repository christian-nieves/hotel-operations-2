package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_RoomStatus_RoomIsOccupiedAndDirty() {
        // Arrange
        Room room123 = new Room(2, 229);

        // Act
        room123.checkIn();

        // Assert
        assertTrue(room123.isOccupied());
        assertTrue(room123.isDirty());
    }

    @Test
    public void checkout() {
        // Arrange
        Room room456 = new Room(1, 100);

        // Act
        room456.checkout();

        // Assert
        assertFalse(room456.isOccupied());
    }

    @Test
    public void cleanRoom() {
    }
}