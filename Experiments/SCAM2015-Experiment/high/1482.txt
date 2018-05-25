public class RolesAndServicesMapping {
    private static final ImmutableMultimap<Service, Authority> SERVICES_TO_ROLES_MAPPING = 
         ImmutableMultimap.<Service, Authority>builder()
            .put(Service.SFP1, Authority.ROLE_PREMIUM)
            .put(Service.SFP, Authority.ROLE_PREMIUM)
            .put(Service.SFE, Authority.ROLE_EXTRA)
            .put(Service.SF, Authority.ROLE_STANDARD)
            .put(Service.SK, Authority.ROLE_STANDARD)
            .put(Service.SFP1, Authority.ROLE_ADMIN)
            .put(Service.ADMIN, Authority.ROLE_ADMIN)
            .put(Service.NONE, Authority.ROLE_DENY)
            .build();

    // Whole magic is here:
    private static final ImmutableMultimap<Authority, Service> ROLES_TO_SERVICES_MAPPING =
            SERVICES_TO_ROLES_MAPPING.inverse();
    // before guava-11.0 it was: ImmutableMultimap.copyOf(Multimaps.invertFrom(SERVICES_TO_ROLES_MAPPING, HashMultimap.<Authority, Service>create()));

    public static ImmutableSet<Authority> getRoles(final Service service) {
        return Sets.immutableEnumSet(SERVICES_TO_ROLES_MAPPING.get(service));
    }

    public static ImmutableSet<Service> getServices(final Authority role) {
        return Sets.immutableEnumSet(ROLES_TO_SERVICES_MAPPING.get(role));
    }
}