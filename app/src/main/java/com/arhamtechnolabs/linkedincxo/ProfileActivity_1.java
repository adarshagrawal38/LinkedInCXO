package com.arhamtechnolabs.linkedincxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity_1 extends AppCompatActivity {

    ImageView profile1Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_1);
        profile1Next = findViewById(R.id.profile1Next);

        profile1Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity_2.class);
                startActivity(intent);

            }
        });


    }
}
