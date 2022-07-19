package com.test.MavenPractice;

import org.testng.annotations.Test;

public class mavenPractice {
        @Test
        public void practiceTest1() {
        	System.out.println("TYSS1");
        	String admin = System.getProperty("ADMIN");
        	System.out.println(admin);
        	String password = System.getProperty("MISSIONIMPOSSIBLE"); 
        	System.out.println(password);
        }
        @Test
        public void Test2() {
        	System.out.println("hii");
        	System.out.println("bye");
        }
 
        

}