import data.DBManager;
import data.interfaces.IDBManager;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import repositories.MedicineRepository;
import repositories.interfaces.IMedicineRepository;

public class MyApplicationBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(DBManager.class).to(IDBManager.class);
        bind(MedicineRepository.class).to(IMedicineRepository.class);
    }
}
