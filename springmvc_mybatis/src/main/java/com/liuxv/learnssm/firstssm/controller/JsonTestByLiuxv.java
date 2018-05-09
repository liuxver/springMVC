package com.liuxv.learnssm.firstssm.controller;

import com.liuxv.learnssm.firstssm.po.ItemsCustom;
import com.liuxv.learnssm.firstssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * created by liuxv on 2018/5/9
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
public class JsonTestByLiuxv {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/JsonTestByLiuxv")

    @ResponseBody
    public Object responseJson() throws Exception {
        class ResponseBody {
            String code = "10000";
            String message = "成功";
            Map<String, Object> result = new HashMap<String, Object>();

            public Map<String, Object> getResult() {
                return result;
            }

            public void setResult(Map<String, Object> result) {
                this.result = result;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }

        ResponseBody responseBody = new ResponseBody();
        ItemsCustom itemsCustom = itemsService.findItemsById(1);
        responseBody.getResult().put("itemsCustom", itemsCustom);
        return responseBody;

    }
}
