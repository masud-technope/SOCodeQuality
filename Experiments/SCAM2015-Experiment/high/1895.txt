InetAddress[] localaddr;

    String computername = null;

    try {
        computername = InetAddress.getLocalHost().getHostName();//get pc name
    } catch (UnknownHostException ex) {
        ex.printStackTrace();
    }

    System.out.println(computername);

    try {
        localaddr = InetAddress.getAllByName(computername);
        for (int i = 0; i < localaddr.length; i++) {
            System.out.println("\n" + localaddr[i].getHostAddress());
        }
    } catch (UnknownHostException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }