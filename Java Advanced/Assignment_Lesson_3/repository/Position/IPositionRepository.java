package org.example.repository.Position;

import org.example.entity.Position;

import java.util.List;

public interface IPositionRepository {
    Position create(Position position);
    List<Position> getAllPosition();
}
