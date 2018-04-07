package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "class_codes")
public class ClassCode {
    @ColumnInfo(name = "class_code_id")
    @PrimaryKey
    private int classCodeId;

    private String code;

    public ClassCode() {
    }

    @Ignore
    public ClassCode(int classCodeId, String code) {
        this.classCodeId = classCodeId;
        this.code = code;
    }

    public int getClassCodeId() {
        return classCodeId;
    }

    public void setClassCodeId(int classCodeId) {
        this.classCodeId = classCodeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
