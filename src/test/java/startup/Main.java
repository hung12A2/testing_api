package startup;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import core.constant.Constant;
import service.CommonService;


public class Main {
	
	public static void main(String args[]) {	
		
		// Set api url
		String chosseAPIagain = "yes";
		String[] listApiUrl = Constant.LIST_API_URL;
		System.out.println("Please choose a API_URL");
		
		while (chosseAPIagain.equals("yes")){

			for (int i = 0; i < listApiUrl.length; i++) {
				System.out.println("Press " + i + " --- " + listApiUrl[i]);
			}
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int apiUrlId = 0;
	
			try {
				apiUrlId = Integer.parseInt(reader.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			Constant.API_URL = listApiUrl[apiUrlId];
				
			System.out.println("API_URL is: "+ Constant.API_URL);
			
			if (apiUrlId != 0) {
				System.out.println("This API_URL doesn't have API");
				return;
			}
			
			//process
			CommonService.setApiId();
			CommonService.setCheckUnit();
			CommonService.setUnitTestId();
			CommonService.run();

			System.out.println("press yes to continue");

			try {
				chosseAPIagain = reader.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
