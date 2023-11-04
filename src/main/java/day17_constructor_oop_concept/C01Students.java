package day17_constructor_oop_concept;

    public class C01Students{

        String name = "Tom Hanks";
        int age = 13;
        private String stdId = "TM2010001";
        public void study(){
            System.out.println("Study hard...");
        }
        public void doSport(){
            System.out.println("Doing sports is good for health...");
        }
        public C01Students(){

        }
        public C01Students(String name, int age){
            this.name =name;
            this.age=age;
            this.stdId = stdId;

        }

    }
