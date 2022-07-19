package com.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNgListenerDemo2 {
	   @Test
       public void test4() {
    	   System.out.println("inside test1");
       }
	   @Test
       public void test5() {
    	   System.out.println("inside test2");
       }
	   @Test
       public void test6() {
    	   System.out.println("inside test3");
    	   throw new SkipException("This test is skipped");
       }
}
