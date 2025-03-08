package com.axr.praxis;

import com.axr.praxis.common.Constants;
import com.axr.praxis.domain.dto.MailInfoDto;
import com.axr.praxis.service.ApiService;
import com.axr.praxis.service.MailService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${to[0]}")
    String[] to;

    @Test
    void sendMailTest() {
        MailInfoDto mailInfoDto = new MailInfoDto();
        mailInfoDto.setTo(to);
        mailInfoDto.setSubject("Test Subject");
        mailInfoDto.setText("Test Text");

        mailService.sendMail(mailInfoDto);
    }

    @Test
    void dailySentenceTest() throws Exception {
        String dailySentence = apiService.getDailySentence();
        System.out.println(dailySentence);
    }

    @Test
    void testHTML() throws JsonProcessingException {
        String text = Constants.DAILY_SENTENCE_TEMPLATE.replace("{{content}}", apiService.getDailySentence());
        MailInfoDto mailInfoDto = MailInfoDto.builder()
                .to(to)
                .subject("早上好哇～")
                .text(text)
                .html(true)
                .build();
        mailService.sendMail(mailInfoDto);
    }
}
