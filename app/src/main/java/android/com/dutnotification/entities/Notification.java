package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/15/2018.
 */

@Entity(tableName = "notification")
public class Notification {
    @PrimaryKey
    @ColumnInfo(name = "notification_id")
    private int notificationId;

    @ForeignKey(entity = NotificationCategory.class, parentColumns = "category_id", childColumns = "category_id")
    @ColumnInfo(name = "category_id")
    private int categoryId;

    private String title;

    private String content;

    @ColumnInfo(name = "create_date")
    private String createDate;

    @ForeignKey(entity = Status.class, parentColumns = "status_id", childColumns = "status_id")
    @ColumnInfo(name = "status_id")
    private int statusId;

    public Notification() {
    }

    @Ignore
    public Notification(int notificationId, int categoryId, String title, String content, String createDate, int statusId) {
        this.notificationId = notificationId;
        this.categoryId = categoryId;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.statusId = statusId;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
