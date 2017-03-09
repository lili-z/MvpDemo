package ysd.example.cn.mvpdemo.mvp.veiw;

/**
 * Created by LiLi on 2017/3/9.
 * Func:
 * Desc:
 */

public interface YouView<T> extends BaseView{
   void upDateData(T data);

   void update(String s);
}
