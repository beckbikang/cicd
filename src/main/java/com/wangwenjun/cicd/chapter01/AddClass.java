package com.wangwenjun.cicd.chapter01;

import lombok.Builder;
import lombok.Data;

/**
 * @program: cicd
 * @description:
 * @author: bikang
 * @create: 2022-12-04 22:37
 */
@Builder
@Data
public class AddClass {

    private double a;
    private double b;


    public double add(double a, double b) {
        return a + b;
    }


    public double sub(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("b is zero.");
        }
        return a / b;
    }
}
