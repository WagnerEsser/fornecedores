package br.com.neomind;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class AppConfig extends Application {

	public AppConfig() {
		System.out.println("Created AppConfig");
	}
}
