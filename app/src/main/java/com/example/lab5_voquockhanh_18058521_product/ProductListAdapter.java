package com.example.lab5_voquockhanh_18058521_product;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductListViewHolder> {

    public class ProductListViewHolder extends RecyclerView.ViewHolder {
        private ImageView pImg;
        private TextView pName;
        private RatingBar pRating;
        private TextView pPrice;
        private TextView pOldPrice;
        ConstraintLayout productMainLayout;
        private final ProductListAdapter adapter;

        /**
         * @param itemView
         * @param adapter
         */
        public ProductListViewHolder(@NonNull View itemView, ProductListAdapter adapter) {
            super(itemView);
            pImg = itemView.findViewById(R.id.product_img);
            pName = itemView.findViewById(R.id.product_name);
            pRating = itemView.findViewById(R.id.ratingBar);
            pPrice = itemView.findViewById(R.id.product_price);
            pOldPrice = itemView.findViewById(R.id.product_oldprice);
            productMainLayout = itemView.findViewById(R.id.product_mainlayout);
            this.adapter = adapter;
        }
    }

    private final ArrayList<Product> products;
    private Context context;
    private LayoutInflater inflater;

    /**
     * @param context
     * @param list
     */
    public ProductListAdapter(Context context, ArrayList<Product> list) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        products = list;
    }

    @NonNull
    @Override
    public ProductListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.product_list_item_with_cardview, parent, false);
        return new ProductListViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductListViewHolder holder, int position) {
        Product product = products.get(position);
        holder.pImg.setImageResource(product.getImg());
        holder.pName.setText(product.getName());
        holder.pRating.setRating(product.getRating());
        holder.pPrice.setText(product.getPrice());
        holder.pOldPrice.setText(product.getOldPrice());
        holder.productMainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductDetail.class);
                intent.putExtra("imgID", product.getImg());
                intent.putExtra("productName", product.getName());
                intent.putExtra("ratingBar", product.getRating());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


}
