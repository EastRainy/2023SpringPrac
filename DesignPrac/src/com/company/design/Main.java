package com.company.design;

import com.company.design.facade.*;

public class Main {

    public static void main(String[] args){

        sftpClient client = new sftpClient("www.naver.com", 22, "/home/", "text.tmp");

        client.connect();

        client.write();
        client.read();


        client.disConnect();


    }
}
