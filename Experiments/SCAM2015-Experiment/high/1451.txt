public String toString() {
    StringBuilder s = new StringBuilder("In zoo "); 
    s.append(zoo_name).append(" there are the following animals:\n");
    for (int i = 0; i < animal_list.size(); i++){
        s.append(animal_list.get(i).getName());
        s.append(" who weighs ");
        s.append(animal_list.get(i).getWeight());
        s.append(" kg.\n");
    }
    return s.toString();
}