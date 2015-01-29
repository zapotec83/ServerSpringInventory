package com.companyname.springapp.web;

import java.util.Map;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.impl.ProductManagerImpl;

public class InventoryControllerTest extends TestCase{
	
    public void testHandleRequestView() throws Exception{		
    	InventoryController controller = new InventoryController();
    	controller.setProductManager(new ProductManagerImpl());
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
    	@SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}
