package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(path = "calculator")

public class CalculatorController {
    private final CalculatorServiseImp calculatorServiseImp;

    public CalculatorController(CalculatorServiseImp calculatorServiseImp) {
        this.calculatorServiseImp = calculatorServiseImp;
    }



    public String greeting() {
        return calculatorServiseImp.greeting();
    }


    @GetMapping(path = "plus")

    public String sumTwoNumber(
            @RequestParam(value = "num1") int number_1,
            @RequestParam(value = "num2") int number_2) {

            return calculatorServiseImp.sumTwoNumber(number_1, number_2);

    }

    @GetMapping(path = "minus")
    public String substructTwoNumber(
            @RequestParam("num1") int number_1,
            @RequestParam("num2") int number_2) {
        return calculatorServiseImp.substructTwoNumber(number_1, number_2);
    }

    @GetMapping(path = "multiply")
    public String multiplicationTwoNumber(
            @RequestParam("num1") int number_1,
            @RequestParam("num2") int number_2) {
        return calculatorServiseImp.multiplicationTwoNumber(number_1, number_2);
    }

    @GetMapping(path = "divide")
    public String divisionTwoNumber(
            @RequestParam(value = "num1") int number_1,
            @RequestParam(value = "num2") int number_2) {
        return calculatorServiseImp.divisionTwoNumber(number_1, number_2);
    }

}
