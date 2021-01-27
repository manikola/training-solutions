package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private List<Integer> putBallsToPool(int balls) {
        List<Integer> pool = new ArrayList<>();
        for( int i = 1; i <= balls; i++){
            pool.add(i);
        }
        Collections.shuffle(pool);
        return pool;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) throws IllegalArgumentException  {
        if(ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> ballPool = putBallsToPool(ballCount);
        List<Integer> winningNumbers = ballPool.subList(0,lotteryType);
        Collections.sort(winningNumbers);

        return winningNumbers;
    }



}
