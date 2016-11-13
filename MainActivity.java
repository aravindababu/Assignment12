package com.example.user2.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Adding a Button Variable
    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Converting Xml layout file to Java Code through setContentView
        setContentView(R.layout.activity_main);

        //TypeCasting button and providing its reference from the ID which i have assigned in tne XML Layout
        btnCheck = (Button)findViewById(R.id.btnClick);


        //implementing OnClick Listener for Button to respond to button clicks
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Displaying Toast message whenever user clicks on the button
                Toast toast = Toast.makeText(MainActivity.this,"HELLO WORLD", Toast.LENGTH_SHORT);
                toast.show();

                //Setting the gravity of the toast message through toast Gravity
                toast.setGravity(Gravity.CENTER| Gravity.CENTER,0,0);

            }
        });





    }
}
