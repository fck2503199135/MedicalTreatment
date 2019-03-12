package com.mapper.fck;

import com.beans.fck.*;

import java.util.List;

public interface PurchaseMapper {

    List<Purchase> getAllPurchaseByName(Page page);

    int getCount();

    List<Supplier> getSurIdName();

    Purchase getPurchase(Purchase purchase);

    void addPurchase(Purchase purchase);

    List<Medicinal> getLibrary(Page page);

    void delLibrary(int mid);

    List<Purchase> getAllPurchase(Purchase purchase);


}
