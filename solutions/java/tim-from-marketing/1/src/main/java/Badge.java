class Badge {
    Integer id =null;
    String name = null;
    String department = null;
    
    public String print(Integer id, String name, String department) {
        String a =null;
        this.id = id;
        this.name = name;
        this.department = department;
        if((id != null) && (department != null)){
             a = "["+id+"]"+" - "+name+" - "+department.toUpperCase();
        }else if((id == null) && (department !=  null)){
             a = name+" - "+department.toUpperCase();
        }else if((id != null) && (department ==  null)){
             a = "["+id+"]"+" - "+name+" - "+"OWNER";
        }else{
             a = name+" - "+"OWNER";
        }
        
        return a;
    }
}
