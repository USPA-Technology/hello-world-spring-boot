package io.datawire.labs.hellospring;

import java.util.concurrent.TimeUnit;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static long start = System.currentTimeMillis();

    @GetMapping("/")
    public String sayHello() {
    	
    	String ipa;
//        String hostname;
        try {
//        	hostname = InetAddress.getLocalHost().getHostName();
            ipa = InetAddress.getLocalHost().toString();
//            System.out.println("Your current IP address : " + ipa);
//            System.out.println("Your current Hostname : " + hostname);
            
            return "Hello World from " + ipa;
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }

        return "Hello !";
    }

}
