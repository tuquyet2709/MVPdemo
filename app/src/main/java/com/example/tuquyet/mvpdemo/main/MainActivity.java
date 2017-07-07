package com.example.tuquyet.mvpdemo.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.example.tuquyet.mvpdemo.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements MainContract.View,
    android.view.View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    int choice;
    int randomNumber;
    Random random = new Random();
    MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        initView();
        setOnClickListener();
        randomNumber = random.nextInt(4);
    }

    private void setOnClickListener() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    private void initView() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
    }

    @Override
    public void NumberSelectedIsRight() {
        Toast.makeText(this, "Good! One more, random number is changed :))) ", Toast.LENGTH_SHORT)
            .show();
        randomNumber = random.nextInt(4);
    }

    @Override
    public void NumberSelectedIsWrong() {
        Toast.makeText(this, "Wrong, try again !", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(android.view.View v) {
        switch (v.getId()) {
            case R.id.button1:
                choice = 1;
                mPresenter.NumberChecker(choice, randomNumber);
                break;
            case R.id.button2:
                choice = 2;
                mPresenter.NumberChecker(choice, randomNumber);
                break;
            case R.id.button3:
                choice = 3;
                mPresenter.NumberChecker(choice, randomNumber);
                break;
            case R.id.button4:
                choice = 4;
                mPresenter.NumberChecker(choice, randomNumber);
                break;
            default: break;
        }
    }
}
