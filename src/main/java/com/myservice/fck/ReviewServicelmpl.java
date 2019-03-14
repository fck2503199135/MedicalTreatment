package com.myservice.fck;


import com.beans.fck.Page;
import com.beans.fck.Purchase;
import com.mapper.fck.MedicinalMapper;
import com.mapper.fck.PurchaseMapper;
import com.mapper.fck.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewServicelmpl implements ReviewService {


    @Autowired
    ReviewMapper reviewMapper;

    @Autowired
    PurchaseMapper purchaseMapper;

    @Autowired
    MedicinalMapper medicinalMapper;

    @Override
    public void addReview(Purchase purchase) {
        reviewMapper.addReview(purchaseMapper.getPurchase(purchase));
    }

    @Override
    public Map<String, Object> getReviewByAll(Page page) {
        Map<String,Object> map = new HashMap<>();
        map.put("rows",reviewMapper.getReviewByAll(page));
        map.put("total",reviewMapper.getCount(page));
        return map;
    }

    @Override
    public void delReview(int rid) {
        reviewMapper.delReview(rid);
    }

    @Override
    public void updateReview(int rid) {
        reviewMapper.updateReview(rid);
    }


    @Override
    public void goReview(Purchase purchase) {
        reviewMapper.goReview(purchase);
        reviewMapper.addReview(purchaseMapper.getPurchase(reviewMapper.getPid(purchase)));
    }

    @Override
    public Purchase seeReview(Purchase purchase) {
        return purchaseMapper.getPurchase(reviewMapper.getPid(purchase));
    }
}
