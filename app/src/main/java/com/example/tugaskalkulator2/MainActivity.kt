package com.example.tugaskalkulator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaskalkulator2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding.perTambahan.setOnClickListener {
            tambah()
        }
        binding.peNgurangan.setOnClickListener {
            kurang()
        }
        binding.perKalian.setOnClickListener {
            kali()
        }
        binding.perKalian.setOnClickListener {
            bagi()
        }
        setContentView(binding.root)
    }
    private fun tambah(){
        var angka1 = binding.ankake1.text.toString().toInt()
        var angka2 = binding.ankake2.text.toString().toInt()
        var hasil = angka1 + angka2
        binding.perHitungan.text = "$angka1 + $angka2 = $hasil"
    }
    private fun kurang(){
        var angka1 = binding.ankake1.text.toString().toInt()
        var angka2 = binding.ankake2.text.toString().toInt()
        var hasil = angka1 + angka2
        binding.perHitungan.text = "$angka1 - $angka2 = $hasil"
    }
    private fun kali(){
        var angka1 = binding.ankake1.text.toString().toInt()
        var angka2 = binding.ankake2.text.toString().toInt()
        var hasil = angka1 * angka2
        binding.perHitungan.text = "$angka1 x $angka2 = $hasil"
    }
    private fun bagi(){
        var angka1 = binding.ankake1.text.toString().toInt()
        var angka2 = binding.ankake2.text.toString().toInt()
        var hasil = angka1 / angka2
        binding.perHitungan.text = "$angka1 / $angka2 = $hasil"
    }
    private fun clear(){
        binding.ankake1.text.clear()
        binding.ankake2.text.clear()
        binding.perHitungan.text="Hasil"
    }
}