package com.javapractice.mockito;

import org.junit.jupiter.api.Test;
//import org.mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessStubTest {

    @Test
    void findGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findGreatestFromAllData();
        assertEquals(24, result);
    }
}

