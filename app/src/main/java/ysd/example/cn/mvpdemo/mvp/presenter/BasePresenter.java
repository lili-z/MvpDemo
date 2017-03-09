package ysd.example.cn.mvpdemo.mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by LiLi on 2017/3/7.
 * Func:
 * Desc:
 */

public abstract class BasePresenter<V,T> {
    WeakReference<V> weakReference;
    T modle;

    public BasePresenter(){
        modle=createModel();
    }
    public abstract T createModel();

    public  T getModel(){
        return modle;
    }

    public void touchView(V view) {
            weakReference = new WeakReference<V>(view);
    }

    public void deTouch() {
        weakReference.clear();
        weakReference = null;
        modle=null;
    }

    protected V getView() {
        return weakReference.get();
    }
}
