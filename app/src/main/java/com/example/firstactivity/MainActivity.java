package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    //Toast toast;
    EditText editText1;
    EditText editText2;

    TextView lblSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Define the objects
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        lblSum = findViewById(R.id.lblSum);
        //OnclickButtonListner();

    }
    public void openSecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",editText1.getText().toString());
        intent.putExtra("n2",editText2.getText().toString());

        //Toast.makeText(this,"Opening Calculator..." , Toast.LENGTH_SHORT).show();

        //Creating the LayoutInflater instanc

        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        startActivity(intent);
    }






    /*public void OnclickButtonListner(){
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text= "Navigation to next page";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context , text, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0 );
                        toast.show();

                        //Toast.makeText(this,"Opening Calculator..." , Toast.LENGTH_SHORT).show();

                       //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                       // startActivity(intent);
                    }
                }
        );
    }*/

}