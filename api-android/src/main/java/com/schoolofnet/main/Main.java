package com.schoolofnet.main;

import java.net.URI;

public class Main {

	public static final String BASE_URI = "http://localhost:8080/api/";
	
	public static HttpServer startServer() {
		final ResourceConfig rc = new ResourceConfig().packages("com.schoolofnet");
		
		return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
	}
	
	public static void main(String[] args) {
		final HttpServer server = startServer();
		
		System.out.println("Jersey app started at: " + BASE_URI + "to shutdown, please enter!");
		System.in.read();
		
		server.shutdown();
	}
}
