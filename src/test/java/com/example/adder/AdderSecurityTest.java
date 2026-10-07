package com.example.adder;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdderSecurityTest {

    @Test
    void adderDoesNotExposeMutablePublicStateOrUnexpectedPublicMethods() {
        Field[] publicFields = Adder.class.getFields();

        assertEquals(0, publicFields.length);

        Method[] publicMethods = Adder.class.getDeclaredMethods();

        assertTrue(Arrays.stream(publicMethods)
                .filter(method -> Modifier.isPublic(method.getModifiers()))
                .allMatch(method -> method.getName().equals("add")));
    }
}
