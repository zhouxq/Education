package com.fzw.education.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

//DatabaseHelper��Ϊһ������SQLite�������࣬�ṩ��������Ĺ��ܣ�
//��һ��getReadableDatabase(),getWritableDatabase()���Ի��SQLiteDatabse����ͨ���ö�����Զ����ݿ���в���
//�ڶ����ṩ��onCreate()��onUpgrade()�����ص����������������ڴ������������ݿ�ʱ�������Լ��Ĳ���

public class DatabaseHelper extends SQLiteOpenHelper {
	
	private static final int VERSION = 1;
	//��SQLiteOepnHelper�����൱�У������иù��캯��
	public DatabaseHelper(Context context, String name, CursorFactory factory,
			int version) {
		//����ͨ��super���ø��൱�еĹ��캯��
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	public DatabaseHelper(Context context,String name){
		this(context,name,VERSION);
	}
	public DatabaseHelper(Context context,String name,int version){
		this(context, name,null,version);
	}

	//�ú������ڵ�һ�δ������ݿ��ʱ��ִ��,ʵ�������ڵ�һ�εõ�SQLiteDatabse�����ʱ�򣬲Ż�����������
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		System.out.println("create a Database");
		//db.execSQL("CREATE TABLE IF NOT EXISTS gainian(_id INTEGER PRIMARY KEY AUTOINCREMENT,gainiantext)");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		System.out.println("update a Database");
	}

}