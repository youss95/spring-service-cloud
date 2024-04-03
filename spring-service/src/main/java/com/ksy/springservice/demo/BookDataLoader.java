package com.ksy.springservice.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("testdata")
public class BookDataLoader {

    //어플리케이션 시작 단계 완료 후 발생
    @EventListener(ApplicationReadyEvent.class)
    public void showTestData() {

        System.out.println(" =======  load data =========");
    }
}
