package com.arhamtechnolabs.linkedincxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LogInRegisterActivity extends AppCompatActivity {

    TextView loginSignUpBtn_tv;
    ImageView loginNextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_register);
        getSupportActionBar().hide();
        loginNextBtn = findViewById(R.id.loginNextBtn);
        loginSignUpBtn_tv = findViewById(R.id.loginSignUpBtn);


        loginNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LogInRegisterActivity.this, "Main window is not ready! Please look at register", Toast.LENGTH_SHORT).show();
            }
        });

        loginSignUpBtn_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
