package com.example.sys.retriverecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

public class RecycleAdapter extends AppCompatActivity {
TextView tv1,tv2,tv3;

    public RecycleAdapter(ListDataActivity listDataActivity, ArrayList<Map<String, String>> arrayList) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_recycle_adapter );
    }
}
