package com.example.listview_image_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    String[] fruitName = {"Mango", "Banana", "Watermelon", "Grapes", "Kiwi", "Apple"};
    String[] desc = {"This is mango", "This is banana", "This is watermelon", "This is grapes", "This is kiwi", "This is apple"};
    Integer[] imgID = {R.drawable.mango, R.drawable.banana, R.drawable.watermelon, R.drawable.grapes, R.drawable.kiwi, R.drawable.apple};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst = (ListView) findViewById(R.id.listView);
        CustomListView customListView = new CustomListView(this, fruitName, desc, imgID);
        lst.setAdapter(customListView);
    }
}