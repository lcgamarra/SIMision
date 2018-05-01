package com.gamver.simision.conn;

import java.net.HttpURLConnection;
import java.net.URL;

public class Requester {

    public boolean login_request(String user_arg, String pass_arg){



        try {

            URL url = new URL("http://192.168.0.200/sim/login.php");
            HttpURLConnection client = (HttpURLConnection) url.openConnection();
            client.setRequestMethod("POST");
            client.setRequestProperty("user",user_arg);
            client.setRequestProperty("pass",pass_arg);
            client.setDoOutput(true);

        }catch (Exception e){
            e.printStackTrace();
        }


        return true;
    }

}
