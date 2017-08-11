package com.example.licky.client_taxigo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.example.licky.client_taxigo.R;
import com.example.licky.client_taxigo.GrabOrderAdapter;
public class GrabOrder extends AppCompatActivity {

    ListView opinion_Listview;
    String[] locations = {"台北火車站", "台南火車站", "台中火車站", "台東火車站", "永康火車站",
            "新市火車站", "善化火車站", "大橋火車站", "新營火車站", "柳營火車站"};
    String[] time = {"約3分鐘", "約2分鐘", "約5分鐘", "約1分鐘", "約1分鐘", "約2分鐘", "約5分鐘", "約4分鐘", "約4分鐘", "約3分鐘"};
    String[] comments = new String[]{"有行李", "有嬰兒", "無", "有輪椅", "開後備箱",
            "無", "有行李", "需要開後備箱", "需要六人車", "有嬰兒"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setMenuLayout(R.layout.activity_opinion);
        setContentView(R.layout.activity_grab_order);

        opinion_Listview = (ListView)findViewById(R.id.order_Listview);

        //建立自訂的Adapter
        GrabOrderAdapter adapter = new GrabOrderAdapter(getApplicationContext() ,locations,time,comments);

        //設定ListView 的資源來源

        opinion_Listview.setAdapter(adapter);
    }

}



