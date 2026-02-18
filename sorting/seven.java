import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student
{
    String Name;
    int Age;

    public student(String name, int age)
    {
        this.Name = name;
        this.Age = age;
    }

    public String toString()
    {
        return "student [Name=" + Name + ", Age=" + Age + "]";
    }
}

public class seven
{
    public static void main(String[] args)
    {
        Comparator<student> c = new Comparator<student>()
        {
            public int compare(student i , student j)
            {
                if(i.Age > j.Age)
                    return 1;
                else
                    return -1;
            } 
        };

        List<student> num = new ArrayList<>();

        num.add(new student("Ram",45));
        num.add(new student("Vamsi",62));
        num.add(new student("Rajiu",76));
        num.add(new student("Sai",37));

        Collections.sort(num , c);

        for(student s : num)
        System.out.println(s);
    }
}