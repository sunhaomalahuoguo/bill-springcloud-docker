package com.mengxuegu.bill.service;

import com.mengxuegu.bill.entities.Bill;
import com.mengxuegu.bill.entities.BillProvider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "bill-provider")
public interface BillService {

    @PostMapping("/bill/list")
    public List<BillProvider> getBills(@RequestBody Bill bill);

    @GetMapping("/bill/get/{bid}")
    public BillProvider getBillByBid(@PathVariable("bid") Integer bid);

    @PostMapping("/bill/add")
    public int addBill(@RequestBody Bill bill);

    @PostMapping("/bill/update")
    public int updateBill(@RequestBody Bill bill);

    @GetMapping("/bill/delete/{bid}")
    public int deteleBillByBid(@PathVariable("bid") Integer bid);

}
