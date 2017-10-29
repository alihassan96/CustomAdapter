package com.example.ali_pc.madassign1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Intent CallIntent;
    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) this.findViewById(R.id.list1);

        ArrayList<Contacts> arrayList = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            arrayList.add(new Contacts(i, "ABC " + i, "012239287 " + i, "Male " + i));
    }

        ContactAdapter contactAdapter = new ContactAdapter(this, arrayList);

        listView.setAdapter(contactAdapter);
/*

        b1 = (ImageButton) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CallIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 012239287 "));
                startActivity(CallIntent);

            }
        });
*/


    }

}
