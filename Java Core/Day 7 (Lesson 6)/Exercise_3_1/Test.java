package Exercise_3_1;

public class Test {
	public static void main(String[] args) {
		
		CPU cpu = new CPU();
		
		System.out.println("====== Ram ======");
		CPU.Processor processor = cpu.new Processor(16, "menuFacture1");
		System.out.println("Core Amount: " + processor.coreAmount);
		System.out.println("Menu Facture: " + processor.menuFacturer);
		System.out.println("Cache: " + processor.getCache());
		
		System.out.println("====== Ram ======");
		CPU.Ram ram = cpu.new Ram(64, "Ram1");
		System.out.println("Memory: " + ram.memory);
		System.out.println("Menu Facture: " + ram.menuFacturer);
		System.out.println("clock Speed: " + ram.getClockSpeed());
	}
}
