package uk.co.oliverbcurtis.mvpexample.presenter;

import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract;
import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract.Model;
import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract.View;
import uk.co.oliverbcurtis.mvpexample.model.MainActivityModel;

/*
The presenter class holds all of the business logic and acts as a mediator between the view and model
*/
public class MainActivityPresenter implements MainActivityContract.Presenter {

    private View mView;
    private Model mModel;

    //This method is called from MainActivity (line 27)
    public MainActivityPresenter(View view) {
        mView = view;

        //When this method is called, the below method call is made to the method below
        initPresenter();
    }

    /*
    This method is called from the above method and creates a new instance of the MainActivityModel. This is where the
    Hello World Method is called and the response is returned to this method call.
    */
    private void initPresenter() {
        mModel = new MainActivityModel();
        /*
        The below takes the view that was passed from the MainActivity and calls the method declared in MainActivityContract -
        initView(), which is defined in MainActivity
        */
        mView.initView();
    }

    /*
    This method called from MainActivity (via the MainActivityContract Interface)
    Saved inside data is "Hello World" (the returned string), this is then passed
    */
    @Override
    public void onClick(android.view.View view) {
        String data = mModel.getData();

        //Below is passing the data to the MainActivityContract, which is then defined in MainActivity
        mView.setViewData(data);
    }
}
