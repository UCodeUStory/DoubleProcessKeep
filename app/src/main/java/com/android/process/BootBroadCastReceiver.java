package com.android.process;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by qiyue on 2016/9/20 0020.
 */
public class BootBroadCastReceiver extends BroadcastReceiver {

    public static final String TAG = "qiyue";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"已经开机"+intent.getAction());

        context.startService(new Intent(context, LocalService.class));
        context.startService(new Intent(context, RemoteService.class));

    }
}
