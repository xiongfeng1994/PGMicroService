package com.ebest.msprovideruserstore;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MsProviderUserStoreApplication.class)
@WebAppConfiguration
@Transactional
public class MsProviderUserStoreApplicationTests {

	 	@Autowired
	    private WebApplicationContext context;

	    private MockMvc mockMvc;

	    private ObjectMapper mapper = new ObjectMapper();  
	    
	    @Before
	    public void setupMockMvc() throws Exception {
	        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	    }
	    
	    /**
	     * api: stores/{code}
	     * method: get
	     * description: code is exist 
	     * sql: select * from store where code = 'SUBD_S131618' and is_deleted = 0
	     * @throws Exception
	     */
	    @Test
	    public void test1() throws Exception {
	    	
	       Map expectmap = JSON.parseObject("{" + 
	       		"  \"errorCode\": 0," + 
	       		"  \"errorDesc\": \"\"," + 
	       		"  \"errorMessage\": \"\"," + 
	       		"  \"store\": " + 
	       		"    {" + 
	       		"      \"address\": \"无\"," + 
	       		"      \"cdhCode\": \"SUBD_S131618\"," + 
	       		"      \"channel\": {" + 
	       		"        \"code\": \"000000002\"," + 
	       		"        \"description\": \"分销渠道\"" + 
	       		"      }," + 
	       		"      \"code\": \"SUBD_S131618\"," + 
	       		"      \"name\": \"北坡上9\"," + 
	       		"      \"phone\": \"无\"," + 
	       		"      \"region\": {" + 
	       		"        \"code\": \"000000008\"," + 
	       		"        \"description\": \"安顺分部\"" + 
	       		"      }," + 
	       		"      \"status\": \"Active\"," + 
	       		"      \"storeType\": {" + 
	       		"        \"code\": \"000000002\"," + 
	       		"        \"description\": \"小食杂店\"" + 
	       		"      }" + 
	       		"    }" + 
	       		"}",HashMap.class);
	       String code ="SUBD_S131618";
	       String path ="/stores/%s";
	       MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get(String.format(path,code))
	                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();
	       int status = result.getResponse().getStatus();
	       String content=result.getResponse().getContentAsString();
	       HashMap map = JSON.parseObject(result.getResponse().getContentAsString(), HashMap.class);
	       Assert.assertTrue("status不符合预期", status == 200);
	       Assert.assertTrue("结果不符合预期", expectmap.equals(map));  
	    }
	    
	    
	    /**
	     * api: stores/{code}
	     * method: get
	     * description: code is not exist 
	     * @throws Exception
	     */
	    @Test
	    public void test2() throws Exception {
	    	
	       Map expectmap = JSON.parseObject("{" + 
	       		"  \"errorCode\": 0," + 
	       		"  \"errorDesc\": \"\"," + 
	       		"  \"errorMessage\": \"\"," + 
	       		"  \"store\": " +
	       		"    {}" + 
	       		"}",HashMap.class);
	       String code ="code not existed";
	       String path ="/stores/%s";
	       MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get(String.format(path,code))
	                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();
	       int status = result.getResponse().getStatus();
	       String content=result.getResponse().getContentAsString();
	       HashMap map = JSON.parseObject(result.getResponse().getContentAsString(), HashMap.class);
	       Assert.assertTrue("status不符合预期", status == 200);
	       Assert.assertTrue("结果不符合预期", expectmap.equals(map));  
	    }
	    
	    /**
	     * api: stores/{code}
	     * method: get
	     * description: sql injection in code 
	     * @throws Exception
	     */
	    @Test
	    public void test3() throws Exception {
	    	
	       Map expectmap = JSON.parseObject("{" + 
	       		"  \"errorCode\": 0," + 
	       		"  \"errorDesc\": \"\"," + 
	       		"  \"errorMessage\": \"\"," + 
	       		"  \"store\": " +
	       		"    {}" + 
	       		"}",HashMap.class);
	       String code ="abc or 1 = 1 #";
	       String path ="/stores/%s";
	       MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get(String.format(path,code))
	                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();
	       int status = result.getResponse().getStatus();
	       String content=result.getResponse().getContentAsString();
	       HashMap map = JSON.parseObject(result.getResponse().getContentAsString(), HashMap.class);
	       Assert.assertTrue("status不符合预期", status == 200);
	       Assert.assertTrue("结果不符合预期", expectmap.equals(map));  
	    }
	    
	    
	    /**
	     * api: /stores
	     * method: get
	     * description: query all
	     * sql: select count(*) from store WHERE is_deleted = 0
	     * sqlresult: 10176
	     * @throws Exception
	     */
	    @Test
	    public void test4() throws Exception {
	       int limit = 1000;
	       int lastsize = 176;
	       String path = "/stores?offset=%s";
	       for(int i=1 ; i<=13; i++) {
	    	   MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get(String.format(path,i))
		                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();
	    	   int status = result.getResponse().getStatus();
		       HashMap map = JSON.parseObject(result.getResponse().getContentAsString(), HashMap.class);
		       int storesSize = ((List)map.get("stores")).size();
		       if(i<=10) {
		    	   Assert.assertTrue("status不符合预期", status == 200);
		    	   Assert.assertTrue("数据条数不符合预期", storesSize == limit);
		       }else {
		    	   Assert.assertTrue("status不符合预期", status == 200);
		    	   Assert.assertTrue("数据条数不符合预期", storesSize == lastsize);
		       }
	       }
	     
	    }
	    
	    /**
	     * api: /stores
	     * method: get
	     * description: query by code
	     * @throws Exception
	     */
	    @Test
	    public void test112() throws Exception {
	    	
	       Map expectmap = JSON.parseObject("{" + 
	       		"  \"errorCode\": 0," + 
	       		"  \"errorDesc\": \"\"," + 
	       		"  \"errorMessage\": \"\"," + 
	       		"  \"stores\": [" + 
	       		"    {" + 
	       		"      \"address\": \"无\"," + 
	       		"      \"cdhCode\": \"SUBD_S131618\"," + 
	       		"      \"channel\": {" + 
	       		"        \"code\": \"000000002\"," + 
	       		"        \"description\": \"分销渠道\"" + 
	       		"      }," + 
	       		"      \"code\": \"SUBD_S131618\"," + 
	       		"      \"name\": \"北坡上9\"," + 
	       		"      \"phone\": \"无\"," + 
	       		"      \"region\": {" + 
	       		"        \"code\": \"000000008\"," + 
	       		"        \"description\": \"安顺分部\"" + 
	       		"      }," + 
	       		"      \"status\": \"Active\"," + 
	       		"      \"storeType\": {" + 
	       		"        \"code\": \"000000002\"," + 
	       		"        \"description\": \"小食杂店\"" + 
	       		"      }" + 
	       		"    }" + 
	       		"  ]" + 
	       		"}",HashMap.class);
	       String code ="SUBD_S131618";
	       String path ="/stores?code=%s";
	       MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get(String.format(path,code))
	                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();
	       int status = result.getResponse().getStatus();
	       HashMap map = JSON.parseObject(result.getResponse().getContentAsString(), HashMap.class); 
	       Assert.assertTrue("status不符合预期", status == 200);
	       Assert.assertTrue("结果不符合预期", expectmap.equals(map));
	       
	    }
	    
	    
	    /**
	     * api: /stores
	     * method: get
	     * description: query like name
	     * @throws Exception
	     */
	    @Test
	    public void test113() throws Exception {
	    	
	       Map expectmap = JSON.parseObject("{" + 
	       		"  \"errorCode\": 0," + 
	       		"  \"errorDesc\": \"\"," + 
	       		"  \"errorMessage\": \"\"," + 
	       		"  \"stores\": [" + 
	       		"    {" + 
	       		"      \"address\": \"无\"," + 
	       		"      \"cdhCode\": \"SUBD_S131618\"," + 
	       		"      \"channel\": {" + 
	       		"        \"code\": \"000000002\"," + 
	       		"        \"description\": \"分销渠道\"" + 
	       		"      }," + 
	       		"      \"code\": \"SUBD_S131618\"," + 
	       		"      \"name\": \"北坡上9\"," + 
	       		"      \"phone\": \"无\"," + 
	       		"      \"region\": {" + 
	       		"        \"code\": \"000000008\"," + 
	       		"        \"description\": \"安顺分部\"" + 
	       		"      }," + 
	       		"      \"status\": \"Active\"," + 
	       		"      \"storeType\": {" + 
	       		"        \"code\": \"000000002\"," + 
	       		"        \"description\": \"小食杂店\"" + 
	       		"      }" + 
	       		"    }" + 
	       		"  ]" + 
	       		"}",HashMap.class);
	       String code ="SUBD_S131618";
	       String path ="/stores?storeName=%s";
	       MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get(String.format(path,code))
	                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();
	       int status = result.getResponse().getStatus();
	       HashMap map = JSON.parseObject(result.getResponse().getContentAsString(), HashMap.class); 
	       Assert.assertTrue("status不符合预期", status == 200);
	       Assert.assertTrue("结果不符合预期", expectmap.equals(map));
	       
	    }
	    
	    
}
