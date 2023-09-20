package payroll.example.Owen.Starks;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
