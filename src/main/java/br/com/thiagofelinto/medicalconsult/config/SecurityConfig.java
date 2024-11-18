package br.com.thiagofelinto.medicalconsult.config;


import org.springframework.context.annotation.Configuration;

@Configuration
@Enablewebsecurity
public class SecurityConfig {

    private static final String[] PUBLIC_MATCHES = {
            "/h2-console/**",
            "/swagger-ui/**",
            "/v3/api-docs/**"
    };

    private static final String[] PUBLIC_MATCHES_GET = {
            "/user/**",
            "/consult/**"
    };

    private static final String[] PUBLIC_MATCHES_POST = {
            "/user/**",
            "/consult/**"
    };

    private static final String[] PUBLIC_MATCHES_PUT = {
            "/user/**",
            "/consult/**"
    };

    private static final String[] PUBLIC_MATCHES_DELETE = {
            "/user/**",
            "/consult/**"
    };

}
