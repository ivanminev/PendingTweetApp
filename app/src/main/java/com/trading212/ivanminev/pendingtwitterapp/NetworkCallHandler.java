package com.trading212.ivanminev.pendingtwitterapp;

/**
 * Created by ivan.minev on 22.1.2015 г..
 */
public interface NetworkCallHandler<ResponseType>
{
    public void onSucess(ResponseType response);
    public void onError(Error error);
}
