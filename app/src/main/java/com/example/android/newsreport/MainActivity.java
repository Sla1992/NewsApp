/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.newsreport;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView gaming = (TextView)findViewById(R.id.gaming);
        TextView technology = (TextView)findViewById(R.id.technology);
        TextView politics = (TextView)findViewById(R.id.politics);
        TextView sports = (TextView)findViewById(R.id.sports);
        TextView finance = (TextView)findViewById(R.id.finance);

        //Set a clicklistener on that View
        gaming.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                try{
                    //some exception
                    Intent gamingIntent = new Intent(MainActivity.this, GamingActivity.class);

                    //Start the new activity
                    startActivity(gamingIntent);
                }catch(Exception e){
                    Context context = getApplicationContext();
//                    CharSequence text = "Hier tritt der gamingIntent ein!";
                    CharSequence text2 = e.getMessage();
                    int duration = Toast.LENGTH_SHORT;

//                    Toast toast = Toast.makeText(context, text, duration);
                    Toast toast = Toast.makeText(context, text2, duration);
                    toast.show();
                }

            }
        });

        technology.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                try{
                    //some exception
                    Intent technologyIntent = new Intent(MainActivity.this, TechnologyActivity.class);

                    //Start the new activity
                    startActivity(technologyIntent);
                }catch(Exception e){
                    Context context = getApplicationContext();
//                    CharSequence text = "Hier tritt der gamingIntent ein!";
                    CharSequence text2 = e.getMessage();
                    int duration = Toast.LENGTH_SHORT;

//                    Toast toast = Toast.makeText(context, text, duration);
                    Toast toast = Toast.makeText(context, text2, duration);
                    toast.show();
                }

            }
        });

        politics.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){


                try{
                    //some exception
                    Intent politicsIntent = new Intent(MainActivity.this, PoliticsActivity.class);

                    //Start the new activity
                    startActivity(politicsIntent);
                }catch(Exception e){
                    Context context = getApplicationContext();
                    CharSequence text = "Hier tritt der politicsIntent Catch ein!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        sports.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){


                try{
                    //some exception
                    Intent sportsIntent = new Intent(MainActivity.this, SportsActivity.class);

                    //Start the new activity
                    startActivity(sportsIntent);
                }catch(Exception e){
                    Context context = getApplicationContext();
                    CharSequence text = "Hier tritt der sportsIntent Catch ein!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        finance.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {


                try{
                    //some exception
                    Intent financeIntent = new Intent(MainActivity.this, FinanceActivity.class);

                    //Start the new activity
                    startActivity(financeIntent);
                }catch(Exception e){
                    Context context = getApplicationContext();
                    CharSequence text = "Hier tritt der financeIntent Catch ein!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });


    }
}
