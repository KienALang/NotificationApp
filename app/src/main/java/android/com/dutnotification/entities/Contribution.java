package android.com.dutnotification.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

/**
 * Created by Kenny on 3/22/2018.
 */
@Entity(tableName = "contribution")
public class Contribution {
    @ColumnInfo(name = "contribution_id")
    @PrimaryKey
    private int contributionId;

    @ColumnInfo(name = "user_id")
    @ForeignKey(entity = User.class, parentColumns = "user_id", childColumns = "user_id")
    private int userId;

    private int price;

    @Nullable
    private String content;

    @ColumnInfo(name = "create_date")
    private String createDate;

    public Contribution() {
    }

    @Ignore
    public Contribution(int contributionId, int userId, int price, String content, String createDate) {
        this.contributionId = contributionId;
        this.userId = userId;
        this.price = price;
        this.content = content;
        this.createDate = createDate;
    }

    public int getContributionId() {
        return contributionId;
    }

    public void setContributionId(int contributionId) {
        this.contributionId = contributionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Nullable
    public String getContent() {
        return content;
    }

    public void setContent(@Nullable String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
