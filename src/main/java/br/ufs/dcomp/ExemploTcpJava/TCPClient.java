package br.ufs.dcomp.ExemploTcpJava;

import java.net.*;
import java.io.*;
public class TCPClient{
    public static void main(String[] args){
        System.out.println("Init...");
        try {
            Socket sock = new Socket("127.0.0.1", 3300);
            OutputStream os = sock.getOutputStream();
            os.write("oiiii".getBytes());
        }catch(Exception e){System.out.println(e);}    
    }
}