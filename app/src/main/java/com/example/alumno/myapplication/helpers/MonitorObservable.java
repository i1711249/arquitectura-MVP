package com.example.alumno.myapplication.helpers;


import com.example.alumno.myapplication.models.client;

import java.util.Observable;

public class MonitorObservable extends Observable {
    client wachedValue;

    public MonitorObservable(client o) {
        this.wachedValue = o;
    }

    public void setWacheValue(client o) {
        if (o != null && o.getYear_old() != this.wachedValue.getYear_old()){
            this.wachedValue = o;
        setChanged();
        notifyObservers(o);
    } else

    {

        setChanged();
        notifyObservers(o);
    }
}
}

