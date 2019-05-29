package com.crossing.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private String uname;
    private Integer age;
    private Date date;
}
