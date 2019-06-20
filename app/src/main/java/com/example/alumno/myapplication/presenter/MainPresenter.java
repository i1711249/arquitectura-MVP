package com.example.alumno.myapplication.presenter;

import android.content.Context;
import android.widget.Toast;

import com.example.alumno.myapplication.MainActivity;
import com.example.alumno.myapplication.helpers.CallBack;
import com.example.alumno.myapplication.helpers.MonitorObservable;
import com.example.alumno.myapplication.helpers.ObserverBind;
import com.example.alumno.myapplication.models.client;

import java.util.Observable;

public class MainPresenter {
   public  MonitorObservable monitorObservable;
    ObserverBind observerBind;

    public void  MainPresenter (final Context _context, final client clientObject) {
        monitorObservable = new MonitorObservable(clientObject);
        observerBind = new ObserverBind();
        observerBind.setCallBack(new CallBack(){

            @Override
            public void doThis(Observable o, Object x) {
                Toast.makeText( _context,
                        clientObject.getYear_old() + "",
                        Toast.LENGTH_SHORT).show();
            }
        });
        monitorObservable.addObserver(observerBind);
    }
}
