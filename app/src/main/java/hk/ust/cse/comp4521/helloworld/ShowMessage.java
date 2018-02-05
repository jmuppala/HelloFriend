package hk.ust.cse.comp4521.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    private static final String TAG = "ShowMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent mIntent = getIntent();
        String message = mIntent.getStringExtra("Friend");
        TextView textMessage = (TextView) findViewById(R.id.textMessage);
        textMessage.setText(message);
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Log.i(TAG, "Activity: onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub super.onPause();
        Log.i(TAG, "Activity: onPause()");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub super.onRestart();
        Log.i(TAG, "Activity: onRestart()");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub super.onResume();
        Log.i(TAG, "Activity: onResume()");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub super.onStart();
        Log.i(TAG, "Activity: onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub super.onStop();
        Log.i(TAG, "Activity: onStop()");
        super.onStop();
    }
}
