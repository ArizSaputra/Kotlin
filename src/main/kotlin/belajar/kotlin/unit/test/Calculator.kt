package belajar.kotlin.unit.test

class Calculator {
    // Mendefinisikan kelas Calculator.

    fun divide(first: Int, second: Int): Int {
        // Mendefinisikan fungsi divide yang menerima dua parameter: first dan second (keduanya tipe data integer) dan mengembalikan integer.
        if (second == 0) {
            // Memeriksa apakah nilai dari parameter second adalah 0.
            throw IllegalArgumentException("Can not divide by zero")
            // Melemparkan exception IllegalArgumentException dengan pesan "Can not divide by zero" jika nilai parameter second adalah 0.
        } else {
            return first / second
            // Mengembalikan hasil dari pembagian first oleh second jika second bukan 0.
        }
    }

    fun add(first: Int, second: Int): Int {
        // Mendefinisikan fungsi add yang menerima dua parameter: first dan second (keduanya tipe data integer) dan mengembalikan integer.
        return first + second
        // Mengembalikan hasil penjumlahan dari first dan second.
    }
}

