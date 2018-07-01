package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.android.pets.data.PetContract.PetEntry;

import static java.security.AccessController.getContext;

public class PetDbHelper extends SQLiteOpenHelper {
    private static final int VERSION_DATABASE = 1;
    private static final String NAME_DATABASE = "shelter.db";

    private static final String SQL_CREATE_DATABASE ="CREATE TABLE " + PetEntry.TABLE_NAME + " ("
            + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
            + PetEntry.COLUMN_PET_BREED + " TEXT, "
            + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
            + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

    private static final String SQL_DELETE_DATABASE = "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;

    public PetDbHelper(Context context){
        super(context, NAME_DATABASE, null, VERSION_DATABASE);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(SQL_CREATE_DATABASE);
        Log.d("hay", "hay");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
