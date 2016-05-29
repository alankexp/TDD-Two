/**
 * Created by yuanbao on 2016/5/28.
 */
public interface PersonDao {
        public Person fetchPerson( Integer personID );
        public void update( Person person );
}
