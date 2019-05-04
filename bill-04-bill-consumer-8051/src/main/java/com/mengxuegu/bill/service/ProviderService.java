package com.mengxuegu.bill.service;

import com.mengxuegu.bill.entities.Provider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@FeignClient(value = "provider-provider")
public interface ProviderService {
    @PostMapping("/provider/list")
    public List<Provider> getProviders(@RequestBody Provider provider);

    @GetMapping("/provider/get/{pid}")
    public Provider getProviderByPid(@PathVariable("pid") Integer pid);

    @PostMapping("/provider/add")
    public int addProvider(@RequestBody Provider provider);

    @GetMapping("/provider/delete/{pid}")
    public int deleteProviderByPid(@PathVariable("pid") Integer pid);

    @PostMapping("/provider/update")
    public int updateProvider(@RequestBody Provider provider);
}
