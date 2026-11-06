package nov2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp{
    int empNo;
    String name;
    float salary;
    Emp(int empNo,String name,float salary){
        this.empNo=empNo;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return empNo+" "+name+" "+salary;
    }
}
class EmpNoComparator implements Comparator<Emp>{

    public int compare(Emp e1, Emp e2){
        if (e1.empNo>e2.empNo) 
            return 1;
        else if(e1.empNo<e2.empNo)
            return -1;
        else
            return 0;
    
    }
}
class NameComparator implements Comparator<Emp>{
    //public int compareTo(String);
    public int compare(Emp e1,Emp e2){
        return e1.name.compareTo(e2.name);
    }
}
class SalaryComparator implements Comparator<Emp>{

    public int compare(Emp e1, Emp e2) {
        if (e1.salary>e1.salary) 
            return 1;
        else if (e1.salary<e1.salary) 
            return -1;
        else
            return 0;
        
    }
}
public class ComparatorExmaple {
    public static void main(String[] args) {
        Emp e1= new Emp(101, "bbb", 5600.0f);
        Emp e2= new Emp(103, "aaa", 6500.0f);
        Emp e3= new Emp(102, "ccc", 5500.0f);
        ArrayList<Emp> al= new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        System.out.println(al);
        Collections.sort(al,new EmpNoComparator());
        System.out.println(al);
        Collections.sort(al,new NameComparator());
        System.out.println(al);
        Collections.sort(al,new SalaryComparator());
        System.out.println(al);
        
    }
}
