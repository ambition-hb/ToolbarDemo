package com.haobi.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        //加载toolbar.xml这个菜单文件
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.like:
                item.setIcon(R.drawable.xihuan_2);
                Toast.makeText(this,"点击了喜欢按钮！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.collection:
                item.setIcon(R.drawable.shoucang_2);
                Toast.makeText(this,"点击了收藏按钮！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                item.setIcon(R.drawable.fenxiang_2);
                Toast.makeText(this,"点击了分享按钮！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                toolbar.getMenu().findItem(R.id.like).setIcon(R.drawable.xihuan_1);
                toolbar.getMenu().findItem(R.id.collection).setIcon(R.drawable.shoucang_1);
                toolbar.getMenu().findItem(R.id.share).setIcon(R.drawable.fenxiang_1);
                Toast.makeText(this,"点击了删除按钮！",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
