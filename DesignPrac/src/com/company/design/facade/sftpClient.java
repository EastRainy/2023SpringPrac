package com.company.design.facade;

public class sftpClient {

    private Ftp ftpClient;
    private Reader reader;
    private Writer writer;

    public sftpClient(Ftp ftpClient, Reader reader, Writer writer){
        this.ftpClient = ftpClient;
        this.reader = reader;
        this.writer = writer;
    }
    public sftpClient(String host, int port, String path, String filename){
        this.ftpClient = new Ftp(host, port, path);
        this.reader = new Reader(filename);
        this.writer = new Writer(filename);
    }

    public void connect(){
        ftpClient.connect();
        reader.fileConnect();
        writer.fileConnect();
    }
    public void disConnect(){
        ftpClient.Disconnect();
        reader.fileDisconnect();
        writer.fileDisconnect();
    }

    public void read(){
        reader.fileRead();
    }
    public void write(){
        writer.write();
    }


}
