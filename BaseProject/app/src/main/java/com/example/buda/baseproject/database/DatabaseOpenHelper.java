package com.example.buda.baseproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

import timber.log.Timber;

/**
 * Created by Buda on 6/6/2016.
 */
public abstract class DatabaseOpenHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "base-project";
    private static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            createTables(connectionSource);
        } catch (SQLException e) {
            Timber.e(e, "onCreate Could not create new table");
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            dropTables(connectionSource);
            onCreate(database, connectionSource);
        } catch (SQLException e) {
            Timber.e(e, "onUpgrade Could not create new table");
        }
    }

    /**
     * Create all tables
     * @param connectionSource
     * @throws SQLException
     */
    private void createTables(ConnectionSource connectionSource) throws SQLException {

    }

    /**
     * Drops all tables
     * @param connectionSource
     * @throws SQLException
     */
    protected void dropTables(ConnectionSource connectionSource) throws SQLException {

    }


    /**
     * Drops all tables and recreates them
     * @param context
     * @return
     */
    public boolean resetDatabase(Context context) {
//        return context.resetDatabase(DATABASE_NAME);
        try {
            dropTables(getConnectionSource());
            createTables(getConnectionSource());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
