package com;

import java.util.HashMap;

public class Direction implements TurnDirection {
    private final char direction;


    public Direction(char direction) {
        this.direction = direction;
    }

    public Direction() {
        this.direction = ' ';
    }

    @Override
    public Direction turnRight() {
        return this.turn(turnRightMap);
    }

    @Override
    public Direction turnLeft() {
        return this.turn(turnLeftMap);
    }

    private Direction turn(HashMap<Character, Direction> map) {
      if (map.containsKey(direction)) {
        return map.get(direction);
      } else {
        throw new IllegalArgumentException();
      }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        if (direction != direction1.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    @Override
    public String toString() {
        return "Direction{direction=" + direction + '}';
    }

}
