package com.javapractice.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    void findGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 3});

        int result = businessImpl.findGreatestFromAllData();
        assertEquals(24, result);
    }
}

