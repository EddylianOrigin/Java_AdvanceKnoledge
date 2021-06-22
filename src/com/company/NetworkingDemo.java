package com.company;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException {

        String url = "www.simplilearn.com";

        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));

        // getHostAddress() method
        System.out.println("Host Address : " + inetAddress.getHostAddress());

        // isLinkLocalAddress() method
        System.out.println("Host Address : " + inetAddress.isLinkLocalAddress());
        //Address and Host Address have same value but different representation

        //isAnyLocalAddress() method( is no address assioziate with this website?
        System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());

        // isLoopbackAddress() method
        System.out.println("isLoopbackAddress : " + inetAddress.isLoopbackAddress());

        // isSiteLocalAddress() method
        System.out.println("isSiteLocalAddress : " + inetAddress.isSiteLocalAddress());

        // hasCode() method
        System.out.println("hashCode : " + inetAddress.hashCode());
    }
}
