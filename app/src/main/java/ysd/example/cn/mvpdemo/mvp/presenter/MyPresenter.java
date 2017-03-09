package ysd.example.cn.mvpdemo.mvp.presenter;


import ysd.example.cn.mvpdemo.mvp.entity.MyEntity;
import ysd.example.cn.mvpdemo.mvp.model.MyModel;
import ysd.example.cn.mvpdemo.mvp.veiw.MyView;

/**
 * Created by LiLi on 2017/3/7.
 * Func:
 * Desc:
 */

public class MyPresenter extends BasePresenter<MyView,MyModel> {


    public void requestHttp(){
        MyEntity data = getModel().getResponse();
        getView().showData(data);
//        getView().dismissProgress();
    }

    @Override
    public MyModel createModel() {
        return new MyModel();
    }
}
