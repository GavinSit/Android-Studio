package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{ //implement listener
    /*
        NOTE: when it says button or whatever item cannot be resolved, click it and import
        it when it gives a prompt (ALT+enter)

     */
    Button add; //declare buttons
    Button subtract;
    TextView outputTextView;

    String num1String;

    @Override //override has to be capital or wont work
    protected void onCreate(Bundle savedInstanceState) { //kinda like constructor runs when app open
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subtract = findViewById(R.id.subtractButton);//initiate buttons
        add = findViewById(R.id.submitbutton); //create a button
        //R.id. whatever your button is called
        outputTextView = findViewById(R.id.textViewAnswer);

    } //end of on create

    @Override
    public void onClick(View view){

    }

    public void add(View view){ //code here is executed when button is clicked


        int num1, num2, sum;

        EditText num1fromuser = findViewById(R.id.num1); //get the user input for button 1
        EditText num2fromuser = findViewById(R.id.num2); //get the user input for button 2

        //when getting text, MUST put .getText() and then .toString() which gets it as String
        num1String = num1fromuser.getText().toString(); //get user input in form of string
        num1 = Integer.parseInt(num1String); //change the user input to a integer

        num2 = Integer.parseInt(num2fromuser.getText().toString()); //can be done in one step

        sum = num1 + num2;
        outputTextView.setText("The sum is " + sum);
    }

    public void subtract (View view){
        int num1, num2, difference;

        EditText num1fromuser = findViewById(R.id.num1); //get the user input for button 1
        EditText num2fromuser = findViewById(R.id.num2); //get the user input for button 2

        //when getting text, MUST put .getText() and then .toString() which gets it as String
        num1String = num1fromuser.getText().toString(); //get user input in form of string
        num1 = Integer.parseInt(num1String); //change the user input to a integer

        num2 = Integer.parseInt(num2fromuser.getText().toString()); //can be done in one step

        difference = num1 - num2;
        outputTextView.setText("The difference is " + difference);
    }


}
