package com.example.venky.eventlist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Venky on 2/15/2016.
 */
public class DBhelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "eventManager";

    // Contacts table name
    private static final String TABLE_EVENTS = "events";

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "eventName";
    private static final String KEY_DESC = "eventDesc";
    private static final String KEY_LOCATION = "eventLocation";
    private static final String KEY_DATE = "eventDate";


    public DBhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_EVENTS_TABLE = "CREATE TABLE " + TABLE_EVENTS + "("+KEY_ID +" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + KEY_NAME + " TEXT," + KEY_DESC + " TEXT,"
                + KEY_LOCATION + " TEXT,"+ KEY_DATE + " DATE"  + ")";
        db.execSQL(CREATE_EVENTS_TABLE);


    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EVENTS);
        onCreate(db);

    }

    public void addEvent(Event obj){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, obj.getEventName());
        values.put(KEY_DESC, obj.getEventDesc());
        values.put(KEY_LOCATION, obj.getEventLocation());
        values.put(KEY_DATE, obj.getEventDate());
        db.insert(TABLE_EVENTS, null, values);
        db.close();

    }
    public List<Event> displayEvents() {
        List<Event> event_list = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + TABLE_EVENTS + " ORDER BY " + KEY_DATE;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                Event event = new Event();
                event.setEventName(cursor.getString(1));
                event.setEventDesc(cursor.getString(2));
                event.setEventLocation(cursor.getString(3));
                event.setEventDate(cursor.getString(4));
                event_list.add(event);
//                event_list.add(cursor.getString(cursor.getColumnIndex("eventName")));
            } while (cursor.moveToNext());
        }
        db.close();
        cursor.close();
        return event_list;
    }
    public List<Event> byLocation(String loc) {
        List<Event> eventt_list = new ArrayList<>();
        String selectQueryy = "SELECT  * FROM " + TABLE_EVENTS + " WHERE "+ KEY_LOCATION + " = ' "+loc+"'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQueryy, null);
        if (cursor.moveToFirst()) {
            do {
                Event event = new Event();
                event.setEventName(cursor.getString(1));
                event.setEventDesc(cursor.getString(2));
                event.setEventLocation(cursor.getString(3));
                event.setEventDate(cursor.getString(4));
                eventt_list.add(event);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return eventt_list;
    }
}
