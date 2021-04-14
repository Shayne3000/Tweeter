package tweeter.libraries.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import tweeter.libraries.roomdb.dao.UserDao
import tweeter.libraries.roomdb.entities.User

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class TweeterDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        const val DATABASE_NAME = "tweeter_db.db"
    }
}
