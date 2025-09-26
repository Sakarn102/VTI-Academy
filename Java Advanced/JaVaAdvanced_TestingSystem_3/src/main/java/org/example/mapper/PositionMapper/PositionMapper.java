package org.example.mapper.PositionMapper;

import org.example.entity.Enums.PositionEnum;
import org.example.entity.Position;

public class PositionMapper {
    public static Position create(String name) {
        Position position = new Position();
        position.setName(PositionEnum.valueOf(name));
        return position;
    }
}
