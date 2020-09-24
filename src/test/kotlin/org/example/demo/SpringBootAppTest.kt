package org.example.demo

import assertk.assertThat
import assertk.assertions.isNotEmpty
import org.junit.jupiter.api.Test

class SpringBootAppTest : SpringBootBaseTestCase() {
    @Test
    fun testSpike() {
        assertThat("spike").isNotEmpty()
    }
}