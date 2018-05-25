class Account {}

class Dao<TEntity, TId> {}

class DA {
    // your DaoManager.createDao() will also need a similar signature
    public static <TEntity> Dao<TEntity, Integer> getDao(Class<TEntity> daoType) {
        /// yadda blah, create DAO as appropriate
        return new Dao<TEntity, Integer>();
    }
}

public class Test {
    public static void main(String[] args) {
        // Pass the class literal for what you want TEntity to be as a parameter
        Dao<Account, Integer> dao = DA.getDao(Account.class);
    }
}