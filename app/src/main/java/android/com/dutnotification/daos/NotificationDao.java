package android.com.dutnotification.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.com.dutnotification.entities.Notification;

import java.util.List;

/**
 * Created by Kenny on 3/23/2018.
 */
@Dao
public interface NotificationDao extends BaseDao<Notification> {
    @Query("SELECT * FROM notification")
    List<Notification> getNotifications();

    @Query("SELECT * FROM notification WHERE notification_id = :id")
    Notification getNotificationById(int id);
}
