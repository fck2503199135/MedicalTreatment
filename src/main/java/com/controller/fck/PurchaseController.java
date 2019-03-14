package com.controller.fck;

import com.beans.fck.Page;
import com.beans.fck.Purchase;
import com.beans.fck.Supplier;
import com.myservice.fck.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class PurchaseController {
    @Autowired
    PurchaseService ps;

    @RequestMapping("/getAllPurchaseByName")
    @ResponseBody
    public Map<String, Object> getAllPurchaseByName(@RequestBody Page page) {
        return ps.getAllPurchaseByName(page);
    }

    @RequestMapping("/getSurIdName")
    @ResponseBody
    public List<Supplier> getSurIdName() {
        return ps.getSurIdName();
    }



    @RequestMapping("/getPurByAddId")
    @ResponseBody
    public List<Purchase> getPurByAddId(String strpids) {
        int[] ints = new int[strpids.length()];
        for (int i=0;i<strpids.length();i++){
            ints[i]=Integer.parseInt(String.valueOf(strpids.charAt(i)));
        }
        Purchase purchase = new Purchase();
        purchase.setPids(ints);
        return ps.getPurByAddId(purchase);
    }




    @RequestMapping("/addPurchase")
    @ResponseBody
    public String addPurchase(Purchase purchase) {
        ps.addPurchase(purchase);
        return "1";
    }

    @RequestMapping("/getLibrary")
    @ResponseBody
    public Map<String, Object> getLibrary(@RequestBody Page page) {
        return ps.getLibrary(page);
    }



    @RequestMapping("/delLibrary")
    @ResponseBody
    public String delLibrary(int mid) {
        ps.delLibrary(mid);
        return "1";
    }

    @RequestMapping("/PurchaseByCrePids")
    @ResponseBody
    public String PurchaseByCrePids(Purchase purchase) {
        ps.getAllPurchase(purchase);
        return "1";
    }

    @RequestMapping("/PurchaseByGoPids")
    @ResponseBody
    public String PurchaseByGoPids(Purchase purchase) {
       ps.PurchaseByGoPids(purchase);
        return "1";
    }







}
