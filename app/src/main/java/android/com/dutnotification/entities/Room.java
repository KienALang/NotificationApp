package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/15/2018.
 */
@Entity(tableName = "rooms")
public class Room {
    @PrimaryKey
    @ColumnInfo(name = "room_id")
    private int roomId;

    @ColumnInfo(name = "room_name")
    private String roomName;

    @ColumnInfo(name = "building_block_id")
    private int buildingBlockId;

    public Room() {
    }

    @Ignore
    public Room(int roomId, String roomName, int buildingBlockId) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.buildingBlockId = buildingBlockId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getBuildingBlockId() {
        return buildingBlockId;
    }

    public void setBuildingBlockId(int buildingBlockId) {
        this.buildingBlockId = buildingBlockId;
    }
}
