package com.example.user.myapplication; /**
 * Created by User on 07/02/2017.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "usersInfo";
    // Contacts table name
    private static final String TABLE_SHOPS = "users";
    // Shops Table Columns names
    private static final String KEY_ID = "email";
    private static final String KEY_NAME = "password";
    public DB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_SHOPS + "("
        + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SHOPS);
// Creating tables again
        onCreate(db);
    }
}
