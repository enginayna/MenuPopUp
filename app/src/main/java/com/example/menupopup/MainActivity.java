package com.example.menupopup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(MainActivity.this , button);
                menu.getMenuInflater().inflate(R.menu.menu_design,menu.getMenu());
                menu.show();
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId()==R.id.action_Sil){
                            Toast.makeText(MainActivity.this , "Sil Secildi." , Toast.LENGTH_SHORT).show();
                            return true;
                        }
                        if (item.getItemId() == R.id.action_Duzenle){
                            Toast.makeText(MainActivity.this , "Duzenle Secildi" , Toast.LENGTH_SHORT).show();
                            return true;
                        }
                        else{
                            return false;
                        }

                    }
                });
            }
        });
    }
}
