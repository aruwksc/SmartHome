import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/", "/home", "/login", "/css/**", "/js/**").permitAll()  // Разрешаем доступ к login
                    .anyRequest().authenticated() // Требуем аутентификацию для всех остальных запросов
            )
            .formLogin(form -> form
                    .loginPage("/login")  // Указываем путь к custom login
                    .permitAll()  // Разрешаем всем доступ к странице логина
            )
            .logout(logout -> logout.permitAll())  // Разрешаем всем выходить из системы
            .csrf(csrf -> csrf.disable());  // Отключаем CSRF для простоты в разработке

    return http.build();
}

void main() {
}
