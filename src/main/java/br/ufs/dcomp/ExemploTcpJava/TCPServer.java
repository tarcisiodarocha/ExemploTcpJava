package br.ufs.dcomp.ExemploTcpJava;

import java.net.*;
import java.io.*;
public class TCPServer{
    public static void main(String[] args){
        System.out.println("Server Init...");
        try {
            ServerSocket ss = new ServerSocket(3300, 5, InetAddress.getByName("127.0.0.1"));
            Socket sock = ss.accept();
            InputStream is = sock.getInputStream();
            OutputStream os = sock.getOutputStream();
            
            byte[] buf = new byte[20];
            is.read(buf);
            String msg = new String(buf);
            System.out.println(msg);
            
        }catch(Exception e){System.out.println(e);}    
    }
}