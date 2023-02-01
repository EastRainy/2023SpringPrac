package com.company.design.facade;

public class Reader {

    private String filename;

    public Reader(String filename){
        this.filename = filename;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s 로 연결합니다.", filename);
        System.out.println(msg);
    }
    public void fileRead(){
        String msg = String.format("Reader %s 의 내용을 읽습니다.", filename);
        System.out.println(msg);

    }
    public void fileDisconnect(){
        String msg = String.format("Reader %s 와 연결 종료됩니다.", filename);
        System.out.println(msg);
    }


}
