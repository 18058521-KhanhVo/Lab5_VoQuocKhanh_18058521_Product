package com.example.lab5_voquockhanh_18058521_product;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetail extends AppCompatActivity {

    private ImageView product_img_detail;
    private TextView product_name_detail;
    private RatingBar ratingBar_detail;
    private int imgID;
    private String productName;
    private float rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);

        product_img_detail = findViewById(R.id.product_img_detail);
        product_name_detail = findViewById(R.id.product_name_detail);
        ratingBar_detail = findViewById(R.id.ratingBar_detail);

        getData();
        setData();
    }

    private void getData() {
        if (getIntent().hasExtra("imgID") && getIntent().hasExtra("productName") && getIntent().hasExtra("ratingBar")) {
            imgID = getIntent().getIntExtra("imgID", 1);
            productName = getIntent().getStringExtra("productName");
            rating = getIntent().getFloatExtra("ratingBar", 4);
        } else
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
    }

    private void setData() {
        product_img_detail.setImageResource(imgID);
        product_name_detail.setText(productName);
        ratingBar_detail.setRating(rating);
    }
}
