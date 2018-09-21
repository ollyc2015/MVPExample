package uk.co.oliverbcurtis.mvpexample.model;

import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract;

/*
The model class that provides with the data. So all the things you may require from the API which maybe parsing JSON

The below class implements MainActivityContract.Model so that we are forced to implement the getData method, this method
requires us to return a string, which has been done.
*/
public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData() {
        return "Hello World";
    }
}