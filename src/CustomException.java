public class CustomException extends Exception {
    private Integer capacity;

    public CustomException(Integer capacity) {
        super("Capacidad insuficiente: "+ capacity);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ". La capadidad minima requerida es: "+ this.capacity;
    }
}
