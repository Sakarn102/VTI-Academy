package com.vti.entity.Exercise3.Question1;

public class CPU {
    protected float price;
    public CPU() {
    }
    public class Processor {
        public float coreAmount;
        public String menuFacturer;
        public Processor(float coreAmount, String menuFacturer) {
            super();
            this.coreAmount = coreAmount;
            this.menuFacturer = menuFacturer;
        }
        public float getCache() {
            return 4.3f;
        }
    }
    public class Ram {
        public float memory;
        public String menuFacturer;
        public Ram(float memory, String menuFacturer) {
            super();
            this.memory = memory;
            this.menuFacturer = menuFacturer;
        }
        public float getClockSpeed() {
            return 5.5f;
        }
    }
}
