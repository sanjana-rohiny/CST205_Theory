package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub\
		System.out.println("MAIN");
		
		URL safari = new URL("https://www.safaritvchannel.com/");
        URLConnection yc = safari.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
	}

}
