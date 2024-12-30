package com.myspring.service;

import com.myspring.dao.HelloDao;
import lombok.Data;

import java.util.Date;

@Data
public class InjectionService02 {
    private int num;
    private String name;
    private Date date;
    private HelloDao helloDao;
}
