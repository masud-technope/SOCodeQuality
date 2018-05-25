Map<Integer,String> map=new HashMap<>();
 map.put(1,"EnterStringHere");
 map.put(2,"hi");
 map.put(3,"EnterStringHere");
 Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
 while (iterator.hasNext()){
    Map.Entry<Integer,String> entry=iterator.next();
        if(entry.getValue().equals("EnterStringHere")){
            iterator.remove();
        }
    }
 System.out.println(map);