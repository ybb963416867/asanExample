package com.example.asanexample;

public class ASanTest {
    static {
        System.loadLibrary("asanexample");
    }
    public static native void testUseAfterFree();
    public static native void testHeapBufferOverflow();
    public static native void testStackBufferOverflow();
    public static native void testGlobalBufferOverflow();
    public static native void testUseAfterReturn();
    public static native void testUseAfterScope();
    public static native void testRepeatFree();
    public static native void testMemoryLeak();
}
