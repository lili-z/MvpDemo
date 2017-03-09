package ysd.example.cn.mvpdemo.mvp.model;

import ysd.example.cn.mvpdemo.mvp.entity.YouEntity;

/**
 * Created by LiLi on 2017/3/9.
 * Func:
 * Desc:
 */

public class YouModel implements BaseModel<YouEntity,YouEntity>{

    @Override
    public YouEntity getResponse() {
        return new YouEntity("this is youentity");
    }

    @Override
    public YouEntity getData() {
        return null;
    }
}
