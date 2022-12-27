package pu.fmi.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WordsCounterApplication {

  public static void main(String[] args) {
    SpringApplication.run(WordsCounterApplication.class, args);
  }

  @Bean
  public WordsProvider stringWordProvider() {
    return new StringWordsProvider();
  }
}
