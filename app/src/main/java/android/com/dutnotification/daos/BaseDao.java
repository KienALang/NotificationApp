package android.com.dutnotification.daos;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Kenny on 3/22/2018.
 */

public interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long[] insertAll(List<T> t);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insert(T t);

    @Update
    void update(T t);

    @Delete
    void delete(T t);
}
