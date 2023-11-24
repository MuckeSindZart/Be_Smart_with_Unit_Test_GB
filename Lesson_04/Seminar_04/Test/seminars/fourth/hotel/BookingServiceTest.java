package seminars.fourth.hotel;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {

    HotelService hotelMock;
    BookingService bookingService;

    @BeforeEach
    void setUp() {
        hotelMock = mock(HotelService.class);
        bookingService = new BookingService(hotelMock);
    }

    @Test
    void bookingTestTrue() {
        when(hotelMock.isRoomAvailable(11)).thenReturn(true);
        assertTrue(bookingService.bookRoom(11));
    }

    @Test
    void bookingTestFalse() {
        when(hotelMock.isRoomAvailable(12)).thenReturn(false);
        assertFalse(bookingService.bookRoom(12));
    }
}