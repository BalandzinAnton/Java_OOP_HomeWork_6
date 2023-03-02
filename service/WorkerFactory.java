package OOP.HW.HW_6.service;

import OOP.HW.HW_6.model.Builder;
import OOP.HW.HW_6.model.Cook;
import OOP.HW.HW_6.model.Driver;

public class WorkerFactory {

  public Worker getWorker(WorkerTypes type) {
    Worker toReturn = null;

    switch (type) {
      case BUILDER:
        toReturn = new Builder();
        break;
      case COOK:
        toReturn = new Cook();
        break;
      case DRIVER:
        toReturn = new Driver();
        break;
      default:
        throw new IllegalArgumentException("Wrong worker type:" + type);
    }
    return toReturn;
  }

}
