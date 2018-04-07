package android.com.dutnotification.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.com.dutnotification.entities.User;

import java.util.List;

/**
 * Created by Kenny on 3/15/2018.
 */
@Dao
public interface UserDao extends BaseDao<User> {

    @Query("SELECT * FROM users")
    List<User> getUsers();

    @Query("SELECT * FROM users WHERE code = :code")
    User getUserByCode(String code);

    @Query("SELECT * FROM users WHERE user_id = :id")
    User getUserById(int id);
}
