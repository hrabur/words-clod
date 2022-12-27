package pu.fmi.practice;

public class StringWordsProvider implements WordsProvider {

  @Override
  public String[] getWords(String text) {
    return text.split("[\s\r\n,.-]");
  }
}
