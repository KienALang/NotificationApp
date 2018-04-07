package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "school_year_schedules")
public class SchoolYearSchedule {
    @ColumnInfo(name = "schedule_Id")
    @PrimaryKey
    private int scheduleId;

    @ColumnInfo(name = "start_week_id")
    @ForeignKey(entity = Week.class, parentColumns = "week_id", childColumns = "start_week_id")
    private int startWeekId;

    @ColumnInfo(name = "end_week_id")
    @ForeignKey(entity = Week.class, parentColumns = "week_id", childColumns = "end_week_id")
    private int endWeekId;

    private String content;

    public SchoolYearSchedule() {
    }

    @Ignore
    public SchoolYearSchedule(int scheduleId, int startWeekId, int endWeekId, String content) {
        this.scheduleId = scheduleId;
        this.startWeekId = startWeekId;
        this.endWeekId = endWeekId;
        this.content = content;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getStartWeekId() {
        return startWeekId;
    }

    public void setStartWeekId(int startWeekId) {
        this.startWeekId = startWeekId;
    }

    public int getEndWeekId() {
        return endWeekId;
    }

    public void setEndWeekId(int endWeekId) {
        this.endWeekId = endWeekId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
