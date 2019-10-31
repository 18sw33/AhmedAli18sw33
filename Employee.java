class Employee{
    void getInfo(int finalSalary,int numberOfHours)
    {
        
        System.out.println("Final Salary :"+finalSalary+".\nNo. Of Hours Worked : "+numberOfHours);
    }

    int addSalary(int salary)
    {
        if(salary>500)
            salary+=10;   
        return salary;
    }

    int addWorkHours(int numberOfHours,int salary)
    {
        if(numberOfHours>5)
            salary+=5;
        return salary;
    }

    public static void main(String args[]) {
        int salary = 654;
        int numberOfHours = 9;
        int finalSalary;
        Employee employee = new Employee();
        finalSalary = employee.addSalary(salary);
        finalSalary = employee.addWorkHours(numberOfHours,salary);

        employee.getInfo(finalSalary,numberOfHours);
    }

}








