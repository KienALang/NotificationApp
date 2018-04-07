package android.com.dutnotification.controllers;

import android.com.dutnotification.entities.Bill;
import android.com.dutnotification.entities.BuildingCategory;
import android.com.dutnotification.entities.Contribution;
import android.com.dutnotification.entities.DayofWeek;
import android.com.dutnotification.entities.Notification;
import android.com.dutnotification.entities.NotificationCategory;
import android.com.dutnotification.entities.Payment;
import android.com.dutnotification.entities.PeriodTime;
import android.com.dutnotification.entities.Role;
import android.com.dutnotification.entities.Room;
import android.com.dutnotification.entities.SchoolYear;
import android.com.dutnotification.entities.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kenny on 3/22/2018.
 */

public class FakeData {
    public static List<Role> createRoles() {
        List<Role> roles = new ArrayList<>(
        );
        Role role1 = new Role(1, "Admin");
        Role role2 = new Role(2, "User");
        roles.add(role1);
        roles.add(role2);

        return roles;
    }

    public static List<Room> createRooms() {
        List<Room> rooms = new ArrayList<>();
        Room room1 = new Room();
        return rooms;
    }

    public static List<BuildingCategory> createBuildingCategories() {
        List<BuildingCategory> buildingCategories = new ArrayList<>();
        buildingCategories.add(new BuildingCategory(1, "Ký túc xá"));
        buildingCategories.add(new BuildingCategory(2, "Trường học"));
        return buildingCategories;
    }

    public static List<Contribution> createContribution() {
        List<Contribution> list = new ArrayList<>();
        list.add(new Contribution(1, 1, 100, "Mua nước" ,"2018/2/02/03"));
        list.add(new Contribution(2, 2, 10, "Mua Vim" ,"2018/2/02/03"));
        list.add(new Contribution(3, 1, 120, "Mua chổi" ,"2018/2/02/03"));
        return list;
    }

    public static List<NotificationCategory> createNotificationCategory() {
        List<NotificationCategory> list = new ArrayList<>();
        list.add(new NotificationCategory(1, "Ký túc xá"));
        list.add(new NotificationCategory(2, "Trang đào tạo"));
        list.add(new NotificationCategory(3, "Phòng công tác sinh viên"));
        list.add(new NotificationCategory(4, "Lịch học"));
        return list;
    }

    public static List<Notification> createNotifications() {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification(1, 1, "Tiền điện nước tháng 5", "Tổng tiền: 250000", "2018/05/10", 4));
        notifications.add(new Notification(2, 1, "Tiền điện nước tháng 4", "Tổng tiền: 258000", "2018/05/10", 3));
        notifications.add(new Notification(3, 2, "Học bù", "Công nghệ di động F203, tiết 1-2 ngày 20/03/2018", "20/03/2018", 1));
        notifications.add(new Notification(4, 2, "Nghỉ học", "Môn công nghệ di động, tiết 3-4 ngày 23/03/2018", "2018/05/10", 2));
        notifications.add(new Notification(5, 3, "Miễn giảm học phí", "Danh sách được miễn giảm", "2018/05/10", 1));
        notifications.add(new Notification(6, 3, "Học bổng", "Học bổng HK1 2017-2018", "2018/05/10", 2));
        notifications.add(new Notification(7, 4, "Học môn Vật lý", "F203, tiết 1-2 ngày 20/03/2018", "2018/05/10", 1));
        notifications.add(new Notification(8, 4, "Học lập trình C", "F203, tiết 1-2 ngày 20/03/2018", "2018/05/10", 2));
        return notifications;
    }

    public static List<Status> createStatus() {
        List<Status> list = new ArrayList<>();
        list.add(new Status(1, "Đã xem"));
        list.add(new Status(2, "Chưa xem"));
        list.add(new Status(3, "Đã trả"));
        list.add(new Status(4, "Chưa trả"));
        return list;
    }

    public static List<Bill> createBills() {
        List<Bill> list = new ArrayList<>();
        list.add(new Bill(1, "2018/03/01", 178200, 3));
        list.add(new Bill(1, "2018/03/01", 78200, 4));
        return list;
    }

    public static List<Payment> createPayments() {
        List<Payment> list = new ArrayList<>();
        list.add(new Payment(1, 1, 1, 12,"Điện nước tháng 3", 3));
        list.add(new Payment(2, 2, 1, 15,"Điện nước tháng 3", 3));
        list.add(new Payment(3, 3, 1, 14,"Điện nước tháng 3", 4));
        list.add(new Payment(4, 4, 1, 10,"Điện nước tháng 3", 4));
        return list;
    }

    public static List<DayofWeek> createDaysofWeek() {
        List<DayofWeek> list = new ArrayList<>();
        list.add(new DayofWeek(1, "Thứ hai"));
        list.add(new DayofWeek(1, "Thứ ba"));
        list.add(new DayofWeek(1, "Thứ tư"));
        list.add(new DayofWeek(1, "Thứ năm"));
        list.add(new DayofWeek(1, "Thứ sáu"));
        list.add(new DayofWeek(1, "Thứ bảy"));
        list.add(new DayofWeek(1, "Chủ nhật"));
        return list;
    }

    public static List<PeriodTime> createPeriodTimes() {
        List<PeriodTime> list = new ArrayList<>();
        list.add(new PeriodTime(1, "7h00", "8h00"));
        list.add(new PeriodTime(2, "8h00", "9h00"));
        list.add(new PeriodTime(3, "9h00", "10h00"));
        list.add(new PeriodTime(4, "10h00", "11h00"));
        list.add(new PeriodTime(5, "11h00", "12h00"));
        list.add(new PeriodTime(6, "12h30", "13h30"));
        list.add(new PeriodTime(7, "13h30", "14h30"));
        list.add(new PeriodTime(8, "14h30", "15h30"));
        list.add(new PeriodTime(9, "15h30", "16h30"));
        list.add(new PeriodTime(10, "16h30", "17h30"));
        return list;
    }

    public static List<SchoolYear> createSchoolYears() {
        List<SchoolYear> list = new ArrayList<>();
        list.add(new SchoolYear(1, 2017, 2018));
        list.add(new SchoolYear(2, 2016, 2017));
        list.add(new SchoolYear(3, 2015, 2016));
        list.add(new SchoolYear(4, 2014, 2015));
        return list;
    }


}
