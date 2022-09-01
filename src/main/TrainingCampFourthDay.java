package main;

import solution.*;

import java.util.Arrays;

/**
 * @author ASilentFigure
 * @project TrainingCampFourthDay
 * @date 2022/8/31 10:05
 */
public class TrainingCampFourthDay {

    public static void main(String[] args) {
        int [][] boxTypes = {{1, 3}, {2, 2}, {1, 1}};
        MaximumUnits maximumUnits = new MaximumUnits();
        System.out.println(maximumUnits.maximumUnits(boxTypes, 10));
    }
}
