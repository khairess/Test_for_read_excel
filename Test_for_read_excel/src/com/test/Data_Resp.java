package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Resp {
	@DataProvider(name="url_data")
	public static Object[][] urlsheet()
	{
		    ExUt exl=new ExUt();
		    Object[][] arrayObject = exl.getExcelData("C:\\Users\\Lenovo\\Desktop\\List.xls","Sheet1");
			return arrayObject;
	}
	@Test(dataProvider="url_data")
	public void Test_Case(String url,String mark,String num) 
	{
		System.out.println(url);
	}
}
