package ysd.example.cn.mvpdemo.mvp.model;

/**
 * Created by LiLi on 2017/3/9.
 * Func:
 * Desc:
 */

public interface BaseModel<E,T> extends IModel<T> {
    E getResponse();

}
