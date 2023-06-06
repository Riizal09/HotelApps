package com.rizalfadilah.hotelapps;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://content.shopback.com/id/wp-content/uploads/2020/08/21121403/Laut-Biru-Resort-Hotel-300x199.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}