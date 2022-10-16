public class MySqlCustomerDal implements ICustomerDal, IRepository{ //bir class'ı extend edicekse implements'ten önce extends yazarak verilir.
    @Override
    public void add() {
        System.out.println("My Sql eklendi.");
    }
}
