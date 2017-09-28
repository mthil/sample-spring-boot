package com.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@BeforeClass
    public static void testAddition() throws Exception
    {System.out.println("beforeClass addition");
    if(DemoApplication.additionner(5, 3)==8){
    Assert.assertTrue(true);
    }else{
    	Assert.assertTrue(false);
    }
    }
	
    @After
    public void testSoustraire() throws Exception
    {System.out.println("after soustraire");}
    @Test
    public void multiplier() throws Exception
    {    	System.out.println("multiplier");    }
    @Test
    public void testMultiplier2() throws Exception
    {System.out.println("multiplier2");}
    
    @Ignore
    @Test
	public void testDiviser() throws Exception
    {System.out.println("ignore test diviser");   }
}
