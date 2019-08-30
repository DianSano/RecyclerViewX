package com.jodemy.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mTitles = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
        initRecyclerView();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/id/thumb/d/d3/Kota_Batu_1.jpg/" +
                "250px-Kota_Batu_1.jpg");
        mTitles.add("Kota Wisata Batu");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/id/thumb/7/75/" +
                "Tugu_Balai_Kota_Malang.jpg/400px-Tugu_Balai_Kota_Malang.jpg");
        mTitles.add("Kota Malang");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/id/thumb/d/d3/" +
                "Pemandangan_Kota_Surabaya.jpg/650px-Pemandangan_Kota_Surabaya.jpg");
        mTitles.add("Kota Surabaya");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/id/thumb/d/dd/Plengkungombak.jpg/" +
                "300px-Plengkungombak.jpg");
        mTitles.add("Kota Banyuwangi");
    }

    private void initRecyclerView() {
       Log.d(TAG, "initIRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mTitles, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
