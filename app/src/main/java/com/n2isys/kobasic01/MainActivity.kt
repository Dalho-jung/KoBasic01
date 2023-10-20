package com.n2isys.kobasic01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.kobasic01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding // 요거 선언도 해줘야함 _01
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater,null,false)  // 요거 해줘야함 _02
        setContentView(binding.root) // 요거 해줘야함 _03 binding.root






    }
}