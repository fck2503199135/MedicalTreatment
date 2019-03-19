package com.mapper.fck;

import com.beans.fck.Page;
import com.beans.fck.Purchase;
import com.beans.fck.Review;

import java.util.List;

public interface ReviewMapper {

    void addReview(Purchase purchase);

    List<Review> getReviewByAll(Page page);

    int getCount(Page page);

    void delReview(int rid);

    void updateReview(int rid);

    void goReview(Purchase purchase);

    Purchase getPid(Purchase purchase);

    Purchase seeReview(Page page);


}
