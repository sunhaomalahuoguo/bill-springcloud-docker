package com.mengxuegu.bill.service.impl;

import com.mengxuegu.bill.entities.Bill;
import com.mengxuegu.bill.entities.BillProvider;
import com.mengxuegu.bill.mapper.BillMapper;
import com.mengxuegu.bill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/1
 * @since 1.0.0
 */
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public List<BillProvider> getBills(Bill bill) {
        return billMapper.getBills(bill);
    }

    @Override
    public BillProvider getBillByBid(Integer bid) {
        return billMapper.getBillByBid(bid);
    }

    @Override
    public int addBill(Bill bill) {
        return billMapper.addBill(bill);
    }

    @Override
    public int updateBill(Bill bill) {
        return billMapper.updateBill(bill);
    }

    @Override
    public int deteleBillByBid(Integer bid) {
        return billMapper.deteleBillByBid(bid);
    }
}