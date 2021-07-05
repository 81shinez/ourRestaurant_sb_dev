package com.ourRestaurant.ourRestaurant.Services.Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PapagoCallTest {
    @Test
    void execute() {
        PapagoCall papagoCall = new PapagoCall();
        System.out.println("TEST");
        System.out.println(papagoCall.execute("안녕하세요 세상아"));
    }
}