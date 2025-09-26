package org.example.Service.Position;

import org.example.Repository.Position.IPositionRepository;
import org.example.Repository.Position.PositionRepository;
import org.example.entity.Enums.PositionEnum;
import org.example.entity.Position;
import org.example.mapper.PositionMapper.PositionMapper;

import java.util.List;

public class PositionService implements IPositionService {
    private final IPositionRepository positionRepository;
    public PositionService() {
        this.positionRepository = new PositionRepository();
    }
    @Override
    public Position create(String name) {
        Position position = PositionMapper.create(name);
        return positionRepository.create(position);
    }

    @Override
    public List<Position> getAllPosition() {
        return positionRepository.getAllPosition();
    }
}
