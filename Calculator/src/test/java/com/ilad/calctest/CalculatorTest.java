package com.ilad.calctest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ilad.calc.Calculator;

@Listeners({com.ilad.calctest.TestListener.class})
public class CalculatorTest {
	private Calculator calc;
	
	
	@BeforeMethod(alwaysRun=true)
	public void beforeEveryTest(){
		 calc = new Calculator();
	}
	
	@Test(dataProvider="test_add")
	public void testAdd(int a, int b, int expected){
		Reporter.log("Test Add Done", true);
		Assert.assertEquals(calc.Add(a, b), expected);
	}
	@Test(groups="g1")
	public void testSubstruct(){
		Reporter.log("Test Sub Done", true);
		Assert.assertEquals(calc.Substruct(15, 7), 8);
	}
	@Test(dependsOnMethods={"testDivide" }, alwaysRun = true)
	public void testMultiply(){
		Reporter.log("Test Multi Done", true);
		Assert.assertEquals(calc.Multiply(12, 7), 84);
	}
	
	@Test(groups="g1")
	public void testDivide(){
		Reporter.log("Test Div Done", true);
		Assert.assertEquals(calc.Divide(81, 9), 9.0);
	}
	
	@DataProvider(name="test_add")
	public static Object[][] provideData(){
		return new Object[][]{
			{5 ,8, 13},
			{8 ,8, 16}
		};
	}
}
