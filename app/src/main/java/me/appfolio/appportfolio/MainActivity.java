package me.appfolio.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        String name = "";

        switch (view.getId()) {
            case R.id.button_popular_movies:
                name = "Popular Movies";
                break;
            case R.id.button_stock_hawk:
                name = "Stock Hawk";
                break;
            case R.id.button_build_it_bigger:
                name = "Build It Bigger";
                break;
            case R.id.button_make_your_app_material:
                name = "Make Your App Material";
                break;
            case R.id.button_go_ubiquitous:
                name = "Go Ubiquitous";
                break;
            case R.id.button_capstone_my_own_app:
                name = "Capstone";
                break;
        }

        String message = getString(R.string.button_message, name);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
