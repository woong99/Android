package com.example.doitmission_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    BitmapDrawable bitmap;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
    }

    public void onButton1Clicked(View view) {
        changeImage();
    }

    private void changeImage() {
        Resources res = getResources();
        bitmap  =(BitmapDrawable) res.getDrawable(R.drawable.beach);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        if(imageIndex == 0){
            imageView2.setImageDrawable(bitmap);
            imageView2.getLayoutParams().width = bitmapWidth;
            imageView2.getLayoutParams().height = bitmapHeight;
            imageView1.setImageDrawable(null);
            imageIndex = 1;
        }
        else if(imageIndex == 1){
            imageView1.setImageDrawable(bitmap);
            imageView1.getLayoutParams().width = bitmapWidth;
            imageView1.getLayoutParams().height = bitmapHeight;
            imageView2.setImageDrawable(null);
            imageIndex = 0;
        }
    }
}