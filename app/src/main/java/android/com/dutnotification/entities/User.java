package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

/**
 * Created by Kenny on 1/26/2018.
 */
@Entity(tableName = "users")
public class User implements Serializable {

    @ColumnInfo(name = "user_id")
    @PrimaryKey
    private int userId;

    @ColumnInfo(name = "role_id")
    @ForeignKey(entity = Role.class, parentColumns = "role_id", childColumns = "role_id")
    private int roleId;

    private String code;

    private String password;

    private String fullname;

    private String phone;

    private String className;

    @ColumnInfo(name = "room_id")
    @ForeignKey(entity = Room.class, parentColumns = "room_id", childColumns = "room_id")
    private int roomId;

    public User() {
    }

    @Ignore
    public User(int userId, int roleId, String code, String password, String fullname, String phone, String className, int roomId) {
        this.userId = userId;
        this.roleId = roleId;
        this.code = code;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
        this.className = className;
        this.roomId = roomId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
