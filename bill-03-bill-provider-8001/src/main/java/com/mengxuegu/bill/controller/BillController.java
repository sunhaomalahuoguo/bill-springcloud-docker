package com.mengxuegu.bill.controller;

import com.mengxuegu.bill.entities.Bill;
import com.mengxuegu.bill.entities.BillProvider;
import com.mengxuegu.bill.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/1
 * @since 1.0.0
 */
@RestController
public class BillController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BillService billService;

    @PostMapping("/bill/list")
    public List<BillProvider> getBills(@RequestBody Bill bill){
        if (bill == null){
            bill = new Bill();
        }
        logger.info("bill提供者-入参："+bill.toString());
        List<BillProvider> bills = billService.getBills(bill);
        logger.info("bill提供者-出参："+bills.toString());
        return bills;
    }

    @GetMapping("/bill/get/{bid}")
    public BillProvider getBillByBid(@PathVariable("bid") Integer bid){
        return billService.getBillByBid(bid);
    }

    @PostMapping("/bill/add")
    public int addBill(@RequestBody Bill bill){
        return billService.addBill(bill);
    }
    @PostMapping("/bill/update")
    public int updateBill(@RequestBody Bill bill){
        return billService.updateBill(bill);
    }
    @GetMapping("/bill/delete/{bid}")
    public int deteleBillByBid(@PathVariable("bid") Integer bid){
        return billService.deteleBillByBid(bid);
    }
}