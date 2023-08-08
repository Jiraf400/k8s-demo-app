package com.jirafik.gateway.config;

import com.jirafik.gateway.broker.entity.User;
import com.jirafik.gateway.broker.producer.RabbitProducer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Component
@Slf4j
@AllArgsConstructor
public class JwtAuthConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

    private final RabbitProducer producer;

    @Override
    public Collection<GrantedAuthority> convert(Jwt source) {

        producer.sendUploadRequest(new User(source.getClaims().get("preferred_username").toString()));

        return ((ArrayList<String>) source.getClaims().get("roles"))
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
