package android.com.dutnotification.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.com.dutnotification.entities.NotificationCategory;

import java.util.List;

/**
 * Created by Kenny on 3/23/2018.
 */
@Dao
public interface NotificationCategoryDao extends BaseDao<NotificationCategory> {
    @Query("SELECT * FROM notification_categories")
    List<NotificationCategory> getNotificationCategories();

    @Query("SELECT * FROM notification_categories WHERE category_id = :id")
    NotificationCategory getNotificationCategoryById(int id);
}
