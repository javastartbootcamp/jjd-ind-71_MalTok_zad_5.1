package pl.javastart.task.logic;

import pl.javastart.task.model.Point;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.

    public void run(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        Point point = new Point(x, y);

        String pointInfo = point.getPointInfo();

        PointManager manager = new PointManager();
        String pointLocation = manager.checkPointLocation(point);

        System.out.println(pointInfo + " " + pointLocation);

        scanner.close();
    }
}
