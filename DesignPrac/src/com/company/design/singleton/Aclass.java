package com.company.design.singleton;


public class Aclass {

    private SocketClient socketClient;

    public Aclass(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
