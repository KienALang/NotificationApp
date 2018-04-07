package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "class_schedules")
public class ClassSchedule {
    @ColumnInfo(name = "class_code_id")
    @PrimaryKey
    @ForeignKey(entity = ClassCode.class, parentColumns = "class_code_id", childColumns = "class_code_id")
    private int classCodeId;

    @ColumnInfo(name = "subject_id")
    @ForeignKey(entity = Subject.class, parentColumns = "subject_id", childColumns = "subject_id")
    private int subjectId;

    @ColumnInfo(name = "teacher_id")
    @ForeignKey(entity = Subject.class, parentColumns = "subject_id", childColumns = "subject_id")
    private int teacherId;

    @ColumnInfo(name = "day_of_week_id")
    @ForeignKey(entity = Subject.class, parentColumns = "day_of_week_id", childColumns = "day_of_week_id")
    private int dayofWeekId;

    @ColumnInfo(name = "period_id")
    @ForeignKey(entity = PeriodTime.class, parentColumns = "period_id", childColumns = "period_id")
    private int periodId;

    @ColumnInfo(name = "start_week_id")
    @ForeignKey(entity = Week.class, parentColumns = "week_id", childColumns = "start_week_id")
    private int startWeekId;

    @ColumnInfo(name = "end_week_id")
    @ForeignKey(entity = Week.class, parentColumns = "week_id", childColumns = "end_week_id")
    private int endWeekId;

    @ColumnInfo(name = "room_id")
    @ForeignKey(entity = Room.class, parentColumns = "room_id", childColumns = "room_id")
    private int roomId;

    public ClassSchedule() {
    }

    @Ignore
    public ClassSchedule(int classCodeId, int subjectId, int teacherId, int dayofWeekId, int periodId, int startWeekId, int endWeekId, int roomId) {
        this.classCodeId = classCodeId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
        this.dayofWeekId = dayofWeekId;
        this.periodId = periodId;
        this.startWeekId = startWeekId;
        this.endWeekId = endWeekId;
        this.roomId = roomId;
    }

    public int getClassCodeId() {
        return classCodeId;
    }

    public void setClassCodeId(int classCodeId) {
        this.classCodeId = classCodeId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getDayofWeekId() {
        return dayofWeekId;
    }

    public void setDayofWeekId(int dayofWeekId) {
        this.dayofWeekId = dayofWeekId;
    }

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
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

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
