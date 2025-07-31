import com.github.javafaker.Faker;
import model.Employee;
import model.Product;
import utils.writers.csvwriter.CSVWriter;
import utils.writers.Writable;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {
        Faker faker = new Faker(Locale.ENGLISH);

        UUID id = UUID.randomUUID();
        String fullname = faker.name().fullName();
        LocalDate date = faker.date().birthday(0, 10).toInstant()
                        .atZone(java.time.ZoneId.systemDefault())
                        .toLocalDate();

        Employee employee = new Employee(id, fullname, date);
        List<Employee> employees = List.of(employee);

        Writable<Employee> writerE = new CSVWriter<>();

        writerE.writeToFile(employees,"C:\\Users\\Pavel\\Desktop\\homework\\CSVReportGenerator\\src\\main\\resources" +
                "\\reportEmployee.csv");

        Product product = new Product(UUID.randomUUID(),faker.company().name(),
                Double.parseDouble(faker.commerce().price().replace(',','.')));
        List<Product> products = List.of(product);

        Writable<Product> writerP = new CSVWriter<>();
        writerP.writeToFile(products,"C:\\Users\\Pavel\\Desktop\\homework\\CSVReportGenerator\\src\\main\\resources" +
                "\\reportProduct");
    }
}
