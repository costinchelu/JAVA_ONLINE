package udemy_sec1_5a.CodingExerciseC;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstN, double secondN)
    {
        firstN *= 1000;
        secondN *= 1000;
        if ((int)firstN == (int)secondN) return true;
        else return false;
    }
}