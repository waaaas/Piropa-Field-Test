package com.piropa_field_test.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "Data.db";
	private static final int DATABASE_VERSION = 1;
	
	private static final String DATA_TABLE = "Data";
	private static final String DATA_ID = "_ID";
	private static final String DATA_GPS_X ="X-Axis";
	private static final String DATA_GPS_Y ="Y-Axis";
	private static final String DATA_GPS_Z ="Z-Axis";
	private static final String DATA_2G ="2G";
	private static final String DATA_CONTENT = "content";
	
	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null/*factory*/, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
	/*	String createDB = "CREATE TABLE "+DATA_TABLE+" ("+
				DATA_ID+" INTEGER PRIMARY KEY, "+ DATA_TITEL
	 */
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS "+DATA_TABLE);
		onCreate(db);
	}

}
