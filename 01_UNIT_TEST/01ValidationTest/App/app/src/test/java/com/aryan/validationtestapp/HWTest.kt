package com.aryan.validationtestapp

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HWTest {

    @Test
    fun `( is more than ) return false`() {
        val result = HW.checkBraces(
            string = "((((0))"
        )

        // Expected to return false for the test case above
        assertThat(result).isFalse()
    }

    @Test
    fun `) is more than ( return false`() {
        val result = HW.checkBraces(
            string = "((0))))))"
        )

        // Expected to return false for the test case above
        assertThat(result).isFalse()
    }

    @Test
    fun `( is same as ) return true`() {
        val result = HW.checkBraces(
            string = "(for of the(test))"
        )

        // Expected to return true for the test case above
        assertThat(result).isTrue()
    }
}