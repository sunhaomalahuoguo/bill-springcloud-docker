package com.mengxuegu.bill.controller;

import com.mengxuegu.bill.entities.Bill;
import com.mengxuegu.bill.entities.BillProvider;
import com.mengxuegu.bill.entities.Provider;
import com.mengxuegu.bill.service.BillService;
import com.mengxuegu.bill.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/1
 * @since 1.0.0
 */
@Controller
public class BillController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BillService billService;
    @Autowired
    private ProviderService providerService;

    @GetMapping("/bill/list")
    public String getBills(Map<String,Object> map,
                           @RequestParam(value = "billName",required = false) String billName,
                           @RequestParam(value = "pid",required = false) Integer pid,
                           @RequestParam(value = "pay",required = false) Integer pay){
        Bill bill = new Bill();
        bill.setBillName(billName);
        bill.setPid(pid);
        bill.setPay(pay);
        logger.info("bill-getBills消费者-入参："+bill.toString());
        List<BillProvider> bills = billService.getBills(bill);
        logger.info("bill-getBills消费者-出参："+bills.toString());
        Provider providerQuery = new Provider();
        List<Provider> providers = providerService.getProviders(providerQuery);
        map.put("bills",bills);
        map.put("billName",billName);
        map.put("pid",pid);
        map.put("pay",pay);
        map.put("providers",providers);
        return "bill/list";
    }

    @GetMapping("/bill/toadd")
    public String toadd(Map<String,Object> map){
        List<Provider> providers = providerService.getProviders(new Provider());
        logger.info("bill-toadd消费者-出参："+providers.toString());
        map.put("providers",providers);
        return "bill/add";
    }

    @PostMapping("/bill/add")
    public String add(Bill bill){
        billService.addBill(bill);
        logger.info("bill-add消费者-出参："+bill.toString());
        return "redirect:/bill/list";
    }

    @GetMapping("/bill/get/{bid}")
    public String view(@PathVariable("bid") Integer bid,
                       Map<String,Object> map){
        logger.info("bill-view消费者-入参："+bid);
        BillProvider billProvider = billService.getBillByBid(bid);
        logger.info("bill-view消费者-出参："+billProvider.toString());
        map.put("billProvider",billProvider);
        return "bill/view";
    }

    @GetMapping("/bill/toupdate/{bid}")
    public String toUpdate(@PathVariable("bid") Integer bid,
                           Map<String,Object> map){
        logger.info("bill-toUpdate消费者-入参："+bid);
        BillProvider billProvider = billService.getBillByBid(bid);
        map.put("billProvider",billProvider);

        List<Provider> providers = providerService.getProviders(new Provider());
        map.put("providers",providers);
        return "bill/update";
    }

    @PostMapping("/bill/update")
    public String update(Bill bill){
        logger.info("bill-update消费者-入参："+bill.toString());
        billService.updateBill(bill);
        return "redirect:/bill/list";
    }

    @DeleteMapping("/bill/delete/{bid}")
    public String delete(@PathVariable("bid") Integer bid){
        logger.info("bill-delete消费者-入参："+bid);
        billService.deteleBillByBid(bid);
        return "redirect:/bill/list";
    }
}