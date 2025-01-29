package singlylinkedlist.studentrecordmanagement;

class StudentLinkedList{
    private Student head;


    public void addBeginning(int rollNumber,String name,int age,String grade){
        Student newNode= new Student(rollNumber,name,age,grade);

        newNode.next=head;
        head=newNode;

    }

    public void addEnd(int rollNumber,String name,int age,String grade){
        Student newNode = new Student( rollNumber, name,  age,  grade);
        if(head==null){
            head=newNode;
            return;
        }
        Student temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }

    public void addAtPosition(int position, int rollNumber,String name,int age,String grade){
        Student newNode = new Student(rollNumber,name,age,grade);

        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }

        Student temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }


    public void deleteByRollNumber(int rollnumber){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNumber==rollnumber){
            head=head.next;
            System.out.println("Student with rollnumber "+rollnumber+" deleted");
            return;
        }
        Student temp=head;
        while (temp.next!=null && temp.next.rollNumber!=rollnumber){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Student with rollnumber "+rollnumber+" not found");

        }else{
            temp.next=temp.next.next;
            System.out.println("Student with rollNumber "+rollnumber+" deleted ");

        }




    }


    public void searchByRollNumber(int rollNumber){
        Student temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollNumber){
                System.out.println("Student Found: Roll Number = " + temp.rollNumber + ", Name = " + temp.name +
                        ", Age = " + temp.age + ", Grade = " + temp.grade);
                return;
            }
            temp=temp.next;
        }

        System.out.println("Student with rollNumber"+rollNumber+" Not found ");


    }

    public void updateGrade(int rollNumber, String newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade; // Update grade
                System.out.println("Grade updated for Roll Number " + rollNumber + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    public void displayAll(){
        if(head==null){
            System.out.println("No Student found");
        }
        Student temp = head;

        while (temp!=null){
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

}
