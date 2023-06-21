package pl.javastart.task.logic;

import pl.javastart.task.model.Point;

public class PointManager {
    public String checkPointLocation(Point point) {
        String info;
        if (isInFirstQuarter(point)) {
            info = "leży w I ćwiartce układu współrzędnych";
        } else if (isInSecondQuarter(point)) {
            info = "leży w II ćwiartce układu współrzędnych";
        } else if (isInThirdQuarter(point)) {
            info = "leży w III ćwiartce układu współrzędnych";
        } else if (isInFourthQuarter(point)) {
            info = "leży w IV ćwiartce układu współrzędnych";
        } else if (inCenter(point)) {
            info = "leży na środku układu współrzędnych";
        } else if (onAxisX(point)) {
            info = "leży na osi X";
        } else {
            info = "leży na osi Y";
        }
        return info;
    }

    private boolean isInFirstQuarter(Point point) {
        return point.getX() > 0 && point.getY() > 0;
    }

    private boolean isInSecondQuarter(Point point) {
        return point.getX() < 0 && point.getY() > 0;
    }

    private boolean isInThirdQuarter(Point point) {
        return point.getX() < 0 && point.getY() < 0;
    }

    private boolean isInFourthQuarter(Point point) {
        return point.getX() > 0 && point.getY() < 0;
    }

    private boolean onAxisX(Point point) {
        return point.getY() == 0;
    }

    private boolean onAxisY(Point point) {
        return point.getX() == 0;
    }

    private boolean inCenter(Point point) {
        return onAxisX(point) && onAxisY(point);
    }
}
