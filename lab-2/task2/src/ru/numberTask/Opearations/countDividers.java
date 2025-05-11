package ru.numberTask.Opearations;

import java.util.Date;
import java.util.ArrayList;

public class countDividers implements NumberOperation{
    public Date CreateTime = new Date();
    public int countRun = 0;

    @Override
    public int count(int num) {
        ArrayList<Integer> tempList = new ArrayList<>();
        countRun++;

        for (int divider = 1; divider <= num; divider++){
            if (num % divider == 0){
                boolean flag = true;

                for (int checker = 2; Math.pow(checker, 2) <= divider; checker++){
                    if (divider % checker == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    tempList.add(divider);
                }
            }
        }
        return tempList.size();
    }
}
