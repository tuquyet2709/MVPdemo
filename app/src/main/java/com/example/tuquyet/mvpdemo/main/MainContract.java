package com.example.tuquyet.mvpdemo.main;

/**
 * Created by tuquyet on 07/07/2017.
 */
public interface MainContract {
    interface Presenter {
        void NumberChecker(int choice, int random);
    }

    interface View {
        void NumberSelectedIsRight();
        void NumberSelectedIsWrong();
    }
}
