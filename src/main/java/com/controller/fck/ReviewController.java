package com.controller.fck;

import com.beans.fck.Page;
import com.beans.fck.Purchase;
import com.myservice.fck.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ReviewController {

    @Autowired
    ReviewService rs;

    @RequestMapping("/addReview")
    @ResponseBody
    public String addReview(Purchase purchase){
        rs.addReview(purchase);
        return "1";
    }

    @RequestMapping("/getReviewByAll")
    @ResponseBody
    public Map<String,Object> getReviewByAll(@RequestBody Page page){
        return rs.getReviewByAll(page);
    }


    @RequestMapping("/getReviewByAllNo")
    @ResponseBody
    public Map<String,Object> getReviewByAllNo(@RequestBody Page page){
        return rs.getReviewByAll(page);
    }


    @RequestMapping("/delReview")
    @ResponseBody
    public String delReview(int rid){
        rs.delReview(rid);
        return "1";
    }

    @RequestMapping("/updateReview")
    @ResponseBody
    public String updateReview(int rid){
        rs.updateReview(rid);
        return "1";
    }


    @RequestMapping("/goReview")
    @ResponseBody
    public String goReview(Purchase purchase){
        rs.goReview(purchase);
        return "1";
    }



    @RequestMapping("/seeReview")
    @ResponseBody
    public Purchase seeReview(Page page){
       return rs.seeReview(page);
    }





}
