package com.company.design.facade;

public class Ftp {

    private String host, path;
    private int port;

    public Ftp(String host, int port, String path){

        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect(){
        System.out.println("FTP Host : "+ host + " Port : " + port + "로 연결");
    }
    public void moveDerectory(){
        System.out.println("FTP path "+path + " 로 이동합니다.");
    }
    public void Disconnect(){
        System.out.println("연결을 종료합니다.");
    }



}
