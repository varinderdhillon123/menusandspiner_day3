package com.example.menusandspiner_day3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btn = (Button) findViewById(R.id.btnShow);
        //btn.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.action_add:
                Intent mIntent = new Intent(this, PickerExampleActivity.class );
                startActivity(mIntent);
                Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT);
            case R.id.action_edit:
                Toast.makeText(MainActivity.this, "Edit", Toast.LENGTH_SHORT);
            case R.id.action_delete:
                Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo
            menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
    }
    @Override
    public boolean onContextItemSelected (@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add:
                Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT);
            case R.id.action_edit:
                Toast.makeText(MainActivity.this, "Edit", Toast.LENGTH_SHORT);
            case R.id.action_delete:
                Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT);
        }
        return super.onContextItemSelected(item);
    }
    public void showMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) this);
        popup.inflate(R.menu.menu_main);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add:
                Log.d("MENU", "Add");
                return true;
            case R.id.action_edit:
                Log.d("MENU", "Edit");
                return true;
            case R.id.action_delete:
                Log.d("MENU", "Delete");
                return true;
            default:
                return false;
        }
    }
}


