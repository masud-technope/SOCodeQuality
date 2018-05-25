public String getRidOfAnnoyingChar(DatagramPacket packet){
        String result = new String(packet.getData());
        char[] annoyingchar = new char[1];
        char[] charresult = result.toCharArray();
        result = "";
        for(int i=0;i<charresult.length;i++){
            if(charresult[i]==annoyingchar[0]){
                break;
            }
            result+=charresult[i];
        }
        return result;
    }