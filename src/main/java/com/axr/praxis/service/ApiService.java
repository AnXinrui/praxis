package com.axr.praxis.service;

import com.axr.praxis.common.ApiResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @description 调用三方 api 服务
 * @author xinrui.an
 * @date 2025/03/07
 */
@Slf4j
@Service
public class ApiService {

    @Value("${apiKey.dailySentence}")
    private String dailySentenceApiKey;
    /**
     * 获取每日一句
     * @return 每日一句
     */
    public String getDailySentence() throws JsonProcessingException {
        WebClient webClient = WebClient.create("https://api.t1qq.com/api/tool/daytry?key=" + dailySentenceApiKey);
        String result = webClient.get()
                .retrieve()
                .bodyToMono(String.class)
                // 阻塞等待结果（同步调用）
                .block();
        ObjectMapper objectMapper = new ObjectMapper();
        ApiResult res = objectMapper.readValue(result, ApiResult.class);
        String sentence = res.getData().getNote();
        log.info("每日一句: {}", sentence);

        return sentence;
    }
}
