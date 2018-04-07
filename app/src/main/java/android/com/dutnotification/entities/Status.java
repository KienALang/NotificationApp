package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/15/2018.
 */

@Entity(tableName = "statuses")
public class Status {
    @PrimaryKey
    @ColumnInfo(name = "status_id")
    private int statusId;

    @ColumnInfo(name = "status_name")
    private String statusName;

    public Status() {
    }

    @Ignore
    public Status(int statusId, String statusName) {
        this.statusId = statusId;
        this.statusName = statusName;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
