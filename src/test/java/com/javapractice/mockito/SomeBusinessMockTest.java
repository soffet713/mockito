package com.javapractice.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    @Test
    void findGreatestFromAllData() {
        DataService dataServiceMock = Mockito.mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 3});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

        int result = businessImpl.findGreatestFromAllData();
        assertEquals(24, result);
    }
}

