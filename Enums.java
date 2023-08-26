package Lessons.Exercise.Enums;

public class Enums {
    public static void main(String[] args) {

        for(Month month: Month.values()){
            if (month.name().endsWith("Y")){
                System.out.println(month + ": ends with y");
            } else  {
                System.out.println(month + ": doesn't end with y");
            }
        }

    }
}
