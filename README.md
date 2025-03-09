### Farhanul Khair - 2208107010076
### Matakuliah : Kualitas Perangkat Lunak
<br>

# Penjelasan Proyek Unit Testing Android

## Deskripsi Proyek
Proyek ini adalah aplikasi kalkulator sederhana untuk Android yang dibangun dengan fokus pada implementasi pengujian (testing). Proyek ini mendemonstrasikan cara membuat dan menjalankan dua jenis pengujian dalam aplikasi Android:
1. **Unit Test (Local Test)**: Dijalankan di JVM lokal untuk menguji logika bisnis
2. **Instrumented Test**: Dijalankan di perangkat Android/emulator untuk menguji UI dan integrasi

## Struktur Proyek

### Kelas Utama
1. **MainActivity.java**: Activity utama yang berisi UI kalkulator dan logika untuk menangani input pengguna
2. **Calculator.java**: Kelas yang berisi logika bisnis untuk operasi matematika (tambah, kurang, kali, bagi)

### Layout
1. **activity_main.xml**: Tampilan UI kalkulator dengan input field, tombol, dan hasil

### Unit Test (Local Test)
1. **CalculatorUnitTest.java**: 
   - `testAddition()`: Menguji operasi penambahan
   - `testSubtraction()`: Menguji operasi pengurangan
   - `testMultiplication()`: Menguji operasi perkalian
   - `testDivision()`: Menguji operasi pembagian
   - `testDivisionByZero()`: Menguji penanganan error pembagian dengan nol

2. **ExampleUnitTest.java**:
   - `addition_isCorrect()`: Test default bawaan Android Studio

### Instrumented Test
1. **MainActivityInstrumentedTest.java**:
   - `useAppContext()`: Memverifikasi package aplikasi
   - `testAddButtonFunctionality()`: Menguji fungsionalitas tombol tambah
   - `testSubtractButtonFunctionality()`: Menguji fungsionalitas tombol kurang

2. **ExampleInstrumentedTest.java**:
   - `useAppContext()`: Test default bawaan Android Studio

## Fitur Kalkulator
- Input dua angka
- Operasi penambahan
- Operasi pengurangan
- Menampilkan hasil operasi

## Implementasi Testing

### Unit Testing
- Menggunakan JUnit 4
- Fokus pada pengujian metode-metode dalam kelas Calculator
- Mengikuti pola "Given-When-Then" untuk struktur pengujian
- Menggunakan anotasi `@Before` untuk setup lingkungan test
- Menggunakan anotasi `@Test(expected=...)` untuk menguji exception

### Instrumented Testing
- Menggunakan AndroidJUnit4 dan Espresso
- Menguji interaksi UI dan integrasi komponen
- Menggunakan ViewMatchers dan ViewActions untuk interaksi dengan UI
- Implementasi ActivityScenarioRule untuk lifecycle management

## Dokumentasi
Semua kelas testing dilengkapi dengan dokumentasi JavaDoc standar yang menjelaskan:
- Tujuan setiap test case
- Kondisi awal, tindakan yang dilakukan, dan hasil yang diharapkan
- Referensi ke kelas yang diuji

## Cara Menjalankan Test

### Menjalankan Unit Tests:
```bash
./gradlew test
```
Atau melalui Android Studio:
- Klik kanan pada file test
- Pilih "Run 'TestClassName'"

### Menjalankan Instrumented Tests:
```bash
./gradlew connectedAndroidTest
```
Atau melalui Android Studio:
- Pastikan emulator/perangkat terhubung
- Klik kanan pada file test
- Pilih "Run 'TestClassName'"

## Kesimpulan
Proyek ini menunjukkan praktik terbaik dalam membuat pengujian untuk aplikasi Android dengan membuat lebih dari jumlah minimum unit test (6 unit test) dan instrumented test (4 instrumented test) yang diminta (minimal 2 untuk masing-masing jenis).
