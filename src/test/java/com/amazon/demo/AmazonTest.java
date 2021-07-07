package com.amazon.demo;

import com.amazon.demo.pageobjects.LaunchPage;
import com.amazon.demo.utils.JsonUtil;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author Anand B S
 * @date 07 Jul 2021
 */
public class AmazonTest extends  BaseTest {

    @Test
    public void testCase1() throws InterruptedException {
        Map<String, String> data = JsonUtil.getMapData("TestCase01");
        String productName=data.get("ProductName");
        int index=Integer.valueOf(data.get("ProductName"));
        LaunchPage launchPage= new LaunchPage();
        launchPage.skipSkinin()
                .searchProduct(productName)
                .scrollSelectProduct(index)
                .addProductToCart()
                .goToCart();




    }
}
