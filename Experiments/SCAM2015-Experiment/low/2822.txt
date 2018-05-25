public ArrayList<String> fileRead(String fileName){
        File           f;
        String         s;
        FileReader     fr = null;
        BufferedReader br = null;
        ArrayList<String>   sl = new ArrayList<String>();
        try {
            f  = new File(fileName); 
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while((s=br.readLine())!=null){
                sl.add(s);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
                try {
                    if(br!=null)
                        br.close();
                    if(fr!=null)
                        fr.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }
        return sl;
    }