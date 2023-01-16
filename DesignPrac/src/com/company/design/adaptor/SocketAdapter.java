package com.company.design.adaptor;

public class SocketAdapter implements Electroinc110V {

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }


    @Override
    public void connect(){

        electronic220V.connect();

    }


}
