package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/21/2018.
 */
@Entity(tableName = "teachers")
public class Teacher {

    @ColumnInfo(name = "teacher_id")
    @PrimaryKey
    private int teacherId;

    private String fullname;

    private String phone;

    private String email;

    public Teacher() {
    }

    @Ignore
    public Teacher(int teacherId, String fullname, String phone, String email) {
        this.teacherId = teacherId;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
