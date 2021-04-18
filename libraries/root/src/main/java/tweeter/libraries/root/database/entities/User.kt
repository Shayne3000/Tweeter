package tweeter.libraries.root.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class User(
    @PrimaryKey val id: Int,
    val name: String,
    val username: String
)
