package com.sterbensq.myblog.test;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class Test01Test {

    @Test
    void getMaxPrice() {
        int[] test={5,6,87,99,25};
        int result=new Test01().getMaxPrice(test);
        assert 94==result;
    }

    @Test
    void dailyTemperatures() {
        int[] temperatures={22,25,26,24,23,33};
        int[] result=new Test01().dailyTemperatures(temperatures);
        int[] right=new int[]{1, 1, 3, 2, 1, 0};
        for (int i = 0; i < 6; i++) {
            assert result[i] == right[i];
        }
    }
}