package com.company.design;

import com.company.design.singleton.Aclass;
import com.company.design.singleton.Bclass;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args){

        Aclass A = new Aclass();
        Bclass B = new Bclass();

        SocketClient tmp1 = A.getSocketClient();
        SocketClient tmp2 = B.getSocketClient();

        System.out.println("Equal A-B Socket?");
        System.out.println(tmp1.equals(tmp2));

    }
}
