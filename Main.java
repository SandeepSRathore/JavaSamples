import java.util.*;
public class Main
{
    public static void main(String[] args) {
        HashMap<Student,StudentDetails> map = new HashMap<>();
        map.put(new Student(1,"sandeep"),new StudentDetails(9772441));

        //Iterate using EntrySet
        Set<Map.Entry<Student,StudentDetails>> entrySet = map.entrySet();
        for(Map.Entry entry : entrySet){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }

        //Iterate using java 8 lambdas
        map.forEach((key,value) -> {
            System.out.println("key : "+ key + "value : "+ value);
        });
	}
}



class Student {
    private int id;
    private String name;

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!Student.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        final Student other = (Student) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.id != other.id) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() { 
        return String.format(id + ":" + name); 
    } 

}


class StudentDetails{
    private int phone;

    public StudentDetails(int phone){
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() { 
        return String.format(":" + phone); 
    } 

}
