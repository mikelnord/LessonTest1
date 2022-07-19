package com.gb.android.lessontest1

import junit.framework.Assert.*
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class ExampleHomeworkTest {

    @Test
    fun hometest_assertEquals() {
        assertEquals(4, Calculator.add(2, 2))
        assertEquals("Calculator.add(2, 2) test failed", 3, Calculator.add(2, 2))
    }


    @Test
    fun hometest_assertNotEquals() {
        assertNotEquals(3, Calculator.add(2, 2))
        assertNotEquals("Calculator.add(2, 2) test failed", 4, Calculator.add(2, 2))
    }

    @Test
    fun hometest_assertArrayEquals() {
        assertArrayEquals(
            "Array Equal Test",
            arrayOf(1, 2, 3),
            arrayOf(1, 2, 3)
        )

        assertArrayEquals(
            "Array Equal Test",
            arrayOf(1, 2, 3),
            arrayOf(1, 3, 2)
        )

        assertArrayEquals(
            "Array Equal Test",
            arrayOf(1, 2, 3),
            arrayOf(1, 2, 3, 4)
        )
    }

    @Test
    fun hometest_assertNull() {
        val nullString: String? = null
        val notNullString = "gb.lessontest1.com"
        assertNotNull(notNullString)
        assertNotNull(nullString)
        assertNull(nullString)
        assertNull(notNullString)
    }

    @Test
    fun hometest_assertSame() {
        val originalObject = "gb.lessontest1.com"
        val otherObject = "example.lesson1.com"
        assertNotSame(originalObject, otherObject)
        assertNotSame(originalObject, originalObject)
        assertSame(originalObject, originalObject)
        assertSame(originalObject, otherObject)
    }

}