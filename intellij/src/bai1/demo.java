package bai1;

public class demo {
    public static void main(String[] args) {
        //a :
       Employee employee1 = new Employee(1, "Nguyen", "Nguyen", 1000);
        System.out.println(employee1);
        System.out.println("Ho va ten :" + employee1.getFullName());
        Employee e = new Employee();

        //b:
        Employee employee2[] = new Employee[3];
        employee2[0] = new Employee(3, "Nguyen", "Nguyen", 1000);
        employee2[1] = new Employee(1, "Nguyen", "Man", 2000);
        employee2[2] = new Employee(2, "Huynh", "Hai", 3000);
        for (int i = 0; i < employee2.length; i++) {
            System.out.println(employee2[i].toString());
        }
        System.out.println("ID tang dan");
        sortASC(employee2);

    }

    public static void sortASC(Employee employee2[]) {
        Employee temp = employee2[0];
        for (int i = 0; i < employee2.length - 1; i++) {
            for (int j = i + 1; j < employee2.length; j++) {
                if (employee2[i].getId() > employee2[j].getId()) {
                    temp = employee2[j];
                    employee2[j] = employee2[i];
                    employee2[i] = temp;
                }
            }
        }
        for(Employee em:employee2){
            System.out.println(em.toString());
        }
    }

}