package seminars.five.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {

    public List<Integer> generatorListNumbs() {
        List<Integer> listNumbs = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            listNumbs.add(rnd.nextInt(101));
        }

        return listNumbs;
    }
}
