package puzzles;

import java.util.List;

public class Day1 {
    private List<Integer> integerList;
    private final int target = 2020;

    public Day1(List<Integer> list){
        this.integerList = list;
    }

    public Integer calculate(){
        for (Integer firstInt: this.integerList) {
            for (Integer secondInt: this.integerList) {
                int resutlTemp = firstInt + secondInt;
                if(resutlTemp == this.target){
                    return firstInt*secondInt;
                }

            }
        }
        return 0;
    }

    public Integer calculate2(){
        for (Integer firstInt: this.integerList) {
            for (Integer secondInt: this.integerList) {
                for (Integer thirdInt: this.integerList) {
                    int resutlTemp = firstInt + secondInt + thirdInt;
                    if(resutlTemp == this.target){
                        return firstInt*secondInt*thirdInt;
                    }
                }
            }
        }
        return 0;
    }

}
