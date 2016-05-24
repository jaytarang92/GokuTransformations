package com.tarang.myfirstandroidapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void displayUserCred(View view) {
        EditText emailIn = (EditText) findViewById(R.id.email);
        EditText passwd = (EditText) findViewById(R.id.password);
        Log.i("Clicked:", "Yes I was clicked");
        Log.i("Email:", emailIn.getText().toString());
        Log.i("Password:", passwd.getText().toString());
        Toast.makeText(getApplicationContext(), "Email Input By User: " + emailIn.getText().toString(), Toast.LENGTH_LONG).show();
        Log.i("Status:", "Login Complete! User is registered!");
        ImageView gokuyo = (ImageView) findViewById(R.id.gokuyo);
        gokuyo.setImageResource(R.drawable.goku1);
        Toast.makeText(getApplicationContext(), "Goku has transformed!", Toast.LENGTH_LONG).show();
    }

    public void goku(View view) {
        ImageView gokuyo = (ImageView) findViewById(R.id.gokuyo);
        gokuyo.setImageResource(R.drawable.goku);
    }

    public void gokuTransform(View view) {
        ImageView gokuyo = (ImageView) findViewById(R.id.gokuyo);
        gokuyo.setImageResource(R.drawable.goku1);
        Toast.makeText(getApplicationContext(), "Goku has transformed!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
