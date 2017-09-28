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
    {
    if(DemoApplication.additionner(5,3)==8){
    Assert.assertTrue(true);
    }else{
    Assert.assertTrue(false);
    }
    }
	@Test
    public  void addition_integer_and_null_should_give_exception_return() throws Exception
    {
    try{
    	DemoApplication.additionner(5, null);
    	Assert.assertTrue(false);}
    catch(Exception e){
    	Assert.assertTrue(true);
    }
    }
	@Test
    public void soustraire_two_integer_should_give_integer_return() throws Exception
    {
    if(DemoApplication.soustraire(5, 3)==2){
        Assert.assertTrue(true);
        }else{
        	Assert.assertTrue(false);
        }
    }
	@Test
    public  void soustraire_integer_and_null_should_give_exception_return() throws Exception
    {
    try{
    	DemoApplication.soustraire(5, null);
    	Assert.assertTrue(false);}
    catch(Exception e){
    	Assert.assertTrue(true);
    }
    }

	@Test
    public  void multiplier_two_integer_should_give_integer_return() throws Exception
    {
    if(DemoApplication.multiplier(5,3)==15){
    Assert.assertTrue(true);
    }else{
    Assert.assertTrue(false);
    }
    }
	
	@Test
    public  void multiplier_integer_and_null_should_give_exception_return() throws Exception
    {
    try{
    	DemoApplication.multiplier(5, null);
    	Assert.assertTrue(false);}
    catch(Exception e){
    	Assert.assertTrue(true);
    }
    }
    
	@Test
    public  void diviser_two_integer_should_give_integer_return() throws Exception
    {
    if(DemoApplication.diviser(9,3)==3){
    Assert.assertTrue(true);
    }else{
    Assert.assertTrue(false);
    }
    }
	
	@Test
    public  void diviser_integer_and_null_should_give_exception_return() throws Exception
    {
    try{
    	DemoApplication.diviser(5, null);
    	Assert.assertTrue(false);}
    catch(Exception e){
    	Assert.assertTrue(true);
    }
    }
}
