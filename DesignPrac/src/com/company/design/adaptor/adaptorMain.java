package com.company.design.adaptor;

public class adaptorMain {

    public static void adaptorMain(String[] args){

        Radio radio = new Radio();
        Airconditioner aircon = new Airconditioner();

        plug(radio);
        //110V 플러그에 라디오 직접연결

        Electroinc110V adaptor = new SocketAdapter(aircon);
        plug(adaptor);
        //110V 플러그에 어뎁터를 이용하여 220V 에어컨 연결

    }
    private static void plug(Electroinc110V electroinc110V){
        //전원공급 110V 콘센트릭 플러그
        electroinc110V.connect();
    }
}
