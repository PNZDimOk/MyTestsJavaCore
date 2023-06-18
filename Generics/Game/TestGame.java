package Generics.Game;

public class TestGame {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Igoryok", 17);
        Schoolar schoolar2 = new Schoolar("Vanka", 16);

        Student student1 = new Student("Dmitrii", 24);
        Student student2 = new Student("Tatiana", 24);

        Employee employee1 = new Employee("Boris", 31);
        Employee employee2 = new Employee("Oleg", 29);

        Team<Schoolar> teamSchoolar = new Team<>("Dragons");
        teamSchoolar.addParticipantInTeam(schoolar1);
        teamSchoolar.addParticipantInTeam(schoolar2);

        Team<Student> teamStudent1 = new Team<>("Students");
        teamStudent1.addParticipantInTeam(student1);
        teamStudent1.addParticipantInTeam(student2);

        Team<Employee> teamEmployee = new Team<>("Rabotyagi");
        teamEmployee.addParticipantInTeam(employee1);
        teamEmployee.addParticipantInTeam(employee2);

        Student student3 = new Student("Dmitrii", 24);
        Student student4 = new Student("Tatiana", 24);
        Team<Student> teamStudent2 = new Team<>("Students_bakalavr");
        teamStudent2.addParticipantInTeam(student3);
        teamStudent2.addParticipantInTeam(student4);


        teamStudent1.playWith(teamStudent2);
    }
}
