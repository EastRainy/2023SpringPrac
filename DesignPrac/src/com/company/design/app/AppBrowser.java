package com.company.design.app;

import com.company.design.proxy.Html;
import com.company.design.proxy.iBrowser;

public class AppBrowser implements iBrowser{


    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AppBrowser(String url, Runnable before, Runnable after){
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {
        before.run();
        if(html == null){

            this.html = new Html(url);
            System.out.println("BrowserProxy loading Html from " + url);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        after.run();
        System.out.println("BrowserProxy use cache Html : " + url);
        return html;

    }
}
