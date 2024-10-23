package com.gravityer.conf;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/api/products/**").authenticated()
            .and()
            .oauth2ResourceServer().jwt();
    }
}
