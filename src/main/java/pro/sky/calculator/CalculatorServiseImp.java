package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiseImp implements CalculatorInterface {


    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public int sumTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }

    @Override
    public int substructTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 - num2;
        return sum;
    }
    @Override
    public int multiplicationTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 * num2;
        return sum;
    }

    @Override
    public int divisionTwoNumber(int num1, int num2) {

        int sum;
        sum = num1 / num2;
        return sum;
    }


}
