package OOP.HW.HW_6.model;

import OOP.HW.HW_6.service.Worker;

public class Driver implements Worker {

  @Override
  public void searchWorker() {
    //находим работника
    System.out.println("Подбираем водителя...");
  }

  @Override
  public void drawUpWorker() {
    //оформляем работника
    System.out.println("Делаем запрос в базу ГАИ о наличии нарушений\n"
        + "Оформляем водителя...");
  }
}
