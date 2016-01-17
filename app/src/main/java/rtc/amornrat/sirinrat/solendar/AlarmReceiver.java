package rtc.amornrat.sirinrat.solendar;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by masterUNG on 1/17/16 AD.
 */
public class AlarmReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Success", Toast.LENGTH_SHORT).show();

        MediaPlayer alarmMediaPlayer = MediaPlayer.create(context, R.raw.intro_start_horse);
        alarmMediaPlayer.start();

//        MainActivity objMainActivity = new MainActivity();
//        objMainActivity.masterNotification();

        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("http://androidthai.in.th/about-me.html"));
        PendingIntent objPendingIntent = PendingIntent.getActivity(context, 0, objIntent, 0);

        Notification objNotification = new Notification.Builder(context)
                .setSmallIcon(R.drawable.icon_cow)
                .setContentTitle("Title")
                .setContentText("Message")
                .setAutoCancel(true)
                .setContentIntent(objPendingIntent)
                .build();

        NotificationManager objNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        objNotificationManager.notify(1000, objNotification);



    }   //AlarmReceiver
}   // Main Class
