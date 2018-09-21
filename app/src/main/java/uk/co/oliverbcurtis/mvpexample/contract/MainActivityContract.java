package uk.co.oliverbcurtis.mvpexample.contract;

//Contract holds the well defined methods for all of the 3 classes
public interface MainActivityContract {

    //View defines the rules for the View Class - the below methods will need to be implemented in MainActivity
    interface View {
        //Method used to initialise views
        void initView();
        //Method used to set some data
        void setViewData(String data);
    }

    //Model defines the rules for the Model Class - the below methods will need to be implemented in MainActivityModel
    interface Model {

        //getData() will return a string type
        String getData();
    }
    /*
    Presenter is a Class that will handle all of the events that is fired from the main view - all business logic/condition logic
    or whatever the logic that you might need to perform in the View/Model Class should be carried out in the Presenter Class
    */
    interface Presenter {

        void onClick(android.view.View view);
    }
}
