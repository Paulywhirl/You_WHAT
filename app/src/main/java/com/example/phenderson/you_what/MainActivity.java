package com.example.phenderson.you_what;

import android.app.DialogFragment;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView firstTextView = (TextView) findViewById(R.id.you_what);
        Button firstButton = (Button) findViewById(R.id.you_what);
        final MediaPlayer mp_what = MediaPlayer.create(this, R.raw.youwhat);

        firstButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mp_what.start();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id ==R.id.action){

            DialogFragment myFragment = new MyDialogFragment();

            myFragment.show(getFragmentManager(), "The Dialog");
            return true;
        }
        else if (id == R.id.close){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
