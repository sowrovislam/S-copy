package com.example.textrepeater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    NavigationView navigationView;
    FrameLayout frameLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawerLayout);
        materialToolbar=findViewById(R.id.matriaToolbar);
        navigationView=findViewById(R.id.navigationView);
        frameLayout=findViewById(R.id.frameLayout);




        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId()==R.id.exit){



                }
                return false;
            }
        });






















        // ata   Fragment


        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new BlankFragment());
        fragmentTransaction.commit();


// ses   Fragment




//>>>>>>>ata drawer layout ar kaj>>>>>>>>

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
                MainActivity.this,drawerLayout,materialToolbar,R.string.Drawer_close,R.string.Drawer_Open);
        drawerLayout.addDrawerListener(toggle);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.home){
                    Toast.makeText(MainActivity.this, " i am  Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (item.getItemId()==R.id.numbar) {

                    Toast.makeText(MainActivity.this, " i am  Contacts", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);

                } else if (item.getItemId()==R.id.support) {

                    Toast.makeText(MainActivity.this, " i am  Support", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);

                } else if (item.getItemId()==R.id.privacy) {

                    Toast.makeText(MainActivity.this, " i am  Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);

                } else if (item.getItemId()==R.id.report) {

                    Toast.makeText(MainActivity.this, " i am  Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);


                }


                return true;
            }
        });

//>>>>>>>>>> ses dower layout >>>>>>









    }


        @Override
        public void onBackPressed() {


        new AlertDialog.Builder(MainActivity.this)

                .setTitle("Thanks you ")
                .setMessage("!! Do You Realy Exit")
                .setIcon(R.drawable.img_1)
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        dialogInterface.dismiss();


                    }
                })


                .show();







    }


}