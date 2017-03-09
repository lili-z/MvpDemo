package ysd.example.cn.mvpdemo.mvp.model;


import ysd.example.cn.mvpdemo.mvp.entity.MyEntity;
import ysd.example.cn.mvpdemo.mvp.entity.YouEntity;

/**
 * Created by LiLi on 2017/3/9.
 * Func:
 * Desc:
 */

public class MyModel implements BaseModel<MyEntity,YouEntity> {

    /**
     * 网络请求
     * @return
     */
    @Override
    public MyEntity getResponse() {
        return new MyEntity("this is myentity");
    }


    @Override
    public YouEntity getData() {
        return null;
    }
}
