package one.digitalinnovation.gof;

import org.springframework.boot.springApplication;

/*
 * Projeto Spring Boot gerado via Spring Initializer.
 * Os seguintes módulos foram selecionados.
 * - spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author falvojr
 */

@EnableFeignCliente
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}