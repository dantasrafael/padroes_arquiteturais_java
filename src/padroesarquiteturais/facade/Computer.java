package padroesarquiteturais.facade;

public class Computer {
	
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void executar() {
		hardDrive.lerDados();
		memory.carregarDados();
		cpu.processarDados();
	}

}
