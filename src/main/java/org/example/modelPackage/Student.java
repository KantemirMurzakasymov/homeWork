package org.example.modelPackage;

@Table
public class Student {

        @Column
        private String first_name;

        @Column
        private String last_name;

        @Column
        private Byte age;

        public Student() {
        }

        public Student( String first_name, String last_name, Byte age) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.age = age;
        }

    public String getFirst_name(String first_name) {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name(String last_name) {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Byte getAge(byte aByte) {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                '}';
    }
}
