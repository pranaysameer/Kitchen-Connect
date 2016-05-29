package com.example.naveenkumar.mykc;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class category extends AppCompatActivity {
    final Context cnt=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        de.hdodenhof.circleimageview.CircleImageView img1=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.cat_dessert);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cnt, catselected.class);
                //String stringcat=""+R.id.profile_image;
                intent.putExtra("string", "" + R.id.cat_dessert);
                startActivity(intent);
            }
        });
        de.hdodenhof.circleimageview.CircleImageView img2=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.cat_curries);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cnt,catselected.class);
                //String stringcat=""+R.id.profile_image;
                intent.putExtra("string",""+R.id.cat_curries);
                startActivity(intent);
            }
        });
        de.hdodenhof.circleimageview.CircleImageView img3=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.cat_soups);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cnt, catselected.class);
                //String stringcat=""+R.id.profile_image;
                intent.putExtra("string", "" + R.id.cat_soups);
                startActivity(intent);
            }
        });
        de.hdodenhof.circleimageview.CircleImageView img4=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.cat_continental);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cnt, catselected.class);
                //String stringcat=""+R.id.profile_image;
                intent.putExtra("string", "" + R.id.cat_continental);
                startActivity(intent);
            }
        });
        de.hdodenhof.circleimageview.CircleImageView img5=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.cat_biryani);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cnt,catselected.class);
                //String stringcat=""+R.id.profile_image;
                intent.putExtra("string",""+R.id.cat_biryani);
                startActivity(intent);
            }
        });
        de.hdodenhof.circleimageview.CircleImageView img6=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.cat_chinese);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cnt,catselected.class);
                intent.putExtra("string",""+R.id.cat_chinese);
                startActivity(intent);
            }
        });
        de.hdodenhof.circleimageview.CircleImageView img7=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.cat_starters);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cnt,catselected.class);
                intent.putExtra("string",""+R.id.cat_starters);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        finish();
        System.exit(0);
    }
}
