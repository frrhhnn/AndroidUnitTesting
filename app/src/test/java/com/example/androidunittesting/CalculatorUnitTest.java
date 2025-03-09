package com.example.androidunittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Kelas unit test untuk menguji fungsionalitas dasar dari kelas {@link Calculator}.
 * Pengujian mencakup operasi aritmetika dasar: penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class CalculatorUnitTest {
    private Calculator calculator;

    /**
     * Mengatur lingkungan pengujian sebelum setiap metode pengujian dijalankan.
     * Menginisialisasi instance baru dari kelas {@link Calculator}.
     */
    @Before
    public void setup() {
        calculator = new Calculator();
    }

    /**
     * Menguji operasi penjumlahan dalam {@link Calculator}.
     * <p>
     * Langkah pengujian:
     * 1. Diberikan angka 10.0 dan 5.0.
     * 2. Menjalankan metode {@code add()} untuk melakukan penjumlahan.
     * 3. Memverifikasi bahwa hasilnya adalah 15.0.
     * </p>
     *
     * @throws AssertionError jika hasil perhitungan tidak sesuai.
     */
    @Test
    public void testAddition() {
        // Given
        double a = 10.0;
        double b = 5.0;
        double expected = 15.0;

        // When
        double result = calculator.add(a, b);

        // Then
        assertEquals(expected, result, 0.001);
    }

    /**
     * Menguji operasi pengurangan dalam {@link Calculator}.
     * <p>
     * Langkah pengujian:
     * 1. Diberikan angka 10.0 dan 5.0.
     * 2. Menjalankan metode {@code subtract()} untuk melakukan pengurangan.
     * 3. Memverifikasi bahwa hasilnya adalah 5.0.
     * </p>
     *
     * @throws AssertionError jika hasil perhitungan tidak sesuai.
     */
    @Test
    public void testSubtraction() {
        // Given
        double a = 10.0;
        double b = 5.0;
        double expected = 5.0;

        // When
        double result = calculator.subtract(a, b);

        // Then
        assertEquals(expected, result, 0.001);
    }

    /**
     * Menguji operasi perkalian dalam {@link Calculator}.
     * <p>
     * Langkah pengujian:
     * 1. Diberikan angka 10.0 dan 5.0.
     * 2. Menjalankan metode {@code multiply()} untuk melakukan perkalian.
     * 3. Memverifikasi bahwa hasilnya adalah 50.0.
     * </p>
     *
     * @throws AssertionError jika hasil perhitungan tidak sesuai.
     */
    @Test
    public void testMultiplication() {
        // Given
        double a = 10.0;
        double b = 5.0;
        double expected = 50.0;

        // When
        double result = calculator.multiply(a, b);

        // Then
        assertEquals(expected, result, 0.001);
    }

    /**
     * Menguji operasi pembagian dalam {@link Calculator}.
     * <p>
     * Langkah pengujian:
     * 1. Diberikan angka 10.0 dan 5.0.
     * 2. Menjalankan metode {@code divide()} untuk melakukan pembagian.
     * 3. Memverifikasi bahwa hasilnya adalah 2.0.
     * </p>
     *
     * @throws AssertionError jika hasil perhitungan tidak sesuai.
     */
    @Test
    public void testDivision() {
        // Given
        double a = 10.0;
        double b = 5.0;
        double expected = 2.0;

        // When
        double result = calculator.divide(a, b);

        // Then
        assertEquals(expected, result, 0.001);
    }

    /**
     * Menguji pembagian oleh nol dalam {@link Calculator}.
     * <p>
     * Langkah pengujian:
     * 1. Diberikan angka 10.0 dan 0.0 sebagai penyebut.
     * 2. Menjalankan metode {@code divide()}.
     * 3. Memverifikasi bahwa metode ini melemparkan {@link IllegalArgumentException}.
     * </p>
     *
     * @throws IllegalArgumentException jika pembagian oleh nol terjadi.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        // When
        calculator.divide(10.0, 0.0);
        // Then: Harus melempar IllegalArgumentException
    }
}
