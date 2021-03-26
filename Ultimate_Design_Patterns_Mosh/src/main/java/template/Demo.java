package template;

public class Demo {

    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        var task2 = new GenerateReportTask();
        task.execute();
        task2.execute();
    }
}
