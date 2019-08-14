package com.irsyadashari.topprogramminglanguange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutActivity extends AppCompatActivity {

    private String title = "About Developer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setActionBarTitle(title);

        ImageView fotoImageView = findViewById(R.id.foto_guwe);

        Glide.with(this)
                .load(R.drawable.foto_formal)
                .apply(new RequestOptions().override(400,400))
                .into(fotoImageView);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
