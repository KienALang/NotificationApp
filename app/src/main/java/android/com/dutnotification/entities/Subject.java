package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "subjects")
public class Subject {
    @ColumnInfo(name = "subject_id")
    @PrimaryKey
    private int subjectId;

    @ColumnInfo(name = "subject_name")
    private String subjectName;

    @ColumnInfo(name = "number_of_credit")
    private float numberofCredit;

    public Subject() {
    }

    @Ignore
    public Subject(int subjectId, String subjectName, float numberofCredit) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.numberofCredit = numberofCredit;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getNumberofCredit() {
        return numberofCredit;
    }

    public void setNumberofCredit(float numberofCredit) {
        this.numberofCredit = numberofCredit;
    }
}
