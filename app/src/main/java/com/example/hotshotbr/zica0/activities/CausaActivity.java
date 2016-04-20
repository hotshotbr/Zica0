package com.example.hotshotbr.zica0.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.hotshotbr.zica0.R;

/**
 * Created by hotshotbr on 18/04/2016.
 */
public class CausaActivity extends Activity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causa);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle app bar item clicks here. The app bar
        // automatically handles clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
