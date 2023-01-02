package pu.fmi.practice;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WordsCountController {

  WordsCounter counter;

  public WordsCountController(WordsCounter counter) {
    this.counter = counter;
  }

  @GetMapping("/")
  public String home() {
    return "Index";
  }

  @GetMapping("/count")
  public String showForm() {
    return "WordsCounterForm";
  }

  @PostMapping("/count")
  public String contWords(@RequestParam String text, Map<String, Object> model) {
    var count = counter.count(text);
    model.put("count", count);
    return "WordsCounterForm";
  }
}
