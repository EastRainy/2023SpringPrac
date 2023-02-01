package com.company.design.facade;

public class facadeMain {

    public facadeMain(){

        sftpClient client = new sftpClient("www.naver.com", 22, "/home/", "text.tmp");

        client.connect();

        client.write();
        client.read();


        client.disConnect();



    }
}
