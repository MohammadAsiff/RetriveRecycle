package com.example.sys.retriverecycle;

import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Map;

public class ListDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_list_data );
        AlertController.RecycleListView rv=findViewById( R.id.recycleView );
        ExampleDB db=new ExampleDB( this );
        ArrayList<Map<String,String>>arrayList= new ArrayList();
        arrayList=db.getDatafromDatabase();
        RecycleAdapter adapter=new RecycleAdapter(this,arrayList);
        rv.setAdapter( adapter );

    }
}
