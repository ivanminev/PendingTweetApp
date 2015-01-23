package com.trading212.ivanminev.pendingtwitterapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ivan.minev on 22.1.2015 г..
 */
public class LoginChooserFragment extends android.support.v4.app.Fragment implements View.OnClickListener
{

    private Button loginButton;

    private Button registerButton;

    private LoginFragmentActionListener listener;

    @Override
    public void onClick(View v)
    {
        if(v.getId() == loginButton.getId())
        {
            listener.onLoginClick();
        }
        if(v.getId() == registerButton.getId())
        {
            listener.onRegisterClick();
        }
    }


    public interface LoginFragmentActionListener
    {
        public void onLoginClick();

        public void onRegisterClick();
    }

    @Override
    public void onAttach(Activity activity)
    {

        super.onAttach(activity);
        this.listener = (LoginFragmentActionListener) activity;


    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.login_choice_view, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        loginButton = (Button) getActivity().findViewById(R.id.loginButton);
        registerButton = (Button) getActivity().findViewById(R.id.registerButton);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
        super.onActivityCreated(savedInstanceState);
    }
}
