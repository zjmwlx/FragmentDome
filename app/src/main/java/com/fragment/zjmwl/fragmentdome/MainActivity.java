package com.fragment.zjmwl.fragmentdome;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn_1);
        btn.setOnClickListener(this);
        replaceFrament(new LeftFragment());

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_1:
                Toast.makeText(this, "点击了按钮", Toast.LENGTH_LONG).show();
                replaceFrament(new AntherFragment());
                break;

        }
    }

    /**
     * 动态加载碎片的方法,
     * @param fragment:需要加载的碎片实例
     */
    private void replaceFrament(Fragment fragment) {
        //用getSupportFragmentManager()方法获取fragmentManager实例
        FragmentManager fragmentManager = getSupportFragmentManager();
        //通过fragmentManager实例的beginTransaction()方法开启事务.
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //掉用事务的replace()方法调换fragment,传入父容器和要替换的fragment实例
        transaction.replace(R.id.right_layout, fragment);
        //降事务添加都返回栈
        transaction.addToBackStack(null);
        //commit()提交事务.
        transaction.commit();

    }
}
