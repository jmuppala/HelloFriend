package hk.ust.cse.comp4521.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class HelloWorld extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "HelloWorld";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
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

        Button helloButton = (Button) findViewById(R.id.helloButton);
        helloButton.setOnClickListener(this);

        Button goodbyeButton = (Button) findViewById(R.id.goodbyeButton);
        goodbyeButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        EditText friendName = (EditText) findViewById(R.id.friendName);
        String name = friendName.getText().toString();

        Intent mIntent = new Intent(this, ShowMessage.class);

        switch(view.getId()) {
            case R.id.helloButton:
                mIntent.putExtra("Friend", "Hello " + name + "!");
                break;
            case R.id.goodbyeButton:
                mIntent.putExtra("Friend", "Goodbye " + name + "!");
                break;
            default:
                break;
        }
        startActivity(mIntent);
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
