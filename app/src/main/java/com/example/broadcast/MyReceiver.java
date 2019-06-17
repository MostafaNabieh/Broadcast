package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String intent_action=intent.getAction();
        if(intent_action != null)
        {
            String toastMessage = "unknown intent action";
            switch (intent_action){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Power connected!";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power disconnected!";
                    break;
                case Intent.ACTION_SCREEN_ON:
                    toastMessage="Screen Open";
                    break;

            }
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();

        }

    }
}
