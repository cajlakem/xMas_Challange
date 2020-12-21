package main;

import puzzles.Day1;
import puzzles.Day2;
import utils.TestUtils;

public class Main {

    public static void main(String[] args) {
        Day1 day1 = new Day1(TestUtils.readFileIntoListInteger("day1"));
        System.out.println(day1.calculate());
        day1 = new Day1(TestUtils.readFileIntoListInteger("day1"));
        System.out.println(day1.calculate2());
        Day2 day2 = new Day2(TestUtils.readFileIntoList("day2"));
        System.out.println(day2.calculate());





    }
}
