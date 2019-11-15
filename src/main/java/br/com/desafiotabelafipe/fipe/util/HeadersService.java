package br.com.desafiotabelafipe.fipe.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class HeadersService {

    public static HttpEntity getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        return new HttpEntity<>(null, headers);
    }
}
