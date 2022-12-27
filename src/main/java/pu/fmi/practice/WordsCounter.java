package pu.fmi.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WordsCounter {

  @Autowired WordsProvider provider;

  Long count(String text) {
    return (long) provider.getWords(text).length;
  }
}
