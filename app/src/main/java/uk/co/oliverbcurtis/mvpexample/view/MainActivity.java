package uk.co.oliverbcurtis.mvpexample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import uk.co.oliverbcurtis.mvpexample.R;
import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract.Presenter;
import uk.co.oliverbcurtis.mvpexample.contract.MainActivityContract.View;
import uk.co.oliverbcurtis.mvpexample.presenter.MainActivityPresenter;

//This class relates to all the views/fragments etc used
public class MainActivity extends AppCompatActivity implements View {

    //In our activity_main.xml, we have a TextView and a Button, hence they are declared below
    private TextView mTextView;
    private Button mButton;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content view to the activity_main.xml
        setContentView(R.layout.activity_main);
        //Creating an instance of a Presenter package, this creates a link between the three Classes
        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                /*
                Here when the OnClick is made, a call is made to MainActivityContract Interface where the onClick(view) method
                is declared, from the interface method, the definition for that method is handled in the MainActivityPresenter Class
                */
                mPresenter.onClick(view);
            }
        });
    }

    //Here finally the "Hello World" data string is set to the TextView and presented to the user on their device
    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
    
}