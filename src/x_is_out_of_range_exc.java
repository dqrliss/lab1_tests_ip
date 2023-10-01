public class x_is_out_of_range_exc extends Exception {
    private double number;
    public x_is_out_of_range_exc(String message, double num) {
        super(message);
        number = num;
    }
}
