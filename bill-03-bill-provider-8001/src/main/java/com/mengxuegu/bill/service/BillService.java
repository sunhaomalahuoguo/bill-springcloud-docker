package com.mengxuegu.bill.service;

import com.mengxuegu.bill.entities.Bill;
import com.mengxuegu.bill.entities.BillProvider;

import java.util.List;

public interface BillService {
    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deteleBillByBid(Integer bid);
}
