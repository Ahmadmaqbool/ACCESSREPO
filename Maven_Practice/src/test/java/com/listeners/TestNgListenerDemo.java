package com.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNgListenerDemo {
	   @Test
       public void test1() {
    	   System.out.println("inside test1");
       }
	   @Test
       public void test2() {
    	   System.out.println("inside test2");
    	   Assert.assertTrue(false);
       }
	   @Test
       public void test3() {
    	   System.out.println("inside test3");
    	   throw new SkipException("This test is skipped");
       }
}
