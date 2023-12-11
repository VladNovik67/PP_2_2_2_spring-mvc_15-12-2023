package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarsDao;
import web.model.Cars;

import java.util.List;

@Service
public class CarsServiceImp implements CarsService {

    @Autowired
    private CarsDao carsDao;

    @Override
    public List<Cars> getCars(int count) {
        return carsDao.getCars(count);
    }
}
