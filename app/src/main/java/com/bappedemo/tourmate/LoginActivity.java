package com.bappedemo.tourmate;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;

public class LoginActivity extends AppCompatActivity {

    CircularProgressButton circularProgressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        circularProgressButton = findViewById(R.id.cirLoginButton);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncTask<String,String,String> loginBtn = new AsyncTask<String, String, String>() {
                    @Override
                    protected String doInBackground(String... voids) {



                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        return "done";
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        if (s.equals("done")){
                            Toast.makeText(LoginActivity.this, "Login CLicked",
                                    Toast.LENGTH_SHORT).show();

                            circularProgressButton.doneLoadingAnimation(Color.parseColor("#5cb85c"),
                                    BitmapFactory.decodeResource(getResources(),R.drawable.ic_done_white_48dp));
                            startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                            finish();
                        }
                    }
                };
                circularProgressButton.startAnimation();
                loginBtn.execute();
            }
        });

    }




    public void onLoginClick(View View){
        startActivity(new Intent(this,RegistrationActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
        finish();
    }
}
