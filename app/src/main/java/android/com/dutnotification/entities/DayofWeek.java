package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "days_of_week")
public class DayofWeek {
    @ColumnInfo(name = "day_of_week_id")
    @PrimaryKey
    private int dayofWeekId;

    @ColumnInfo(name = "day_of_week_name")
    private String dayofWeekName;

    public DayofWeek() {
    }

    @Ignore
    public DayofWeek(int dayofWeekId, String dayofWeekName) {
        this.dayofWeekId = dayofWeekId;
        this.dayofWeekName = dayofWeekName;
    }

    public int getDayofWeekId() {
        return dayofWeekId;
    }

    public void setDayofWeekId(int dayofWeekId) {
        this.dayofWeekId = dayofWeekId;
    }

    public String getDayofWeekName() {
        return dayofWeekName;
    }

    public void setDayofWeekName(String dayofWeekName) {
        this.dayofWeekName = dayofWeekName;
    }
}
