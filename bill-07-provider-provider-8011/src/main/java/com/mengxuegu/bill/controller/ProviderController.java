package com.mengxuegu.bill.controller;

import com.mengxuegu.bill.entities.Provider;
import com.mengxuegu.bill.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/2
 * @since 1.0.0
 */
@RestController
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @PostMapping("/provider/list")
    public List<Provider> getProviders(@RequestBody Provider provider){
        return providerService.getProviders(provider);
    }
    @GetMapping("/provider/get/{pid}")
    public Provider getProviderByPid(@PathVariable("pid") Integer pid){
        return providerService.getProviderByPid(pid);
    }

    @PostMapping("/provider/add")
    public int addProvider(@RequestBody Provider provider){
        return providerService.addProvider(provider);
    }

    @GetMapping("/provider/delete/{pid}")
    public int deleteProviderByPid(@PathVariable("pid") Integer pid){
        return providerService.deleteProviderByPid(pid);
    }

    @PostMapping("/provider/update")
    public int updateProvider(@RequestBody Provider provider){
        return providerService.updateProvider(provider);
    }
}