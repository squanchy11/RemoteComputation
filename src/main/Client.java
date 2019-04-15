package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class Client {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter IP: ");
        String ip = br.readLine();

        ServerInterface obj = (ServerInterface) Naming.lookup("rmi://" + ip + ":1099" + "/My-Server");

        // Test calculatePI
        System.out.println(obj.calculatePI(10000000));

        // Test getServerOS
        System.out.println(obj.getOS());
    }
}
