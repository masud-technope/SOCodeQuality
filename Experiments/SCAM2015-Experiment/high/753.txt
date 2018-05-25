public enum Permission {
    READ, WRITE;
}

public class User {

    private final EnumSet<Permission> permissions;

    public User(Permission... permissions) {
       this.permissions = EnumSet.copyOf(Arrays.asList(permissions));
    }

    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }

    //...
}

User user = new User(Permission.READ, Permission.WRITE);