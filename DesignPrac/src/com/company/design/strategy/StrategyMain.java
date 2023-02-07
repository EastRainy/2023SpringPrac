package com.company.design.strategy;

public class StrategyMain {

    public void StrategyMain(){

        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();
        EncodingStrategy append = new AppendStrategy();

        String message = "hello design";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);

        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);

        System.out.println(base64Result);
        System.out.println(normalResult);
        System.out.println(appendResult);

    }


}
