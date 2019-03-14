package com.myservice.fck;

import com.beans.fck.Page;
import com.beans.fck.Purchase;

import java.util.Map;

public interface ReviewService {

    void addReview(Purchase purchase);

    Map<String, Object> getReviewByAll(Page page);

    void delReview(int rid);

    void updateReview(int rid);

    void goReview(Purchase purchase);

    Purchase seeReview(Purchase purchase);
}
