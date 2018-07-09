import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Jack", "Adams", 32);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Jill", "McWilliams", 33);
        DBGolfer.save(golfer2);


        List<Golfer> golfers = DBGolfer.getAll();

        Golfer jack = DBGolfer.find(golfer1.getId());

        System.out.println(jack.getFirstName());

        System.exit(0);
    }
}