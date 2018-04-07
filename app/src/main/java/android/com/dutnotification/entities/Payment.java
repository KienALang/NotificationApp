package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Kenny on 3/16/2018.
 */
@Entity(tableName = "payments")
public class Payment {
    @PrimaryKey
    @ColumnInfo(name = "payment_id")
    private int paymentId;

    @ForeignKey(entity = User.class, parentColumns = "user_id", childColumns = "user_id")
    @ColumnInfo(name = "user_id")
    private int userId;

    @ForeignKey(entity = Bill.class, parentColumns = "bill_id", childColumns = "bill_id")
    @ColumnInfo(name = "bill_id")
    private int billId;

    private int price;

    private String content;

    @ForeignKey(entity = Status.class, parentColumns = "status_id", childColumns = "status_id")
    @ColumnInfo(name = "status_id")
    private int statusId;

    public Payment() {
    }

    @Ignore
    public Payment(int paymentId, int userId, int billId, int price, String content, int statusId) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.billId = billId;
        this.price = price;
        this.content = content;
        this.statusId = statusId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
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
