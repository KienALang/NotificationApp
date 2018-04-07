package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/15/2018.
 */

@Entity(tableName = "building_blocks")
public class BuildingBlock {

    @ColumnInfo(name = "building_block_id")
    @PrimaryKey
    private int buildingBlockId;

    @ColumnInfo(name = "building_name")
    private String buildingName;

    @ColumnInfo(name = "building_category_id")
    @ForeignKey(entity = BuildingCategory.class,
            parentColumns = "building_category_id", childColumns = "building_category_id")
    private int buildingCategoryId;

    public BuildingBlock() {
    }

    @Ignore
    public BuildingBlock(int buildingBlockId, String buildingName, int buildingCategoryId) {
        this.buildingBlockId = buildingBlockId;
        this.buildingName = buildingName;
        this.buildingCategoryId = buildingCategoryId;
    }

    public int getBuildingBlockId() {
        return buildingBlockId;
    }

    public void setBuildingBlockId(int buildingBlockId) {
        this.buildingBlockId = buildingBlockId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getBuildingCategoryId() {
        return buildingCategoryId;
    }

    public void setBuildingCategoryId(int buildingCategoryId) {
        this.buildingCategoryId = buildingCategoryId;
    }
}
