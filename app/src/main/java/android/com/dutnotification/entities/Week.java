package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "weeks")
public class Week {

    @ColumnInfo(name = "week_id")
    @PrimaryKey
    private int weekId;

    @ColumnInfo(name = "week_name")
    private String weekName;

    @ColumnInfo(name = "start_date")
    private String startDate;

    @ColumnInfo(name = "end_date")
    private String endDate;

    public Week() {
    }

    @Ignore
    public Week(int weekId, String weekName, String startDate, String endDate) {
        this.weekId = weekId;
        this.weekName = weekName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getWeekId() {
        return weekId;
    }

    public void setWeekId(int weekId) {
        this.weekId = weekId;
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
