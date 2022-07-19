package com.test.MavenPractice;

import org.testng.annotations.Test;

public class mavenPractice {
        @Test
        public void practiceTest1() {
        	System.out.println("TYSS1");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
  
        	String password = System.getProperty("MISSIONIMPOSSIBLE"); 
        	System.out.println(password);
        }
        @Test
        public void Test2() {
        	System.out.println("hiii");
        	System.out.println("bye");
        	String url = System.getProperty("URL");
        	String username = System.getProperty("USERNAME");
        	String password = System.getProperty("PASSWORD");
        	System.out.println(url);
        	System.out.println(username);
        	System.out.println(password);
        }
 
 }