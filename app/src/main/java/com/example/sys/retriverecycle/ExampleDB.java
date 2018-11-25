package com.example.sys.retriverecycle;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Map;

public class ExampleDB extends SQLiteOpenHelper {
    private  static final String DATABASE="sample_db";
    private  static final String TABLE_NAME="student";
    public  static  final  String NAME="Name";
    public  static final  String COLLEGE="College";
    public  static  final  String BRANCH="Branch";
    public ArrayList<Map<String,String>> getDatafromDatabase;

    public ExampleDB(Context context) {
        super( context,DATABASE, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL( "Create table "+TABLE_NAME +"("+NAME+" TEXT,"+COLLEGE+" TEXT,"
                +BRANCH+" TEXT"+")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL( "DROP TABLE IF EXISTS"+TABLE_NAME );
        onCreate( sqLiteDatabase );
    }
    public void  insert(String s1,String s2,String s3)
    {
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues contentValues=new ContentValues(  );
        contentValues.put( NAME,s1 );
        contentValues.put( COLLEGE,s2 );
        contentValues.put( BRANCH,s3 );
        sqLiteDatabase.insert( TABLE_NAME,null,contentValues );
    }
}
