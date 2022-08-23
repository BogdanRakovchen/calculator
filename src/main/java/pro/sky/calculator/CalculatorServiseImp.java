package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiseImp implements CalculatorInterface {

    public String transform(int num) {
        return "" + num;
    }

    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String sumTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return num1 + " + " + num2 + " " + " = " + sum;
    }

    @Override
    public String substructTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 - num2;
        return num1 + " - " + num2 + " " + " = " + sum;
    }
    @Override
    public String multiplicationTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 * num2;
        return num1 + " * " + num2 + " " + " = " + sum;
    }

    @Override
    public String divisionTwoNumber(int num1, int num2) {
        int sum;

        if (num2 == 0) {
            throw new RuntimeException("Делить на ноль нельзя");
        }
        sum = num1 / num2;
        return num1 + " / " + num2 + " " + " = " + sum;
    }

//    public String errorMessage() {
//        return "123";
//    }


}
