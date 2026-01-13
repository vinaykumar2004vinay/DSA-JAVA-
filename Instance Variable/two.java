class Student
{
    int rollno;
    int marks;
    String name;
}

public class two
{
    public static void main(String[] args)
    {
        Student obj1 = new Student();
        obj1.rollno = 101;
        obj1.marks = 85;
        obj1.name = "Kiran";

        Student obj2 = new Student();
        obj2.rollno = 102;
        obj2.marks = 92;
        obj2.name = "Hari";

        Student obj3 = new Student();
        obj3.rollno = 103;
        obj3.marks = 73;
        obj3.name = "Ravi";

        Student obj[] = new Student[3];
        obj[0] = obj1;
        obj[1] = obj2;
        obj[2] = obj3;

        int nums[] = new int[4];
        nums[0] = 5;
        nums[1] = 2;
        nums[2] = 7;
        nums[3] = 9;

        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}