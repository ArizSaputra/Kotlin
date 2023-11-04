package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assumptions.*
import org.opentest4j.TestAbortedException

@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
// @DisplayName("Test for Calculator class")
class CalculatorTest {

    val calculator = Calculator()
// Membuat instance dari kelas Calculator dan menyimpannya ke dalam variabel 'calculator'.

    @Test
// Anotasi untuk menandai bahwa fungsi berikutnya adalah unit test.
// @DisplayName("Test for function Calculator.add(10, 10)")
    fun testAddSuccess() {
        // Fungsi testAddSuccess untuk menguji fungsi add dengan parameter 10 dan 10.
        println("Unit Test testAddSuccess")
        // Mencetak pesan "Unit Test testAddSuccess" ke konsol.
        val result = calculator.add(10, 10)
        // Memanggil fungsi add dari objek calculator dengan parameter 10 dan 10, hasilnya disimpan dalam variabel 'result'.
        assertEquals(20, result, "Hasil harusnya 20")
        // Membandingkan nilai yang diharapkan (20) dengan hasil dari fungsi calculator.add(10, 10).
    }

    @Test
// Anotasi untuk menandai bahwa fungsi berikutnya adalah unit test.
// @DisplayName("Test for function Calculator.add(20, 20)")
    fun testAddSuccess2() {
        // Fungsi testAddSuccess2 untuk menguji fungsi add dengan parameter 20 dan 20.
        println("Unit Test testAddSuccess2")
        // Mencetak pesan "Unit Test testAddSuccess2" ke konsol.
        val result = calculator.add(20, 20)
        // Memanggil fungsi add dari objek calculator dengan parameter 20 dan 20, hasilnya disimpan dalam variabel 'result'.
        assertEquals(40, result, "Hasil harus 40")
        // Membandingkan nilai yang diharapkan (40) dengan hasil dari fungsi calculator.add(20, 20).
    }

}