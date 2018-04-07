package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "school_years")
public class SchoolYear {

    @ColumnInfo(name = "school_year_id")
    @PrimaryKey
    private int schoolYearId;

    @ColumnInfo(name = "start_year")
    private int startYear;

    @ColumnInfo(name = "end_year")
    private int endYear;

    public SchoolYear() {
    }

    @Ignore
    public SchoolYear(int schoolYearId, int startYear, int endYear) {
        this.schoolYearId = schoolYearId;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public int getSchoolYearId() {
        return schoolYearId;
    }

    public void setSchoolYearId(int schoolYearId) {
        this.schoolYearId = schoolYearId;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }
}
