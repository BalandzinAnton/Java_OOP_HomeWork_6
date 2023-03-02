package OOP.HW.HW_6.model;

import OOP.HW.HW_6.service.Worker;

public class Builder implements Worker {

  @Override
  public void searchWorker() {
    //находим работника
    System.out.println("Подбираем строителя...");
  }

  @Override
  public void drawUpWorker() {
    //оформляем работника
    System.out.println("Проверяем документы высотника\n"
        + "Подбираем жилье\n"
        + "Оформляем строителя...");
  }

}
