Server server = ServerFactory.getServer();
        Service[] services = server.findServices();
        for (Service service : services) {
            for (Connector connector : service.findConnectors()) {
                ProtocolHandler protocolHandler = connector.getProtocolHandler();
                if (protocolHandler instanceof Http11Protocol
                    || protocolHandler instanceof Http11AprProtocol
                    || protocolHandler instanceof Http11NioProtocol) {
                    serverPort = connector.getPort();
                    System.out.println("HTTP Port: " + connector.getPort());
                }
            }


        }