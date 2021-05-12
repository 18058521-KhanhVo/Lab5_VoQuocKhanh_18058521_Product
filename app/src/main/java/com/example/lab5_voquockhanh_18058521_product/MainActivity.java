package com.example.lab5_voquockhanh_18058521_product;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Product> products = new ArrayList<>();
    private ProductListAdapter adapter;
//    private View main, productDetail;
//    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        main = getLayoutInflater().inflate(R.layout.activity_main, null);
//        productDetail = getLayoutInflater().inflate(R.layout.product_detail, null);
        setContentView(R.layout.activity_main);

//        fab = main.findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(productDetail);
//            }
//        });

        Product product = new Product(R.drawable.giacchuyen_1, "Day cap", 4, "99.000đ", "199.000d");
        Product product1 = new Product(R.drawable.carbusbtops2_1, "aaa", 3, "29.000đ", "59.000d");
        Product product2 = new Product(R.drawable.daucam_1, "bbbb", 3, "59.000đ", "99.000d");
        products.add(product);
        products.add(product1);
        products.add(product2);


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        ProductListAdapter productListAdapter = new ProductListAdapter(this, products);
        recyclerView.setAdapter(productListAdapter);
    }
}