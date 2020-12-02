package methodvarargs.examstats;

public class ExamStats {

    private double maxPoints;

    public ExamStats(double maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if(results ==null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int overTheLimit =0;
        for (int point : results) {
            if ( point > (limitInPercent / 100.0) * maxPoints) {
                overTheLimit++;
            }
        }
        return overTheLimit;

    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if(results ==null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (int point : results) {
            if (point < (limitInPercent / 100.0) * maxPoints) {
                return true;
            }
        }
        return false;

    }
}
