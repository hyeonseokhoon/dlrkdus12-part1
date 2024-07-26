package calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {
    private static final double PI = 3.14; // 값이 불변(final)이고 어디서나 쓰임(static)
    private double areaCircle;

    List<Double> areaCircles = new ArrayList<>();

    public double areaCircle(double radius){
        areaCircle = PI * radius * radius;
        areaCircles.add(areaCircle);
        System.out.println(areaCircle);
        return areaCircle;
    }

    @Override
    public void removeResult() {
        areaCircles.remove(0);
    }

    @Override
    public void inquiryResults() {
        for (Double in : areaCircles) {
            System.out.println(in);
        }
    }
}
