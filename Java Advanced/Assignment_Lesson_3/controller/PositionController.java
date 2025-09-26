package org.example.controller;

import org.example.service.Position.IPositionService;
import org.example.service.Position.PositionService;
import org.example.entity.Position;

public class PositionController {
    public static void main(String[] args) {
            IPositionService positionRepository = new PositionService();
//            positionRepository.create("PM");
            for (Position p : positionRepository.getAllPosition()) {
                System.out.println("ID: " + p.getId() + " - " + "Name: " + p.getName());
            }

    }
}
