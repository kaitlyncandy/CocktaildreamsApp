package com.example.x15411762.cocktail_dreams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class homeScreen extends AppCompatActivity {

    ImageButton GoToNewActivity;
    ImageButton cocktails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

    GoToNewActivity = (ImageButton)findViewById(R.id.cocktails));

    cocktails.setOnClickListener(new View.OnClickListener() {

        public void OnClick(View v){
            Intent intent = new Intent(homeScreen.this, cocktailCategory.class);
            startActivity(intent);
        }
    });

}
}



