package uk.co.oliverbcurtis.mvpexample.model;

import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract;


public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData() {
        return "Hello World";
    }
}