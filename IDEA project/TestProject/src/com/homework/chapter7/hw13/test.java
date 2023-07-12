package com.homework.chapter7.hw13;

public class test {
    public static void main(String[] args) {
        Person[] perons = new Person[4];

        perons[3] = new Student("Abby",17,"male",314501);
        perons[2] = new Student("Betty",18,"female",314502);
        perons[1] = new Teacher("Laura",32,"male",5);
        perons[0] = new Teacher("Mary",45,"female",9);
        for (int i = 0; i < perons.length; i++) {
            System.out.print(perons[i].getAge()+"\t");

        }

        for (int i = 0; i < perons.length-1; i++) {
            for (int j = 0; j < perons.length-1-i; j++) {
                if(perons[j].getAge()>perons[j+1].getAge()){
                    Person temp = perons[j+1];
                    perons[j+1] = perons[j];
                    perons[j] = temp;
                }

            }

        }
        System.out.println();
        for (int i = 0; i < perons.length; i++) {
            System.out.print(perons[i].getAge()+"\t");

        }
        System.out.println();
        for (int i = 0; i < perons.length; i++) {
            if(perons[i] instanceof Student){
                ((Student) perons[i]).study();
            } else if (perons[i] instanceof Teacher) {
                ((Teacher) perons[i]).teach();

            } else {
                System.out.println("#########################");
            }

        }




    }
}
