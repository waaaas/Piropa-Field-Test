package com.piropa_field_test.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "Data.db";
	private static final int DATABASE_VERSION = 1;
	
	private static final String DATA_TABLE = "Piropadb";
	
	private static final String DATA_RADIO_MAST_ID = "RADIO_MAST_ID";
	private static final String DATA_ID = "_ID";
	private static final String DATA_GPS_X ="X-Axis";
	private static final String DATA_GPS_Y ="Y-Axis";
	private static final String DATA_SIGNAL_VALUE ="Signal_Value";
	
	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null/*factory*/, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
	String createDB = "CREATE TABLE "+DATA_TABLE+" ("+
				DATA_RADIO_MAST_ID+" INTEGER,"+
				DATA_ID+" INTEGER PRIMARY KEY, "+ 
				DATA_GPS_X+ " TEXT,"+
				DATA_GPS_Y+ " TEXT,"+
				DATA_SIGNAL_VALUE+ " INTEGER)";
	db.execSQL(createDB);
	 
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS "+DATA_RADIO_MAST_ID);
		onCreate(db);
	}

}
