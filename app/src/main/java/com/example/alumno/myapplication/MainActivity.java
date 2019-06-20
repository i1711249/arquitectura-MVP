package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.myapplication.helpers.CallBack;
import com.example.alumno.myapplication.helpers.MonitorObservable;
import com.example.alumno.myapplication.helpers.ObserverBind;
import com.example.alumno.myapplication.models.client;
import com.example.alumno.myapplication.presenter.MainPresenter;

import java.util.Observable;

public class MainActivity extends AppCompatActivity {
    Button btnEdad;
    MainPresenter mainPresenter;
    MonitorObservable monitorObservable;
    ObserverBind observerBind;
    client clientObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clientObject = new client();
        clientObject.setYear_old(19);

        mainPresenter = new MainPresenter(this, clientObject);

        btnEdad = (Button)findViewById(R.id.btnEdad);
        btnEdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clientObject.setYear_old(clientObject.getYear_old() + 1);
                mainPresenter.monitorObservable.setWacheValue(clientObject);

            }

        });
    }
        }


