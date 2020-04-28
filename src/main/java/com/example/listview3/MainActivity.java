package com.example.listview3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] name = {"新增支出","新增收入","我的支出","我的收入","数据管理","系统设置","收支便签","帮助","退出"};
    int[] icon = {R.drawable.addoutaccount,R.drawable.showinfo,R.drawable.outaccountinfo,R.drawable.inaccountinfo,R.drawable.showinfo,R.drawable.sysset,R.drawable.accountflag,R.drawable.help,R.drawable.exit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gview);
        Myadapter myadeapter = new Myadapter();
        gridView.setAdapter(myadeapter);
    }
    class Myadapter extends BaseAdapter{

        @Override
        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int position) {
            return name[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = View.inflate(MainActivity.this,R.layout.item,null);
            ImageView imag1 = convertView.findViewById(R.id.grideima);
            TextView te1 = convertView.findViewById(R.id.gridetext);
            imag1.setImageResource(icon[position]);
            te1.setText(name[position]);
            return convertView;
        }
    }
}
