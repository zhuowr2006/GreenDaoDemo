package com.hema.frame.greendaodemo.bean.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.github.yuweiguocn.library.greendao.MigrationHelper;
import com.hema.frame.greendaodemo.bean.DaoMaster;
import com.hema.frame.greendaodemo.bean.ShopDao;

import org.greenrobot.greendao.database.Database;

/**
 * Created by Administrator on 2017/7/6.
 */

public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        //参数为所有的Dao类：
        //MigrationHelper.migrate(db,TestDataDao.class,TestData2Dao.class,TestData3Dao.class);
        MigrationHelper.migrate(db,ShopDao.class);
    }
}
