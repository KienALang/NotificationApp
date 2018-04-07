package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/16/2018.
 */

@Entity(tableName = "bills")
public class Bill {

    @ColumnInfo(name = "bill_id")
    @PrimaryKey
    private int billId;

    @ColumnInfo(name = "create_date")
    private String createDate;

    private int price;

    @ColumnInfo(name = "status_id")
    @ForeignKey(entity = Status.class, parentColumns = "status_id", childColumns = "status_id")
    private int statusId;

    public Bill() {
    }
    @Ignore
    public Bill(int billId, String createDate, int price, int statusId) {
        this.billId = billId;
        this.createDate = createDate;
        this.price = price;
        this.statusId = statusId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
