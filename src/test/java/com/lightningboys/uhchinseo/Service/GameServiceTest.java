package com.lightningboys.uhchinseo.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GameServiceTest {

    @Autowired
    BalanceGameService balanceGameService;
    @Autowired
    MusicGameService musicGameService;



//    @Test
//    void updateScore(){
//        musicGameService.updateScore(1L, 10);
//    }
}