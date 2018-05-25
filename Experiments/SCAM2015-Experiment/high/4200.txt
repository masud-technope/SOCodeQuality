List<Player> getPlayers() {
    try {
        Method method = getMethod(Server.class, "getOnlinePlayers");
        Object result = method.invoke(Bukkit.getServer());
        if(result instanceof Player[])
            return Arrays.asList((Player[])result);
        else
            return (List<Player>)result;

    } catch(ReflectiveOperationException e) {

        // something went wrong! If you have a better way to handle problems, do that instead
        throw new RuntimeException(e);
    }
}