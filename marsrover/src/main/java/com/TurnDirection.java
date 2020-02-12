package com;

import java.util.HashMap;

public interface TurnDirection {
    final HashMap<Character, Direction> turnLeftMap = new HashMap<Character, Direction>(){{
        put ('N', new DirectionW());
        put ('W', new DirectionS());
        put ('S', new DirectionE());
        put ('E', new DirectionN());
    }};
    final HashMap<Character, Direction> turnRightMap = new HashMap<Character, Direction>(){{
        put ('N', new DirectionE());
        put ('W', new DirectionN());
        put ('E', new DirectionS());
        put ('S', new DirectionW());
    }};

    public abstract Direction turnLeft();
    public abstract Direction turnRight();
}
