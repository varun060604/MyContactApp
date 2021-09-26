package com.varun.mycontactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MoreDetails extends AppCompatActivity {

    ImageView mainImage;
    TextView Name, PhoneNo,EmailID,Address;
    RadioButton radioButton, radioGroup;

    String data1;
    String Email[];
    String Phone_no[];
    String address[];
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);

        mainImage = findViewById(R.id.mainImage);
        Name = findViewById(R.id.personName);
        PhoneNo = findViewById(R.id.PhoneNo);
        EmailID = findViewById(R.id.Email);
        Address = findViewById(R.id.Address);

        Email = getResources().getStringArray(R.array.EmailId);
        Phone_no = getResources().getStringArray(R.array.Phone_No);
        address = getResources().getStringArray(R.array.Address);

        getData();
        setData();

    }


    private void getData(){
        if(getIntent().hasExtra("myImage")&&getIntent().hasExtra("data1"))
        {
            data1 = getIntent().getStringExtra("data1");
            myImage = getIntent().getIntExtra("myImage",1);
        }
        else
        {
            Toast.makeText(this,"NoData",Toast.LENGTH_SHORT).show();
        }
    }
    private void setData()
    {
        Name.setText(data1);
        EmailID.setText(Email[0]);
        PhoneNo.setText(Phone_no[0]);
        Address.setText(address[0]);
        mainImage.setImageResource(myImage);
    }

}