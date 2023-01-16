package com.company.design.singleton;

public class main_tested {

    public void main_tested(){

        Aclass A = new Aclass();
        Bclass B = new Bclass();

        SocketClient tmp1 = A.getSocketClient();
        SocketClient tmp2 = B.getSocketClient();

        System.out.println("Equal A-B Socket?");
        System.out.println(tmp1.equals(tmp2));

    }

}
