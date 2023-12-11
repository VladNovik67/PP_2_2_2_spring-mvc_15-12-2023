package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarsDaoImp implements CarsDao {

    private static final List<Cars> carList = new ArrayList<>();

    static {
        carList.add(new Cars("Maibah", "2000", "23"));
        carList.add(new Cars("Audi", "L", "203"));
        carList.add(new Cars("BMV", "XL", "5000"));
        carList.add(new Cars("BMV", "400", "KKK"));
        carList.add(new Cars("LADA", "Grante", "3412"));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Cars> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
