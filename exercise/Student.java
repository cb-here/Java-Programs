public class Student{
    public static void main(String[] args){
        float marks1 = 39.7f, marks2 = 90.0f, marks3 = 78.7f, marks4 = 89.7f, marks5 = 37f;
        float total = marks1 + marks2 + marks3 + marks4 + marks5;
        float per = total / 500 * 100;
        System.out.println("Student total marks is: " + total);
        System.out.println("Student total percentage is: " + per);
    }
}