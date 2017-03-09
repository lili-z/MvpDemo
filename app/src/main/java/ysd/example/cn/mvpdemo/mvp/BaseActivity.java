package ysd.example.cn.mvpdemo.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import ysd.example.cn.mvpdemo.mvp.presenter.BasePresenter;


/**
 * Created by LiLi on 2017/3/7.
 * Func:
 * Desc:
 */

public abstract class BaseActivity<V, E extends BasePresenter> extends AppCompatActivity {
    E mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mPresenter = createPresenter();
        mPresenter.touchView((V) this);
        init();
        Log.i("oncreate", "onCreate");
    }

    protected abstract int getLayout();

    protected abstract void init();

    protected abstract E createPresenter();

    protected  E getPreserter(){
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.deTouch();
    }

    public void showProgress() {
        Toast.makeText(this, "progressshow", Toast.LENGTH_SHORT).show();
    }

    public void dismissProgress() {
        Toast.makeText(this, "progressdismiss", Toast.LENGTH_SHORT).show();
    }

}
