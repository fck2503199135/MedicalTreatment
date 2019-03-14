package com.myservice.fck;

import com.beans.fck.Page;
import com.beans.fck.Purchase;
import com.beans.fck.Supplier;
import com.mapper.fck.MedicinalMapper;
import com.mapper.fck.PurchaseMapper;
import com.mapper.fck.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PurchaseServicelmpl implements PurchaseService{

    @Autowired
    PurchaseMapper purchaseMapper;

    @Autowired
    MedicinalMapper medicinalMapper;

    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public Map<String, Object> getAllPurchaseByName(Page page) {
        Map<String,Object> map = new HashMap<>();
        map.put("rows",purchaseMapper.getAllPurchaseByName(page));
        map.put("total",purchaseMapper.getCount(page));
        return map;
    }

    @Override
    public List<Supplier> getSurIdName() {
        return purchaseMapper.getSurIdName();
    }

    @Override
    public void addPurchase(Purchase purchase) {
        Purchase p = purchaseMapper.getPurchase(purchase);
        p.setPp("DYF00"+p.getPid());
        purchaseMapper.addPurchase(p);
    }

    @Override
    public Map<String, Object> getLibrary(Page page) {
        Map<String,Object> map = new HashMap<>();
        map.put("rows",purchaseMapper.getLibrary(page));
        map.put("total",medicinalMapper.getCount(page));
        return map;
    }

    @Override
    public void delLibrary(int mid) {
        purchaseMapper.delLibrary(mid);
    }

    @Override
    public void getAllPurchase(Purchase purchase) {
        List<Purchase> allPurchase = purchaseMapper.getAllPurchase(purchase);
        for (Purchase p:allPurchase) {
            reviewMapper.addReview(p);
        }
    }


    @Override
    public void PurchaseByGoPids(Purchase purchase) {
        List<Purchase> allPurchase = purchaseMapper.getAllPurchase(purchase);
        purchase.setPp("DYF00"+purchase.getPid());
        for (Purchase p:allPurchase) {
            purchaseMapper.addPurchase(p);
        }
    }

    @Override
    public List<Purchase> getPurByAddId(Purchase purchase) {
        return purchaseMapper.getAllPurchase(purchase);
    }
}
