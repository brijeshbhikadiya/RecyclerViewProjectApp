package com.example.recyclervewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;    //step1: create a all variables.
    LinearLayoutManager linearLayoutManager;
    recyclerviewadapter recyclerviewadapter;
    List<recyclerview> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            //import code : always right here...
      // requestWindowFeature(Window.FEATURE_NO_TITLE); //this line hides a title bar.
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       //getSupportActionBar().hide();  // this line hides a action bar.

        setContentView(R.layout.activity_main);

        initData();     //step2 : make a two method. 1.initData(): add multiple data in recyclerview.
        initRecyclerview();   //step 3 : set all recyclerview data
    }

    private void initData() {
        userlist = new ArrayList<>();

        userlist.add(new recyclerview(R.drawable.bunty1,"Vansh","11.30 am","Hello,How Are you?"));

        userlist.add(new recyclerview(R.drawable.bunty2,"Vansh","11.30 am","Hello?"));

        userlist.add(new recyclerview(R.drawable.buny3 ,"Bhavy","1.30 pm","Hyy"));

        userlist.add(new recyclerview(R.drawable.boy1,"Jaivik","12.30 am","Do you want play free fire?"));

        userlist.add(new recyclerview(R.drawable.boy2,"Dhruvil","2.30 pm","i am fine"));

        userlist.add(new recyclerview(R.drawable.boy1,"Viturv","5.30 am","Good Morning"));

        userlist.add(new recyclerview(R.drawable.boy1,"Akshart","6.30 pm","byy"));

        userlist.add(new recyclerview(R.drawable.boy1,"Krish","4.30 pm","Hello,How Are you?"));
        userlist.add(new recyclerview(R.drawable.boy2,"Shivo","11.30 am","Hello,How Are you?"));
        userlist.add(new recyclerview(R.drawable.boy1,"Sahil","11.30 am","Hello,How Are you?"));
        userlist.add(new recyclerview(R.drawable.boy2,"Gami","11.30 am","Hello,How Are you?"));

    }

    private void initRecyclerview() {

        recyclerView=findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerviewadapter=new recyclerviewadapter(userlist);
        recyclerView.setAdapter(recyclerviewadapter);
        recyclerviewadapter.notifyDataSetChanged();





    }

}