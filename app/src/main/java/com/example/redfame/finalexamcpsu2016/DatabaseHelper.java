package com.example.redfame.finalexamcpsu2016;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Promlert on 2016-11-20.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Login";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "Login";
    public static final String COL_ID = "_id";
    public static final String COL_NAME = "_name";
    public static final String COL_Username = "_username";
    public static final String COL_Password = "_password";

    private static final String SQL_CRATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME + " TEXT, "
                    + COL_Username + " TEXT"
                    + COL_Password + " TEXT"
                    + ")";

    public DatabaseHelper(Context context1, String databaseName, Context context, int databaseVersion) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_NAME, "Android Studio");
        cv.put(COL_Username, "android");
        cv.put(COL_Password, "123456");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Promlert Lovichit");
        cv.put(COL_Username, "promlert");
        cv.put(COL_Password, "456789");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Mark Zuckerberg");
        cv.put(COL_Username, "markz");
        cv.put(COL_Password, "789012");
        db.insert(TABLE_NAME, null, cv);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
