package uk.co.oliverbcurtis.mvpexample.presenter;

import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract;
import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract.Model;
import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract.View;
import uk.co.oliverbcurtis.mvpexample.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private View mView;
    private Model mModel;

    public MainActivityPresenter(View view) {
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}
