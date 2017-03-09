package ysd.example.cn.mvpdemo;

import android.view.View;
import android.widget.Toast;

import ysd.example.cn.mvpdemo.mvp.BaseActivity;
import ysd.example.cn.mvpdemo.mvp.entity.YouEntity;
import ysd.example.cn.mvpdemo.mvp.presenter.YouPresenter;
import ysd.example.cn.mvpdemo.mvp.veiw.YouView;

public class SecondActivity extends BaseActivity<YouView, YouPresenter> implements YouView<YouEntity>, View.OnClickListener {


    @Override
    public void onClick(View view) {
        getPreserter().updateData();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_second;
    }

    @Override
    protected void init() {
        findViewById(R.id.tv_data).setOnClickListener(this);
    }

    @Override
    protected YouPresenter createPresenter() {
        return new YouPresenter();
    }

    @Override
    public void upDateData(YouEntity data) {
        Toast.makeText(this, data.s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void update(String s) {

    }
}
