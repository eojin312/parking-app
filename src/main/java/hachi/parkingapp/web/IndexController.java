package hachi.parkingapp.web;

import hachi.parkingapp.common.ConstantValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(@RequestParam(value = "no", defaultValue = ConstantValue.DEFAULT_NO) Long no, Model model) {
        model.addAttribute("no", no);
        return "index";
    }
}
