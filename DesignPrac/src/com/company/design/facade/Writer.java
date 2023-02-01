package com.company.design.facade;

public class Writer {

    private String filename;

    public Writer(String filename){
        this.filename = filename;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s 로 연결합니다.", filename);
        System.out.println(msg);

    }
    public void fileDisconnect(){

        String msg = String.format("Writer %s 와 연결 종료됩니다.", filename);
        System.out.println(msg);

    }
    public void write(){
        String msg = String.format("Writer %s 로 파일쓰기 진행합니다.", filename);
        System.out.println(msg);

    }

}
