package com.example.androidunittesting;

import android.content.Context;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Kelas pengujian instrumentasi untuk menguji fungsionalitas UI di {@link MainActivity}.
 * Menggunakan framework Espresso untuk menguji interaksi antarmuka pengguna.
 *
 * @see <a href="http://d.android.com/tools/testing">Dokumentasi Pengujian Android</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    /**
     * Aturan yang akan menjalankan {@link MainActivity} sebelum setiap pengujian dilakukan.
     * Menggunakan {@link ActivityScenarioRule} untuk mengelola siklus hidup aktivitas.
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    /**
     * Menguji apakah aplikasi berjalan dalam package yang benar.
     * <p>
     * Pengujian ini mendapatkan konteks aplikasi dan membandingkan package name yang
     * diharapkan dengan package name aktual aplikasi yang sedang diuji.
     * </p>
     *
     * @throws AssertionError jika package name tidak sesuai.
     */
    @Test
    public void useAppContext() {
        // Mendapatkan konteks aplikasi
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        // Memastikan package name sesuai dengan yang diharapkan
        assertEquals("com.example.androidunittesting", appContext.getPackageName());
    }

    /**
     * Menguji fungsionalitas tombol tambah pada UI.
     * <p>
     * Langkah pengujian:
     * 1. Memasukkan angka "10" ke dalam input pertama.
     * 2. Memasukkan angka "5" ke dalam input kedua.
     * 3. Menekan tombol tambah.
     * 4. Memverifikasi bahwa hasil yang ditampilkan adalah "15.0".
     * </p>
     *
     * @throws AssertionError jika hasil perhitungan tidak sesuai.
     */
    @Test
    public void testAddButtonFunctionality() {
        // Memasukkan angka ke input pertama
        onView(withId(R.id.num1EditText)).perform(typeText("10"), closeSoftKeyboard());

        // Memasukkan angka ke input kedua
        onView(withId(R.id.num2EditText)).perform(typeText("5"), closeSoftKeyboard());

        // Menekan tombol tambah
        onView(withId(R.id.addButton)).perform(click());

        // Memeriksa apakah hasil yang ditampilkan sesuai dengan "15.0"
        onView(withId(R.id.resultTextView)).check(matches(withText(containsString("15.0"))));
    }

    /**
     * Menguji fungsionalitas tombol kurang pada UI.
     * <p>
     * Langkah pengujian:
     * 1. Memasukkan angka "10" ke dalam input pertama.
     * 2. Memasukkan angka "5" ke dalam input kedua.
     * 3. Menekan tombol kurang.
     * 4. Memverifikasi bahwa hasil yang ditampilkan adalah "5.0".
     * </p>
     *
     * @throws AssertionError jika hasil perhitungan tidak sesuai.
     */
    @Test
    public void testSubtractButtonFunctionality() {
        // Memasukkan angka ke input pertama
        onView(withId(R.id.num1EditText)).perform(typeText("10"), closeSoftKeyboard());

        // Memasukkan angka ke input kedua
        onView(withId(R.id.num2EditText)).perform(typeText("5"), closeSoftKeyboard());

        // Menekan tombol kurang
        onView(withId(R.id.subtractButton)).perform(click());

        // Memeriksa apakah hasil yang ditampilkan sesuai dengan "5.0"
        onView(withId(R.id.resultTextView)).check(matches(withText(containsString("5.0"))));
    }
}
