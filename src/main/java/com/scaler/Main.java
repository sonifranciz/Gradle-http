package com.scaler;
import com.scaler.greetings.Greetings;
import main.java.com.scaler.http.Client;
public class Main {
    public static void main(String[] args) {

        Greetings g=new Greetings();
        System.out.println(g.greet());

        Client client= new Client();
        String repsonse= client.get("https://www.youtube.com/");
        System.out.println(repsonse);
        System.out.println("Hello world!");
    }
}