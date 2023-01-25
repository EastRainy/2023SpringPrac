package com.company.design.proxy;

import com.company.design.proxy.iBrowser;
public class browserProxy implements iBrowser{


    private String url;
    private Html html;

    public browserProxy(String url){
        this.url = url;
    }

    @Override
    public Html show(){

        if(html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading Html from " + url);
        }

        System.out.println("BrowserProxy use cache Html : " + url);
        return html;

    }

}
