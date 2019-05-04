package com.mengxuegu.bill.service.impl;

import com.mengxuegu.bill.entities.Provider;
import com.mengxuegu.bill.mapper.ProviderMapper;
import com.mengxuegu.bill.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/2
 * @since 1.0.0
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderMapper providerMapper;
    @Override
    public List<Provider> getProviders(Provider provider) {
        return providerMapper.getProviders(provider);
    }

    @Override
    public Provider getProviderByPid(Integer pid) {
        return providerMapper.getProviderByPid(pid);
    }

    @Override
    public int addProvider(Provider provider) {
        return providerMapper.addProvider(provider);
    }

    @Override
    public int deleteProviderByPid(Integer pid) {
        return providerMapper.deleteProviderByPid(pid);
    }

    @Override
    public int updateProvider(Provider provider) {
        return providerMapper.updateProvider(provider);
    }
}