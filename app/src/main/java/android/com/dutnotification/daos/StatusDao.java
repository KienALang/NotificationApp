package android.com.dutnotification.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.com.dutnotification.entities.Status;

import java.util.List;

/**
 * Created by Kenny on 3/21/2018.
 */
@Dao
public interface StatusDao extends BaseDao<Status> {

    @Query("SELECT * FROM statuses")
    List<Status> getStatuses();

    @Query("SELECT * FROM statuses WHERE status_id = :id")
    Status getStatusById(int id);
}
