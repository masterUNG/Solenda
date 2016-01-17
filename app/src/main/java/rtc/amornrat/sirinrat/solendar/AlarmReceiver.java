package rtc.amornrat.sirinrat.solendar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
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

    }
}   // Main Class
