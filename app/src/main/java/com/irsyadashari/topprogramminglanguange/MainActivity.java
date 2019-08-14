package com.irsyadashari.topprogramminglanguange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLanguange;
    private ArrayList<Languange> list = new ArrayList<>();
    private String title = "Top 10 Programming Languange";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvLanguange = findViewById(R.id.rv_languange);
        rvLanguange.setHasFixedSize(true);

        list.addAll(LanguangeData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvLanguange.setLayoutManager(new LinearLayoutManager(this));
        ListLanguangeAdapter listLanguangeAdapter = new ListLanguangeAdapter(list);
        rvLanguange.setAdapter(listLanguangeAdapter);

        listLanguangeAdapter.setOnItemClickCallback(new ListLanguangeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Languange data) {
                //ke halaman detail
                gotoDetail(data);
            }
        });
    }

    private void gotoDetail(Languange data) {
        Toast.makeText(this, data.getName() + " clicked", Toast.LENGTH_SHORT).show();

        //ke halaman detail
        Bundle bundle = new Bundle();

        bundle.putString("nama",data.getName());
        bundle.putString("developer",data.getDeveloper());
        bundle.putString("description",data.getDescription());
        bundle.putString("photo",data.getPhoto());

        Intent dataAttached = new Intent(MainActivity.this, DetailActivity.class);
        dataAttached.putExtras(bundle);

        startActivity(dataAttached);

    }

    public void gotoAboutPage(){
        Intent goToAbout = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(goToAbout);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        gotoAboutPage();
        return super.onOptionsItemSelected(item);
    }
}
