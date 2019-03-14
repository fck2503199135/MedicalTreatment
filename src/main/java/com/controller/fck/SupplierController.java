package com.controller.fck;

import com.beans.fck.Page;
import com.beans.fck.Supplier;
import com.myservice.fck.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class SupplierController {

    @Autowired
    SupplierService ss;

    @RequestMapping("/getByNameAndName")
    @ResponseBody
    public Map<String,Object> getByNameAndName(@RequestBody Page page){
        return ss.getByNameAndName(page);
    }

    @RequestMapping("/addSupplier")
    @ResponseBody
    public String addSupplier(Supplier supplier){
        ss.addSupplier(supplier);
        return "1";
    }

    @RequestMapping("/delSupplier")
    @ResponseBody
    public String delSupplier(int sid){
        ss.delSupplier(sid);
        return "1";
    }

    @RequestMapping("/getById")
    @ResponseBody
    public Supplier getById(int sid){
        return ss.getById(sid);
    }



    @RequestMapping("/updateSupplier")
    @ResponseBody
    public String updateSupplier(Supplier supplier){
       ss.updateSupplier(supplier);
       return "1";
    }



}
