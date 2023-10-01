public class k_is_out_of_range_exc extends Exception {
    private int number;
    public k_is_out_of_range_exc(String message, int num) {
        super(message);
        number = num;
    }
}
