package com.starsep.androidlintbug169751286

import com.starsep.library.TestClass
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test = TestClass(
            text = "test",
            testDouble = 42.123,
            testInt = 42
        )
        testText.text = getString(R.string.stringTemplate, test.text, test.testDouble, test.testInt)
    }
}