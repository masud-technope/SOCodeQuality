public void setupSftpServer(){
    SshServer sshd = SshServer.setUpDefaultServer();
    sshd.setPort(22);
    sshd.setKeyPairProvider(new SimpleGeneratorHostKeyProvider("hostkey.ser"));

    List<NamedFactory<UserAuth>> userAuthFactories = new ArrayList<NamedFactory<UserAuth>>();
    userAuthFactories.add(new UserAuthNone.Factory());
    sshd.setUserAuthFactories(userAuthFactories);

    sshd.setCommandFactory(new ScpCommandFactory());

    List<NamedFactory<Command>> namedFactoryList = new ArrayList<NamedFactory<Command>>();
    namedFactoryList.add(new SftpSubsystem.Factory());
    sshd.setSubsystemFactories(namedFactoryList);

    try {
        sshd.start();
    } catch (Exception e) {
        e.printStackTrace();
    }
}