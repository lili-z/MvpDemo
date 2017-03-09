package ysd.example.cn.mvpdemo;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import ysd.example.cn.mvpdemo.mvp.BaseActivity;
import ysd.example.cn.mvpdemo.mvp.entity.MyEntity;
import ysd.example.cn.mvpdemo.mvp.presenter.MyPresenter;
import ysd.example.cn.mvpdemo.mvp.veiw.MyView;

public class MainActivity extends BaseActivity<MyView,MyPresenter> implements MyView<MyEntity>, View.OnClickListener  {

    private TextView tv;
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(this);
        findViewById(R.id.tv_sencond_act).setOnClickListener(this);
    }

    @Override
    protected MyPresenter createPresenter() {
        return new MyPresenter();
    }


    @Override
    public void showData(MyEntity entity) {
        Toast.makeText(this, entity.getData(), Toast.LENGTH_SHORT).show();
        Log.i("mvptag","showdata");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv:
                getPreserter().requestHttp();
                break;
            case R.id.tv_sencond_act:
                startActivity(new Intent(this,SecondActivity.class));
                break;
        }
    }


}
