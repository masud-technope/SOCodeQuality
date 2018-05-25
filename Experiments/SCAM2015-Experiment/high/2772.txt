List<Employee> list=new ArrayList<Employee>();
    list.add(new Employee(1, "A", Double.parseDouble("50")));
    list.add(new Employee(22, "B", Double.parseDouble("11")));
    list.add(new Employee(3, "C", Double.parseDouble("222")));
    list.add(new Employee(34, "D", Double.parseDouble("4")));

    SortedSet<Employee> set=new TreeSet<Employee>( list);

    List<Employee> l=new ArrayList<Employee>();
    l.addAll(set);

    System.out.println(l);