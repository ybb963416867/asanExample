package com.example.asanexample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnUseAfterFreeClick(view: View?) {
        ASanTest.testUseAfterFree()
    }

    fun onBtnHeapBufferOverflow(view: View?) {
        ASanTest.testHeapBufferOverflow()
    }

    fun onBtnStackBufferOverflow(view: View?) {
        ASanTest.testStackBufferOverflow()
    }

    fun onBtnGlobalBufferOverflow(view: View?) {
        ASanTest.testGlobalBufferOverflow()
    }

    fun onBtnUseAfterReturn(view: View?) {
        ASanTest.testUseAfterReturn()
    }

    fun onBtnUseAfterScope(view: View?) {
        ASanTest.testUseAfterScope()
    }

    fun onBtnUseRepeatFree(view: View?) {
        ASanTest.testRepeatFree()
    }

    fun onBtnMemoryLeak(view: View?) {
        ASanTest.testMemoryLeak()
    }
}