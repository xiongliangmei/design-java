package structured.Facade;
/**
 * 门面类（核心）
 * **/
public class Computer {
  CPU cpu;
  Memory memory;
  Disk disk;
  public Computer() {
    cpu = new CPU();
    memory = new Memory();
    disk = new Disk();
  }
  public  void  start(){
      cpu.start();
      disk.start();
      memory.start();
  }
  public  void shutdown(){
      cpu.shutDown();
      disk.shutDown();
      memory.shutDown();
  }
}
