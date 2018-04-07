package android.com.dutnotification.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.com.dutnotification.entities.BuildingCategory;

import java.util.List;

/**
 * Created by Kenny on 3/22/2018.
 */
@Dao
public interface BuildingCategoryDao extends BaseDao<BuildingCategory> {
    @Query("SELECT * FROM building_categories")
    List<BuildingCategory> getBuildingCategories();

    @Query("SELECT * FROM building_categories WHERE building_category_id = :id")
    BuildingCategory getBuildingCategoryById(int id);
}
