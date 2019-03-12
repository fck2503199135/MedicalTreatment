package com.myservice.fck;

import com.beans.fck.Page;
import com.beans.fck.Purchase;
import com.beans.fck.Supplier;

import java.util.List;
import java.util.Map;


public interface PurchaseService {

   Map<String,Object> getAllPurchaseByName(Page page);

   List<Supplier> getSurIdName();

   void addPurchase(Purchase purchase);

   Map<String,Object> getLibrary(Page page);

   void delLibrary(int mid);

   void getAllPurchase(Purchase purchase);

   void PurchaseByGoPids(Purchase purchase);

}
