package com.kkh.homework.springboot.web.dto;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

public class HelloResponseDtoTest {
    @Test
    public void 롬북_기능_테스트() {

        //given
        String name = "test";
        int amount = 1000;
        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        //then

        Assert.assertEquals(dto.getName(), name);
        Assert.assertEquals(dto.getAmount(), amount);


    }

}
