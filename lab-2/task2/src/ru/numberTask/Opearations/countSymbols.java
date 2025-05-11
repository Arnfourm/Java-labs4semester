package ru.numberTask.Opearations;

import java.util.Date;

public class countSymbols implements NumberOperation{
    public Date CreateTime = new Date();
    public int countRun = 0;

    @Override
    public int count(int num)
    {
        countRun++;
        return String.valueOf(num).length();
    }
}
