package com.example.kristina.spatialite_android_library.SQLite;

/**
 * Callback interface for SQLite's profile function.
 */

public interface Profile {

    /**
     * Callback to profile (ie log) one SQL statement
     * with its estimated execution time.
     *
     * @param stmt SQL statement string
     * @param est  estimated execution time in milliseconds.
     */

    public void profile(String stmt, long est);
}

