package android.com.dutnotification.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.com.dutnotification.entities.Bill;

import java.util.List;

/**
 * Created by Kenny on 3/15/2018.
 */
@Dao
public interface BillDao extends BaseDao<Bill> {

    @Query("SELECT * FROM bills")
    List<Bill> getBills();

    @Query("SELECT * FROM bills WHERE bill_id = :id")
    Bill getBillById(int id);
}
