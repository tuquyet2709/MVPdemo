package com.example.tuquyet.mvpdemo.main;

/**
 * Created by tuquyet on 07/07/2017.
 */
public class MainPresenter implements MainContract.Presenter {
    MainContract.View viewNumber;

    public MainPresenter(MainContract.View viewNumber) {
        this.viewNumber = viewNumber;
    }

    @Override
    public void NumberChecker(int choice, int randomNumber) {

        if (choice == randomNumber+1) viewNumber.NumberSelectedIsRight();
        else viewNumber.NumberSelectedIsWrong();
    }
}
