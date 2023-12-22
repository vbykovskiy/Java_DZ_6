import entities.User;
import repositories.Persistable;
import repositories._impl.Persister;
import utils.Reportable;
import utils._impl.UserReport;

public class Main{
    public static void main(String[] args){

        User user = new User("Bob");
        
        Reportable reportable = new UserReport();
        reportable.report(user);
        Persistable persistable = new Persister();
        persistable.save(user);
    }
}