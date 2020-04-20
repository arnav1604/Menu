package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.x:
                Toast.makeText(this, "Add is selected", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),Login.class);
                startActivity(i);

                break;
            case R.id.y:
                Toast.makeText(this, "Delete is selected", Toast.LENGTH_SHORT).show();
                Intent j=new Intent(getApplicationContext(),SignOff.class);
                startActivity(j);
                break;
            //case R.id.z:
            //    Toast.makeText(this, "Search is selected", Toast.LENGTH_SHORT).show();
              //  break;
        }
            return super.onOptionsItemSelected(item);

        }


}
