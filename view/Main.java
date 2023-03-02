package OOP.HW.HW_6.view;

import OOP.HW.HW_6.service.Worker;
import OOP.HW.HW_6.service.WorkerFactory;
import OOP.HW.HW_6.service.WorkerTypes;

public class Main {

  public static void main(String[] args) {

    WorkerFactory worker = new WorkerFactory();

    Worker builder = worker.getWorker(WorkerTypes.BUILDER);
    Worker cook = worker.getWorker(WorkerTypes.COOK);
    Worker driver = worker.getWorker(WorkerTypes.DRIVER);

    builder.searchWorker();
    builder.drawUpWorker();
    cook.searchWorker();
    cook.drawUpWorker();
    driver.searchWorker();
    driver.drawUpWorker();

  }
}
