package com.example.listapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //single Row structure i.e image, text, description
    //create datasource text, image, description
    // create custom adapter

    ListView first;
    String[] fruitname={"Kiwifruit", "Bananas", "Watermelons", "Grapes", "Apples" };
    String[] desc={"These are tasty kiwifruit", "These are tasty bananas", "This is a tasty watermelon", "These are tasty grapes", "These are tasty apples"};
    Integer[] imgid={R.drawable.kiwis, R.drawable.bananas, R.drawable.watermelon, R.drawable.grapes, R.drawable.apples};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            first= (ListView) findViewById(R.id.listview);
            CustomListview customListview=new CustomListview(this, fruitname, desc, imgid);
            first.setAdapter(customListview);



    }
}
