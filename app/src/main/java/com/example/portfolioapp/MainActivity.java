package com.example.portfolioapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.portfolioapp.fragments.ContactFragment;
import com.example.portfolioapp.fragments.EducationFragment;
import com.example.portfolioapp.fragments.ExperienceFragment;
import com.example.portfolioapp.fragments.HomeFragment;
import com.example.portfolioapp.fragments.PortfolioFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setHomeFragment();

        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_home:
                        setHomeFragment();
                        break;
                    case R.id.menu_education:
                        setEducationFragment();
                        break;
                    case R.id.menu_experience:
                        setExperienceFragment();
                        break;
                    case R.id.menu_portfolio:
                        setPortfolioFragment();
                        break;
                    case R.id.menu_contacts:
                        setContactFragment();
                        break;
                }
                return true;
            }
        });
    }

    void setHomeFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
        setAnimation();
    }

    private void setAnimation() {
        YoYo.with(Techniques.ZoomIn)
                .duration(700)
                .repeat(0)
                .playOn(findViewById(R.id.container));

    }

    void setEducationFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new EducationFragment()).commit();
        setAnimation();
    }

    void setPortfolioFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PortfolioFragment()).commit();
        setAnimation();
    }

    void setContactFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new ContactFragment()).commit();
        setAnimation();
    }

    void setExperienceFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new ExperienceFragment()).commit();
        setAnimation();
    }
}