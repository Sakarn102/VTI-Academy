package Exercise_3_1;

public class CPU {
	protected float price;
	
	
	public CPU() {
		
	}

	public class Processor {
		protected float coreAmount;
		protected String menuFacturer;
		
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
		protected float memory;
		protected String menuFacturer;
		
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
