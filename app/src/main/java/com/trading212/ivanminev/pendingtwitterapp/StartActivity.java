package com.trading212.ivanminev.pendingtwitterapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;


public class StartActivity extends FragmentActivity implements LoginChooserFragment.LoginFragmentActionListener
{

    FrameLayout fragCointainer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        if(getSharedPreferences(Constants.LoggedUserPrefs, MODE_PRIVATE).
                getBoolean("Logged User", false))
        {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);

        }

        fragCointainer = (FrameLayout) findViewById(R.id.fragmentContainer);

        LoginChooserFragment frag = new LoginChooserFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentContainer, frag).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onLoginClick()
    {

        Intent intent=new Intent(StartActivity.this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onRegisterClick()
    {

    }
}
