import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 * Created by 47989768s on 14/02/17.
 */
public class Manager {

    public static void addPerson(Persona p){

        ObjectContainer db = null;

        db = Db4o.openFile("persons.data");

        db.store(p);

    }

}
