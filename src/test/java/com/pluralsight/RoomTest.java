package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void checkIn()
    {
        Room testRoom = new Room(12, 120);
        testRoom.checkIn();
        assertTrue(testRoom.isOccupied());
        assertTrue(testRoom.isDirty());
    }

    @Test
    void checkOut()
    {
        Room testRoom = new Room(12, 120);
        testRoom.checkOut();
        assertFalse(testRoom.isOccupied());
    }

    @Test
    void cleanRoom()
    {
        Room testRoom = new Room(12, 120);
        assertFalse(testRoom.isDirty());
    }
}