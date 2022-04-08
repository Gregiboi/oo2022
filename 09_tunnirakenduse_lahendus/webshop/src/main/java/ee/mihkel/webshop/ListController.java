package ee.mihkel.webshop;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ListController {
    List<String> strings = new ArrayList<>(Arrays.asList(
            "Scooby Doo", "Mickey Mouse", "Donald Duck"));

    @GetMapping("strings")
    public List<String> getStrings() {
        return strings;
    }

    @GetMapping("strings/{index}")
    public String getString(@PathVariable int index) {
        return strings.get(index);
    }

    @DeleteMapping("strings/{index}")
    public String deleteString(@PathVariable int index) {
        return strings.remove(index);
    }

    @DeleteMapping("strings")
    public String deleteAllString() {
        for (int i = 0; i < strings.size(); i++) {
            strings.remove(i);
        }
        return "Kõik tooted kustutatud";
    }
}
