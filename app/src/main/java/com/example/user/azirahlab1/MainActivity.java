package com.example.user.azirahlab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.text;

public class MainActivity extends AppCompatActivity {


    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById (R.id.button);
        etName = (EditText) findViewById (R.id.editText);
        tvMessage = (TextView) findViewById (R.id.textView);
    }

    public void displayText (View view){

        String text = etName.getText().toString();

        //Display text obtain from getText
        tvMessage.setText ("WELCOME " + text);

        //to show toast
        Toast toast = Toast.makeText(this,"WELCOME " + text, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void ResetText (View view){

        //show toast
        Toast toast = Toast.makeText (this, "Name have been reset", Toast.LENGTH_SHORT);
        toast.show();

        etName.getText().clear();
    }

}
