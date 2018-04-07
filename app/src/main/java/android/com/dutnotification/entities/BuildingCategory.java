package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/15/2018.
 */

@Entity(tableName = "building_categories")
public class BuildingCategory {
    @PrimaryKey
    @ColumnInfo(name = "building_category_id")
    private int buildingCategoryId;

    @ColumnInfo(name = "category_name")
    private String categoryName;

    public BuildingCategory() {
    }

    @Ignore
    public BuildingCategory(int buildingCategoryId, String categoryName) {
        this.buildingCategoryId = buildingCategoryId;
        this.categoryName = categoryName;
    }

    public int getBuildingCategoryId() {
        return buildingCategoryId;
    }

    public void setBuildingCategoryId(int buildingCategoryId) {
        this.buildingCategoryId = buildingCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
