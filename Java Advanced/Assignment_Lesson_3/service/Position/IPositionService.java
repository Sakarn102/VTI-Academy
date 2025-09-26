package org.example.service.Position;

import org.example.entity.Position;

import java.util.List;

public interface IPositionService {
    Position create(String name);
    List<Position> getAllPosition();
}
