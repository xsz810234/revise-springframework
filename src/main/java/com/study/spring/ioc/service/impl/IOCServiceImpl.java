package com.study.spring.ioc.service.impl;

import com.study.spring.ioc.service.IOCService;

public class IOCServiceImpl implements IOCService {
    @Override
    public String hello() {
        return "Hello,IOC";
    }
}
