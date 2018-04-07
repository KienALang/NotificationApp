package android.com.dutnotification.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.com.dutnotification.daos.BuildingCategoryDao;
import android.com.dutnotification.daos.ContributionDao;
import android.com.dutnotification.daos.NotificationCategoryDao;
import android.com.dutnotification.daos.NotificationDao;
import android.com.dutnotification.daos.StatusDao;
import android.com.dutnotification.daos.UserDao;
import android.com.dutnotification.entities.Bill;
import android.com.dutnotification.entities.BuildingBlock;
import android.com.dutnotification.entities.BuildingCategory;
import android.com.dutnotification.entities.ClassCode;
import android.com.dutnotification.entities.ClassSchedule;
import android.com.dutnotification.entities.Contribution;
import android.com.dutnotification.entities.DayofWeek;
import android.com.dutnotification.entities.Notification;
import android.com.dutnotification.entities.NotificationCategory;
import android.com.dutnotification.entities.Payment;
import android.com.dutnotification.entities.PeriodTime;
import android.com.dutnotification.entities.Role;
import android.com.dutnotification.entities.SchoolYear;
import android.com.dutnotification.entities.SchoolYearSchedule;
import android.com.dutnotification.entities.Status;
import android.com.dutnotification.entities.Subject;
import android.com.dutnotification.entities.Teacher;
import android.com.dutnotification.entities.User;
import android.com.dutnotification.entities.Week;
import android.content.Context;

/**
 * Created by Kenny on 3/21/2018.
 */
@Database(entities = {
        Bill.class, BuildingBlock.class, BuildingCategory.class, ClassCode.class, ClassSchedule.class,
        Contribution.class, DayofWeek.class, Notification.class,
        NotificationCategory.class, Payment.class, PeriodTime.class, Role.class,
        android.com.dutnotification.entities.Room.class, SchoolYear.class, SchoolYearSchedule.class,
        Status.class, Subject.class, Teacher.class, User.class, Week.class
}, version = 3)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase appDatabase;

    public static AppDatabase getInstance(Context context) {
        if (appDatabase == null) {
            appDatabase = buildDatabaseInstance(context);
        }

        return appDatabase;
    }

    private static AppDatabase buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, "database-mydut")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }

    public abstract StatusDao getStatusDao();

    public abstract UserDao getUserDao();

    public abstract BuildingCategoryDao getBuildingCategoryDao();

    public abstract NotificationCategoryDao getNotificationCategoryDao();

    public abstract NotificationDao getNotificationDao();

    public abstract ContributionDao getContributionDao();

    public void cleanUp() {
        appDatabase = null;
    }
}

