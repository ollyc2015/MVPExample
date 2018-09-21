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


public class MainActivity extends AppCompatActivity implements View {

    private TextView mTextView;
    private Button mButton;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                mPresenter.onClick(view);
            }
        });
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}