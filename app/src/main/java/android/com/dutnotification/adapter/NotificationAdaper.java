package android.com.dutnotification.adapter;

import android.com.dutnotification.R;
import android.com.dutnotification.entities.Notification;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kenny on 3/23/2018.
 */

public class NotificationAdaper extends ArrayAdapter<Notification> {
    private Context mContext;
    private int mLayout;
    private ArrayList<Notification> mNotifications;

    public NotificationAdaper(Context context, ArrayList<Notification> notifications) {
        super(context, 0, notifications);
        this.mContext = context;
        this.mNotifications = notifications;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Notification notification = (Notification) getItem(position);
        //Checking if existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_notification, parent, false);
        }

        // Lookup view for data population
        ImageView iconView = (ImageView) convertView.findViewById(R.id.notification_icon);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.notification_title);
        TextView tvShortContent = (TextView) convertView.findViewById(R.id.notification_short_content);

        setNotificationIcon(notification, iconView);
        tvTitle.setText(notification.getTitle());
        tvShortContent.setText(notification.getContent());

        return  convertView;
    }

    private void setNotificationIcon(Notification notification, ImageView imageView) {
        switch (notification.getCategoryId()) {
            case 1: imageView.setImageResource(R.drawable.dormitory); break;
            case 2: imageView.setImageResource(R.drawable.class_logo); break;
            case 3: imageView.setImageResource(R.drawable.scholarship); break;
            case 4: imageView.setImageResource(R.drawable.icon_class); break;
        }
    }

}
