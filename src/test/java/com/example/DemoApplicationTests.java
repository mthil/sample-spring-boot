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
	
	@Test
    public  void addition_two_integer_should_give_integer_return() throws Exception
    {System.out.println("addition_two_integer_should_give_integer_resposne");
    if(DemoApplication.additionner(5,3)==8){
    Assert.assertTrue(true);
    }else{
    Assert.assertTrue(false);
    }
    }
	@Test
    public  void addition_integer_and_null_should_give_exception_return() throws Exception
    {
		System.out.println("addition_two_integer_should_give_integer_resposne");
    try{
    	DemoApplication.additionner(5, null);
    	Assert.assertTrue(false);}
    catch(Exception e){
    	Assert.assertTrue(true);
    }
    }
	@Test
    public void soustraire_two_integer_should_give_integer_return() throws Exception
    {System.out.println("after soustraire");
    if(DemoApplication.soustraire(5, 3)==2){
        Assert.assertTrue(true);
        }else{
        	Assert.assertTrue(false);
        }
    }
//    @Test
//    public void multiplier() throws Exception
//    {    	System.out.println("multiplier");    }
//    @Test
//    public void testMultiplier2() throws Exception
//    {System.out.println("multiplier2");}
//    
//    
//    @Test
//	public void testDiviser() throws Exception
//    {System.out.println("ignore test diviser");   }
}
