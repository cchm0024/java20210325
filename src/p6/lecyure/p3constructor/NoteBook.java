package p6.lecyure.p3constructor;

public class NoteBook {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	NoteBook() {
		this.model = "hp";
		this.memory = 8;
		this.cpu = "amd";
		this.ssd = 128;
	}
	
	NoteBook(String model, int memory) {
		/*
		this.model = model;
		this.memory = memory;
		this.cpu = "amd";
		this.ssd = 128;
		*/
		this(model, memory, "amd", 128);
	}
	
	NoteBook(String model, int memory, String cpu) {
		/*
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
		*/
		this(model, memory, cpu, 128);
		
	}
	
	NoteBook(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
}





