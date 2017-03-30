package ru.serdyuk.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class LomTest {
    @Test
    @Repeat(100)
    public void getData() throws Exception {
        Lom mock = Mockito.mock(Lom.class);
        Mockito.when(mock.getData()).thenReturn("success");

        assertEquals("success", mock.getData());
    }
}