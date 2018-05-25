@Context
UriInfo uriInfo;

@PostConstruct
public void myfunc() {
    if (uriInfo == null) { //breakpoint on this line, so I can see what uriInfo is

    }
}