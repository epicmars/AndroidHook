package com.androidpi.liblua

class NativeLib {

    /**
     * A native method that is implemented by the 'liblua' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'liblua' library on application startup.
        init {
            System.loadLibrary("liblua")
        }
    }
}