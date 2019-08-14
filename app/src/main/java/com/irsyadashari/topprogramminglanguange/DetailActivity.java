package com.irsyadashari.topprogramminglanguange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundleReceived = getIntent().getExtras();

        Languange dataReceived = new Languange();

        dataReceived.setName(bundleReceived.getString("nama"));
        dataReceived.setDeveloper(bundleReceived.getString("developer"));
        dataReceived.setDescription(bundleReceived.getString("description"));
        dataReceived.setPhoto(bundleReceived.getString("photo"));

        ImageView gambar = findViewById(R.id.img_item_photo);
        TextView nama = findViewById(R.id.tv_item_name);
        TextView developer = findViewById(R.id.tv_item_developer_detail);
        TextView description = findViewById(R.id.tv_description);

        Glide.with(this)
                .load(dataReceived.getPhoto())
                .apply(new RequestOptions().override(800,800))
                .into(gambar);

        nama.setText(dataReceived.getName());
        String developerText = "Inventor : \n"+dataReceived.getDeveloper();
        developer.setText(developerText);
        description.setText(dataReceived.getDescription());
        setActionBarTitle(dataReceived.getName());

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
