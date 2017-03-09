package ysd.example.cn.mvpdemo.mvp.presenter;

import ysd.example.cn.mvpdemo.mvp.entity.YouEntity;
import ysd.example.cn.mvpdemo.mvp.model.YouModel;
import ysd.example.cn.mvpdemo.mvp.veiw.YouView;

/**
 * Created by LiLi on 2017/3/9.
 * Func:
 * Desc:
 */

public class YouPresenter extends BasePresenter<YouView,YouModel> {

    @Override
    public YouModel createModel() {
        return new YouModel();
    }

    public void updateData(){
        YouEntity response = getModel().getResponse();
        getView().upDateData(response);
    }

}
