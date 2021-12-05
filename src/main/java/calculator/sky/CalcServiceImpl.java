package calculator.sky;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements skypro.calculator.CalcService {


    public String showGreetings() {
        return "Добро пожаловать в калькулятор.";
    }

    public int Plus(int num1, int num2) {
        return num1 + num2;
    }

    public int Minus(int num1, int num2) {
        return num1 - num2;
    }

    public int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int Divide(int num1, int num2) {

        return num1 / num2;

    }
}
