package io.github.leryn.homepage.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author Leryn
 * @since Leryn 1.0.0
 */
@Configuration
public class GlobalCorsConfiguration {

  @Bean
  public CorsFilter corsFilter() {
    CorsConfiguration corsConfiguration = new CorsConfiguration();
    corsConfiguration.addAllowedOriginPattern("*");
    corsConfiguration.setAllowCredentials(true);
    corsConfiguration.addAllowedHeader("*");
    corsConfiguration.setAllowedMethods(List.of("GET","POST","PUT","DELETE","OPTIONS"));
    corsConfiguration.setExposedHeaders(List.of(
      HttpHeaders.ACCESS_CONTROL_REQUEST_METHOD,
      HttpHeaders.ACCESS_CONTROL_REQUEST_HEADERS,
      HttpHeaders.AUTHORIZATION,
      "X-Requested-With",
      "X-Access-Token"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", corsConfiguration);
    return new CorsFilter(source);
  }

}
