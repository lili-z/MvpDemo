package ysd.example.cn.mvpdemo.mvp.veiw;

/**
 * Created by LiLi on 2017/3/7.
 * Func:
 * Desc:
 */

public interface MyView<T> extends BaseView {
    void showData(T data);
}
