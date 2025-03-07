package com.axr.praxis;

import com.axr.praxis.domain.dto.MailInfoDto;
import com.axr.praxis.service.ApiService;
import com.axr.praxis.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @description  随便测测
 * @author xinrui.an
 * @date 2025/03/07
 */
@SpringBootTest
class CommonTest {

    @Resource
    private MailService mailService;

    @Resource
    private ApiService apiService;

    @Test
    void sendMailTest() {
        MailInfoDto mailInfoDto = new MailInfoDto();
        mailInfoDto.setTo("a-xr@qq.com");
        mailInfoDto.setSubject("Test Subject");
        mailInfoDto.setText("Test Text");

        mailService.sendMail(mailInfoDto);
    }

    @Test
    void dailySentenceTest() throws Exception {
        String dailySentence = apiService.getDailySentence();
        System.out.println(dailySentence);
    }
}
