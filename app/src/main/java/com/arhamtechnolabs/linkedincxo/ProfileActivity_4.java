package com.arhamtechnolabs.linkedincxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity_4 extends AppCompatActivity {

    ImageView profile4NextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_4);
        profile4NextBtn = findViewById(R.id.profile4NextBtn);

        profile4NextBtn = findViewById(R.id.profile4NextBtn);

        profile4NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity_5.class);
                startActivity(intent);
            }
        });
    }
}
